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
package org.robovm.pods.applovinsdk;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALIncentivizedInterstitialAd/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ALIncentivizedInterstitialAdPtr extends Ptr<ALIncentivizedInterstitialAd, ALIncentivizedInterstitialAdPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ALIncentivizedInterstitialAd.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ALIncentivizedInterstitialAd() {}
    protected ALIncentivizedInterstitialAd(Handle h, long handle) { super(h, handle); }
    protected ALIncentivizedInterstitialAd(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSdk:")
    public ALIncentivizedInterstitialAd(ALSdk sdk) { super((SkipInit) null); initObject(init(sdk)); }
    @Method(selector = "initWithZoneIdentifier:")
    public ALIncentivizedInterstitialAd(String zoneIdentifier) { super((SkipInit) null); initObject(init(zoneIdentifier)); }
    @Method(selector = "initWithZoneIdentifier:sdk:")
    public ALIncentivizedInterstitialAd(String zoneIdentifier, ALSdk sdk) { super((SkipInit) null); initObject(init(zoneIdentifier, sdk)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adDisplayDelegate")
    public native ALAdDisplayDelegate getAdDisplayDelegate();
    @Property(selector = "setAdDisplayDelegate:")
    public native void setAdDisplayDelegate(ALAdDisplayDelegate v);
    @Property(selector = "adVideoPlaybackDelegate")
    public native ALAdVideoPlaybackDelegate getAdVideoPlaybackDelegate();
    @Property(selector = "setAdVideoPlaybackDelegate:")
    public native void setAdVideoPlaybackDelegate(ALAdVideoPlaybackDelegate v);
    @Property(selector = "zoneIdentifier")
    public native String getZoneIdentifier();
    @Property(selector = "isReadyForDisplay")
    public native boolean isReadyForDisplay();
    /**
     * @deprecated Please use -[ALSdk userIdentifier] instead to properly identify your users in our system. This property is now deprecated and will be removed in a future SDK version.
     */
    @Deprecated
    @Property(selector = "userIdentifier")
    public static native String getUserIdentifier();
    /**
     * @deprecated Please use -[ALSdk userIdentifier] instead to properly identify your users in our system. This property is now deprecated and will be removed in a future SDK version.
     */
    @Deprecated
    @Property(selector = "setUserIdentifier:")
    public static native void setUserIdentifier(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSdk:")
    protected native @Pointer long init(ALSdk sdk);
    @Method(selector = "initWithZoneIdentifier:")
    protected native @Pointer long init(String zoneIdentifier);
    @Method(selector = "initWithZoneIdentifier:sdk:")
    protected native @Pointer long init(String zoneIdentifier, ALSdk sdk);
    @Method(selector = "preloadAndNotify:")
    public native void preload(ALAdLoadDelegate adLoadDelegate);
    @Method(selector = "show")
    public native void show();
    @Method(selector = "showAndNotify:")
    public native void show(ALAdRewardDelegate adRewardDelegate);
    @Method(selector = "showAd:andNotify:")
    public native void showAd(ALAd ad, ALAdRewardDelegate adRewardDelegate);
    @Method(selector = "dismiss")
    public native void dismiss();
    @Method(selector = "shared")
    public static native ALIncentivizedInterstitialAd shared();
    @Method(selector = "preloadAndNotify:")
    public static native void Preload(ALAdLoadDelegate adLoadDelegate);
    @Method(selector = "isReadyForDisplay")
    public static native boolean IsReadyForDisplay();
    @Method(selector = "show")
    public static native void Show();
    @Method(selector = "showAndNotify:")
    public static native void Show(ALAdRewardDelegate adRewardDelegate);
    /**
     * @deprecated Placements have been deprecated and will be removed in a future SDK version. Please configure zones from the UI and use them instead.
     */
    @Deprecated
    @Method(selector = "showOver:placement:andNotify:")
    public native void showOver(UIWindow window, String placement, ALAdRewardDelegate adRewardDelegate);
    /**
     * @deprecated Explicitly passing in an UIWindow to show an ad is deprecated as all cases show over the application's key window. Use showAndNotify: instead.
     */
    @Deprecated
    @Method(selector = "showOver:andNotify:")
    public native void showOver(UIWindow window, ALAdRewardDelegate adRewardDelegate);
    /**
     * @deprecated Explicitly passing in an UIWindow to show an ad is deprecated as all cases show over the application's key window. Use showAd:andNotify: instead.
     */
    @Deprecated
    @Method(selector = "showOver:renderAd:andNotify:")
    public native void showOver(UIWindow window, ALAd ad, ALAdRewardDelegate adRewardDelegate);
    /**
     * @deprecated Placements have been deprecated and will be removed in a future SDK version. Please configure zones from the UI and use them instead.
     */
    @Deprecated
    @Method(selector = "showOverPlacement:")
    public static native void showOverPlacement(String placement);
    /**
     * @deprecated Placements have been deprecated and will be removed in a future SDK version. Please configure zones from the UI and use them instead.
     */
    @Deprecated
    @Method(selector = "showOverPlacement:andNotify:")
    public static native void ShowOverPlacement(String placement, ALAdRewardDelegate adRewardDelegate);
    /**
     * @deprecated Placements have been deprecated and will be removed in a future SDK version. Please configure zones from the UI and use them instead.
     */
    @Deprecated
    @Method(selector = "showOver:placement:andNotify:")
    public static native void ShowOver(UIWindow window, String placement, ALAdRewardDelegate adRewardDelegate);
    /**
     * @deprecated Explicitly passing in an UIWindow to show an ad is deprecated as all cases show over the application's key window. Use showAndNotify: instead.
     */
    @Deprecated
    @Method(selector = "showOver:andNotify:")
    public static native void ShowOver(UIWindow window, ALAdRewardDelegate adRewardDelegate);
    /*</methods>*/
}
