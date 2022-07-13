# Facebook iOS Core framework

### Use the dynamic version of frameworks
It is available for a download as `FacebookSDK_Dynamic.framework.zip` and allows automatic swift dependency resolution. In case static linking is required swift libs should be specified manually in `robovm.xml`:  
```xml
<libs>
    <lib>libswiftCore.dylib</lib>>
    <lib>libswiftCoreFoundation.dylib</lib>>
    <lib>libswiftCoreGraphics.dylib</lib>>
    <lib>libswiftCoreImage.dylib</lib>>
    <lib>libswiftDarwin.dylib</lib>>
    <lib>libswiftDispatch.dylib</lib>>
    <lib>libswiftFoundation.dylib</lib>>
    <lib>libswiftMetal.dylib</lib>>
    <lib>libswiftObjectiveC.dylib</lib>>
    <lib>libswiftQuartzCore.dylib</lib>>
    <lib>libswiftUIKit.dylib</lib>>

    <lib>swiftCompatibility51</lib>
</libs>
```

### Frameworks required for this pod:
* FBSDKCoreKit.framework

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where FBSDKCoreKit.framework is located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-facebook-core-ios:$altpodsVersion"
}
```
