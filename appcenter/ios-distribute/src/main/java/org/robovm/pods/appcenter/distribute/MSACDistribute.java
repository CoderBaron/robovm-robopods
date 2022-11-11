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
package org.robovm.pods.appcenter.distribute;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSACDistribute/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MSACDistributePtr extends Ptr<MSACDistribute, MSACDistributePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSACDistribute.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MSACDistribute() {}
    protected MSACDistribute(Handle h, long handle) { super(h, handle); }
    protected MSACDistribute(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "updateTrack")
    public static native MSACUpdateTrack getUpdateTrack();
    @Property(selector = "setUpdateTrack:")
    public static native void setUpdateTrack(MSACUpdateTrack v);
    @Property(selector = "delegate")
    public static native MSACDistributeDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public static native void setDelegate(MSACDistributeDelegate v);
    @Property(selector = "apiUrl")
    public static native String getApiUrl();
    @Property(selector = "setApiUrl:")
    public static native void setApiUrl(String v);
    @Property(selector = "installUrl")
    public static native String getInstallUrl();
    @Property(selector = "setInstallUrl:")
    public static native void setInstallUrl(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "notifyUpdateAction:")
    public static native void notifyUpdateAction(MSACUpdateAction action);
    @Method(selector = "openURL:")
    public static native boolean openURL(NSURL url);
    @Method(selector = "disableAutomaticCheckForUpdate")
    public static native void disableAutomaticCheckForUpdate();
    @Method(selector = "checkForUpdate")
    public static native void checkForUpdate();
    /*</methods>*/
}
