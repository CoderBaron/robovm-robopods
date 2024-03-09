# Firebase iOS Google SignIn framework

### Frameworks required for this pod: 
* AppAuth.xcframework (from Firebase.zip/GoogleSignIn/AppAuth.xcframework)
* GTMAppAuth.xcframework (from Firebase.zip/GoogleSignIn/GTMAppAuth.xcframework)
* GTMSessionFetcher.xcframework (from Firebase.zip/GoogleSignIn/GTMSessionFetcher.xcframework)
* GoogleSignIn.xcframework (from Firebase.zip/GoogleSignIn/GoogleSignIn.xcframework)

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where GoogleSignIn.framework (and other) are located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-firebase-google-signin-ios:$altpodsVersion"
}
```