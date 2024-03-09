# Firebase iOS Messaging framework

### Frameworks required for this pod: 
* FirebaseMessaging.xcframework (from Firebase.zip/FirebaseMessaging/FirebaseMessaging.xcframework)
* GoogleDataTransport.xcframework (from Firebase.zip/FirebaseMessaging/GoogleDataTransport.xcframework

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
[the official guide](https://firebase.google.com/docs/cloud-messaging/ios/client).

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where FirebaseMessaging.framework (and other) are located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-firebase-messaging-ios:$altpodsVersion"
}
```

### Disable method swizzling
This is required to be done in case of RoboVM. Following steps to be done as specified in the [guide](https://firebase.google.com/docs/cloud-messaging/ios/client):
- add following lines to `info.plist`:  
```
<key>FirebaseAppDelegateProxyEnabled</key>
<false />
```
- explicitly map your APNs token to the FCM registration token in app delegate:  
```
@Override
public void didRegisterForRemoteNotifications(UIApplication application, NSData deviceToken) {
    super.didRegisterForRemoteNotifications(application, deviceToken);
    FIRMessaging.messaging().setAPNSToken(deviceToken);
}
```
 