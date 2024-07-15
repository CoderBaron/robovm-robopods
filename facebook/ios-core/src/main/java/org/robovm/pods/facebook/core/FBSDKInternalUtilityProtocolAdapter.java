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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKInternalUtilityProtocolAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKInternalUtilityProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("isFacebookAppInstalled")
    public boolean isFacebookAppInstalled() { return false; }
    @NotImplemented("isUnity")
    public boolean isUnity() { return false; }
    @NotImplemented("bundleForStrings")
    public NSBundle getBundleForStrings() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("URLWithScheme:host:path:queryParameters:error:")
    public NSURL constructURL(String scheme, String host, String path, NSDictionary<NSString, NSString> queryParameters, NSError.NSErrorPtr errorRef) { return null; }
    @NotImplemented("appURLWithHost:path:queryParameters:error:")
    public NSURL appURL(String host, String path, NSDictionary<NSString, NSString> queryParameters, NSError.NSErrorPtr errorRef) { return null; }
    @NotImplemented("facebookURLWithHostPrefix:path:queryParameters:error:")
    public NSURL facebookURL(String hostPrefix, String path, NSDictionary<NSString, NSString> queryParameters, NSError.NSErrorPtr errorRef) { return null; }
    @NotImplemented("registerTransientObject:")
    public void registerTransientObject(NSObject object) {}
    @NotImplemented("unregisterTransientObject:")
    public void unregisterTransientObject(NSObject object) {}
    @NotImplemented("checkRegisteredCanOpenURLScheme:")
    public void checkRegisteredCanOpenURLScheme(String urlScheme) {}
    @NotImplemented("validateURLSchemes")
    public void validateURLSchemes() {}
    @NotImplemented("extendDictionaryWithDataProcessingOptions:")
    public void extendDictionary(NSMutableDictionary<NSString, NSString> parameters) {}
    @NotImplemented("hexadecimalStringFromData:")
    public String hexadecimalStringFromData(NSData data) { return null; }
    @NotImplemented("validateAppID")
    public void validateAppID() {}
    @NotImplemented("validateRequiredClientAccessToken")
    public String validateRequiredClientAccessToken() { return null; }
    @NotImplemented("extractPermissionsFromResponse:grantedPermissions:declinedPermissions:expiredPermissions:")
    public void extractPermissions(NSDictionary<NSString, ?> responseObject, NSMutableSet<NSString> grantedPermissions, NSMutableSet<NSString> declinedPermissions, NSMutableSet<NSString> expiredPermissions) {}
    @NotImplemented("validateFacebookReservedURLSchemes")
    public void validateFacebookReservedURLSchemes() {}
    @NotImplemented("validateDomainConfiguration")
    public void validateDomainConfiguration() {}
    @NotImplemented("parametersFromFBURL:")
    public NSDictionary<NSString, ?> parametersFromFBURL(NSURL url) { return null; }
    @NotImplemented("topMostViewController")
    public UIViewController topMostViewController() { return null; }
    /*</methods>*/
}
