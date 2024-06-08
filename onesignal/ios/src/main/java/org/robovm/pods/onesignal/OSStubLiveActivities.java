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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("OneSignalOSCore.OSStubLiveActivities")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSStubLiveActivities/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements OSLiveActivities/*</implements>*/ {

    /*<ptr>*/public static class OSStubLiveActivitiesPtr extends Ptr<OSStubLiveActivities, OSStubLiveActivitiesPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OSStubLiveActivities.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OSStubLiveActivities() {}
    protected OSStubLiveActivities(Handle h, long handle) { super(h, handle); }
    protected OSStubLiveActivities(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "liveActivities")
    public static native Class<?> liveActivities();
    @Method(selector = "enter:withToken:")
    public static native void enter(String activityId, String withToken);
    @Method(selector = "enter:withToken:withSuccess:withFailure:")
    public static native void enter(String activityId, String withToken, @Block VoidBlock1<NSDictionary<?, ?>> withSuccess, @Block VoidBlock1<NSError> withFailure);
    @Method(selector = "exit:")
    public static native void exit(String activityId);
    @Method(selector = "exit:withSuccess:withFailure:")
    public static native void exit(String activityId, @Block VoidBlock1<NSDictionary<?, ?>> withSuccess, @Block VoidBlock1<NSError> withFailure);
    /*</methods>*/
}
