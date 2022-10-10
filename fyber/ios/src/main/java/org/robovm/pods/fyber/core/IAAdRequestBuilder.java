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
package org.robovm.pods.fyber.core;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/IAAdRequestBuilder/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "useSecureConnections")
    boolean isUseSecureConnections();
    @Property(selector = "setUseSecureConnections:")
    void setUseSecureConnections(boolean v);
    @Property(selector = "spotID")
    String getSpotID();
    @Property(selector = "setSpotID:")
    void setSpotID(String v);
    @Property(selector = "timeout")
    double getTimeout();
    @Property(selector = "setTimeout:")
    void setTimeout(double v);
    /**
     * @deprecated In current version setting this property will not affect anything. In the next SDK version this property will be removed. Please use 'userData' property of IASDKCore instance instead.
     */
    @Deprecated
    @Property(selector = "userData")
    IAUserData getUserData();
    /**
     * @deprecated In current version setting this property will not affect anything. In the next SDK version this property will be removed. Please use 'userData' property of IASDKCore instance instead.
     */
    @Deprecated
    @Property(selector = "setUserData:")
    void setUserData(IAUserData v);
    /**
     * @deprecated In current version setting this property will not affect anything. In the next SDK version this property will be removed. Please use 'keywords' property of IASDKCore instead.
     */
    @Deprecated
    @Property(selector = "keywords")
    String getKeywords();
    /**
     * @deprecated In current version setting this property will not affect anything. In the next SDK version this property will be removed. Please use 'keywords' property of IASDKCore instead.
     */
    @Deprecated
    @Property(selector = "setKeywords:")
    void setKeywords(String v);
    /**
     * @deprecated In current version setting this property will will not affect anything. In the next SDK version this property will be removed. Please use 'location' property of IASDKCore instance.
     */
    @Deprecated
    @Property(selector = "location")
    CLLocation getLocation();
    /**
     * @deprecated In current version setting this property will will not affect anything. In the next SDK version this property will be removed. Please use 'location' property of IASDKCore instance.
     */
    @Deprecated
    @Property(selector = "setLocation:")
    void setLocation(CLLocation v);
    @Property(selector = "debugger")
    IADebugger getDebugger();
    @Property(selector = "setDebugger:")
    void setDebugger(IADebugger v);
    @Property(selector = "subtypeDescription")
    IAInterfaceAdDescription getSubtypeDescription();
    @Property(selector = "setSubtypeDescription:")
    void setSubtypeDescription(IAInterfaceAdDescription v);
    /**
     * @deprecated In current version setting this property will not affect anything. In the next SDK version this property will be removed. Please use 'muteAudio' property of IASDKCore instance instead.
     */
    @Deprecated
    @Property(selector = "muteAudio")
    boolean isMuteAudio();
    /**
     * @deprecated In current version setting this property will not affect anything. In the next SDK version this property will be removed. Please use 'muteAudio' property of IASDKCore instance instead.
     */
    @Deprecated
    @Property(selector = "setMuteAudio:")
    void setMuteAudio(boolean v);
    /*</properties>*/
    /*<methods>*/
    
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
