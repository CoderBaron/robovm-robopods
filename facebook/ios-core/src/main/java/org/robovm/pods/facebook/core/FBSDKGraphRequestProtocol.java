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
package org.robovm.pods.facebook.core;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.webkit.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.storekit.*;
import org.robovm.pods.facebook.corebasics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/FBSDKGraphRequestProtocol/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "parameters")
    NSDictionary<NSString, ?> getParameters();
    @Property(selector = "setParameters:")
    void setParameters(NSDictionary<NSString, ?> v);
    @Property(selector = "tokenString")
    String getTokenString();
    @Property(selector = "graphPath")
    String getGraphPath();
    @Property(selector = "HTTPMethod")
    FBSDKHTTPMethod getHTTPMethod();
    @Property(selector = "version")
    String getVersion();
    @Property(selector = "flags")
    FBSDKGraphRequestFlags getFlags();
    @Property(selector = "isGraphErrorRecoveryDisabled")
    boolean isGraphErrorRecoveryDisabled();
    @Property(selector = "setGraphErrorRecoveryDisabled:")
    void setGraphErrorRecoveryDisabled(boolean v);
    @Property(selector = "hasAttachments")
    boolean hasAttachments();
    @Property(selector = "forAppEvents")
    boolean isForAppEvents();
    @Property(selector = "useAlternativeDefaultDomainPrefix")
    boolean isUseAlternativeDefaultDomainPrefix();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "startWithCompletion:")
    FBSDKGraphRequestConnecting start(@Block VoidBlock3<FBSDKGraphRequestConnecting, NSObject, NSError> completion);
    @Method(selector = "formattedDescription")
    String formattedDescription();
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
