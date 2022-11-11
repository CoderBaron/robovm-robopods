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
package org.robovm.pods.appcenter.crashes;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSACCrashes/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MSACCrashesPtr extends Ptr<MSACCrashes, MSACCrashesPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSACCrashes.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MSACCrashes() {}
    protected MSACCrashes(Handle h, long handle) { super(h, handle); }
    protected MSACCrashes(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "hasCrashedInLastSession")
    public static native boolean hasCrashedInLastSession();
    @Property(selector = "hasReceivedMemoryWarningInLastSession")
    public static native boolean hasReceivedMemoryWarningInLastSession();
    @Property(selector = "lastSessionCrashReport")
    public static native MSACErrorReport getLastSessionCrashReport();
    @Property(selector = "delegate")
    public static native MSACCrashesDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public static native void setDelegate(MSACCrashesDelegate v);
    @Property(selector = "userConfirmationHandler")
    public static native @Block Block1<NSArray<MSACErrorReport>, Boolean> getUserConfirmationHandler();
    @Property(selector = "setUserConfirmationHandler:")
    public static native void setUserConfirmationHandler(@Block Block1<NSArray<MSACErrorReport>, Boolean> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "trackError:withProperties:attachments:")
    public static native String trackError(NSError error, NSDictionary<NSString, NSString> properties, NSArray<MSACErrorAttachmentLog> attachments);
    @Method(selector = "trackException:withProperties:attachments:")
    public static native String trackException(MSACExceptionModel exception, NSDictionary<NSString, NSString> properties, NSArray<MSACErrorAttachmentLog> attachments);
    @Method(selector = "generateTestCrash")
    public static native void generateTestCrash();
    @Method(selector = "disableMachExceptionHandler")
    public static native void disableMachExceptionHandler();
    @Method(selector = "notifyWithUserConfirmation:")
    public static native void notify(MSACUserConfirmation userConfirmation);
    /*</methods>*/
}
