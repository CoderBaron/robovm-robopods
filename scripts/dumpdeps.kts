#!/usr/bin/env kotlinc -jvm-target 9 -cp dist/kotlinc/lib/kotlin-main-kts.jar -script
import java.io.File
import java.nio.file.Path
import kotlin.system.exitProcess

/**
 * Simple that builds dependency tree of firebase frameworks
 * @author dkimitsa
 */


// single point for logs
val log = log()
// check if Firebase exists
val firebaseRoot = Path.of(System.getProperty("user.home"), "Downloads", "Firebase").toFile().also {
    it.requiresIsDirectory { "Failed to Firebase directory ${it.canonicalPath}" }
    log.i("Firebase root found at ${it.canonicalPath}")
}

// list all possible frameworks
val frameworkPaths = firebaseRoot
    .walkTopDown()
    .filter {
        val cp = it.canonicalPath
        it.isDirectory && cp.endsWith(".framework") && (!cp.contains(".xcframework") || cp.contains("ios-arm64_armv7") || cp.contains("ios-arm64"))
    }.distinctBy{ it.nameWithoutExtension }
    .toList()
val frameworkNames = frameworkPaths.mapTo(mutableSetOf()) { f-> f.nameWithoutExtension }
val symbolToFramework = mutableMapOf<String, String>()
val frameworkToImports = mutableMapOf<String, List<String>>()
val frameworkToDependencies = mutableMapOf<String, Set<String>>()

// get dependencies
frameworkPaths. parallelStream().forEach { f ->
    val name = f.nameWithoutExtension
    val bin = File(f, name)
    val exports = execAndGetOutSequence("nm -g ${bin.canonicalPath}").mapNotNull {s ->
        val idx = s.indexOf(" T ").takeIf { it != -1 }
                ?: s.indexOf(" D ").takeIf { it != -1 }
        idx?.let { s.substring(it + 3) }?.takeUnless { it.startsWith("__") || it.startsWith("_$") }
    }.toSet()
    val imports = execAndGetOutSequence("nm -g -u -j ${bin.canonicalPath}").filter {
        it.isNotBlank() && !it.contains(':')
    }.distinct().toList()
    val linkerDependencies = run {
        // dump dependencies specified as linker command (LC_LINKER_OPTION_
        var frameworkTagDetected = false
        val frameworkLinePrefix = "string #2 "
        execAndGetOutSequence("otool -l ${bin.canonicalPath}").mapNotNull { s ->
            if (s == "string #1 -framework") {
                    frameworkTagDetected = true
                    null
            } else {
                val res = if (frameworkTagDetected && s.startsWith(frameworkLinePrefix)) {
                    s.substring(frameworkLinePrefix.length).takeIf { frameworkNames.contains(it) }
                } else null
                frameworkTagDetected = false
                res
            }
        }.toSet()
    }

    synchronized(symbolToFramework) {
        exports.forEach {
            if (symbolToFramework.containsKey(it))
                println("### $it ---> $name, was ${symbolToFramework[it]}")
            symbolToFramework[it] = name
        }
        frameworkToImports[name] = imports
        frameworkToDependencies[name] = linkerDependencies
    }
}

// build framework to framework dependency
val frameworkToFramework = frameworkToImports.map { (framework, importedSymbols) ->
    val depFrameworks = importedSymbols.mapNotNullTo(mutableSetOf()) { symbol ->
        // remove self-dependencies
        symbolToFramework[symbol].takeUnless { f -> f == framework }
    }
    depFrameworks.addAll(frameworkToDependencies[framework] ?: emptyList())
    // for FirebaseCore always add FirebaseCoreInternal as it doesn't refer it dirrectly
    // for analytics always add FirebaseInstallations
    when (framework){
        "FirebaseCore" -> depFrameworks.add("FirebaseCoreInternal")
        "FirebaseAnalytics" -> depFrameworks.add("FirebaseInstallations")
        "FirebaseAppCheck" -> depFrameworks.add("AppCheckCore")
        "FirebaseFirestore" -> depFrameworks.add("FirebaseFirestoreInternal")
    }
    framework to depFrameworks.sorted()
}.toMap()

// build deep dependency
fun deepWalker(
    name: String,
    parent: String = name,
    res: MutableList<Pair<String, String>> = mutableListOf(),
    visited: MutableSet<String> = mutableSetOf()
): MutableList<Pair<String, String>> {
    if (!visited.contains(name)) {
        visited.add(name)
        if (name != parent) res.add(parent to name)
        frameworkToFramework[name]?.forEach { deepWalker(it, name, res, visited) }
        visited.remove(name)
    }
    return res
}

// build dependency tree
frameworkToFramework.keys.sorted().forEach { framework ->
    println("$framework:")
    val dependencies = mutableMapOf<String, MutableSet<String>>()
    deepWalker(framework)?.forEach { (framework, dependency) ->
        dependencies.getOrPut( framework, { mutableSetOf<String>() }).add(dependency)
    }
    fun recursiveWalker(items: MutableMap<String, MutableSet<String>>, level: Int = 1, frm: String, action: (level: Int, frm: String) -> Unit) {
        items.remove(frm)?.forEach {
            action(level, it)
            recursiveWalker(items, level + 1, it, action)
        }
    }
    recursiveWalker(dependencies.toMutableMap(), frm = framework) { level, frm -> println("    ".repeat(level) + frm) }
    fun flatSetOf(frm: String) = mutableSetOf<String>().also { flatSet ->
        recursiveWalker(dependencies.toMutableMap(), frm = frm) { _, frm -> flatSet.add(frm) }
    }
    val flatSet = flatSetOf(framework)
    if (flatSet.size > 1) {
        if (flatSet.contains("FirebaseCore")) {
            println("    >>> flat list (without dependencies of FirebaseCore) ")
            val coreFlatSet = flatSetOf("FirebaseCore")
            flatSet.removeAll(coreFlatSet)
            flatSet.remove("FirebaseCore")
        } else {
            println("    >>> flat list")
        }
        flatSet.sorted().forEach { println("    <framework>" + it + "</framework>") }
    }

//    dependencies.asSequence().sortedBy { it.key }
//        .forEach { (frm, req) -> println("    $frm by $req") }
}
exitProcess(0)


fun File.requiresIsDirectory(msgProvider: () -> String) {
    if (!this.isDirectory)
        throw IllegalStateException(msgProvider())
}

fun execAndGetOutSequence(command: String) = sequence {
    val p = Runtime.getRuntime().exec(command)
    p.inputStream.bufferedReader().apply {
        var line: String?
        while (run { line = readLine(); line } != null) {
            yield(line!!.trim())
        }
    }
    p.waitFor().also { code ->
        if (code != 0)
            error("non zero exit code $code when executing $command")
    }
}

class log {
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

