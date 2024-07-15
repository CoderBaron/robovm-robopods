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
package org.robovm.pods.clearads;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CASAppOpen/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CASAppOpenPtr extends Ptr<CASAppOpen, CASAppOpenPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CASAppOpen.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CASAppOpen() {}
    protected CASAppOpen(Handle h, long handle) { super(h, handle); }
    protected CASAppOpen(SkipInit skipInit) { super(skipInit); }
    public CASAppOpen(String managerId) { super((Handle) null, create(managerId)); retain(getHandle()); }
    public CASAppOpen(CASMediationManager manager) { super((Handle) null, create(manager)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "managerId")
    public native String getManagerId();
    @Property(selector = "contentCallback")
    public native CASCallback getContentCallback();
    @Property(selector = "setContentCallback:", strongRef = true)
    public native void setContentCallback(CASCallback v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "loadAdWithCompletionHandler:")
    public native void loadAd(@Block VoidBlock2<CASAppOpen, NSError> completionHandler);
    /**
     * @deprecated Loading app open ads now assumes the current orientation of the device, matching other full-screen formats.
     */
    @Deprecated
    @Method(selector = "loadAdWithOrientation:completionHandler:")
    public native void loadAd(UIInterfaceOrientation orientation, @Block VoidBlock2<CASAppOpen, NSError> completionHandler);
    @Method(selector = "isAdAvailable")
    public native boolean isAdAvailable();
    @Method(selector = "presentFromRootViewController:")
    public native void presentFromRootViewController(UIViewController controller);
    @Method(selector = "createWithManagerId:")
    protected static native @Pointer long create(String managerId);
    @Method(selector = "createWithManager:")
    protected static native @Pointer long create(CASMediationManager manager);
    /*</methods>*/
}
