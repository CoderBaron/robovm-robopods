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
package org.robovm.pods.appcenter.analytics;

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
import org.robovm.pods.appcenter.core.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSACAnalytics/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MSACAnalyticsPtr extends Ptr<MSACAnalytics, MSACAnalyticsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSACAnalytics.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MSACAnalytics() {}
    protected MSACAnalytics(Handle h, long handle) { super(h, handle); }
    protected MSACAnalytics(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "transmissionInterval")
    public static native @MachineSizedUInt long getTransmissionInterval();
    @Property(selector = "setTransmissionInterval:")
    public static native void setTransmissionInterval(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "trackEvent:")
    public static native void trackEvent(String eventName);
    @Method(selector = "trackEvent:withProperties:")
    public static native void trackEvent(String eventName, NSDictionary<NSString, NSString> properties);
    @Method(selector = "trackEvent:withProperties:flags:")
    public static native void trackEvent(String eventName, NSDictionary<NSString, NSString> properties, MSACFlags flags);
    @Method(selector = "trackEvent:withTypedProperties:")
    public static native void trackEvent(String eventName, MSACEventProperties properties);
    @Method(selector = "trackEvent:withTypedProperties:flags:")
    public static native void trackEvent(String eventName, MSACEventProperties properties, MSACFlags flags);
    @Method(selector = "pause")
    public static native void pause();
    @Method(selector = "resume")
    public static native void resume();
    @Method(selector = "startSession")
    public static native void startSession();
    @Method(selector = "enableManualSessionTracker")
    public static native void enableManualSessionTracker();
    @Method(selector = "transmissionTargetForToken:")
    public static native MSACAnalyticsTransmissionTarget transmissionTargetForToken(String token);
    /*</methods>*/
}
