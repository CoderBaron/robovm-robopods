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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IAAdRequestBuilderAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements IAAdRequestBuilder/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("useSecureConnections")
    public boolean isUseSecureConnections() { return false; }
    @NotImplemented("setUseSecureConnections:")
    public void setUseSecureConnections(boolean v) {}
    @NotImplemented("spotID")
    public String getSpotID() { return null; }
    @NotImplemented("setSpotID:")
    public void setSpotID(String v) {}
    @NotImplemented("timeout")
    public double getTimeout() { return 0; }
    @NotImplemented("setTimeout:")
    public void setTimeout(double v) {}
    /**
     * @deprecated In current version setting this property will not affect anything. In the next SDK version this property will be removed. Please use 'userData' property of IASDKCore instance instead.
     */
    @Deprecated
    @NotImplemented("userData")
    public IAUserData getUserData() { return null; }
    /**
     * @deprecated In current version setting this property will not affect anything. In the next SDK version this property will be removed. Please use 'userData' property of IASDKCore instance instead.
     */
    @Deprecated
    @NotImplemented("setUserData:")
    public void setUserData(IAUserData v) {}
    /**
     * @deprecated In current version setting this property will not affect anything. In the next SDK version this property will be removed. Please use 'keywords' property of IASDKCore instead.
     */
    @Deprecated
    @NotImplemented("keywords")
    public String getKeywords() { return null; }
    /**
     * @deprecated In current version setting this property will not affect anything. In the next SDK version this property will be removed. Please use 'keywords' property of IASDKCore instead.
     */
    @Deprecated
    @NotImplemented("setKeywords:")
    public void setKeywords(String v) {}
    @NotImplemented("debugger")
    public IADebugger getDebugger() { return null; }
    @NotImplemented("setDebugger:")
    public void setDebugger(IADebugger v) {}
    @NotImplemented("subtypeDescription")
    public IAInterfaceAdDescription getSubtypeDescription() { return null; }
    @NotImplemented("setSubtypeDescription:")
    public void setSubtypeDescription(IAInterfaceAdDescription v) {}
    /**
     * @deprecated In current version setting this property will not affect anything. In the next SDK version this property will be removed. Please use 'muteAudio' property of IASDKCore instance instead.
     */
    @Deprecated
    @NotImplemented("muteAudio")
    public boolean isMuteAudio() { return false; }
    /**
     * @deprecated In current version setting this property will not affect anything. In the next SDK version this property will be removed. Please use 'muteAudio' property of IASDKCore instance instead.
     */
    @Deprecated
    @NotImplemented("setMuteAudio:")
    public void setMuteAudio(boolean v) {}
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
