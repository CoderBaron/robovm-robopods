#!/bin/sh
set -e

# clean up
rm -rf build
rm -rf fetch_pods.xcodeproj
rm -rf fetch_pods.xcworkspace
rm -rf Pods
rm -rf target-ios
rm -rf target-ios-sim
rm -rf *.xcframework

# copy dummy project required to fetch lib using cocoapods
cp -R ../../scripts/fetch_pods.xcodeproj ./

PODNAME=AppLovinSDK
pod install 
pod update 
cp -R `find Pods/AppLovinSDK -name "AppLovinSDK.xcframework"` ./
