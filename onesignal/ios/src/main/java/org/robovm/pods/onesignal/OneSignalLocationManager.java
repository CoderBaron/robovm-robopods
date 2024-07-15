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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OneSignalLocationManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements OSLocation/*</implements>*/ {

    /*<ptr>*/public static class OneSignalLocationManagerPtr extends Ptr<OneSignalLocationManager, OneSignalLocationManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OneSignalLocationManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OneSignalLocationManager() {}
    protected OneSignalLocationManager(Handle h, long handle) { super(h, handle); }
    protected OneSignalLocationManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "Location")
    public static native Class<?> Location();
    @Method(selector = "sharedInstance")
    public static native OneSignalLocationManager sharedInstance();
    @Method(selector = "start")
    public static native void start();
    @Method(selector = "clearLastLocation")
    public static native void clearLastLocation();
    @Method(selector = "onFocus:")
    public static native void onFocus(boolean isActive);
    @Method(selector = "startLocationSharedWithFlag:")
    public static native void startLocationShared(boolean enable);
    @Method(selector = "promptLocationFallbackToSettings:completionHandler:")
    public static native void promptLocationFallbackToSettings(boolean fallback, @Block VoidBlock1<PromptActionResult> completionHandler);
    @Method(selector = "requestPermission")
    public static native void requestPermission();
    @Method(selector = "setShared:")
    public static native void setShared(boolean enable);
    @Method(selector = "isShared")
    public static native boolean isShared();
    /*</methods>*/
}
