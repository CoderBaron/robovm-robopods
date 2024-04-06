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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/FBSDKInternalUtilityProtocol/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "isFacebookAppInstalled")
    boolean isFacebookAppInstalled();
    @Property(selector = "isUnity")
    boolean isUnity();
    @Property(selector = "bundleForStrings")
    NSBundle getBundleForStrings();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "URLWithScheme:host:path:queryParameters:error:")
    NSURL constructURL(String scheme, String host, String path, NSDictionary<NSString, NSString> queryParameters, NSError.NSErrorPtr errorRef);
    @Method(selector = "appURLWithHost:path:queryParameters:error:")
    NSURL appURL(String host, String path, NSDictionary<NSString, NSString> queryParameters, NSError.NSErrorPtr errorRef);
    @Method(selector = "facebookURLWithHostPrefix:path:queryParameters:error:")
    NSURL facebookURL(String hostPrefix, String path, NSDictionary<NSString, NSString> queryParameters, NSError.NSErrorPtr errorRef);
    @Method(selector = "registerTransientObject:")
    void registerTransientObject(NSObject object);
    @Method(selector = "unregisterTransientObject:")
    void unregisterTransientObject(NSObject object);
    @Method(selector = "checkRegisteredCanOpenURLScheme:")
    void checkRegisteredCanOpenURLScheme(String urlScheme);
    @Method(selector = "validateURLSchemes")
    void validateURLSchemes();
    @Method(selector = "extendDictionaryWithDataProcessingOptions:")
    void extendDictionary(NSMutableDictionary<NSString, NSString> parameters);
    @Method(selector = "hexadecimalStringFromData:")
    String hexadecimalStringFromData(NSData data);
    @Method(selector = "validateAppID")
    void validateAppID();
    @Method(selector = "validateRequiredClientAccessToken")
    String validateRequiredClientAccessToken();
    @Method(selector = "extractPermissionsFromResponse:grantedPermissions:declinedPermissions:expiredPermissions:")
    void extractPermissions(NSDictionary<NSString, ?> responseObject, NSMutableSet<NSString> grantedPermissions, NSMutableSet<NSString> declinedPermissions, NSMutableSet<NSString> expiredPermissions);
    @Method(selector = "validateFacebookReservedURLSchemes")
    void validateFacebookReservedURLSchemes();
    @Method(selector = "validateDomainConfiguration")
    void validateDomainConfiguration();
    @Method(selector = "parametersFromFBURL:")
    NSDictionary<NSString, ?> parametersFromFBURL(NSURL url);
    @Method(selector = "topMostViewController")
    UIViewController topMostViewController();
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
