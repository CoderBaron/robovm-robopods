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
package org.robovm.pods.clearads;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CASSettings/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CASSettingsPtr extends Ptr<CASSettings, CASSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CASSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CASSettings() {}
    protected CASSettings(Handle h, long handle) { super(h, handle); }
    protected CASSettings(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getUserConsent")
    public native CASConsentStatus getUserConsent();
    @Method(selector = "updateUserWithConsent:")
    public native void updateUser(CASConsentStatus consent);
    @Method(selector = "getCCPAStatus")
    public native CASCCPAStatus getCCPAStatus();
    @Method(selector = "updateCCPAWithStatus:")
    public native void updateCCPA(CASCCPAStatus status);
    @Method(selector = "getTaggedAudience")
    public native CASAudience getTaggedAudience();
    @Method(selector = "setTaggedWithAudience:")
    public native void setTagged(CASAudience audience);
    @Method(selector = "isTrackLocationEnabled")
    public native boolean isTrackLocationEnabled();
    @Method(selector = "setTrackLocationWithEnabled:")
    public native void setTrackLocation(boolean enabled);
    @Method(selector = "getBannerRefreshInterval")
    public native @MachineSizedSInt long getBannerRefreshInterval();
    @Method(selector = "setBannerRefreshWithInterval:")
    public native void setBannerRefresh(@MachineSizedSInt long interval);
    @Method(selector = "getInterstitialInterval")
    public native @MachineSizedSInt long getInterstitialInterval();
    @Method(selector = "setInterstitialWithInterval:")
    public native void setInterstitial(@MachineSizedSInt long interval);
    @Method(selector = "restartInterstitialInterval")
    public native void restartInterstitialInterval();
    @Method(selector = "isMutedAdSounds")
    public native boolean isMutedAdSounds();
    @Method(selector = "setMuteAdSoundsTo:")
    public native void setMuteAdSoundsTo(boolean muted);
    @Method(selector = "setInterstitialAdsWhenVideoCostAreLowerWithAllow:")
    public native void setInterstitialAdsWhenVideoCostAreLower(boolean allow);
    @Method(selector = "isInterstitialAdsWhenVideoCostAreLowerAllowed")
    public native boolean isInterstitialAdsWhenVideoCostAreLowerAllowed();
    @Method(selector = "isDebugMode")
    public native boolean isDebugMode();
    @Method(selector = "setDebugMode:")
    public native void setDebugMode(boolean enabled);
    @Method(selector = "setTestDeviceWithIds:")
    public native void setTestDevice(NSArray<NSString> ids);
    @Method(selector = "getLoadingMode")
    public native CASLoadingManagerMode getLoadingMode();
    @Method(selector = "setLoadingWithMode:")
    public native void setLoading(CASLoadingManagerMode mode);
    @Method(selector = "isAnalyticsCollectionEnabled")
    public native boolean isAnalyticsCollectionEnabled();
    @Method(selector = "setAnalyticsCollectionWithEnabled:")
    public native void setAnalyticsCollection(boolean enabled);
    /*</methods>*/
}
