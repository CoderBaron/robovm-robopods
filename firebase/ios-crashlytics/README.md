# Firebase iOS Crashlytics framework

### Frameworks required for this pod: 
* FirebaseCrashlytics.xcframework (from Firebase.zip/FirebaseCrashlytics/FirebaseCrashlytics.xcframework)
* GoogleDataTransport.xcframework (from Firebase.zip/FirebaseCrashlytics/GoogleDataTransport.xcframework)
* PromisesSwift.xcframework (from Firebase.zip/FirebaseCrashlytics/PromisesSwift.xcframework)
* FirebaseSessions.xcframework (from Firebase.zip/FirebaseCrashlytics/FirebaseSessions.xcframework)
* FirebaseInstallations.xcframework (from Firebase.zip/FirebaseAnalytics/FirebaseInstallations.xcframework)
* nanopb.xcframework (from Firebase.zip/FirebaseAnalytics/nanopb.xcframework)

Plus ones required for ios-core module:
* FirebaseCore.xcframework (from Firebase.zip/FirebaseAnalytics/FirebaseCore.xcframework)
* FirebaseCoreInternal.xcframework (from Firebase.zip/FirebaseAnalytics/FirebaseCoreInternal.xcframework)
* GoogleUtilities.xcframework (from Firebase.zip/FirebaseAnalytics/GoogleUtilities.xcframework)
* FBLPromises.xcframework (from Firebase.zip/FirebaseAnalytics/FBLPromises.xcframework)

### Way to report uncaught Java exception
Firebase provides `FIRExceptionModel` to report not native exceptions and display proper lines/function names. To use this approach register handler by invoking `FIRCrashlytics.registerDefaultJavaUncaughtExceptionHandler()`. More details in [blog post](https://dkimitsa.github.io/2020/07/08/firebase-and-java-stacktraces/).

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where FirebaseCrashlytics.framework (and other) are located -->
    </frameworkPaths>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
repositories {
    maven { url 'https://oss.sonatype.org/content/repositories/snapshots' }
}
dependencies {
   ... other dependencies ...
   implementation "io.github.dkimitsa.robovm:robopods-firebase-crashlytics-ios:$altpodsVersion"
}
```
