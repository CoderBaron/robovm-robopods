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
package org.robovm.pods.firebase.auth;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRAuth/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRAuthPtr extends Ptr<FIRAuth, FIRAuthPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRAuth.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIRAuth() {}
    protected FIRAuth(Handle h, long handle) { super(h, handle); }
    protected FIRAuth(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "app")
    public native org.robovm.pods.firebase.core.FIRApp getApp();
    @Property(selector = "currentUser")
    public native FIRUser getCurrentUser();
    @Property(selector = "languageCode")
    public native String getLanguageCode();
    @Property(selector = "setLanguageCode:")
    public native void setLanguageCode(String v);
    @Property(selector = "settings")
    public native FIRAuthSettings getSettings();
    @Property(selector = "setSettings:")
    public native void setSettings(FIRAuthSettings v);
    @Property(selector = "userAccessGroup")
    public native String getUserAccessGroup();
    @Property(selector = "shareAuthStateAcrossDevices")
    public native boolean isShareAuthStateAcrossDevices();
    @Property(selector = "setShareAuthStateAcrossDevices:")
    public native void setShareAuthStateAcrossDevices(boolean v);
    @Property(selector = "tenantID")
    public native String getTenantID();
    @Property(selector = "setTenantID:")
    public native void setTenantID(String v);
    @Property(selector = "APNSToken")
    public native NSData getAPNSToken();
    @Property(selector = "setAPNSToken:")
    public native void setAPNSToken(NSData v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library(Library.INTERNAL)
    public static class Notifications {
        static { Bro.bind(Notifications.class); }

        @GlobalValue(symbol="FIRAuthStateDidChangeNotification", optional=true)
        public static native NSString AuthStateDidChange();
    }
    
    @Method(selector = "updateCurrentUser:completion:")
    public native void updateCurrentUser(FIRUser user, @Block VoidBlock1<NSError> completion);
    @Method(selector = "fetchSignInMethodsForEmail:completion:")
    public native void fetchSignInMethods(String email, @Block VoidBlock2<NSArray<NSString>, NSError> completion);
    @Method(selector = "signInWithEmail:password:completion:")
    public native void signInUsingEmailPassword(String email, String password, @Block VoidBlock2<FIRAuthDataResult, NSError> completion);
    @Method(selector = "signInWithEmail:link:completion:")
    public native void signInUsingEmailLink(String email, String link, @Block VoidBlock2<FIRAuthDataResult, NSError> completion);
    @Method(selector = "signInWithProvider:UIDelegate:completion:")
    public native void signInUsingProvider(FIRFederatedAuthProvider provider, FIRAuthUIDelegate UIDelegate, @Block VoidBlock2<FIRAuthDataResult, NSError> completion);
    @Method(selector = "signInWithCredential:completion:")
    public native void signInUsingCredential(FIRAuthCredential credential, @Block VoidBlock2<FIRAuthDataResult, NSError> completion);
    @Method(selector = "signInAnonymouslyWithCompletion:")
    public native void signInAnonymously(@Block VoidBlock2<FIRAuthDataResult, NSError> completion);
    @Method(selector = "signInWithCustomToken:completion:")
    public native void signInUsingCustomToken(String token, @Block VoidBlock2<FIRAuthDataResult, NSError> completion);
    @Method(selector = "createUserWithEmail:password:completion:")
    public native void createUser(String email, String password, @Block VoidBlock2<FIRAuthDataResult, NSError> completion);
    @Method(selector = "confirmPasswordResetWithCode:newPassword:completion:")
    public native void confirmPasswordReset(String code, String newPassword, @Block VoidBlock1<NSError> completion);
    @Method(selector = "checkActionCode:completion:")
    public native void checkActionCode(String code, @Block VoidBlock2<FIRActionCodeInfo, NSError> completion);
    @Method(selector = "verifyPasswordResetCode:completion:")
    public native void verifyPasswordResetCode(String code, @Block VoidBlock2<NSString, NSError> completion);
    @Method(selector = "applyActionCode:completion:")
    public native void applyActionCode(String code, @Block VoidBlock1<NSError> completion);
    @Method(selector = "sendPasswordResetWithEmail:completion:")
    public native void sendPasswordReset(String email, @Block VoidBlock1<NSError> completion);
    @Method(selector = "sendPasswordResetWithEmail:actionCodeSettings:completion:")
    public native void sendPasswordReset(String email, FIRActionCodeSettings actionCodeSettings, @Block VoidBlock1<NSError> completion);
    @Method(selector = "sendSignInLinkToEmail:actionCodeSettings:completion:")
    public native void sendSignInLink(String email, FIRActionCodeSettings actionCodeSettings, @Block VoidBlock1<NSError> completion);
    @Method(selector = "signOut:")
    public native boolean signOut(NSError.NSErrorPtr error);
    @Method(selector = "isSignInWithEmailLink:")
    public native boolean isSignInWithEmailLink(String link);
    @Method(selector = "addAuthStateDidChangeListener:")
    public native NSObject addAuthStateDidChangeListener(@Block VoidBlock2<FIRAuth, FIRUser> listener);
    @Method(selector = "removeAuthStateDidChangeListener:")
    public native void removeAuthStateDidChangeListener(NSObject listenerHandle);
    @Method(selector = "addIDTokenDidChangeListener:")
    public native NSObject addIDTokenDidChangeListener(@Block VoidBlock2<FIRAuth, FIRUser> listener);
    @Method(selector = "removeIDTokenDidChangeListener:")
    public native void removeIDTokenDidChangeListener(NSObject listenerHandle);
    @Method(selector = "useAppLanguage")
    public native void useAppLanguage();
    @Method(selector = "useEmulatorWithHost:port:")
    public native void useEmulator(String host, @MachineSizedSInt long port);
    @Method(selector = "canHandleURL:")
    public native boolean canHandleURL(NSURL URL);
    @Method(selector = "setAPNSToken:type:")
    public native void setAPNSToken(NSData token, FIRAuthAPNSTokenType type);
    @Method(selector = "canHandleNotification:")
    public native boolean canHandleNotification(NSDictionary<?, ?> userInfo);
    @Method(selector = "revokeTokenWithAuthorizationCode:completion:")
    public native void revokeToken(String authorizationCode, @Block VoidBlock1<NSError> completion);
    @Method(selector = "initializeRecaptchaConfigWithCompletion:")
    public native void initializeRecaptchaConfig(@Block VoidBlock1<NSError> completion);
    @Method(selector = "useUserAccessGroup:error:")
    public native boolean useUserAccessGroup(String accessGroup, NSError.NSErrorPtr outError);
    @Method(selector = "getStoredUserForAccessGroup:error:")
    public native FIRUser getStoredUser(String accessGroup, NSError.NSErrorPtr outError);
    @Method(selector = "auth")
    public static native FIRAuth auth();
    @Method(selector = "authWithApp:")
    public static native FIRAuth auth(org.robovm.pods.firebase.core.FIRApp app);
    /*</methods>*/
}
