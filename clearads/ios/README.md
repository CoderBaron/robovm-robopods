# https://github.com/cleveradssolutions/CAS-iOS

## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `CleverAdsSolutions.framework`.

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where CleverAdsSolutions.framework is located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-clearads-ios:$altpodsVersion"
}
```

## Singular home page

https://github.com/cleveradssolutions/CAS-iOS