# Firebase iOS Analytics framework

### Frameworks required for this pod: 
* FirebaseAnalytics.xcframework (from Firebase.zip/FirebaseAnalytics/FirebaseAnalytics.xcframework)

Plus ones required for ios-core module:
* FBLPromises.xcframework (from Firebase.zip/FirebaseAnalytics/FBLPromises.xcframework)
* FirebaseCore.xcframework (from Firebase.zip/FirebaseAnalytics/FirebaseCore.xcframework)
* FirebaseCoreInternal.xcframework (from Firebase.zip/FirebaseAnalytics/FirebaseCoreInternal.xcframework)
* FirebaseInstallations.xcframework (from Firebase.zip/FirebaseAnalytics/FirebaseInstallations.xcframework)
* GoogleAppMeasurement.xcframework (from Firebase.zip/FirebaseAnalytics/GoogleAppMeasurement.xcframework)
* GoogleAppMeasurementIdentitySupport.xcframework (from Firebase.zip/FirebaseAnalytics/GoogleAppMeasurementIdentitySupport.xcframework)
* GoogleUtilities.xcframework (from Firebase.zip/FirebaseAnalytics/GoogleUtilities.xcframework)
* nanopb.xcframework (from Firebase.zip/FirebaseAnalytics/nanopb.xcframework)

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where FirebaseAnalytics.framework is located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-firebase-analytics-ios:$altpodsVersion"
}
```
