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
package org.robovm.pods.facebook.login;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.pods.facebook.core.*;
import org.robovm.pods.facebook.corebasics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKLoginCompletionParameters/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKLoginCompletionParametersPtr extends Ptr<FBSDKLoginCompletionParameters, FBSDKLoginCompletionParametersPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKLoginCompletionParameters.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKLoginCompletionParameters() {}
    protected FBSDKLoginCompletionParameters(Handle h, long handle) { super(h, handle); }
    protected FBSDKLoginCompletionParameters(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "authenticationToken")
    public native FBSDKAuthenticationToken getAuthenticationToken();
    @Property(selector = "setAuthenticationToken:")
    public native void setAuthenticationToken(FBSDKAuthenticationToken v);
    @Property(selector = "profile")
    public native FBSDKProfile getProfile();
    @Property(selector = "setProfile:")
    public native void setProfile(FBSDKProfile v);
    @Property(selector = "accessTokenString")
    public native String getAccessTokenString();
    @Property(selector = "setAccessTokenString:")
    public native void setAccessTokenString(String v);
    @Property(selector = "nonceString")
    public native String getNonceString();
    @Property(selector = "setNonceString:")
    public native void setNonceString(String v);
    @Property(selector = "authenticationTokenString")
    public native String getAuthenticationTokenString();
    @Property(selector = "setAuthenticationTokenString:")
    public native void setAuthenticationTokenString(String v);
    @Property(selector = "code")
    public native String getCode();
    @Property(selector = "setCode:")
    public native void setCode(String v);
    @Property(selector = "permissions")
    public native NSSet<NSObject> getPermissions();
    @Property(selector = "setPermissions:")
    public native void setPermissions(NSSet<NSObject> v);
    @Property(selector = "declinedPermissions")
    public native NSSet<NSObject> getDeclinedPermissions();
    @Property(selector = "setDeclinedPermissions:")
    public native void setDeclinedPermissions(NSSet<NSObject> v);
    @Property(selector = "expiredPermissions")
    public native NSSet<NSObject> getExpiredPermissions();
    @Property(selector = "setExpiredPermissions:")
    public native void setExpiredPermissions(NSSet<NSObject> v);
    @Property(selector = "appID")
    public native String getAppID();
    @Property(selector = "setAppID:")
    public native void setAppID(String v);
    @Property(selector = "userID")
    public native String getUserID();
    @Property(selector = "setUserID:")
    public native void setUserID(String v);
    @Property(selector = "error")
    public native NSError getError();
    @Property(selector = "setError:")
    public native void setError(NSError v);
    @Property(selector = "expirationDate")
    public native NSDate getExpirationDate();
    @Property(selector = "setExpirationDate:")
    public native void setExpirationDate(NSDate v);
    @Property(selector = "dataAccessExpirationDate")
    public native NSDate getDataAccessExpirationDate();
    @Property(selector = "setDataAccessExpirationDate:")
    public native void setDataAccessExpirationDate(NSDate v);
    @Property(selector = "challenge")
    public native String getChallenge();
    @Property(selector = "setChallenge:")
    public native void setChallenge(String v);
    @Property(selector = "graphDomain")
    public native String getGraphDomain();
    @Property(selector = "setGraphDomain:")
    public native void setGraphDomain(String v);
    @Property(selector = "userTokenNonce")
    public native String getUserTokenNonce();
    @Property(selector = "setUserTokenNonce:")
    public native void setUserTokenNonce(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
