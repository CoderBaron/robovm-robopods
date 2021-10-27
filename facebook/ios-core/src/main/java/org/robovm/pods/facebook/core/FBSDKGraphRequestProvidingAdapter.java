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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKGraphRequestProvidingAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKGraphRequestProviding/*</implements>*/ {

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
    @NotImplemented("createGraphRequestWithGraphPath:parameters:tokenString:HTTPMethod:flags:")
    public FBSDKGraphRequest createGraphRequest(String graphPath, NSDictionary<?, ?> parameters, String tokenString, FBSDKHTTPMethod method, FBSDKGraphRequestFlags flags) { return null; }
    @NotImplemented("createGraphRequestWithGraphPath:parameters:")
    public FBSDKGraphRequest createGraphRequest(String graphPath, NSDictionary<NSString, ?> parameters) { return null; }
    @NotImplemented("createGraphRequestWithGraphPath:")
    public FBSDKGraphRequest createGraphRequest(String graphPath) { return null; }
    @NotImplemented("createGraphRequestWithGraphPath:parameters:HTTPMethod:")
    public FBSDKGraphRequest createGraphRequest(String graphPath, NSDictionary<NSString, ?> parameters, FBSDKHTTPMethod method) { return null; }
    @NotImplemented("createGraphRequestWithGraphPath:parameters:tokenString:version:HTTPMethod:")
    public FBSDKGraphRequest createGraphRequest(String graphPath, NSDictionary<NSString, ?> parameters, String tokenString, String version, FBSDKHTTPMethod method) { return null; }
    @NotImplemented("createGraphRequestWithGraphPath:parameters:flags:")
    public FBSDKGraphRequest createGraphRequest(String graphPath, NSDictionary<?, ?> parameters, FBSDKGraphRequestFlags flags) { return null; }
    /*</methods>*/
}
