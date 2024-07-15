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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKGraphRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKGraphRequestProtocol/*</implements>*/ {

    /*<ptr>*/public static class FBSDKGraphRequestPtr extends Ptr<FBSDKGraphRequest, FBSDKGraphRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKGraphRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKGraphRequest() {}
    protected FBSDKGraphRequest(Handle h, long handle) { super(h, handle); }
    protected FBSDKGraphRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithGraphPath:")
    public FBSDKGraphRequest(String graphPath) { super((SkipInit) null); initObject(init(graphPath)); }
    @Method(selector = "initWithGraphPath:useAlternativeDefaultDomainPrefix:")
    public FBSDKGraphRequest(String graphPath, boolean useAlternativeDefaultDomainPrefix) { super((SkipInit) null); initObject(init(graphPath, useAlternativeDefaultDomainPrefix)); }
    @Method(selector = "initWithGraphPath:HTTPMethod:")
    public FBSDKGraphRequest(String graphPath, FBSDKHTTPMethod method) { super((SkipInit) null); initObject(init(graphPath, method)); }
    @Method(selector = "initWithGraphPath:parameters:")
    public FBSDKGraphRequest(String graphPath, NSDictionary<NSString, ?> parameters) { super((SkipInit) null); initObject(init(graphPath, parameters)); }
    @Method(selector = "initWithGraphPath:parameters:useAlternativeDefaultDomainPrefix:")
    public FBSDKGraphRequest(String graphPath, NSDictionary<NSString, ?> parameters, boolean useAlternativeDefaultDomainPrefix) { super((SkipInit) null); initObject(init(graphPath, parameters, useAlternativeDefaultDomainPrefix)); }
    @Method(selector = "initWithGraphPath:parameters:HTTPMethod:")
    public FBSDKGraphRequest(String graphPath, NSDictionary<NSString, ?> parameters, FBSDKHTTPMethod method) { super((SkipInit) null); initObject(init(graphPath, parameters, method)); }
    @Method(selector = "initWithGraphPath:parameters:HTTPMethod:useAlternativeDefaultDomainPrefix:")
    public FBSDKGraphRequest(String graphPath, NSDictionary<NSString, ?> parameters, FBSDKHTTPMethod method, boolean useAlternativeDefaultDomainPrefix) { super((SkipInit) null); initObject(init(graphPath, parameters, method, useAlternativeDefaultDomainPrefix)); }
    @Method(selector = "initWithGraphPath:parameters:tokenString:version:HTTPMethod:")
    public FBSDKGraphRequest(String graphPath, NSDictionary<NSString, ?> parameters, String tokenString, String version, FBSDKHTTPMethod method) { super((SkipInit) null); initObject(init(graphPath, parameters, tokenString, version, method)); }
    @Method(selector = "initWithGraphPath:parameters:tokenString:version:HTTPMethod:forAppEvents:")
    public FBSDKGraphRequest(String graphPath, NSDictionary<NSString, ?> parameters, String tokenString, String version, FBSDKHTTPMethod method, boolean forAppEvents) { super((SkipInit) null); initObject(init(graphPath, parameters, tokenString, version, method, forAppEvents)); }
    @Method(selector = "initWithGraphPath:parameters:tokenString:version:HTTPMethod:forAppEvents:useAlternativeDefaultDomainPrefix:")
    public FBSDKGraphRequest(String graphPath, NSDictionary<NSString, ?> parameters, String tokenString, String version, FBSDKHTTPMethod method, boolean forAppEvents, boolean useAlternativeDefaultDomainPrefix) { super((SkipInit) null); initObject(init(graphPath, parameters, tokenString, version, method, forAppEvents, useAlternativeDefaultDomainPrefix)); }
    @Method(selector = "initWithGraphPath:parameters:flags:")
    public FBSDKGraphRequest(String graphPath, NSDictionary<NSString, ?> parameters, FBSDKGraphRequestFlags requestFlags) { super((SkipInit) null); initObject(init(graphPath, parameters, requestFlags)); }
    @Method(selector = "initWithGraphPath:parameters:flags:useAlternativeDefaultDomainPrefix:")
    public FBSDKGraphRequest(String graphPath, NSDictionary<NSString, ?> parameters, FBSDKGraphRequestFlags requestFlags, boolean useAlternativeDefaultDomainPrefix) { super((SkipInit) null); initObject(init(graphPath, parameters, requestFlags, useAlternativeDefaultDomainPrefix)); }
    @Method(selector = "initWithGraphPath:parameters:tokenString:HTTPMethod:flags:")
    public FBSDKGraphRequest(String graphPath, NSDictionary<NSString, ?> parameters, String tokenString, String HTTPMethod, FBSDKGraphRequestFlags flags) { super((SkipInit) null); initObject(init(graphPath, parameters, tokenString, HTTPMethod, flags)); }
    @Method(selector = "initWithGraphPath:parameters:tokenString:HTTPMethod:flags:forAppEvents:useAlternativeDefaultDomainPrefix:")
    public FBSDKGraphRequest(String graphPath, NSDictionary<NSString, ?> parameters, String tokenString, String method, FBSDKGraphRequestFlags requestFlags, boolean forAppEvents, boolean useAlternativeDefaultDomainPrefix) { super((SkipInit) null); initObject(init(graphPath, parameters, tokenString, method, requestFlags, forAppEvents, useAlternativeDefaultDomainPrefix)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "parameters")
    public native NSDictionary<NSString, ?> getParameters();
    @Property(selector = "setParameters:")
    public native void setParameters(NSDictionary<NSString, ?> v);
    @Property(selector = "tokenString")
    public native String getTokenString();
    @Property(selector = "graphPath")
    public native String getGraphPath();
    @Property(selector = "HTTPMethod")
    public native FBSDKHTTPMethod getHTTPMethod();
    @Property(selector = "version")
    public native String getVersion();
    @Property(selector = "forAppEvents")
    public native boolean isForAppEvents();
    @Property(selector = "useAlternativeDefaultDomainPrefix")
    public native boolean isUseAlternativeDefaultDomainPrefix();
    @Property(selector = "flags")
    public native FBSDKGraphRequestFlags getFlags();
    @Property(selector = "isGraphErrorRecoveryDisabled")
    public native boolean isGraphErrorRecoveryDisabled();
    @Property(selector = "hasAttachments")
    public native boolean hasAttachments();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="FBSDKNonJSONResponseProperty", optional=true)
    public static native NSString nonJSONResponsePropertyKey();
    
    @Method(selector = "initWithGraphPath:")
    protected native @Pointer long init(String graphPath);
    @Method(selector = "initWithGraphPath:useAlternativeDefaultDomainPrefix:")
    protected native @Pointer long init(String graphPath, boolean useAlternativeDefaultDomainPrefix);
    @Method(selector = "initWithGraphPath:HTTPMethod:")
    protected native @Pointer long init(String graphPath, FBSDKHTTPMethod method);
    @Method(selector = "initWithGraphPath:parameters:")
    protected native @Pointer long init(String graphPath, NSDictionary<NSString, ?> parameters);
    @Method(selector = "initWithGraphPath:parameters:useAlternativeDefaultDomainPrefix:")
    protected native @Pointer long init(String graphPath, NSDictionary<NSString, ?> parameters, boolean useAlternativeDefaultDomainPrefix);
    @Method(selector = "initWithGraphPath:parameters:HTTPMethod:")
    protected native @Pointer long init(String graphPath, NSDictionary<NSString, ?> parameters, FBSDKHTTPMethod method);
    @Method(selector = "initWithGraphPath:parameters:HTTPMethod:useAlternativeDefaultDomainPrefix:")
    protected native @Pointer long init(String graphPath, NSDictionary<NSString, ?> parameters, FBSDKHTTPMethod method, boolean useAlternativeDefaultDomainPrefix);
    @Method(selector = "initWithGraphPath:parameters:tokenString:version:HTTPMethod:")
    protected native @Pointer long init(String graphPath, NSDictionary<NSString, ?> parameters, String tokenString, String version, FBSDKHTTPMethod method);
    @Method(selector = "initWithGraphPath:parameters:tokenString:version:HTTPMethod:forAppEvents:")
    protected native @Pointer long init(String graphPath, NSDictionary<NSString, ?> parameters, String tokenString, String version, FBSDKHTTPMethod method, boolean forAppEvents);
    @Method(selector = "initWithGraphPath:parameters:tokenString:version:HTTPMethod:forAppEvents:useAlternativeDefaultDomainPrefix:")
    protected native @Pointer long init(String graphPath, NSDictionary<NSString, ?> parameters, String tokenString, String version, FBSDKHTTPMethod method, boolean forAppEvents, boolean useAlternativeDefaultDomainPrefix);
    @Method(selector = "initWithGraphPath:parameters:flags:")
    protected native @Pointer long init(String graphPath, NSDictionary<NSString, ?> parameters, FBSDKGraphRequestFlags requestFlags);
    @Method(selector = "initWithGraphPath:parameters:flags:useAlternativeDefaultDomainPrefix:")
    protected native @Pointer long init(String graphPath, NSDictionary<NSString, ?> parameters, FBSDKGraphRequestFlags requestFlags, boolean useAlternativeDefaultDomainPrefix);
    @Method(selector = "initWithGraphPath:parameters:tokenString:HTTPMethod:flags:")
    protected native @Pointer long init(String graphPath, NSDictionary<NSString, ?> parameters, String tokenString, String HTTPMethod, FBSDKGraphRequestFlags flags);
    @Method(selector = "initWithGraphPath:parameters:tokenString:HTTPMethod:flags:forAppEvents:useAlternativeDefaultDomainPrefix:")
    protected native @Pointer long init(String graphPath, NSDictionary<NSString, ?> parameters, String tokenString, String method, FBSDKGraphRequestFlags requestFlags, boolean forAppEvents, boolean useAlternativeDefaultDomainPrefix);
    @Method(selector = "setGraphErrorRecoveryDisabled:")
    public native void setGraphErrorRecoveryDisabled(boolean disable);
    @Method(selector = "startWithCompletion:")
    public native FBSDKGraphRequestConnecting start(@Block VoidBlock3<FBSDKGraphRequestConnecting, NSObject, NSError> completion);
    @Method(selector = "formattedDescription")
    public native String formattedDescription();
    /*</methods>*/
}
