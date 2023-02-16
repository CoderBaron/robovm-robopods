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
package org.robovm.pods.facebook.corebasics;

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
import org.robovm.apple.webkit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKCrashHandler/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKCrashHandlerProtocol/*</implements>*/ {

    /*<ptr>*/public static class FBSDKCrashHandlerPtr extends Ptr<FBSDKCrashHandler, FBSDKCrashHandlerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKCrashHandler.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKCrashHandler() {}
    protected FBSDKCrashHandler(Handle h, long handle) { super(h, handle); }
    protected FBSDKCrashHandler(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "shared")
    public static native FBSDKCrashHandler getShared();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "saveException:")
    public native void saveException(NSException exception);
    @Method(selector = "disable")
    public native void disable();
    @Method(selector = "disable")
    public static native void sharedDisable();
    @Method(selector = "addObserver:")
    public static native void sharedAddObserver(FBSDKCrashObserving observer);
    @Method(selector = "removeObserver:")
    public static native void sharedRemoveObserver(FBSDKCrashObserving observer);
    @Method(selector = "clearCrashReportFiles")
    public static native void sharedClearCrashReportFiles();
    @Method(selector = "getFBSDKVersion")
    public static native String getFBSDKVersion();
    @Method(selector = "addObserver:")
    public native void addObserver(FBSDKCrashObserving observer);
    @Method(selector = "clearCrashReportFiles")
    public native void clearCrashReportFiles();
    /*</methods>*/
}
