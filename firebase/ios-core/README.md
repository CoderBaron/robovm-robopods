# Firebase iOS Core framework

### Frameworks required for this pod: 
* FirebaseCore.xcframework (from Firebase.zip/FirebaseAnalytics/FirebaseCore.xcframework)
* FirebaseCoreInternal.xcframework (from Firebase.zip/FirebaseAnalytics/FirebaseCoreInternal.xcframework)
* GoogleUtilities.xcframework (from Firebase.zip/FirebaseAnalytics/GoogleUtilities.xcframework)
* FBLPromises.xcframework (from Firebase.zip/FirebaseAnalytics/FBLPromises.xcframework)

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where FirebaseCore.framework is located -->
    </frameworkPaths>
     <swiftSupport/>
</config>
```

`<swiftSupport/>` *IS IMPORTANT* as firebase is swift based framework now.  

### Gradle

Add the following dependency to your `build.gradle`:

```
repositories {
    maven { url 'https://oss.sonatype.org/content/repositories/snapshots' }
}
dependencies {
   ... other dependencies ...
   implementation "io.github.dkimitsa.robovm:robopods-firebase-core-ios:$altpodsVersion"
}
```