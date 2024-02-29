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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALSdkSettings/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ALSdkSettingsPtr extends Ptr<ALSdkSettings, ALSdkSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ALSdkSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ALSdkSettings() {}
    protected ALSdkSettings(Handle h, long handle) { super(h, handle); }
    protected ALSdkSettings(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "termsAndPrivacyPolicyFlowSettings")
    public native ALTermsAndPrivacyPolicyFlowSettings getTermsAndPrivacyPolicyFlowSettings();
    @Property(selector = "isVerboseLoggingEnabled")
    public native boolean isVerboseLoggingEnabled();
    @Property(selector = "setVerboseLoggingEnabled:")
    public native void setVerboseLoggingEnabled(boolean v);
    @Property(selector = "isMuted")
    public native boolean isMuted();
    @Property(selector = "setMuted:")
    public native void setMuted(boolean v);
    @Property(selector = "isCreativeDebuggerEnabled")
    public native boolean isCreativeDebuggerEnabled();
    @Property(selector = "setCreativeDebuggerEnabled:")
    public native void setCreativeDebuggerEnabled(boolean v);
    @Property(selector = "testDeviceAdvertisingIdentifiers")
    public native NSArray<NSString> getTestDeviceAdvertisingIdentifiers();
    @Property(selector = "setTestDeviceAdvertisingIdentifiers:")
    public native void setTestDeviceAdvertisingIdentifiers(NSArray<NSString> v);
    @Property(selector = "initializationAdUnitIdentifiers")
    public native NSArray<NSString> getInitializationAdUnitIdentifiers();
    @Property(selector = "setInitializationAdUnitIdentifiers:")
    public native void setInitializationAdUnitIdentifiers(NSArray<NSString> v);
    @Property(selector = "isExceptionHandlerEnabled")
    public native boolean isExceptionHandlerEnabled();
    @Property(selector = "setExceptionHandlerEnabled:")
    public native void setExceptionHandlerEnabled(boolean v);
    @Property(selector = "isLocationCollectionEnabled")
    public native boolean isLocationCollectionEnabled();
    @Property(selector = "setLocationCollectionEnabled:")
    public native void setLocationCollectionEnabled(boolean v);
    @Property(selector = "extraParameters")
    public native NSDictionary<NSString, NSString> getExtraParameters();
    @Property(selector = "setExtraParameters:")
    public native void setExtraParameters(NSDictionary<NSString, NSString> v);
    /**
     * @deprecated This property is deprecated and will be removed in a future SDK version. Please use `-[ALSdkSettings isVerboseLoggingEnabled]` instead.
     */
    @Deprecated
    @Property(selector = "isVerboseLogging")
    public native boolean isVerboseLogging();
    /**
     * @deprecated This property is deprecated and will be removed in a future SDK version. Please use `-[ALSdkSettings isVerboseLoggingEnabled]` instead.
     */
    @Deprecated
    @Property(selector = "setIsVerboseLogging:")
    public native void setIsVerboseLogging(boolean v);
    /**
     * @deprecated This property is deprecated and will be removed in a future SDK version. Use the new MAX Terms and Privacy Policy Flow instead (see ALSdkSettings.termsAndPrivacyPolicyFlowSettings)
     */
    @Deprecated
    @Property(selector = "consentFlowSettings")
    public native ALConsentFlowSettings getConsentFlowSettings();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setExtraParameterForKey:value:")
    public native void setExtraParameter(String key, String value);
    /*</methods>*/
}
