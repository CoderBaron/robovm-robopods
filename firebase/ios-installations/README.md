# Firebase iOS Installations framework
The Firebase installations service (FIS) provides a Firebase installation ID (FID) for each installed instance of a Firebase app

### Frameworks required for this pod: 
* FirebaseInstallations.xcframework (from Firebase.zip/FirebaseAnalytics/FirebaseInstallations.xcframework)

Plus ones required for ios-core module:
* FirebaseCore.framework (from Firebase.zip/FirebaseAnalytics/FirebaseCore.xcframework)
* FirebaseCoreInternal.framework (from Firebase.zip/FirebaseAnalytics/FirebaseCoreInternal.xcframework)

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where FirebaseInstallations.framework is located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-firebase-installations-ios:$altpodsVersion"
}
```