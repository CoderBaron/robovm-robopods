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
package org.robovm.pods.firebase.analytics;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRAnalytics/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRAnalyticsPtr extends Ptr<FIRAnalytics, FIRAnalyticsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRAnalytics.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIRAnalytics() {}
    protected FIRAnalytics(Handle h, long handle) { super(h, handle); }
    protected FIRAnalytics(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library(Library.INTERNAL)
    public static class ConsentStatus {
        static { Bro.bind(ConsentStatus.class); }

        @GlobalValue(symbol="FIRConsentStatusDenied", optional=true)
        public static native NSString Denied();
        @GlobalValue(symbol="FIRConsentStatusGranted", optional=true)
        public static native NSString Granted();
    }

    @Library(Library.INTERNAL)
    public static class ConsentType {
        static { Bro.bind(ConsentType.class); }

        @GlobalValue(symbol="FIRConsentTypeAdStorage", optional=true)
        public static native NSString AdStorage();
        @GlobalValue(symbol="FIRConsentTypeAnalyticsStorage", optional=true)
        public static native NSString AnalyticsStorage();
        @GlobalValue(symbol="FIRConsentTypeAdUserData", optional=true)
        public static native NSString AdUserData();
        @GlobalValue(symbol="FIRConsentTypeAdPersonalization", optional=true)
        public static native NSString AdPersonalization();
    }
    
    @Method(selector = "logEventWithName:parameters:")
    public static native void logEvent(String name, NSDictionary<NSString, ?> parameters);
    @Method(selector = "setUserPropertyString:forName:")
    public static native void setUserPropertyString(String value, String name);
    @Method(selector = "setUserID:")
    public static native void setUserID(String userID);
    @Method(selector = "setAnalyticsCollectionEnabled:")
    public static native void setAnalyticsCollectionEnabled(boolean analyticsCollectionEnabled);
    @Method(selector = "setSessionTimeoutInterval:")
    public static native void setSessionTimeoutInterval(double sessionTimeoutInterval);
    @Method(selector = "sessionIDWithCompletion:")
    public static native void sessionID(@Block VoidBlock2<Long, NSError> completion);
    @Method(selector = "appInstanceID")
    public static native String appInstanceID();
    @Method(selector = "resetAnalyticsData")
    public static native void resetAnalyticsData();
    @Method(selector = "setDefaultEventParameters:")
    public static native void setDefaultEventParameters(NSDictionary<NSString, ?> parameters);
    @Method(selector = "handleEventsForBackgroundURLSession:completionHandler:")
    public static native void handleEventsForBackgroundURLSession(String identifier, @Block Runnable completionHandler);
    @Method(selector = "handleOpenURL:")
    public static native void handleOpenURL(NSURL url);
    @Method(selector = "handleUserActivity:")
    public static native void handleUserActivity(NSObject userActivity);
    @Method(selector = "setConsent:")
    public static native void setConsent(NSDictionary<NSString, NSString> consentSettings);
    @Method(selector = "initiateOnDeviceConversionMeasurementWithEmailAddress:")
    public static native void initiateOnDeviceConversionMeasurement(String emailAddress);
    @Method(selector = "initiateOnDeviceConversionMeasurementWithPhoneNumber:")
    public static native void initiateOnDeviceConversionMeasurementWithPhoneNumber(String phoneNumber);
    /*</methods>*/
}
