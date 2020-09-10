# RoboPods FireBase InMobi Ads Mediation Adapter iOS v9.0.7.2

### Frameworks required for this pod: 
* InMobiAdapter.framework

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where InMobiAdapter.framework (and other) are located -->
    </frameworkPaths>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "io.github.dkimitsa.robovm:robopods-firebase-google-mobile-ads-inmobi-adapter-ios:$altpodsVersion"
}
```

## Official website

https://developers.google.com/admob/ios/mediation/inmobi