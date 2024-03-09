# RoboPods for Firebase Google Mobile Ads 

### Frameworks required for this pod: 
* GoogleMobileAds.xcframework (from Firebase.zip/Google-Mobile-Ads-SDK/GoogleMobileAds.xcframework)
* UserMessagingPlatform.xcframework (from Firebase.zip/Google-Mobile-Ads-SDK/UserMessagingPlatform.xcframework)

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
        <path>libs</path>  <!-- path where GoogleMobileAds.framework is located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-firebase-google-mobile-ads-ios:$altpodsVersion"
}
```

### Sample code 
UIApplicationDelegateAdapter:  
```java
@Override
public boolean didFinishLaunching(UIApplication application, UIApplicationLaunchOptions launchOptions) {
    GADMobileAds.sharedInstance().start(status -> {
        GADMobileAds.sharedInstance().getRequestConfiguration().setTestDeviceIdentifiers(new NSArray<>(GADRequest.GADSimulatorID()));
    });
    GADRewardBasedVideoAd.sharedInstance().setDelegate(new GADRewardBasedVideoAdDelegateAdapter() {
        @Override
        public void didReceiveAd(GADRewardBasedVideoAd rewardBasedVideoAd) {
            if (GADRewardBasedVideoAd.sharedInstance().isReady())
                GADRewardBasedVideoAd.sharedInstance().presentFromRootViewController(MyViewController.this);
        }
    });

    // ... other code 
}
```

Any other place to use GAD:  
```java
    GADRewardBasedVideoAd.sharedInstance().loadRequest(new GADRequest(), "ca-app-pub-3940256099942544/1712485313" );
```

## Official website
https://firebase.google.com/docs/admob/ios/quick-start
