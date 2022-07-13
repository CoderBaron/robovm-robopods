# IronSource SDK iOS

## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `IronSource.framework`.

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where IronSource.framework is located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-ironsource-ios:$altpodsVersion"
}
```

## IronSource home page
https://developers.is.com/ironsource-mobile/ios/ios-sdk/
