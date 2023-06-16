/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.ironsource;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IronSource/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class IronSourcePtr extends Ptr<IronSource, IronSourcePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IronSource.class); }/*</bind>*/
    /*<constants>*/
    public static final String IS_REWARDED_VIDEO = "rewardedvideo";
    public static final String IS_INTERSTITIAL = "interstitial";
    public static final String IS_OFFERWALL = "offerwall";
    public static final String IS_BANNER = "banner";
    public static final String getSdkVersion = "7.3.1";
    public static final String DataSource_MOPUB = "MoPub";
    /*</constants>*/
    /*<constructors>*/
    public IronSource() {}
    protected IronSource(Handle h, long handle) { super(h, handle); }
    protected IronSource(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "sdkVersion")
    public static native String sdkVersion();
    @Method(selector = "shouldTrackReachability:")
    public static native void shouldTrackReachability(boolean flag);
    @Method(selector = "setAdaptersDebug:")
    public static native void setAdaptersDebug(boolean flag);
    @Method(selector = "setDynamicUserId:")
    public static native boolean setDynamicUserId(String dynamicUserId);
    @Method(selector = "advertiserId")
    public static native String advertiserId();
    @Method(selector = "setMediationType:")
    public static native void setMediationType(String mediationType);
    @Method(selector = "setSegment:")
    public static native void setSegment(ISSegment segment);
    @Method(selector = "setSegmentDelegate:")
    public static native void setSegmentDelegate(ISSegmentDelegate delegate);
    @Method(selector = "setMetaDataWithKey:value:")
    public static native void setMetaData(String key, String value);
    @Method(selector = "setMetaDataWithKey:values:")
    public static native void setMetaData(String key, NSMutableArray<?> values);
    @Method(selector = "setNetworkDataWithNetworkKey:andNetworkData:")
    public static native void setNetworkData(String networkKey, NSDictionary<?, ?> networkData);
    @Method(selector = "getISDemandOnlyBiddingData")
    public static native String getISDemandOnlyBiddingData();
    @Method(selector = "setUserId:")
    public static native void setUserId(String userId);
    @Method(selector = "initWithAppKey:")
    public static native void init(String appKey);
    @Method(selector = "initWithAppKey:delegate:")
    public static native void init(String appKey, ISInitializationDelegate delegate);
    @Method(selector = "initWithAppKey:adUnits:")
    public static native void init(String appKey, NSArray<NSString> adUnits);
    @Method(selector = "initWithAppKey:adUnits:delegate:")
    public static native void init(String appKey, NSArray<NSString> adUnits, ISInitializationDelegate delegate);
    @Method(selector = "initISDemandOnly:adUnits:")
    public static native void initISDemandOnly(String appKey, NSArray<NSString> adUnits);
    /**
     * @deprecated This API has been deprecated. Please use setLevelPlayRewardedVideoDelegate instead.
     */
    @Deprecated
    @Method(selector = "setRewardedVideoDelegate:")
    public static native void setRewardedVideoDelegate(ISRewardedVideoDelegate delegate);
    @Method(selector = "setLevelPlayRewardedVideoDelegate:")
    public static native void setLevelPlayRewardedVideoDelegate(LevelPlayRewardedVideoDelegate delegate);
    @Method(selector = "showRewardedVideoWithViewController:")
    public static native void showRewardedVideo(UIViewController viewController);
    @Method(selector = "showRewardedVideoWithViewController:placement:")
    public static native void showRewardedVideo(UIViewController viewController, String placementName);
    @Method(selector = "hasRewardedVideo")
    public static native boolean hasRewardedVideo();
    @Method(selector = "isRewardedVideoCappedForPlacement:")
    public static native boolean isRewardedVideoCappedForPlacement(String placementName);
    @Method(selector = "rewardedVideoPlacementInfo:")
    public static native ISPlacementInfo rewardedVideoPlacementInfo(String placementName);
    @Method(selector = "setRewardedVideoServerParameters:")
    public static native void setRewardedVideoServerParameters(NSDictionary<?, ?> parameters);
    @Method(selector = "clearRewardedVideoServerParameters")
    public static native void clearRewardedVideoServerParameters();
    @Method(selector = "setISDemandOnlyRewardedVideoDelegate:")
    public static native void setISDemandOnlyRewardedVideoDelegate(ISDemandOnlyRewardedVideoDelegate delegate);
    @Method(selector = "loadISDemandOnlyRewardedVideo:")
    public static native void loadISDemandOnlyRewardedVideo(String instanceId);
    @Method(selector = "loadISDemandOnlyRewardedVideoWithAdm:adm:")
    public static native void loadISDemandOnlyRewardedVideo(String instanceId, String adm);
    @Method(selector = "showISDemandOnlyRewardedVideo:instanceId:")
    public static native void showISDemandOnlyRewardedVideo(UIViewController viewController, String instanceId);
    @Method(selector = "hasISDemandOnlyRewardedVideo:")
    public static native boolean hasISDemandOnlyRewardedVideo(String instanceId);
    /**
     * @deprecated This API has been deprecated. Please use setLevelPlayRewardedVideoManualDelegate instead.
     */
    @Deprecated
    @Method(selector = "setRewardedVideoManualDelegate:")
    public static native void setRewardedVideoManualDelegate(ISRewardedVideoManualDelegate delegate);
    @Method(selector = "setLevelPlayRewardedVideoManualDelegate:")
    public static native void setLevelPlayRewardedVideoManualDelegate(LevelPlayRewardedVideoManualDelegate delegate);
    @Method(selector = "loadRewardedVideo")
    public static native void loadRewardedVideo();
    /**
     * @deprecated This API has been deprecated. Please use setLevelPlayInterstitialDelegate instead.
     */
    @Deprecated
    @Method(selector = "setInterstitialDelegate:")
    public static native void setInterstitialDelegate(ISInterstitialDelegate delegate);
    @Method(selector = "setLevelPlayInterstitialDelegate:")
    public static native void setLevelPlayInterstitialDelegate(LevelPlayInterstitialDelegate delegate);
    @Method(selector = "loadInterstitial")
    public static native void loadInterstitial();
    @Method(selector = "showInterstitialWithViewController:")
    public static native void showInterstitial(UIViewController viewController);
    @Method(selector = "showInterstitialWithViewController:placement:")
    public static native void showInterstitial(UIViewController viewController, String placementName);
    @Method(selector = "hasInterstitial")
    public static native boolean hasInterstitial();
    @Method(selector = "isInterstitialCappedForPlacement:")
    public static native boolean isInterstitialCappedForPlacement(String placementName);
    @Method(selector = "setISDemandOnlyInterstitialDelegate:")
    public static native void setISDemandOnlyInterstitialDelegate(ISDemandOnlyInterstitialDelegate delegate);
    @Method(selector = "loadISDemandOnlyInterstitial:")
    public static native void loadISDemandOnlyInterstitial(String instanceId);
    @Method(selector = "loadISDemandOnlyInterstitialWithAdm:adm:")
    public static native void loadISDemandOnlyInterstitial(String instanceId, String adm);
    @Method(selector = "showISDemandOnlyInterstitial:instanceId:")
    public static native void showISDemandOnlyInterstitial(UIViewController viewController, String instanceId);
    @Method(selector = "hasISDemandOnlyInterstitial:")
    public static native boolean hasISDemandOnlyInterstitial(String instanceId);
    /**
     * @deprecated This API call is for the ironSource Offerwall, which will soon be deprecated. Please migrate to the Tapjoy Offerwall using the 'Offerwall migration checklist'.
     */
    @Deprecated
    @Method(selector = "setOfferwallDelegate:")
    public static native void setOfferwallDelegate(ISOfferwallDelegate delegate);
    /**
     * @deprecated This API call is for the ironSource Offerwall, which will soon be deprecated. Please migrate to the Tapjoy Offerwall using the 'Offerwall migration checklist'.
     */
    @Deprecated
    @Method(selector = "showOfferwallWithViewController:")
    public static native void showOfferwallWithViewController$(UIViewController viewController);
    /**
     * @deprecated This API call is for the ironSource Offerwall, which will soon be deprecated. Please migrate to the Tapjoy Offerwall using the 'Offerwall migration checklist'.
     */
    @Deprecated
    @Method(selector = "showOfferwallWithViewController:placement:")
    public static native void showOfferwall(UIViewController viewController, String placementName);
    /**
     * @deprecated This API call is for the ironSource Offerwall, which will soon be deprecated. Please migrate to the Tapjoy Offerwall using the 'Offerwall migration checklist'.
     */
    @Deprecated
    @Method(selector = "offerwallCredits")
    public static native void offerwallCredits();
    /**
     * @deprecated This API call is for the ironSource Offerwall, which will soon be deprecated. Please migrate to the Tapjoy Offerwall using the 'Offerwall migration checklist'.
     */
    @Deprecated
    @Method(selector = "hasOfferwall")
    public static native boolean hasOfferwall();
    /**
     * @deprecated This API has been deprecated as of SDK 7.3.0. Please use setLevelPlayBannerDelegate instead.
     */
    @Deprecated
    @Method(selector = "setBannerDelegate:")
    public static native void setBannerDelegate(ISBannerDelegate delegate);
    @Method(selector = "setLevelPlayBannerDelegate:")
    public static native void setLevelPlayBannerDelegate(LevelPlayBannerDelegate delegate);
    @Method(selector = "loadBannerWithViewController:size:")
    public static native void loadBanner(UIViewController viewController, ISBannerSize size);
    @Method(selector = "loadBannerWithViewController:size:placement:")
    public static native void loadBanner(UIViewController viewController, ISBannerSize size, String placementName);
    @Method(selector = "destroyBanner:")
    public static native void destroyBanner(ISBannerView banner);
    @Method(selector = "isBannerCappedForPlacement:")
    public static native boolean isBannerCappedForPlacement(String placementName);
    /**
     * @deprecated This method has been deprecated. Please use setISDemandOnlyBannerDelegateForInstanceId instead.
     */
    @Deprecated
    @Method(selector = "setISDemandOnlyBannerDelegate:")
    public static native void setISDemandOnlyBannerDelegate(ISDemandOnlyBannerDelegate delegate);
    @Method(selector = "setISDemandOnlyBannerDelegate:forInstanceId:")
    public static native void setISDemandOnlyBannerDelegate(ISDemandOnlyBannerDelegate delegate, String instanceId);
    @Method(selector = "loadISDemandOnlyBannerWithAdm:instanceId:viewController:size:")
    public static native void loadISDemandOnlyBanner(String adm, String instanceId, UIViewController viewController, ISBannerSize size);
    @Method(selector = "loadISDemandOnlyBannerWithInstanceId:viewController:size:")
    public static native void loadISDemandOnlyBanner(String instanceId, UIViewController viewController, ISBannerSize size);
    @Method(selector = "destroyISDemandOnlyBannerWithInstanceId:")
    public static native void destroyISDemandOnlyBanner(String instanceId);
    @Method(selector = "setLogDelegate:")
    public static native void setLogDelegate(ISLogDelegate delegate);
    @Method(selector = "setConsent:")
    public static native void setConsent(boolean consent);
    @Method(selector = "addImpressionDataDelegate:")
    public static native void addImpressionDataDelegate(ISImpressionDataDelegate delegate);
    @Method(selector = "setAdRevenueDataWithDataSource:impressionData:")
    public static native void setAdRevenueData(String dataSource, NSData impressionData);
    @Method(selector = "removeImpressionDataDelegate:")
    public static native void removeImpressionDataDelegate(ISImpressionDataDelegate delegate);
    @Method(selector = "setConsentViewWithDelegate:")
    public static native void setConsentView(ISConsentViewDelegate delegate);
    @Method(selector = "loadConsentViewWithType:")
    public static native void loadConsentView(String consentViewType);
    @Method(selector = "showConsentViewWithViewController:andType:")
    public static native void showConsentView(UIViewController viewController, String consentViewType);
    @Method(selector = "getConversionValue")
    public static native NSNumber getConversionValue();
    @Method(selector = "launchTestSuite:")
    public static native void launchTestSuite(UIViewController viewController);
    @Method(selector = "setWaterfallConfiguration:forAdUnit:")
    public static native void setWaterfallConfiguration(ISWaterfallConfiguration waterfallConfiguration, ISAdUnit adUnit);
    /*</methods>*/
}
