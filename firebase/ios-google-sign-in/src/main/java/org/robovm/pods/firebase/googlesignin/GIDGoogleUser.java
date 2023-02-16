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
package org.robovm.pods.firebase.googlesignin;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GIDGoogleUser/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class GIDGoogleUserPtr extends Ptr<GIDGoogleUser, GIDGoogleUserPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GIDGoogleUser.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GIDGoogleUser() {}
    protected GIDGoogleUser(Handle h, long handle) { super(h, handle); }
    protected GIDGoogleUser(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public GIDGoogleUser(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "userID")
    public native String getUserID();
    @Property(selector = "profile")
    public native GIDProfileData getProfile();
    @Property(selector = "grantedScopes")
    public native NSArray<NSString> getGrantedScopes();
    @Property(selector = "configuration")
    public native GIDConfiguration getConfiguration();
    @Property(selector = "accessToken")
    public native GIDToken getAccessToken();
    @Property(selector = "refreshToken")
    public native GIDToken getRefreshToken();
    @Property(selector = "idToken")
    public native GIDToken getIdToken();
    @Property(selector = "fetcherAuthorizer")
    public native GTMFetcherAuthorizationProtocol getFetcherAuthorizer();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "refreshTokensIfNeededWithCompletion:")
    public native void refreshTokensIfNeeded(@Block VoidBlock2<GIDGoogleUser, NSError> completion);
    @Method(selector = "addScopes:presentingViewController:completion:")
    public native void addScopes(NSArray<NSString> scopes, UIViewController presentingViewController, @Block VoidBlock2<GIDSignInResult, NSError> completion);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
