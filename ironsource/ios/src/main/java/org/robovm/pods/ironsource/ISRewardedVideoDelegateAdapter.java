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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ISRewardedVideoDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements ISRewardedVideoDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @deprecated This API has been deprecated as of SDK 7.3.0. Please use the alternate API in LevelPlayRewardedVideoDelegate instead.
     */
    @Deprecated
    @NotImplemented("rewardedVideoHasChangedAvailability:")
    public void rewardedVideoHasChangedAvailability(boolean available) {}
    /**
     * @deprecated This API has been deprecated as of SDK 7.3.0. Please use the alternate API in LevelPlayRewardedVideoDelegate instead.
     */
    @Deprecated
    @NotImplemented("didReceiveRewardForPlacement:")
    public void didReceiveRewardForPlacement(ISPlacementInfo placementInfo) {}
    /**
     * @deprecated This API has been deprecated as of SDK 7.3.0. Please use the alternate API in LevelPlayRewardedVideoDelegate instead.
     */
    @Deprecated
    @NotImplemented("rewardedVideoDidFailToShowWithError:")
    public void rewardedVideoDidFailToShow(NSError error) {}
    /**
     * @deprecated This API has been deprecated as of SDK 7.3.0. Please use the alternate API in LevelPlayRewardedVideoDelegate instead.
     */
    @Deprecated
    @NotImplemented("rewardedVideoDidOpen")
    public void rewardedVideoDidOpen() {}
    /**
     * @deprecated This API has been deprecated as of SDK 7.3.0. Please use the alternate API in LevelPlayRewardedVideoDelegate instead.
     */
    @Deprecated
    @NotImplemented("rewardedVideoDidClose")
    public void rewardedVideoDidClose() {}
    /**
     * @deprecated This API has been deprecated as of SDK 7.3.0. Please use the alternate API in LevelPlayRewardedVideoDelegate instead.
     */
    @Deprecated
    @NotImplemented("rewardedVideoDidStart")
    public void rewardedVideoDidStart() {}
    /**
     * @deprecated This API has been deprecated as of SDK 7.3.0. Please use the alternate API in LevelPlayRewardedVideoDelegate instead.
     */
    @Deprecated
    @NotImplemented("rewardedVideoDidEnd")
    public void rewardedVideoDidEnd() {}
    /**
     * @deprecated This API has been deprecated as of SDK 7.3.0. Please use the alternate API in LevelPlayRewardedVideoDelegate instead.
     */
    @Deprecated
    @NotImplemented("didClickRewardedVideo:")
    public void didClickRewardedVideo(ISPlacementInfo placementInfo) {}
    /*</methods>*/
}
