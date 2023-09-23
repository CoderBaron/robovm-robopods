# Firebase iOS RemoteConfig framework

### Frameworks required for this pod: 
* FirebaseRemoteConfig.xcframework (from Firebase.zip/FirebaseRemoteConfig/FirebaseRemoteConfig.xcframework)
* FirebaseABTesting.xcframework (from Firebase.zip/FirebaseRemoteConfig/FirebaseABTesting.xcframework)
* FirebaseInstallations.xcframework (from Firebase.zip/FirebaseAnalytics/FirebaseInstallations.xcframework)

Plus ones required for ios-core module:
* FirebaseCore.xcframework (from Firebase.zip/FirebaseAnalytics/FirebaseCore.xcframework)
* FirebaseCoreInternal.xcframework (from Firebase.zip/FirebaseAnalytics/FirebaseCoreInternal.xcframework)
* GoogleUtilities.xcframework (from Firebase.zip/FirebaseAnalytics/GoogleUtilities.xcframework)
* FBLPromises.xcframework (from Firebase.zip/FirebaseAnalytics/FBLPromises.xcframework)

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where FirebaseRemoteConfig.framework (and other) are located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-firebase-remote-config-ios:$altpodsVersion"
}
```