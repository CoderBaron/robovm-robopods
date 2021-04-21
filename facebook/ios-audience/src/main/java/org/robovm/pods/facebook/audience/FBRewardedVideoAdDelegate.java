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
package org.robovm.pods.facebook.audience;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.pods.facebook.core.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/FBRewardedVideoAdDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "rewardedVideoAdDidClick:")
    void rewardedVideoAdDidClick(FBRewardedVideoAd rewardedVideoAd);
    @Method(selector = "rewardedVideoAdDidLoad:")
    void rewardedVideoAdDidLoad(FBRewardedVideoAd rewardedVideoAd);
    @Method(selector = "rewardedVideoAdDidClose:")
    void rewardedVideoAdDidClose(FBRewardedVideoAd rewardedVideoAd);
    @Method(selector = "rewardedVideoAdWillClose:")
    void rewardedVideoAdWillClose(FBRewardedVideoAd rewardedVideoAd);
    @Method(selector = "rewardedVideoAd:didFailWithError:")
    void didFail(FBRewardedVideoAd rewardedVideoAd, NSError error);
    @Method(selector = "rewardedVideoAdVideoComplete:")
    void rewardedVideoAdVideoComplete(FBRewardedVideoAd rewardedVideoAd);
    @Method(selector = "rewardedVideoAdWillLogImpression:")
    void rewardedVideoAdWillLogImpression(FBRewardedVideoAd rewardedVideoAd);
    @Method(selector = "rewardedVideoAdServerRewardDidSucceed:")
    void rewardedVideoAdServerRewardDidSucceed(FBRewardedVideoAd rewardedVideoAd);
    @Method(selector = "rewardedVideoAdServerRewardDidFail:")
    void rewardedVideoAdServerRewardDidFail(FBRewardedVideoAd rewardedVideoAd);
    @Method(selector = "rewardedVideoAdCompanionViewProvider:")
    void rewardedVideoAdCompanionViewProvider(@Block VoidBlock1<FBAdCompanionView> completion);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
