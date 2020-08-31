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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRUser/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FIRUserInfo/*</implements>*/ {

    /*<ptr>*/public static class FIRUserPtr extends Ptr<FIRUser, FIRUserPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRUser.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIRUser() {}
    protected FIRUser(Handle h, long handle) { super(h, handle); }
    protected FIRUser(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isAnonymous")
    public native boolean isAnonymous();
    @Property(selector = "isEmailVerified")
    public native boolean isEmailVerified();
    @Property(selector = "refreshToken")
    public native String getRefreshToken();
    @Property(selector = "providerData")
    public native @org.robovm.rt.bro.annotation.Marshaler(FIRUserInfo.AsListMarshaller.class) List<FIRUserInfo> getProviderData();
    @Property(selector = "metadata")
    public native FIRUserMetadata getMetadata();
    @Property(selector = "tenantID")
    public native String getTenantID();
    @Property(selector = "multiFactor")
    public native FIRMultiFactor getMultiFactor();
    @Property(selector = "providerID")
    public native String getProviderID();
    @Property(selector = "uid")
    public native String getUid();
    @Property(selector = "displayName")
    public native String getDisplayName();
    @Property(selector = "photoURL")
    public native NSURL getPhotoURL();
    @Property(selector = "email")
    public native String getEmail();
    @Property(selector = "phoneNumber")
    public native String getPhoneNumber();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "updateEmail:completion:")
    public native void updateEmail(String email, @Block VoidBlock1<NSError> completion);
    @Method(selector = "updatePassword:completion:")
    public native void updatePassword(String password, @Block VoidBlock1<NSError> completion);
    @Method(selector = "updatePhoneNumberCredential:completion:")
    public native void updatePhoneNumberCredential(FIRPhoneAuthCredential phoneNumberCredential, @Block VoidBlock1<NSError> completion);
    @Method(selector = "profileChangeRequest")
    public native FIRUserProfileChangeRequest profileChangeRequest();
    @Method(selector = "reloadWithCompletion:")
    public native void reload(@Block VoidBlock1<NSError> completion);
    @Method(selector = "reauthenticateWithCredential:completion:")
    public native void reauthenticate(FIRAuthCredential credential, @Block VoidBlock2<FIRAuthDataResult, NSError> completion);
    /**
     * @deprecated Please use reauthenticateWithCredential:completion: for Objective-C or reauthenticate(withCredential:completion:) for Swift instead.
     */
    @Deprecated
    @Method(selector = "reauthenticateAndRetrieveDataWithCredential:completion:")
    public native void reauthenticateAndRetrieveData(FIRAuthCredential credential, @Block VoidBlock2<FIRAuthDataResult, NSError> completion);
    @Method(selector = "reauthenticateWithProvider:UIDelegate:completion:")
    public native void reauthenticate(FIRFederatedAuthProvider provider, FIRAuthUIDelegate UIDelegate, @Block VoidBlock2<FIRAuthDataResult, NSError> completion);
    @Method(selector = "getIDTokenResultWithCompletion:")
    public native void getIDTokenResult(@Block VoidBlock2<FIRAuthTokenResult, NSError> completion);
    @Method(selector = "getIDTokenResultForcingRefresh:completion:")
    public native void getIDTokenResultForcingRefresh(boolean forceRefresh, @Block VoidBlock2<FIRAuthTokenResult, NSError> completion);
    @Method(selector = "getIDTokenWithCompletion:")
    public native void getIDToken(@Block VoidBlock2<NSString, NSError> completion);
    @Method(selector = "getIDTokenForcingRefresh:completion:")
    public native void getIDTokenForcingRefresh(boolean forceRefresh, @Block VoidBlock2<NSString, NSError> completion);
    /**
     * @deprecated Please use linkWithCredential:completion: for Objective-C or link(withCredential:completion:) for Swift instead.
     */
    @Deprecated
    @Method(selector = "linkAndRetrieveDataWithCredential:completion:")
    public native void linkAndRetrieveData(FIRAuthCredential credential, @Block VoidBlock2<FIRAuthDataResult, NSError> completion);
    @Method(selector = "linkWithCredential:completion:")
    public native void link(FIRAuthCredential credential, @Block VoidBlock2<FIRAuthDataResult, NSError> completion);
    @Method(selector = "linkWithProvider:UIDelegate:completion:")
    public native void link(FIRFederatedAuthProvider provider, FIRAuthUIDelegate UIDelegate, @Block VoidBlock2<FIRAuthDataResult, NSError> completion);
    @Method(selector = "unlinkFromProvider:completion:")
    public native void unlink(String provider, @Block VoidBlock2<FIRUser, NSError> completion);
    @Method(selector = "sendEmailVerificationWithCompletion:")
    public native void sendEmailVerification(@Block VoidBlock1<NSError> completion);
    @Method(selector = "sendEmailVerificationWithActionCodeSettings:completion:")
    public native void sendEmailVerificationUsingActionCode(FIRActionCodeSettings actionCodeSettings, @Block VoidBlock1<NSError> completion);
    @Method(selector = "deleteWithCompletion:")
    public native void delete(@Block VoidBlock1<NSError> completion);
    @Method(selector = "sendEmailVerificationBeforeUpdatingEmail:completion:")
    public native void sendEmailVerificationBeforeUpdatingEmail(String email, @Block VoidBlock1<NSError> completion);
    @Method(selector = "sendEmailVerificationBeforeUpdatingEmail:actionCodeSettings:completion:")
    public native void sendEmailVerificationBeforeUpdatingEmail(String email, FIRActionCodeSettings actionCodeSettings, @Block VoidBlock1<NSError> completion);
    /*</methods>*/
}
