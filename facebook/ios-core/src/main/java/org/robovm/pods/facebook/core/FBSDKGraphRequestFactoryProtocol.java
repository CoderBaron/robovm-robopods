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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/FBSDKGraphRequestFactoryProtocol/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "createGraphRequestWithGraphPath:parameters:tokenString:HTTPMethod:flags:forAppEvents:useAlternativeDefaultDomainPrefix:")
    FBSDKGraphRequestProtocol createGraphRequest(String graphPath, NSDictionary<NSString, ?> parameters, String tokenString, FBSDKHTTPMethod method, FBSDKGraphRequestFlags flags, boolean forAppEvents, boolean useAlternativeDefaultDomainPrefix);
    @Method(selector = "createGraphRequestWithGraphPath:parameters:tokenString:HTTPMethod:flags:")
    FBSDKGraphRequestProtocol createGraphRequest(String graphPath, NSDictionary<NSString, ?> parameters, String tokenString, FBSDKHTTPMethod method, FBSDKGraphRequestFlags flags);
    @Method(selector = "createGraphRequestWithGraphPath:parameters:")
    FBSDKGraphRequestProtocol createGraphRequest(String graphPath, NSDictionary<NSString, ?> parameters);
    @Method(selector = "createGraphRequestWithGraphPath:parameters:useAlternativeDefaultDomainPrefix:")
    FBSDKGraphRequestProtocol createGraphRequest(String graphPath, NSDictionary<NSString, ?> parameters, boolean useAlternativeDefaultDomainPrefix);
    @Method(selector = "createGraphRequestWithGraphPath:")
    FBSDKGraphRequestProtocol createGraphRequest(String graphPath);
    @Method(selector = "createGraphRequestWithGraphPath:useAlternativeDefaultDomainPrefix:")
    FBSDKGraphRequestProtocol createGraphRequest(String graphPath, boolean useAlternativeDefaultDomainPrefix);
    @Method(selector = "createGraphRequestWithGraphPath:parameters:HTTPMethod:")
    FBSDKGraphRequestProtocol createGraphRequest(String graphPath, NSDictionary<NSString, ?> parameters, FBSDKHTTPMethod method);
    @Method(selector = "createGraphRequestWithGraphPath:parameters:HTTPMethod:useAlternativeDefaultDomainPrefix:")
    FBSDKGraphRequestProtocol createGraphRequest(String graphPath, NSDictionary<NSString, ?> parameters, FBSDKHTTPMethod method, boolean useAlternativeDefaultDomainPrefix);
    @Method(selector = "createGraphRequestWithGraphPath:parameters:tokenString:version:HTTPMethod:")
    FBSDKGraphRequestProtocol createGraphRequest(String graphPath, NSDictionary<NSString, ?> parameters, String tokenString, String version, FBSDKHTTPMethod method);
    @Method(selector = "createGraphRequestWithGraphPath:parameters:tokenString:version:HTTPMethod:forAppEvents:")
    FBSDKGraphRequestProtocol createGraphRequest(String graphPath, NSDictionary<NSString, ?> parameters, String tokenString, String version, FBSDKHTTPMethod method, boolean forAppEvents);
    @Method(selector = "createGraphRequestWithGraphPath:parameters:tokenString:version:HTTPMethod:forAppEvents:useAlternativeDefaultDomainPrefix:")
    FBSDKGraphRequestProtocol createGraphRequest(String graphPath, NSDictionary<NSString, ?> parameters, String tokenString, String version, FBSDKHTTPMethod method, boolean forAppEvents, boolean useAlternativeDefaultDomainPrefix);
    @Method(selector = "createGraphRequestWithGraphPath:parameters:flags:")
    FBSDKGraphRequestProtocol createGraphRequest(String graphPath, NSDictionary<NSString, ?> parameters, FBSDKGraphRequestFlags flags);
    @Method(selector = "createGraphRequestWithGraphPath:parameters:flags:useAlternativeDefaultDomainPrefix:")
    FBSDKGraphRequestProtocol createGraphRequest(String graphPath, NSDictionary<NSString, ?> parameters, FBSDKGraphRequestFlags flags, boolean useAlternativeDefaultDomainPrefix);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
