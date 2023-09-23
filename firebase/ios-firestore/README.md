# Firebase iOS Cloud Firestore framework

### Frameworks required for this pod: 
* FirebaseFirestore.xcframework(from Firebase.zip/FirebaseFirestore/FirebaseFirestore.xcframework)
* abseil.xcframework (from Firebase.zip/FirebaseFirestore/abseil.xcframework)
* BoringSSL-GRPC.xcframework (from Firebase.zip/FirebaseFirestore/BoringSSL-GRPC.xcframework)
* gRPC-C++.xcframework (from Firebase.zip/FirebaseFirestore/gRPC-C++.xcframework)
* gRPC-Core.xcframework (from Firebase.zipFirebaseFirestore/gRPC-Core.xcframework)
* leveldb-library.xcframework (from Firebase.zip/FirebaseFirestore/leveldb-library.xcframework)
* nanopb.xcframework (from Firebase.zip/FirebaseAnalytics/nanopb.xcframework)

Plus ones required for ios-core module:
* FirebaseCore.xcframework (from Firebase.zip/FirebaseAnalytics/FirebaseCore.xcframework)
* FirebaseCoreInternal.xcframework (from Firebase.zip/FirebaseAnalytics/FirebaseCoreInternal.xcframework)
* GoogleUtilities.xcframework (from Firebase.zip/FirebaseAnalytics/GoogleUtilities.xcframework)
* FBLPromises.xcframework (from Firebase.zip/FirebaseAnalytics/FBLPromises.xcframework)

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where FirebaseFirestore.framework is located -->
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
   implementation "io.github.dkimitsa.robovm:robopods-firebase-firestore-ios:$altpodsVersion"
}
```
