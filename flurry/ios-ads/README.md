# Flurry Ads iOS 

### Libraries required for this pod: 
* libFlurryAds_X.X.X.a

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <libs>
        <lib>libs/libFlurryAds_X.X.X.a</lib>
    </libs>
</config></config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "io.github.dkimitsa.robovm:robopods-flurry-ads-ios:$altpodsVersion"
}
```