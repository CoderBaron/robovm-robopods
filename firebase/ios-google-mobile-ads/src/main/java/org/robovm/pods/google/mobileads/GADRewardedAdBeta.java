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
package org.robovm.pods.google.mobileads;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADRewardedAdBeta/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements GADAdMetadataProvider, GADFullScreenPresentingAd/*</implements>*/ {

    /*<ptr>*/public static class GADRewardedAdBetaPtr extends Ptr<GADRewardedAdBeta, GADRewardedAdBetaPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADRewardedAdBeta.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADRewardedAdBeta() {}
    protected GADRewardedAdBeta(Handle h, long handle) { super(h, handle); }
    protected GADRewardedAdBeta(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adUnitID")
    public native String getAdUnitID();
    @Property(selector = "responseInfo")
    public native GADResponseInfo getResponseInfo();
    @Property(selector = "adReward")
    public native GADAdReward getAdReward();
    @Property(selector = "serverSideVerificationOptions")
    public native GADServerSideVerificationOptions getServerSideVerificationOptions();
    @Property(selector = "setServerSideVerificationOptions:")
    public native void setServerSideVerificationOptions(GADServerSideVerificationOptions v);
    @Property(selector = "fullScreenContentDelegate")
    public native GADFullScreenContentDelegate getFullScreenContentDelegate();
    @Property(selector = "setFullScreenContentDelegate:", strongRef = true)
    public native void setFullScreenContentDelegate(GADFullScreenContentDelegate v);
    @Property(selector = "paidEventHandler")
    public native @Block VoidBlock1<GADAdValue> getPaidEventHandler();
    @Property(selector = "setPaidEventHandler:")
    public native void setPaidEventHandler(@Block VoidBlock1<GADAdValue> v);
    @Property(selector = "adMetadata")
    public native NSDictionary<NSString, ?> getAdMetadata();
    @Property(selector = "adMetadataDelegate")
    public native GADAdMetadataDelegate getAdMetadataDelegate();
    @Property(selector = "setAdMetadataDelegate:", strongRef = true)
    public native void setAdMetadataDelegate(GADAdMetadataDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "canPresentFromRootViewController:error:")
    public native boolean canPresent(UIViewController rootViewController, NSError.NSErrorPtr error);
    @Method(selector = "presentFromRootViewController:userDidEarnRewardHandler:")
    public native void present(UIViewController rootViewController, @Block Runnable userDidEarnRewardHandler);
    @Method(selector = "loadWithAdUnitID:request:completionHandler:")
    public static native void load(String adUnitID, GADRequest request, @Block VoidBlock2<GADRewardedAdBeta, NSError> completionHandler);
    /*</methods>*/
}
