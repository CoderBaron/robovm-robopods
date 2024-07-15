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
package org.robovm.pods.applovinsdk;

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
import org.robovm.apple.safariservices.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALTermsAndPrivacyPolicyFlowSettings/*</name>*/ 
    extends /*<extends>*/ALConsentFlowSettings/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ALTermsAndPrivacyPolicyFlowSettingsPtr extends Ptr<ALTermsAndPrivacyPolicyFlowSettings, ALTermsAndPrivacyPolicyFlowSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ALTermsAndPrivacyPolicyFlowSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ALTermsAndPrivacyPolicyFlowSettings() {}
    protected ALTermsAndPrivacyPolicyFlowSettings(Handle h, long handle) { super(h, handle); }
    protected ALTermsAndPrivacyPolicyFlowSettings(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    @Property(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    @Property(selector = "privacyPolicyURL")
    public native NSURL getPrivacyPolicyURL();
    @Property(selector = "setPrivacyPolicyURL:")
    public native void setPrivacyPolicyURL(NSURL v);
    @Property(selector = "termsOfServiceURL")
    public native NSURL getTermsOfServiceURL();
    @Property(selector = "setTermsOfServiceURL:")
    public native void setTermsOfServiceURL(NSURL v);
    @Property(selector = "debugUserGeography")
    public native ALConsentFlowUserGeography getDebugUserGeography();
    @Property(selector = "setDebugUserGeography:")
    public native void setDebugUserGeography(ALConsentFlowUserGeography v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
