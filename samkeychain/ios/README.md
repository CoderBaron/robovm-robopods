# SAMKeychain iOS

## Sample app

TODO

## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `SAMKeychain.framework`. Easiest way is to use [Carthage](https://github.com/Carthage/Carthage#installing-carthage):
```
echo 'github github "soffes/SAMKeychain"' > Cartfile
carthage update
```

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where SAMKeychain.framework is located -->
    </frameworkPaths>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "io.github.dkimitsa.robovm:robopods-samkeychain-ios:$altpodsVersion"
}
```

## SAMKeychain home page

[Link](https://github.com/soffes/SAMKeychain)