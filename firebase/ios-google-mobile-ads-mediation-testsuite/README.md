# Google AdMob Mediation Test Suite

### Frameworks required for this pod:
* GoogleMobileAdsMediationTestSuite.framework

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where GoogleMobileAdsMediationTestSuite.framework (and other) are located -->
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
   compile "io.github.dkimitsa.robovm:robopods-google-mobile-ads-mediation-testsuite:$altpodsVersion"
}
```