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
package org.robovm.pods.onesignal;

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
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OneSignal/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OneSignalPtr extends Ptr<OneSignal, OneSignalPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OneSignal.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OneSignal() {}
    protected OneSignal(Handle h, long handle) { super(h, handle); }
    protected OneSignal(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "appId")
    public static native String appId();
    @Method(selector = "sdkVersionRaw")
    public static native String sdkVersionRaw();
    @Method(selector = "sdkSemanticVersion")
    public static native String sdkSemanticVersion();
    @Method(selector = "disablePush:")
    public static native void disablePush(boolean disable);
    @Method(selector = "setMSDKType:")
    public static native void setMSDKType(String type);
    @Method(selector = "setAppId:")
    public static native void setAppId(String newAppId);
    @Method(selector = "initWithLaunchOptions:")
    public static native ObjCClass Init(UIApplicationLaunchOptions launchOptions);
    @Method(selector = "setLaunchURLsInApp:")
    public static native void setLaunchURLsInApp(boolean launchInApp);
    @Method(selector = "setProvidesNotificationSettingsView:")
    public static native void setProvidesNotificationSettingsView(boolean providesView);
    @Method(selector = "enterLiveActivity:withToken:")
    public static native void enterLiveActivity(String activityId, String token);
    @Method(selector = "enterLiveActivity:withToken:withSuccess:withFailure:")
    public static native void enterLiveActivity(String activityId, String token, @Block VoidBlock1<NSDictionary<?, ?>> successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "exitLiveActivity:")
    public static native void exitLiveActivity(String activityId);
    @Method(selector = "exitLiveActivity:withSuccess:withFailure:")
    public static native void exitLiveActivity(String activityId, @Block VoidBlock1<NSDictionary<?, ?>> successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "setLogLevel:visualLevel:")
    public static native void setLogLevel(OSLogLevel logLevel, OSLogLevel visualLogLevel);
    @Method(selector = "onesignalLog:message:")
    public static native void onesignalLog(OSLogLevel logLevel, String message);
    @Method(selector = "promptForPushNotificationsWithUserResponse:")
    public static native void promptForPushNotifications(@Block VoidBooleanBlock block);
    @Method(selector = "promptForPushNotificationsWithUserResponse:fallbackToSettings:")
    public static native void promptForPushNotifications(@Block VoidBooleanBlock block, boolean fallback);
    @Method(selector = "registerForProvisionalAuthorization:")
    public static native void registerForProvisionalAuthorization(@Block VoidBooleanBlock block);
    @Method(selector = "getDeviceState")
    public static native OSDeviceState getDeviceState();
    @Method(selector = "consentGranted:")
    public static native void consentGranted(boolean granted);
    @Method(selector = "requiresUserPrivacyConsent")
    public static native boolean requiresUserPrivacyConsent();
    @Method(selector = "setRequiresUserPrivacyConsent:")
    public static native void setRequiresUserPrivacyConsent(boolean required);
    @Method(selector = "setNotificationWillShowInForegroundHandler:")
    public static native void setNotificationWillShowInForegroundHandler(@Block("(,@Block)") VoidBlock2<OSNotification, VoidBlock1<OSNotification>> block);
    @Method(selector = "setNotificationOpenedHandler:")
    public static native void setNotificationOpenedHandler(@Block VoidBlock1<OSNotificationOpenedResult> block);
    @Method(selector = "setInAppMessageClickHandler:")
    public static native void setInAppMessageClickHandler(@Block VoidBlock1<OSInAppMessageAction> block);
    @Method(selector = "setInAppMessageLifecycleHandler:")
    public static native void setInAppMessageLifecycleHandler(OSInAppMessageLifecycleHandler delegate);
    @Method(selector = "postNotification:")
    public static native void postNotification(NSDictionary<?, ?> jsonData);
    @Method(selector = "postNotification:onSuccess:onFailure:")
    public static native void postNotification(NSDictionary<?, ?> jsonData, @Block VoidBlock1<NSDictionary<?, ?>> successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "postNotificationWithJsonString:onSuccess:onFailure:")
    public static native void postNotification(String jsonData, @Block VoidBlock1<NSDictionary<?, ?>> successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "promptLocation")
    public static native void promptLocation();
    @Method(selector = "setLocationShared:")
    public static native void setLocationShared(boolean enable);
    @Method(selector = "isLocationShared")
    public static native boolean isLocationShared();
    @Method(selector = "sendTag:value:onSuccess:onFailure:")
    public static native void sendTag(String key, String value, @Block VoidBlock1<NSDictionary<?, ?>> successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "sendTag:value:")
    public static native void sendTag(String key, String value);
    @Method(selector = "sendTags:onSuccess:onFailure:")
    public static native void sendTags(NSDictionary<?, ?> keyValuePair, @Block VoidBlock1<NSDictionary<?, ?>> successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "sendTags:")
    public static native void sendTags(NSDictionary<?, ?> keyValuePair);
    @Method(selector = "sendTagsWithJsonString:")
    public static native void sendTags(String jsonString);
    @Method(selector = "getTags:onFailure:")
    public static native void getTags(@Block VoidBlock1<NSDictionary<?, ?>> successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "getTags:")
    public static native void getTags(@Block VoidBlock1<NSDictionary<?, ?>> successBlock);
    @Method(selector = "deleteTag:onSuccess:onFailure:")
    public static native void deleteTag(String key, @Block VoidBlock1<NSDictionary<?, ?>> successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "deleteTag:")
    public static native void deleteTag(String key);
    @Method(selector = "deleteTags:onSuccess:onFailure:")
    public static native void deleteTags(NSArray<?> keys, @Block VoidBlock1<NSDictionary<?, ?>> successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "deleteTags:")
    public static native void deleteTags(NSArray<NSString> keys);
    @Method(selector = "deleteTagsWithJsonString:")
    public static native void deleteTags(String jsonString);
    @Method(selector = "addPermissionObserver:")
    public static native void addPermissionObserver(OSPermissionObserver observer);
    @Method(selector = "removePermissionObserver:")
    public static native void removePermissionObserver(OSPermissionObserver observer);
    @Method(selector = "addSubscriptionObserver:")
    public static native void addSubscriptionObserver(OSSubscriptionObserver observer);
    @Method(selector = "removeSubscriptionObserver:")
    public static native void removeSubscriptionObserver(OSSubscriptionObserver observer);
    @Method(selector = "addEmailSubscriptionObserver:")
    public static native void addEmailSubscriptionObserver(OSEmailSubscriptionObserver observer);
    @Method(selector = "removeEmailSubscriptionObserver:")
    public static native void removeEmailSubscriptionObserver(OSEmailSubscriptionObserver observer);
    @Method(selector = "addSMSSubscriptionObserver:")
    public static native void addSMSSubscriptionObserver(OSSMSSubscriptionObserver observer);
    @Method(selector = "removeSMSSubscriptionObserver:")
    public static native void removeSMSSubscriptionObserver(OSSMSSubscriptionObserver observer);
    @Method(selector = "setEmail:withEmailAuthHashToken:")
    public static native void setEmail(String email, String hashToken);
    @Method(selector = "setEmail:withEmailAuthHashToken:withSuccess:withFailure:")
    public static native void setEmail(String email, String hashToken, @Block Runnable successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "setEmail:")
    public static native void setEmail(String email);
    @Method(selector = "setEmail:withSuccess:withFailure:")
    public static native void setEmail(String email, @Block Runnable successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "logoutEmail")
    public static native void logoutEmail();
    @Method(selector = "logoutEmailWithSuccess:withFailure:")
    public static native void logoutEmail(@Block Runnable successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "setSMSNumber:withSMSAuthHashToken:")
    public static native void setSMSNumber(String smsNumber, String hashToken);
    @Method(selector = "setSMSNumber:withSMSAuthHashToken:withSuccess:withFailure:")
    public static native void setSMSNumber(String smsNumber, String hashToken, @Block VoidBlock1<NSDictionary<?, ?>> successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "setSMSNumber:")
    public static native void setSMSNumber(String smsNumber);
    @Method(selector = "setSMSNumber:withSuccess:withFailure:")
    public static native void setSMSNumber(String smsNumber, @Block VoidBlock1<NSDictionary<?, ?>> successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "logoutSMSNumber")
    public static native void logoutSMSNumber();
    @Method(selector = "logoutSMSNumberWithSuccess:withFailure:")
    public static native void logoutSMSNumber(@Block VoidBlock1<NSDictionary<?, ?>> successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "setLanguage:")
    public static native void setLanguage(String language);
    @Method(selector = "setLanguage:withSuccess:withFailure:")
    public static native void setLanguage(String language, @Block Runnable successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "setExternalUserId:")
    public static native void setExternalUserId(String externalId);
    @Method(selector = "setExternalUserId:withSuccess:withFailure:")
    public static native void setExternalUserId(String externalId, @Block VoidBlock1<NSDictionary<?, ?>> successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "setExternalUserId:withExternalIdAuthHashToken:withSuccess:withFailure:")
    public static native void setExternalUserId(String externalId, String hashToken, @Block VoidBlock1<NSDictionary<?, ?>> successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "removeExternalUserId")
    public static native void removeExternalUserId();
    @Method(selector = "removeExternalUserId:withFailure:")
    public static native void removeExternalUserId(@Block VoidBlock1<NSDictionary<?, ?>> successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "isInAppMessagingPaused")
    public static native boolean isInAppMessagingPaused();
    @Method(selector = "pauseInAppMessages:")
    public static native void pauseInAppMessages(boolean pause);
    @Method(selector = "addTrigger:withValue:")
    public static native void addTrigger(String key, NSObject value);
    @Method(selector = "addTriggers:")
    public static native void addTriggers(NSDictionary<NSString, ?> triggers);
    @Method(selector = "removeTriggerForKey:")
    public static native void removeTriggerForKey(String key);
    @Method(selector = "removeTriggersForKeys:")
    public static native void removeTriggersForKeys(NSArray<NSString> keys);
    @Method(selector = "getTriggers")
    public static native NSDictionary<NSString, ?> getTriggers();
    @Method(selector = "getTriggerValueForKey:")
    public static native NSObject getTriggerValueForKey(String key);
    @Method(selector = "sendOutcome:")
    public static native void sendOutcome(String name);
    @Method(selector = "sendOutcome:onSuccess:")
    public static native void sendOutcome(String name, @Block VoidBlock1<OSOutcomeEvent> success);
    @Method(selector = "sendUniqueOutcome:")
    public static native void sendUniqueOutcome(String name);
    @Method(selector = "sendUniqueOutcome:onSuccess:")
    public static native void sendUniqueOutcome(String name, @Block VoidBlock1<OSOutcomeEvent> success);
    @Method(selector = "sendOutcomeWithValue:value:")
    public static native void sendOutcome(String name, NSNumber value);
    @Method(selector = "sendOutcomeWithValue:value:onSuccess:")
    public static native void sendOutcome(String name, NSNumber value, @Block VoidBlock1<OSOutcomeEvent> success);
    /**
     * @deprecated Please use didReceiveNotificationExtensionRequest:withMutableNotificationContent:withContentHandler: instead.
     */
    @Deprecated
    @Method(selector = "didReceiveNotificationExtensionRequest:withMutableNotificationContent:")
    public static native UNMutableNotificationContent didReceiveNotification(UNNotificationRequest request, UNMutableNotificationContent replacementContent);
    @Method(selector = "didReceiveNotificationExtensionRequest:withMutableNotificationContent:withContentHandler:")
    public static native UNMutableNotificationContent didReceiveNotification(UNNotificationRequest request, UNMutableNotificationContent replacementContent, @Block VoidBlock1<UNNotificationContent> contentHandler);
    @Method(selector = "serviceExtensionTimeWillExpireRequest:withMutableNotificationContent:")
    public static native UNMutableNotificationContent serviceExtensionTimeWillExpire(UNNotificationRequest request, UNMutableNotificationContent replacementContent);
    /*</methods>*/
}
