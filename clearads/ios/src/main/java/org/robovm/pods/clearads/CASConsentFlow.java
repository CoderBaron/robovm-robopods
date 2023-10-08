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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CASConsentFlow/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CASConsentFlowPtr extends Ptr<CASConsentFlow, CASConsentFlowPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CASConsentFlow.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CASConsentFlow() {}
    protected CASConsentFlow(Handle h, long handle) { super(h, handle); }
    protected CASConsentFlow(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEnabled:")
    public CASConsentFlow(boolean isEnabled) { super((SkipInit) null); initObject(init(isEnabled)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "requestGDPR")
    public native boolean isRequestGDPR();
    @Property(selector = "setRequestGDPR:")
    public native void setRequestGDPR(boolean v);
    /**
     * @deprecated The GDPR and ATT request does not support partial activation. Use requestGDPR instead.
     */
    @Deprecated
    @Property(selector = "requestATT")
    public native boolean isRequestATT();
    /**
     * @deprecated The GDPR and ATT request does not support partial activation. Use requestGDPR instead.
     */
    @Deprecated
    @Property(selector = "setRequestATT:")
    public native void setRequestATT(boolean v);
    @Property(selector = "privacyPolicyUrl")
    public native String getPrivacyPolicyUrl();
    @Property(selector = "setPrivacyPolicyUrl:")
    public native void setPrivacyPolicyUrl(String v);
    @Property(selector = "completionHandler")
    public native @Block VoidBlock1<CASConsentFlowStatus> getCompletionHandler();
    @Property(selector = "setCompletionHandler:")
    public native void setCompletionHandler(@Block VoidBlock1<CASConsentFlowStatus> v);
    @Property(selector = "viewControllerToPresent")
    public native UIViewController getViewControllerToPresent();
    @Property(selector = "setViewControllerToPresent:")
    public native void setViewControllerToPresent(UIViewController v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithEnabled:")
    protected native @Pointer long init(boolean isEnabled);
    @Method(selector = "withViewControllerToPresent:")
    public native CASConsentFlow withViewControllerToPresent(UIViewController controller);
    @Method(selector = "present")
    public native void present();
    /*</methods>*/
}
