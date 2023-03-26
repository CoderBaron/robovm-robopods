#!/usr/bin/env kotlinc -jvm-target 9 -script --
import org.w3c.dom.Document
import org.w3c.dom.Element
import org.w3c.dom.Node
import java.io.File
import java.io.InputStream
import java.io.PrintStream
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption
import javax.xml.parsers.DocumentBuilderFactory
import kotlin.concurrent.thread
import kotlin.system.exitProcess

/**
 * Script to automate steps required to bind libraries:
 * - deletes old header files
 * - deletes old java bindings
 * - fetches version information and updates maven pom.xml files
 * - automatically performs bindings

 * important: to be run in robovm-robopods folder
 *
 * @author dkimitsa
 */

// single point for logs
val log = Log()

// readme file (also used as lock)
val readmeFile: File = Path.of("README.md").toFile().also {
    it.requiresIsFile { "Failed to locate ${it.canonicalPath}" }
}

// robovm-bro-gen project expected next to robovm-robopods
val broGenScript: File = Path.of("../robovm-bro-gen/bro-gen.rb").toFile().also {
    it.requiresCanExecute { "Failed to locate bro-gen script at ${it.canonicalPath}" }
    log.i("bro-gen found at ${it.canonicalPath}")
}

// Download root folder
val downloadFolder: File = Path.of(System.getProperty("user.home"), "Downloads").toFile().also {
    it.requiresIsDirectory { "Failed to locate Download directory ${it.canonicalPath}" }
}

// maps group to list of frameworks
val knownGroups = mutableMapOf<String, MutableList<String>>()

// list of known frameworks and ways to process it
val knownFrameworks = mutableMapOf<String, (String) -> Unit>(
    "AppLovinSDK" to { framework ->
        val artifact = "$framework.framework"
        val artifactLocation = downloadFolder.extend("applovin-ios-sdk/AppLovinSDK.xcframework/ios-arm64_armv7/$artifact")
        processFramework(
            artifact = artifact,
            moduleFolder = "applovinsdk/ios",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "applovinsdk.yaml",
            version = { downloadFolder.extend("applovin-ios-sdk/version").readText() },
            instruction = """
                1. Download recent version of applovin-ios-sdk-x.y.z.zip from https://dash.applovin.com/documentation/mediation/manual-integration-ios (login required)
                2. Also its possible to get direct link to it from podspec file, check https://cocoapods.org/pods/AppLovinSDK
                3. create a file ${downloadFolder.extend("applovin-ios-sdk//version")} and put verions there, e.g. 4.0.0
                3. Unpack and rename to ${downloadFolder.extend("applovin-ios-sdk")}
            """.trimIndent()
        )
    },
    "WindowsAzureMessaging" to { framework ->
        val artifact = "$framework.framework"
        val artifactLocation = downloadFolder.extend("WindowsAzureMessaging-SDK-Apple/iOS/$artifact")
        processFramework(
            artifact = artifact,
            moduleFolder = "azure/ios-notification-hubs",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "azure-windows-messaging.yaml",
            version = { azureVersionFromReadme(downloadFolder.extend("WindowsAzureMessaging-SDK-Apple/README.md")) },
            instruction = """
                1. Download recent version of WindowsAzureMessaging-SDK-Apple-X.Y.Z.zip from https://github.com/Azure/azure-notificationhubs-ios/releases
                2. unpack 
                3. expected location ${downloadFolder.extend("WindowsAzureMessaging-SDK-Apple")} 
            """.trimIndent()
        )
    },
    "BranchSDK" to { framework ->
        val artifact = "$framework.framework"
        val artifactLocation = downloadFolder.extend("BranchSDK.xcframework/ios-arm64/$artifact")
        processFramework(
            artifact = artifact,
            moduleFolder = "branchmetrics/ios",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "branchmetrics.yaml",
            version = { artifactLocation.infoPlist.extractVersion() },
            instruction = """
                1. Download recent Branch.zip from https://github.com/BranchMetrics/ios-branch-deep-linking-attribution/releases
                2. Unpack
                3. expected location ${downloadFolder.extend("BranchSDK.xcframework")} 
            """.trimIndent()
        )
    },
    "Charts" to { framework ->
        val artifact = "$framework.framework"
        val artifactLocation = downloadFolder.extend("Charts/Carthage/Build/Charts.xcframework/ios-arm64/$artifact")
        processFramework(
            artifact = artifact,
            moduleFolder = "charts/ios",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "charts.yaml",
            version = {
                downloadFolder.extend("Charts/Cartfile").readLines()
                    .find { it.startsWith("github") }
                    ?.substringAfterLast("\"danielgindi/Charts\"")
                    ?.replace("v", "")?.replace("\"", "")?.trim()
                    ?: error("Failed to find out Charts version!")
            },
            headersCopier = { frm, sourceHeadersDir, destinationHeadersDir ->
                copyHeaders(frm, sourceHeadersDir, destinationHeadersDir)
                // after copied include Charts/Charts-Swift.h to Charts.h
                File(destinationHeadersDir, "Charts.h").appendText("\n#import <Charts/Charts-Swift.h>")
            },
            instruction = """
                0. check latest version number at https://github.com/danielgindi/Charts/releases
                1. get binaries using Carthage, (put proper version instead of X.Y.Z) run in ~/Downloads/Charts:
                  > echo 'github "danielgindi/Charts" "X.Y.Z"' > Cartfile
                  > carthage update --platform ios  --use-xcframeworks
                2. expected location ${downloadFolder.extend("Charts/Carthage/Build/Charts.xcframework/ios-arm64/")} 
            """.trimIndent()
        )
    },
    "HelpshiftX" to { framework ->
        val artifact = "$framework.framework"
        val artifactLocation =
            downloadFolder.extend("helpshiftx-sdk-ios/HelpshiftX.xcframework/ios-arm64_armv7/$artifact")
        processFramework(
            artifact = artifact,
            moduleFolder = "helpshift/ios",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "helpshift.yaml",
            version = {
                downloadFolder.extend("helpshiftx-sdk-ios").list()
                    ?.find { it.startsWith("Release") && it.endsWith(".txt") }
                    ?.let { it.substringAfter('-').substringBeforeLast('.') }
                    ?: error("Failed to find out Helpshift version!")
            },
            instruction = """
                1. download iOS SDK from https://developers.helpshift.com/sdkx_ios/getting-started/#getting-sdk
                2. unpack helpshift-sdk-ios-vX.Y.Z.zip
                3. Rename to ${downloadFolder.extend("helpshift-sdk-ios")} 
            """.trimIndent()
        )
    },
    "InMobiSDK" to { framework ->
        val artifact = "$framework.framework"
        val artifactLocation = downloadFolder.extend("InMobi-iOS-SDK/InMobiSDK.xcframework/ios-arm64_armv7/$artifact")
        processFramework(
            artifact = artifact,
            moduleFolder = "inmobi/ios-sdk",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "inmobi-sdk.yaml",
            version = { artifactLocation.infoPlist.extractVersion() },
            instruction = """
                1. Download iOS sdk (for manual integration) from https://www.inmobi.com/sdk
                2. Unpack
                3. expected location ${downloadFolder.extend("InMobi-iOS-SDK/")}
            """.trimIndent()
        )
    },
    "Lottie" to { framework ->
        val artifact = "$framework.framework"
        val artifactLocation = downloadFolder.extend("Lottie.xcframework/ios-arm64//$artifact")
        val versionFile: String by lazy {
            downloadFolder.extend("Lottie.xcframework/version").readText()
        }
        processFramework(
            artifact = artifact,
            moduleFolder = "lottie/ios",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "lottie.yaml",
            version = { versionFile },
            instruction = """
                1. goto https://github.com/airbnb/lottie-ios/releases and download latest Lottie.xcframework.zip
                2. unpack 
                3. create a file ${downloadFolder.extend("Lottie.xcframework/version")} and put verions there, e.g. 4.0.0 
                4. expected location ${downloadFolder.extend("Lottie.xcframework/ios-arm64/")}
            """.trimIndent()
        )
    },
    "OneSignal" to { framework ->
        val artifact = "$framework.framework"
        val versionFile: String by lazy {
            downloadFolder.extend("OneSignal.xcframework/version").readText()
        }
        processFramework(
            artifact = artifact,
            moduleFolder = "onesignal/ios",
            sourceHeadersDir = downloadFolder,
            destinationHeadersDir = Path.of("onesignal", "ios", "src", "main", "bro-gen").toFile(),
            yaml = "onesignal.yaml",
            headerFolderCleaner = { frm, dst ->
                cleanUpHeaders(frm, dst.extend("OneSignal.framework"))
                cleanUpHeaders(frm, dst.extend("OneSignalCore.framework"))
                cleanUpHeaders(frm, dst.extend("OneSignalOutcomes.framework"))
            },
            headersCopier = { _, src, dst ->
                copyHeaders("OneSignal.framework",
                    src.extend("OneSignal.xcframework/ios-arm64_armv7_armv7s/OneSignal.framework/Headers"),
                    dst.extend("OneSignal.framework/Headers"))
                copyHeaders("OneSignalCore.framework",
                    src.extend("OneSignalCore.xcframework/ios-arm64_armv7_armv7s/OneSignalCore.framework/Headers"),
                    dst.extend("OneSignalCore.framework/Headers"))
                copyHeaders("OneSignalOutcomes.framework",
                    src.extend("OneSignalOutcomes.xcframework/ios-arm64_armv7_armv7s/OneSignalOutcomes.framework/Headers"),
                    dst.extend("OneSignalOutcomes.framework/Headers"))
            } ,
            interactiveValidateHeaderFolder = { _, src, instruction, optional ->
                interactiveValidateHeaderFolder("OneSignal.framework",
                    src.extend("OneSignal.xcframework/ios-arm64_armv7_armv7s/OneSignal.framework/Headers"),
                    instruction, optional)
                interactiveValidateHeaderFolder("OneSignalCore.framework",
                    src.extend("OneSignalCore.xcframework/ios-arm64_armv7_armv7s/OneSignalCore.framework/Headers"),
                    instruction, optional)
                interactiveValidateHeaderFolder("OneSignalOutcomes.framework",
                    src.extend("OneSignalOutcomes.xcframework/ios-arm64_armv7_armv7s/OneSignalOutcomes.framework/Headers"),
                    instruction, optional)
            },
            version = { versionFile },
            instruction = """
                1. Download OneSignal.xcframework.zip from https://github.com/OneSignal/OneSignal-iOS-SDK/releases
                2. Unpack, expected loaction  ${downloadFolder.extend("OneSignal.xcframework")}
                3. Download OneSignalCore.xcframework.zip from https://github.com/OneSignal/OneSignal-iOS-SDK/releases
                4. Unpack, expected loaction  ${downloadFolder.extend("OneSignalCore.xcframework")}
                5. Download OneSignalOutcomes.xcframework.zip from https://github.com/OneSignal/OneSignal-iOS-SDK/releases
                6. Unpack, expected loaction  ${downloadFolder.extend("OneSignalOutcomes.xcframework")}
                7. create a file ${downloadFolder.extend("OneSignal.xcframework/version")} and put verions there, e.g. 4.0.0 
            """.trimIndent()
        )
    },
    "Pollfish" to { framework ->
        val artifact = "$framework.framework"
        val artifactLocation = downloadFolder.extend("Pollfish-iOS-SDK/Pollfish.xcframework/ios-arm64/$artifact")
        processFramework(
            artifact = artifact,
            moduleFolder = "pollfish/ios",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "pollfish.yaml",
            headersCopier = { frm, sourceHeadersDir, destinationHeadersDir ->
                copyHeaders(frm, sourceHeadersDir, destinationHeadersDir)
                // after copied include Pollfish/Pollfish-Swift.h to Pollfish.h
                File(
                    destinationHeadersDir,
                    "Pollfish.h"
                ).appendText("\n#include <TargetConditionals.h>\n#import <UIKit/UIKit.h>\n#import <Pollfish/Pollfish-Swift.h>")
            },
            version = { artifactLocation.infoPlist.extractVersion() },
            instruction = """
                1. download iOS sdk from https://www.pollfish.com/docs/ios
                2. unpack and rename to ${downloadFolder.extend("Pollfish-iOS-SDK")}
            """.trimIndent()
        )
    },
    "GoogleMobileAdsMediationTestSuite" to { framework ->
        val artifact = "$framework.framework"
        val artifactLocation = downloadFolder.extend("googlemobileadsmediationtestsuiteios/GoogleMobileAdsMediationTestSuite.xcframework/ios-arm64_armv7/$artifact")
        processFramework(
            artifact = artifact,
            moduleFolder = "firebase/ios-google-mobile-ads-mediation-testsuite",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "gad-mediation-testsuite.yaml",
            version = {
                downloadFolder.extend("googlemobileadsmediationtestsuiteios/CHANGELOG.md").readLines()
                    .find { it.contains("### ") }
                    ?.let { it.substringAfter("### ") }
                    ?: error("Failed to extract version from CHANGELOG.md!")
            },
            instruction = """
                1. download iOS sdk from https://developers.google.com/admob/ios/mediation-test-suite
                2. unpack 
                3. expected location ${downloadFolder.extend("googlemobileadsmediationtestsuiteios")}
            """.trimIndent(),
            readmeFileVersionUpdater = { frm, modFolder, version ->
                val moduleReadmeFile = Path.of("Firebase/README.md").toFile()
                updateModuleReadmeFileVersionString(frm, moduleReadmeFile, modFolder, version)
            }
        )
    },
    "IASDKCore" to { framework ->
        val fyberVersion: String by lazy {
            downloadFolder.extend("InneractiveAdSDK-iOS-master/IASDKCore/IASDKCore.xcframework/IASDKResources.bundle/").infoPlist.extractVersion()
        }
        val artifactLocation = downloadFolder.extend("InneractiveAdSDK-iOS-master/$framework/$framework.xcframework/ios-arm64_armv7/$framework.framework")
        processFramework(
            artifact = "$framework.framework",
            moduleFolder = "fyber/ios",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "iasdk-core.yaml",
            version = { fyberVersion },
            instruction = """
                1. download and unpack https://github.com/inner-active/InneractiveAdSDK-iOS/archive/refs/heads/master.zip
                2. unpack, expected location ${downloadFolder.extend("InneractiveAdSDK-iOS-master")}
            """.trimIndent()
        )
    },
    "UnityAds" to { framework ->
        val unityVersion: String by lazy {
            downloadFolder.extend("UnityAds/version/").readText()
        }
        val artifactLocation = downloadFolder.extend("UnityAds/$framework.xcframework/ios-arm64_armv7/$framework.framework")
        processFramework(
            artifact = "$framework.framework",
            moduleFolder = "unityads/ios",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "unityads.yaml",
            version = { unityVersion },
            instruction = """
                1. download and unpack UnityAds.zip from https://github.com/Unity-Technologies/unity-ads-ios/releases
                2. unpack, expected location ${downloadFolder.extend("UnityAds")}
                3. create a file ${downloadFolder.extend("UnityAds/version")} and put verions there, e.g. 4.0.0 
            """.trimIndent()
        )
    },
    "YouTubeiOSPlayerHelper" to { framework ->
        val artifactLocation = downloadFolder.extend("$framework/Carthage/Build/$framework.xcframework/ios-arm64_armv7/$framework.framework")
        processFramework(
            artifact = "$framework.framework",
            moduleFolder = "youtube/ios-player-helper",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "youtube-player-helper.yaml",
            version = {
                downloadFolder.extend("$framework/Cartfile").readLines()
                    .find { it.startsWith("github") }
                    ?.let { it.substringAfterLast("==").trim() }
                    ?: error("Failed to find out version!")
            },
            instruction = """
                0. check latest version number at https://github.com/youtube/youtube-ios-player-helper
                1. get binaries using Carthage, (put proper version instead of X.Y.Z) run in ~/Downloads/YouTubeiOSPlayerHelper
                  > echo 'github "youtube/youtube-ios-player-helper" == X.Y.Z' > Cartfile
                  > carthage update --platform ios --use-xcframeworks
            """.trimIndent()
        )
    },
    "Singular" to { lib ->
        val singularVersion: String by lazy {
            downloadFolder.extend("Singular-iOS-sdk/version/").readText()
        }
        val artifactLocation = downloadFolder.extend("Singular-iOS-sdk")
        processFramework(
            artifact = "$lib.lib",
            moduleFolder = "singular/ios",
            sourceHeadersDir = artifactLocation,
            yaml = "singular.yaml",
            version = { singularVersion },
            instruction = """
                0. download latest version from https://support.singular.net/hc/en-us/articles/360037950591-iOS-SDK-Basic-Integration
                1. unpack and rename to ${downloadFolder.extend("Singular-iOS-sdk")}
                3. create a file ${downloadFolder.extend("Singular-iOS-sdk/version")} and put verions there, e.g. 11.0.4 
            """.trimIndent(),
            headersCopier = { frm, sourceHeadersDir, destinationHeadersDir ->
                copyHeadersFiltered(frm, sourceHeadersDir, destinationHeadersDir, flatten = true) {
                    it.fileName.toString().endsWith(".h")
                }
            }
        )
    },
    "IronSource" to { framework ->
        val artifactLocation = downloadFolder.extend("IronSource/IronSource.xcframework/ios-arm64_armv7/$framework.framework")
        processFramework(
            artifact = "$framework.framework",
            moduleFolder = "ironsource/ios",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "ironsource.yaml",
            version = {
                artifactLocation.headers.extend("IronSource.h").readLines()
                .find{ it.contains("MEDIATION_SDK_VERSION") }
                ?.substringAfterLast("@\"")?.substringBefore("\"")
                ?: error("Filed to evaluate $framework version")
            },
            instruction = """
                0. download latest version from https://developers.is.com/ironsource-mobile/ios/ios-sdk/#step-1
                1. unpack
                2. expected location ${artifactLocation}
            """.trimIndent(),
        )
    },
    "Adapty" to { framework ->
        val artifactLocation = Path.of("adapty/cocoapods/Adapty.framework").toFile()
        processFramework(
            artifact = "$framework.framework",
            moduleFolder = "adapty/ios",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "adapty.yaml",
            version = { artifactLocation.infoPlist.extractVersion() },
            headersCopier = { frm, sourceHeadersDir, destinationHeadersDir ->
                copyHeaders(frm, sourceHeadersDir, destinationHeadersDir)
                File(destinationHeadersDir, "Adapty.h").appendText(
                    """
                    #import <Foundation/Foundation.h>
                    #include <TargetConditionals.h>
                    #import <UIKit/UIKit.h>
                    #import <AppTrackingTransparency/AppTrackingTransparency.h>
                    #import <WebKit/WebKit.h>
                    #import <Adapty/Adapty-Swift.h>
                """.trimIndent()
                )
            },
            instruction = """
                0. run adapty/cocoatouch/fetch.sh to fetch and build from cocotouch 
                1. expected location ${artifactLocation}
            """.trimIndent(),
        )
    },
    "TenjinSDK" to { framework ->
        val artifactLocation = downloadFolder.extend("tenjin-ios-sdk/TenjinSDK.xcframework/ios-arm64_armv7/$framework.framework")
        val tenjinvVersion: String by lazy {
            downloadFolder.extend("tenjin-ios-sdk/TenjinSDK.h").readLines()
                .find{ it.contains(" Version ") }
                ?.substringAfterLast(" ")
                ?: error("Filed to evaluate $framework version")
        }
        processFramework(
            artifact = "$framework.framework",
            moduleFolder = "tenjin/ios",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "tenjin.yaml",
            version = { tenjinvVersion },
            instruction = """
                0. download latest version from https://github.com/tenjin/tenjin-ios-sdk/releases
                1. unpack and rename to ${downloadFolder.extend("tenjin-ios-sdk")}
                1. expected location ${artifactLocation}
            """.trimIndent()
        )
    },
    "CleverAdsSolutions" to { framework ->
        val artifactLocation = downloadFolder.extend("CleverAdsSolutionsBase/libs/CleverAdsSolutions.xcframework/ios-arm64/$framework.framework")
        processFramework(
            artifact = "$framework.framework",
            moduleFolder = "clearads/ios",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "clearads.yaml",
            version = { artifactLocation.infoPlist.extractVersion() },
            instruction = """
                0. download latest CleverAdsSolutionsBase.tar.gz from https://github.com/cleveradssolutions/CAS-iOS/releases/
                1. unpack
                2. expected location ${artifactLocation}
            """.trimIndent(),
        )
    },


    ).also {
    registerAppCenter(it, knownGroups)
    registerFirebase(it, knownGroups)
    registerFacebook(it, knownGroups)
    registerFlurry(it, knownGroups)
    registerKochava(it, knownGroups)
    registerMobileAdsMediationAdapters(it, knownGroups)
}


// parse arguments
var parallelBuild = false
var interactive = false
var downloadInstructions = false
val frameworkToProcess = mutableListOf<String>()
args.forEach { arg ->
    if (arg.startsWith("-")) {
        when (arg) {
            "-v" -> log.verbose = true
            "-p" -> parallelBuild = true
            "-i" -> interactive = true
            "-d" -> {
                downloadInstructions = true; interactive = true
            }
            "-h" -> printHelpAndExit(0)
            "--help" -> printHelpAndExit(0)
            else -> {
                println("Error: unknown argument $arg")
                printHelpAndExit(-1)
            }
        }
    } else {
        if (knownFrameworks.keys.contains(arg)) {
            frameworkToProcess.add(arg)
        } else knownGroups[arg]?.let {
            frameworkToProcess.addAll(it)
        } ?: run {
            println("Error: unknown framework or group $arg")
            printHelpAndExit(-1)
        }
    }
}

if (frameworkToProcess.isEmpty()) {
    if (downloadInstructions) {
        frameworkToProcess.addAll(knownFrameworks.keys)
    } else {
        println("Error: not specified framework to process !")
        printHelpAndExit(-1)
    }
}

if (interactive && parallelBuild) {
    println("Error: interactive can't be used with parallel build!")
    printHelpAndExit(-1)
}

frameworkToProcess.run { if (parallelBuild && size > 1) parallelStream() else stream() }
    .forEach { framework -> knownFrameworks[framework]?.invoke(framework) }

println("bye-bye")

fun printHelpAndExit(code: Int) {
    println("usage:")
    println("scripts/harvester.kts [--help] [-v] [-p] [framework1 framework2 ...]")
    println("   --help, -h : prints this help and exits")
    println("           -v : enables verbose output")
    println("           -p : enables parallel processing")
    println("           -i : interactive mode, will check for existing folder and wait for it")
    println("           -d : interactive mode, will print download instructions and wait for frameworks")
    println("   frameworkX : list of frameworks to process. if not specified all frameworks will be processed")
    println("Known frameworks:")
    knownFrameworks.keys.sorted().forEach { println("    $it") }
    println("Known groups:")
    knownGroups.keys.sorted().forEach { group ->
        println("    $group:")
        knownGroups[group]?.forEach { println("        $it") }
    }
    exitProcess(code)
}


fun processInternal(
    framework: String,
    versionProvider: () -> String,
    moduleFolder: String,
    sourceHeadersDir: File,
    destinationHeadersDir: File,
    javaFolder: File,
    yamlFile: File,
    pomFile: File,
    instruction: String?,
    interactiveValidateHeaderFolder: (framework: String, sourceHeadersDir: File, instruction: String?, optional: Boolean) -> Unit,
    headerFolderCleaner: (framework: String, destinationHeadersDir: File) -> Unit,
    headersCopier: (framework: String, sourceHeadersDir: File, destinationHeadersDir: File) -> Unit,
    javaFolderCleaner: (framework: String, destinationJavaDir: File) -> Unit,
    broGenExecutor: (framework: String, javaFolder: File, yamlFile: File) -> Unit,
    pomVersionStringUpdater: (framework: String, pomFile: File, version: String) -> Unit,
    readmeFileVersionUpdater: (framework: String, moduleFolder: String, version: String) -> Unit
) {
    if (interactive) {
        if (downloadInstructions) {
            // extract version from the pom file
            val version = getPomVersionString(framework, pomFile)
            println("$framework: current version $version")
        }
        interactiveValidateHeaderFolder(framework, sourceHeadersDir, instruction, downloadInstructions)
        if (downloadInstructions)
            return
    }

    val version = versionProvider()
    log.d("$framework: version $version")
    headerFolderCleaner(framework, destinationHeadersDir)
    headersCopier(framework, sourceHeadersDir, destinationHeadersDir)
    javaFolderCleaner(framework, javaFolder)
    broGenExecutor(framework, javaFolder, yamlFile)
    pomVersionStringUpdater(framework, pomFile, version)
    readmeFileVersionUpdater(framework, moduleFolder, version)
}


fun cleanUpHeaders(framework: String, destinationHeadersDir: File) {
    // remove destination headers folder
    if (destinationHeadersDir.exists()) {
        log.i("$framework:  Removing existing headers @${destinationHeadersDir.canonicalPath}")
        destinationHeadersDir.requiresDeleteRecursively()
    }
}

fun cleanUpJava(framework: String, destinationJavaDir: File) {
    // remove destination headers folder
    if (destinationJavaDir.exists()) {
        log.i("$framework:  Removing existing Java folder @${destinationJavaDir.canonicalPath}")
        destinationJavaDir.requiresDeleteRecursively()
    }
}

fun interactiveValidateHeaderFolder(framework: String, sourceHeadersDir: File, instruction: String?, optional: Boolean = true) {
    val text = instruction
        ?: "There is no instruction configured for $framework.\nPlease provide missing framework at path specified."
    while (!sourceHeadersDir.isDirectory) {
        println("\n\nMissing source header for $framework at location:\n${sourceHeadersDir.canonicalPath}")
        println("")
        println(text)
        if (optional) {
            println("\n\nEnter Y to retry, ENTER to skip")
            val line = readLine()?.uppercase()
            if (line != "Y")
                break
        } else {
            println("\n\nPress ENTER key once solved")
            readLine()
        }
    }
}

fun copyHeaders(framework: String, sourceHeadersDir: File, destinationHeadersDir: File) {
    // check if source folder exists
    sourceHeadersDir.requiresIsDirectory { "Missing header folder for $framework at ${sourceHeadersDir.canonicalPath}" }

    // copy new headers
    destinationHeadersDir.requireMkdirs()
    log.i("$framework:  Copy headers from ${sourceHeadersDir.canonicalPath}")
    log.i("$framework:                 to ${destinationHeadersDir.canonicalPath}")
    sourceHeadersDir.copyRecursively(destinationHeadersDir)
}


fun copyHeadersFiltered(
    framework: String,
    sourceHeadersDir: File,
    destinationHeadersDir: File,
    flatten: Boolean = false,
    filter: (Path) -> Boolean = { true }
) {
    // check if source folder exists
    sourceHeadersDir.requiresIsDirectory { "Missing header folder for $framework at ${sourceHeadersDir.canonicalPath}" }

    // copy new headers
    destinationHeadersDir.requireMkdirs()
    log.i("$framework:  Copy headers from ${sourceHeadersDir.canonicalPath}")
    log.i("$framework:                 to ${destinationHeadersDir.canonicalPath}")

    val sourcePath = sourceHeadersDir.toPath()
    val destinationPath = destinationHeadersDir.toPath()
    Files.walk(sourcePath).forEach { source ->
        if (filter(source)) {
            val dest = destinationPath.resolve(if (flatten) source.fileName else sourcePath.relativize(source))
            dest.toFile().requireMkdirs()
            Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING)
        }
    }
}


fun execBroGen(framework: String, javaFolder: File, yamlFile: File) {
    // check if yaml file exists
    yamlFile.requiresIsFile { "$framework is missing yaml-file ${yamlFile.canonicalPath}" }

    // generating binding
    val broGenCmd = "${broGenScript.canonicalPath} ${javaFolder.canonicalPath} ${yamlFile.canonicalPath}"
    log.i("$framework:  Invoking bro-gen with command: $broGenCmd")
    exec("$framework:    ", broGenCmd)
}

fun getPomVersionString(framework: String, pomFile: File): String? {
    pomFile.requiresIsFile { "$framework is missing pom.xml ${pomFile.canonicalPath}" }
    val artifactTitleWithVersion = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(pomFile)
        .getElementByTagName("name")?.getTextValue()
        ?: error("Failed to get <name> from ${pomFile.canonicalPath}")
    return artifactTitleWithVersion.indexOf("iOS v").takeIf { it > 0 }
        ?.let { artifactTitleWithVersion.substring(it + 5).trim() }
        ?: error("'iOS v' is missing in artifact <name> in ${pomFile.canonicalPath}")
}

fun updatePomVersionString(framework: String, pomFile: File, version: String) {
    // updating version string in pom file
    pomFile.requiresIsFile { "$framework is missing pom.xml ${pomFile.canonicalPath}" }
    val artifactTitleWithVersion = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(pomFile)
        .getElementByTagName("name")?.getTextValue()
        ?: error("Failed to get <name> from ${pomFile.canonicalPath}")
    val artifactTitle =
        artifactTitleWithVersion.indexOf("iOS v").takeIf { it > 0 }
            ?.let { artifactTitleWithVersion.substring(0, it).trim() }
            ?: error("'iOS v' is missing in artifact <name> in ${pomFile.canonicalPath}")

    // updating the version in module POM file
    val newTitle = "$artifactTitle iOS v${version}"
    log.i("$framework:  Replacing <name> from: $artifactTitleWithVersion")
    log.i("$framework:                   with: $newTitle")
    pomFile.readText().replaceFirst(artifactTitleWithVersion, newTitle).run { pomFile.writeText(this) }
}

fun updateReadmeFileVersionString(framework: String, moduleFolder: String, version: String) {
    // updating the version in README file
    synchronized(readmeFile) {
        var original: String? = null
        var replacement: String? = null
        var versionLineFound = false
        val readmeModuleName = moduleFolder.substringBefore('/')
        readmeFile.readLines().map { line ->
            if (!versionLineFound)
                versionLineFound = line.startsWith("## Version of AltPods")
            if (versionLineFound && replacement == null && line.startsWith("|")) {
                val cols = line.split("|").toMutableList()
                if (cols.size == 4 && cols[1].contains("($readmeModuleName/)")) {
                    cols[2] = " $version".padEnd(cols[2].length)
                    original = line
                    replacement = cols.joinToString("|")
                    replacement!!
                } else line
            } else line
        }.run {
            if (replacement == null || original == null)
                error("$framework version entry ($readmeModuleName/) is not found in ${readmeFile.canonicalPath}")
            log.i("$framework:  Replacing README.md version from: $original")
            log.i("$framework:                                to: $replacement")
            readmeFile.writeText(this.joinToString(System.lineSeparator()))
        }
    }
}

fun updateModuleReadmeFileVersionString(framework: String, moduleReadmeFile: File, moduleFolder: String, version: String) {
    // updating the version in README file
    synchronized(readmeFile) {
        var original: String? = null
        var replacement: String? = null
        val readmeModuleName = File(moduleFolder).name
        moduleReadmeFile.requiresIsFile { "$framework is missing ${moduleReadmeFile.canonicalPath}" }
        moduleReadmeFile.readLines().map { line ->
            if (replacement == null && line.startsWith("|")) {
                val cols = line.split("|").toMutableList()
                if (cols.size == 5 && cols[1].contains("($readmeModuleName/)")) {
                    cols[3] = " $version".padEnd(cols[3].length)
                    original = line
                    replacement = cols.joinToString("|")
                    replacement
                } else line
            } else line
        }.run {
            if (replacement == null || original == null)
                error("$framework version entry ($readmeModuleName/) is not found in ${moduleReadmeFile.canonicalPath}")
            log.i("$framework:  Replacing README.md version from: $original")
            log.i("$framework:                                to: $replacement")
            moduleReadmeFile.writeText(this.joinToString(System.lineSeparator()))
        }
    }
}

// common framework processing code
fun processFramework(
    artifact: String,
    moduleFolder: String,
    sourceHeadersDir: File,
    destinationHeadersDir: File? = null,
    yaml: String,
    version: () -> String,
    instruction: String? = null,
    interactiveValidateHeaderFolder: (framework: String, sourceHeadersDir: File, instruction: String?, optional: Boolean) -> Unit = ::interactiveValidateHeaderFolder,
    headerFolderCleaner: (framework: String, destinationHeadersDir: File) -> Unit = ::cleanUpHeaders,
    headersCopier: (framework: String, sourceHeadersDir: File, destinationHeadersDir: File) -> Unit = ::copyHeaders,
    broGenExecutor: (framework: String, javaFolder: File, yamlFile: File) -> Unit = ::execBroGen,
    javaFolderCleaner: (framework: String, destinationJavaDir: File) -> Unit = ::cleanUpJava,
    pomVersionStringUpdater: (framework: String, pomFile: File, version: String) -> Unit = ::updatePomVersionString,
    readmeFileVersionUpdater: (framework: String, moduleFolder: String, version: String) -> Unit = ::updateReadmeFileVersionString,
) {
    log.d("$artifact:  <<<< starting processing")

    // check if source folder exists
    val resolvedDestinationHeadersDir =
        destinationHeadersDir ?: Path.of(moduleFolder, "src", "main", "bro-gen", artifact, "Headers").toFile()
    val javaFolder = Path.of(moduleFolder, "src", "main", "java").toFile()
    val yamlFile = Path.of(moduleFolder, "src", "main", "bro-gen", yaml).toFile()
    val pomFile = Path.of(moduleFolder, "pom.xml").toFile()

    // default processing
    processInternal(
        artifact, version, moduleFolder, sourceHeadersDir, resolvedDestinationHeadersDir, javaFolder, yamlFile, pomFile,
        instruction = instruction,
        interactiveValidateHeaderFolder = interactiveValidateHeaderFolder,
        headerFolderCleaner = headerFolderCleaner,
        headersCopier = headersCopier,
        javaFolderCleaner = javaFolderCleaner,
        broGenExecutor = broGenExecutor,
        pomVersionStringUpdater = pomVersionStringUpdater,
        readmeFileVersionUpdater = readmeFileVersionUpdater
    )

    log.d("$artifact:  <<<< finished processing")
}

fun extractVersionFromPlist(infoPlist: File): String {
    return execAndGetString(
        arrayOf(
            "/usr/libexec/PlistBuddy",
            "-c",
            "Print :CFBundleShortVersionString",
            infoPlist.canonicalPath
        )
    )[0]
}

fun azureVersionFromReadme(readmeFile: File): String {
    return readmeFile.readLines().find { it.startsWith("github \"Azure/azure-notificationhubs-ios\" ~> ") }
        ?.substringAfter("~> ")
        ?: error("Version not found in ${readmeFile.canonicalPath}")
}

fun File.requiresCanExecute(msgProvider: () -> String) {
    if (!this.canExecute())
        throw IllegalStateException(msgProvider())
}

fun File.requiresIsDirectory(msgProvider: () -> String) {
    if (!this.isDirectory)
        throw IllegalStateException(msgProvider())
}

fun File.requiresIsFile(msgProvider: () -> String) {
    if (!this.isFile)
        throw IllegalStateException(msgProvider())
}

fun File.requiresDeleteRecursively() {
    if (!this.deleteRecursively())
        throw IllegalStateException("Failed to delete ${this.canonicalPath}")
}

fun File.requireMkdirs(): File {
    if (!this.mkdirs())
        throw IllegalStateException("Failed to mkdirs ${this.canonicalPath}")
    return this
}

val File.headers: File
    get() = File(this, "Headers")

val File.infoPlist: File
    get() = File(this, "Info.plist")

fun File.extractVersion(): String {
    return extractVersionFromPlist(this)
}

fun File.extend(path: String): File = File(this, path)
fun String.extend(path: String): File = File(this, path)

fun exec(prefix: String, command: String) {
    val p = Runtime.getRuntime().exec(command)
    thread { p.errorStream.pipeTo(System.err, prefix) }
    thread { p.inputStream.pipeTo(System.out, prefix) }
    p.waitFor().also { code ->
        if (code != 0)
            error("non zero exit code $code when executing $command")
    }
}

fun execAndGetString(command: Array<String>): List<String> {
    val p = Runtime.getRuntime().exec(command)
    return p.inputStream.bufferedReader().readLines().also {
        val code = p.waitFor()
        if (code != 0)
            error("non zero exit code $code when executing ${command.joinToString(" ")}\noutput:${it.joinToString("\n")}")
    }
}

fun InputStream.pipeTo(out: PrintStream, prefix: String) = thread {
    this@pipeTo.bufferedReader().apply {
        try {
            var line: String?
            while (run { line = readLine(); line } != null) {
                out.println(prefix + line)
            }
        } catch (ignore: Throwable) {
        }
    }
}

class Log {
    var verbose = false

    val allowedI: Boolean
        get() = verbose

    fun i(msg: String) {
        if (allowedI)
            println(msg)
    }

    val allowedD = true
    fun d(msg: String) {
        if (allowedD)
            println(msg)
    }
}

fun Document.getElementByTagName(tagName: String): Element? {
    return this.documentElement.getElementByTagName(tagName)
}

fun Element.getElementByTagName(tagName: String): Element? {
    for (i in 0 until childNodes.length) {
        val item = childNodes.item(i)
        if (item.nodeType == Node.ELEMENT_NODE && (item as? Element)?.tagName == tagName)
            return item
    }
    return null
}

fun Element.getTextValue(): String? {
    for (i in 0 until childNodes.length) {
        val item = childNodes.item(i)
        if (item.nodeType == Node.TEXT_NODE)
            return item.nodeValue
    }
    return null
}

fun oneTimeReadmeUpdater(versionOverride: String? = null): (String, String, String) -> Unit {
    val provider: (() -> String)? = versionOverride?.let { { it } }
    return oneTimeReadmeUpdater(provider)
}

fun oneTimeReadmeUpdater(versionOverrideProvider: (() -> String)? = null): (String, String, String) -> Unit {
    val updater = object {
        var readmeUpdated = false
        fun readmeUpdater(framework: String, moduleFolder: String, version: String) {
            if (!readmeUpdated) {
                updateReadmeFileVersionString(framework, moduleFolder, versionOverrideProvider?.invoke() ?: version)
                readmeUpdated = true
            }
        }
    }
    return updater::readmeUpdater
}

class GroupFrameworkRegister(
    private val groupName: String,
    private val frameworkRegistry: MutableMap<String, (String) -> Unit>,
    private val groupRegistry: MutableMap<String, MutableList<String>>
) {
    operator fun set(framework: String, action: (String) -> Unit) {
        frameworkRegistry[framework] = action
        groupRegistry.computeIfAbsent(groupName) { mutableListOf() }.add(framework)
    }
}

fun registerAppCenter(frameworkRegistry: MutableMap<String, (String) -> Unit>, groupRegistry: MutableMap<String, MutableList<String>>) {
    val registry = GroupFrameworkRegister("AppCenter", frameworkRegistry, groupRegistry)
    val appCenterRoot = "AppCenter-SDK-Apple/iOS"
    val appCenterVersion: String by lazy {
        downloadFolder.extend("AppCenter-SDK-Apple/CHANGELOG.md")
            .readLines()
            .find { it.startsWith("## Version ") }
            ?.replace("## Version ", "")?.trim()
            ?: error("Failed to extract SDK version from CHANGLOG.md")
    }

    val appCenterInstallInstruction = """
        1. Download latest AppCenter-SDK-Apple-x.y.z.zip from https://github.com/microsoft/appcenter-sdk-apple/releases
        2. Unpack
        3. Rename ${downloadFolder.extend("AppCenter-SDK-Apple-x.y.z")} to ${downloadFolder.extend("AppCenter-SDK-Apple")} 
    """.trimIndent()

    val readmeUpdater = oneTimeReadmeUpdater { appCenterVersion }
    fun action(
        framework: String, moduleFolder: String, yaml: String,
        artifact: String = "$framework.framework",
        frameworkLocation: String = "$appCenterRoot/$artifact",
    ) {
        val artifactLocation = downloadFolder.extend(frameworkLocation)
        processFramework(
            artifact = artifact,
            moduleFolder = moduleFolder,
            sourceHeadersDir = artifactLocation.headers,
            yaml = yaml,
            version = { appCenterVersion },
            readmeFileVersionUpdater = readmeUpdater,
            instruction = appCenterInstallInstruction
        )
    }
    registry["AppCenterCore"] = { framework -> action(framework, "appcenter/ios-core", "appcenter.yaml", artifact = "AppCenter.framework") }
    registry["AppCenterAnalytics"] = { framework -> action(framework, "appcenter/ios-analytics", "appcenter-analytics.yaml") }
    registry["AppCenterCrashes"] = { framework -> action(framework, "appcenter/ios-crashes", "appcenter-crashes.yaml") }
    registry["AppCenterDistribute"] = { framework -> action(framework, "appcenter/ios-distribute", "appcenter-distribute.yaml") }
}

fun registerFirebase(frameworkRegistry: MutableMap<String, (String) -> Unit>, groupRegistry: MutableMap<String, MutableList<String>>) {
    val registry = GroupFrameworkRegister("Firebase", frameworkRegistry, groupRegistry)
    val versionProvider = object {
        val versions: Map<String, String> by lazy {
            // read versions from README.md
            downloadFolder.extend("Firebase/README.md")
                .readLines()
                .filter { it.contains(" | ") }
                .mapNotNull {
                    it.split(" | ")
                        .takeIf { tokens -> tokens.size == 2 && tokens[0].isNotBlank() && tokens[1].isNotBlank() }
                        ?.let { tokens -> tokens[0].trim() to tokens[1].trim() }
                }.toMap()
                .also {
                    if (log.allowedI) {
                        log.i("Firebase version map:")
                        it.forEach { (k, v) -> log.i("  $k: $v") }
                    }
                }
        }

        operator fun get(key: String) = versions[key] ?: error("Failed to resolve version for $key")
    }

    val firebaseInstallInstruction = """
        Download latest Firebase.zip from https://github.com/firebase/firebase-ios-sdk/releases
        Unpack it, expected location ${downloadFolder.extend("Firebase")}
    """.trimIndent()
    val moduleReadmeFile = Path.of("Firebase/README.md").toFile()
    val readmeUpdater = oneTimeReadmeUpdater { versionProvider["Firebase"] }
    // some ios-arm64_armv7 other ios-arm64
    fun pickLocation(framework: String, prefix: String = framework) : File {
        val candidate = downloadFolder.extend("Firebase/$prefix/$framework.xcframework/ios-arm64/$framework.framework")
        return if (candidate.exists()) candidate
        else downloadFolder.extend("Firebase/$prefix/$framework.xcframework/ios-arm64_armv7/$framework.framework")
    }
    fun action(
        framework: String, moduleFolder: String, yaml: String, versionKey: String = framework,
        frameworkLocation: File = pickLocation(framework),
        destinationHeadersDir: File? = null,
        interactiveValidateHeaderFolder: (framework: String, sourceHeadersDir: File, instruction: String?, optional: Boolean) -> Unit = ::interactiveValidateHeaderFolder,
        headerFolderCleaner: (framework: String, destinationHeadersDir: File) -> Unit = ::cleanUpHeaders,
        headersCopier: (framework: String, sourceHeadersDir: File, destinationHeadersDir: File) -> Unit = ::copyHeaders
    ) {
        val artifactLocation = frameworkLocation
        processFramework(
            artifact = "$framework.framework",
            moduleFolder = moduleFolder,
            destinationHeadersDir = destinationHeadersDir,
            sourceHeadersDir = artifactLocation.headers,
            yaml = yaml,
            version = { versionProvider[versionKey] },
            readmeFileVersionUpdater = { frm, modFolder, version ->
                readmeUpdater(frm, modFolder, version)
                updateModuleReadmeFileVersionString(frm, moduleReadmeFile, modFolder, version)
            },
            instruction = firebaseInstallInstruction,
            interactiveValidateHeaderFolder = interactiveValidateHeaderFolder,
            headerFolderCleaner = headerFolderCleaner,
            headersCopier = headersCopier
        )
    }

    registry["FirebaseCore"] = { framework ->
        action(framework, "firebase/ios-core", "firebase-core.yaml",
            frameworkLocation = pickLocation("FirebaseCore", "FirebaseAnalytics"))
    }
    registry["FirebaseAnalytics"] = { framework -> action(framework, "firebase/ios-analytics", "firebase-analytics.yaml") }
    registry["FirebaseAuth"] = { framework -> action(framework, "firebase/ios-auth", "firebaseauth.yaml") }
    registry["FirebaseCrashlytics"] = { framework -> action(framework, "firebase/ios-crashlytics", "firebase-crashlytics.yaml") }
    registry["FirebaseDatabase"] = { framework -> action(framework, "firebase/ios-database", "firebasedatabase.yaml") }
    registry["FirebaseDynamicLinks"] = { framework -> action(framework, "firebase/ios-dylinks", "firebasedylinks.yaml") }
    registry["FirebaseFirestore"] = { framework -> action(framework, "firebase/ios-firestore", "firebasefirestore.yaml") }
    registry["FirebaseMessaging"] = { framework -> action(framework, "firebase/ios-messaging", "firebase-messaging.yaml") }
    registry["FirebaseRemoteConfig"] = { framework -> action(framework, "firebase/ios-remoteconfig", "firebase-remoteconfig.yaml") }
    registry["FirebaseStorage"] = { framework -> action(framework, "firebase/ios-storage", "firebasestorage.yaml") }
    registry["GoogleMobileAds"] = { framework ->
        action(framework, "firebase/ios-google-mobile-ads", "gad.yaml",
            versionKey = "Google-Mobile-Ads-SDK",
            frameworkLocation = pickLocation("GoogleMobileAds", "Google-Mobile-Ads-SDK"))
    }
    registry["GoogleSignIn"] = { framework ->
        action(framework,
            moduleFolder = "firebase/ios-google-sign-in", "firebase-google-sign-in.yaml",
            frameworkLocation =  pickLocation("GoogleSignIn"),
            destinationHeadersDir = Path.of("firebase", "ios-google-sign-in", "src", "main", "bro-gen").toFile(),
            headerFolderCleaner = { _, dst ->
                cleanUpHeaders("GoogleSignIn", dst.extend("GoogleSignIn.framework"))
                cleanUpHeaders("GTMSessionFetcher", dst.extend("GTMSessionFetcher.framework"))
            },
            headersCopier = { _, _, dst ->
                copyHeaders("GoogleSignIn.framework",
                    pickLocation("GoogleSignIn").extend("Headers"),
                    dst.extend("GoogleSignIn.framework/Headers"))
                copyHeaders("GTMSessionFetcher.framework",
                    pickLocation("GTMSessionFetcher", "GoogleSignIn").extend("Headers"),
                    dst.extend("GTMSessionFetcher.framework/Headers"))
            } ,
            interactiveValidateHeaderFolder = { _, _, instruction, optional ->
                interactiveValidateHeaderFolder("GoogleSignIn.framework",
                    pickLocation("GoogleSignIn").extend("Headers"), instruction, optional)
                interactiveValidateHeaderFolder("GTMSessionFetcher.framework",
                    pickLocation("GTMSessionFetcher", "GoogleSignIn").extend("Headers"), instruction, optional)
            },
        )
    }
    registry["UserMessagingPlatform"] = { framework ->
        action(framework, "firebase/ios-google-ump", "firebase-ump.yaml",
            versionKey = "GoogleUserMessagingPlatform",
            frameworkLocation = pickLocation("UserMessagingPlatform", "Google-Mobile-Ads-SDK"))
    }
    registry["FirebaseAppCheck"] = { framework -> action(framework, "firebase/ios-appcheck", "firebase-appcheck.yaml") }
}

fun registerMobileAdsMediationAdapters(frameworkRegistry: MutableMap<String, (String) -> Unit>, groupRegistry: MutableMap<String, MutableList<String>>) {
    val registry = GroupFrameworkRegister("FirebaseAdsAdapters", frameworkRegistry, groupRegistry)
    val moduleReadmeFile = Path.of("firebase/ios-google-mobile-ads-adapters/README.md").toFile()
    registry["AppLovinAdapter"] = { framework ->
        val artifact = "$framework.framework"
        val artifactLocation =
            downloadFolder.extend("AppLovinAdapter/AppLovinAdapter.xcframework/ios-arm64_armv7/$artifact")
        processFramework(
            artifact = artifact,
            moduleFolder = "firebase/ios-google-mobile-ads-adapters/ios-applovin",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "applovin-adapter.yaml",
            version = { downloadFolder.extend("AppLovinAdapter/version").readText() },
            instruction = """
                1. download AppLovinAdapter-X.X.X.X.zip from https://developers.google.com/admob/ios/mediation/applovin#applovin-ios-mediation-adapter-changelog
                2. extract and rename folder to AppLovinAdapter
                3. create a file ${downloadFolder.extend("AppLovinAdapter/version")} and put verions there, e.g. 4.0.0
                4. expected location ${downloadFolder.extend("AppLovinAdapter/AppLovinAdapter.xcframework/ios-arm64_armv7/")}
            """.trimIndent(),
            readmeFileVersionUpdater = { frm, modFolder, version ->
                updateModuleReadmeFileVersionString(frm, moduleReadmeFile, modFolder, version)
            }
        )
    }
    registry["MetaAdapter"] = { framework ->
        val artifact = "$framework.framework"
        val artifactLocation =
            downloadFolder.extend("MetaAdapter/MetaAdapter.xcframework/ios-arm64_armv7/$artifact")
        processFramework(
            artifact = artifact,
            moduleFolder = "firebase/ios-google-mobile-ads-adapters/ios-facebook",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "facebook-adapter.yaml",
            version = { downloadFolder.extend("MetaAdapter/version").readText() },
            instruction = """
                1. download MetaAdapter-X.X.X.X.zip from https://developers.google.com/admob/ios/mediation/meta#meta-audience-network-ios-mediation-adapter-changelog
                2. extract and rename folder to MetaAdapter 
                3. create a file ${downloadFolder.extend("MetaAdapter/version")} and put verions there, e.g. 4.0.0
                4. expected location ${downloadFolder.extend("MetaAdapter/MetaAdapter.xcframework/ios-arm64_armv7/")}
            """.trimIndent(),
            readmeFileVersionUpdater = { frm, modFolder, version ->
                updateModuleReadmeFileVersionString(frm, moduleReadmeFile, modFolder, version)
            },
        )
    }
    registry["InMobiAdapter"] = { framework ->
        val artifact = "$framework.framework"
        val artifactLocation =
            downloadFolder.extend("InMobiAdapter/InMobiAdapter.xcframework/ios-arm64_armv7/$artifact")
        processFramework(
            artifact = artifact,
            moduleFolder = "firebase/ios-google-mobile-ads-adapters/ios-inmobi",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "inmobi-adapter.yaml",
            version = { downloadFolder.extend("InMobiAdapter/version").readText() },
            instruction = """
                1. download InMobiAdapter-X.X.X.X.zip from https://developers.google.com/admob/ios/mediation/inmobi#inmobi-ios-mediation-adapter-changelog
                2. extract and rename folder to InMobiAdapter 
                3. expected location ${downloadFolder.extend("InMobiAdapter/InMobiAdapter.xcframework/ios-arm64_armv7/")}
            """.trimIndent(),
            readmeFileVersionUpdater = { frm, modFolder, version ->
                updateModuleReadmeFileVersionString(frm, moduleReadmeFile, modFolder, version)
            },
        )
    }
}

fun registerFacebook(frameworkRegistry: MutableMap<String, (String) -> Unit>, groupRegistry: MutableMap<String, MutableList<String>>) {
    val registry = GroupFrameworkRegister("Facebook", frameworkRegistry, groupRegistry)
    val facebookRoot = "Facebook"
    fun extractVersionFromHeader(frameworkName: String, header: File, versionTag: String): String {
        return header.readLines()
            .find { it.startsWith("#define $versionTag @\"") && it.endsWith("\"") }
            ?.substringAfter('\"')?.substringBefore('\"')?.substringBefore(".master")
            ?: error("Filed to evaluate $frameworkName version")
    }

    val facebookVersion: String by lazy {
        extractVersionFromHeader("Facebook",
            downloadFolder.extend("$facebookRoot/FBSDKCoreKit.xcframework/ios-arm64/FBSDKCoreKit.framework/Headers/FBSDKCoreKitVersions.h"),
            "FBSDK_VERSION_STRING")
    }

    val facebookInstallInstruction = """
        1. Download latest FacebookSDK_Dynamic.xcframework.zip from https://github.com/facebook/facebook-ios-sdk/releases
        2. Unpack it, it will be unpacked to ${downloadFolder.extend("XCFrameworks")}
        3. Rename ${downloadFolder.extend("XCFrameworks")} to ${downloadFolder.extend("Facebook")}
    """.trimIndent()
    val facebookAudienceInstallInstruction = """
        1. Download latest FBAudienceNetwork-X.Y.Z.zip from https://developers.facebook.com/docs/audience-network/guides/adding-sdk/ios
        2. Unpack it, it will be unpacked to ${downloadFolder.extend("FBAudienceNetwork-X.Y.Z")}
        3. Rename ${downloadFolder.extend("FBAudienceNetwork-X.Y.Z")} to ${downloadFolder.extend("FBAudienceNetwork")}
    """.trimIndent()

    val readmeUpdater = oneTimeReadmeUpdater { facebookVersion }
    val moduleReadmeFile = Path.of("facebook/README.md").toFile()
    fun action(
        framework: String, moduleFolder: String, yaml: String,
        frameworkLocation: String = "${facebookRoot}/$framework.xcframework/ios-arm64/$framework.framework",
        readmeFileVersionUpdater: (String, String, String) -> Unit = readmeUpdater,
        instruction: String = facebookInstallInstruction,
        versionProvider: () -> String = { facebookVersion }
    ) {
        val artifactLocation = downloadFolder.extend(frameworkLocation)
        processFramework(
            artifact = "$framework.framework",
            moduleFolder = moduleFolder,
            sourceHeadersDir = artifactLocation.headers,
            yaml = yaml,
            version = versionProvider,
            readmeFileVersionUpdater = { frm, modFolder, version ->
                readmeFileVersionUpdater(frm, modFolder, version)
                updateModuleReadmeFileVersionString(frm, moduleReadmeFile, modFolder, version)
            },
            instruction = instruction
        )
    }

    registry["FBSDKCoreKit_Basics"] = { framework -> action(framework, "facebook/ios-core-basics", "facebook-core-basics.yaml") }
    registry["FBSDKCoreKit"] = { framework -> action(framework, "facebook/ios-core", "facebook-core.yaml") }
    registry["FBSDKLoginKit"] = { framework -> action(framework, "facebook/ios-login", "facebook-login.yaml") }
    registry["FBSDKShareKit"] = { framework -> action(framework, "facebook/ios-share", "facebook-share.yaml") }
    registry["FBAEMKit"] = { framework -> action(framework, "facebook/ios-aem", "facebook-aemkit.yaml") }
    registry["FBAudienceNetwork"] = { framework ->
        action(framework, "facebook/ios-audience", "facebook-audience.yaml",
            frameworkLocation = "FBAudienceNetwork/Dynamic/FBAudienceNetwork.xcframework/ios-arm64_armv7/FBAudienceNetwork.framework",
            instruction = facebookAudienceInstallInstruction,
            readmeFileVersionUpdater = { _, _, _ -> },
            versionProvider = {
                extractVersionFromHeader("FBAudienceNetwork",
                    downloadFolder.extend("FBAudienceNetwork/Dynamic/FBAudienceNetwork.xcframework/ios-arm64_armv7/FBAudienceNetwork.framework/Headers/FBAudienceNetwork.h"),
                    "FB_AD_SDK_VERSION")
            })
    }
}

fun registerFlurry(frameworkRegistry: MutableMap<String, (String) -> Unit>, groupRegistry: MutableMap<String, MutableList<String>>) {
    val registry = GroupFrameworkRegister("Flurry", frameworkRegistry, groupRegistry)
    val flurryVersion: String by lazy {
        val podspecFile = downloadFolder.extend("Flurry-iOS-SDK/Flurry-iOS-SDK.podspec")
        var res: String? = null
        podspecFile.readLines().forEach line@{
            it.split('=').takeIf { chunks -> chunks.size == 2 && chunks[0].contains(".version") }
                ?.get(1)?.let { version ->
                    res = version.trim().substringAfter('\'').substringBefore('\'')
                    return@line
                }
        }
        res ?: error("Version not found in ${podspecFile.canonicalPath}")
    }
    val instruction = """
        1. login to https://dev.flurry.com/admin/applications
        2. download iOS SDK and unpack  
        3. rename it to ${downloadFolder.extend("Flurry-iOS-SDK/")}
    """.trimIndent()
    val readmeUpdater = oneTimeReadmeUpdater { flurryVersion }
    fun action(lib: String, moduleFolder: String, yaml: String) {
        processFramework(
            artifact = "$lib.lib",
            moduleFolder = moduleFolder,
            sourceHeadersDir = downloadFolder.extend("Flurry-iOS-SDK/$lib"),
            yaml = yaml,
            version = { flurryVersion },
            readmeFileVersionUpdater = readmeUpdater,
            headersCopier = { frm, sourceHeadersDir, destinationHeadersDir ->
                copyHeadersFiltered(frm, sourceHeadersDir, destinationHeadersDir, flatten = true) {
                    it.fileName.toString().endsWith(".h")
                }
            },
            instruction = instruction
        )
    }

    registry["FlurryAnalytics"] = { action("Flurry", "flurry/ios-analytics", "flurry.yaml") }
    registry["FlurryAds"] = { lib -> action(lib, "flurry/ios-ads", "flurry_ads.yaml") }
    registry["FlurryConfig"] = { lib -> action(lib, "flurry/ios-config", "flurry_config.yaml") }
    registry["FlurryMessaging"] = { lib -> action(lib, "flurry/ios-messaging", "flurry_messaging.yaml") }
}

fun registerKochava(frameworkRegistry: MutableMap<String, (String) -> Unit>, groupRegistry: MutableMap<String, MutableList<String>>) {
    val registry = GroupFrameworkRegister("Kochava", frameworkRegistry, groupRegistry)
    val readmeUpdater = oneTimeReadmeUpdater(versionOverrideProvider = null)
    fun action(framework: String, moduleFolder: String, yaml: String) {
        val artifactLocation = downloadFolder.extend("Apple-XCFramework-$framework/$framework.xcframework/ios-arm64_armv7/$framework.framework")
        processFramework(
            artifact = "$framework.framework",
            moduleFolder = moduleFolder,
            sourceHeadersDir = artifactLocation.headers,
            yaml = yaml,
            version = { artifactLocation.infoPlist.extractVersion() },
            readmeFileVersionUpdater = readmeUpdater,
            instruction = """
                1. Download recent version of `Source code (zip)` from https://github.com/Kochava/Apple-XCFramework-$framework/releases
                2. unpack and rename to ${downloadFolder.extend("Apple-XCFramework-$framework")}
            """.trimIndent(),
            headersCopier = { frm, sourceHeadersDir, destinationHeadersDir ->
                copyHeaders(frm, sourceHeadersDir, destinationHeadersDir)
                // create a wrapper, as objc headers contains less data now that swift one
                File(destinationHeadersDir, "$framework-wrap.h")
                    .appendText("\n#include <TargetConditionals.h>\n#import <UIKit/UIKit.h>\n#import <$framework/$framework-Swift.h>")
            },
        )
    }
    registry["KochavaCore"] = { framework -> action(framework, "kochava/ios-core", "kochava-core.yaml") }
    registry["KochavaTracker"] = { framework -> action(framework, "kochava/ios-tracker", "kochava-tracker.yaml") }
    registry["KochavaAdNetwork"] = { framework -> action(framework, "kochava/ios-ads-network", "kochava-ads.yaml") }
}
