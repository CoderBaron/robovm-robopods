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
package org.robovm.pods.helpshift;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/Helpshift/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HelpshiftPtr extends Ptr<Helpshift, HelpshiftPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(Helpshift.class); }/*</bind>*/
    /*<constants>*/
    public static class UserDetailKeys {
        public static final String userName = "userName";
        public static final String userIdentifier = "userId";
        public static final String userEmail = "userEmail";
        public static final String userAuthToken = "userAuthToken";
    }
    /*</constants>*/
    /*<constructors>*/
    public Helpshift() {}
    protected Helpshift(Handle h, long handle) { super(h, handle); }
    protected Helpshift(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native HelpshiftDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(HelpshiftDelegate v);
    @Property(selector = "proactiveAPIConfigCollectorDelegate")
    public native HelpshiftProactiveAPIConfigCollectorDelegate getProactiveAPIConfigCollectorDelegate();
    @Property(selector = "setProactiveAPIConfigCollectorDelegate:", strongRef = true)
    public native void setProactiveAPIConfigCollectorDelegate(HelpshiftProactiveAPIConfigCollectorDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "sharedInstance")
    public static native Helpshift sharedInstance();
    @Method(selector = "installWithPlatformId:domain:config:")
    public static native void install(String platformId, String domain, NSDictionary<?, ?> config);
    @Method(selector = "pauseDisplayOfInAppNotification:")
    public static native void pauseDisplayOfInAppNotification(boolean shouldPauseInAppNotification);
    @Method(selector = "loginUser:")
    public static native void loginUser(NSDictionary<NSString, NSString> userDetails);
    @Method(selector = "logout")
    public static native void logout();
    /**
     * @deprecated Use clearAnonymousUserOnLogin:(BOOL)shouldClear instead.
     */
    @Deprecated
    @Method(selector = "clearAnonymousUserOnLogin")
    public static native void clearAnonymousUserOnLogin();
    @Method(selector = "clearAnonymousUserOnLogin:")
    public static native void clearAnonymousUserOnLogin(boolean shouldClear);
    @Method(selector = "showConversationWith:config:")
    public static native void showConversation(UIViewController viewController, NSDictionary<?, ?> config);
    @Method(selector = "showFAQsWith:config:")
    public static native void showFAQs(UIViewController viewController, NSDictionary<?, ?> config);
    @Method(selector = "showFAQSection:with:config:")
    public static native void showFAQSection(String faqSectionPublishID, UIViewController viewController, NSDictionary<?, ?> config);
    @Method(selector = "showSingleFAQ:with:config:")
    public static native void showSingleFAQ(String faqPublishID, UIViewController viewController, NSDictionary<?, ?> config);
    @Method(selector = "setLanguage:")
    public static native void setLanguage(String languageCode);
    @Method(selector = "registerDeviceToken:")
    public static native void registerDeviceToken(NSData deviceToken);
    @Method(selector = "handleNotificationWithUserInfoDictionary:isAppLaunch:withController:")
    public static native boolean handleNotification(NSDictionary<?, ?> userInfo, boolean isAppLaunch, UIViewController viewController);
    @Method(selector = "handleProactiveLink:")
    public static native void handleProactiveLink(String proactiveLink);
    @Method(selector = "requestUnreadMessageCount:")
    public static native void requestUnreadMessageCount(boolean shouldFetchFromServer);
    @Method(selector = "leaveBreadcrumb:")
    public static native void leaveBreadcrumb(String leaveBreadcrumb);
    @Method(selector = "clearBreadcrumbs")
    public static native void clearBreadcrumbs();
    @Method(selector = "addLog:")
    public static native void addLog(String message);
    @Method(selector = "addUserTrail:")
    public static native void addUserTrail(String userTrail);
    /*</methods>*/
}
