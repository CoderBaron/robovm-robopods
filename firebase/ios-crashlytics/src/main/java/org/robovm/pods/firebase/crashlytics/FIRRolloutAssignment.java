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
package org.robovm.pods.firebase.crashlytics;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRRolloutAssignment/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRRolloutAssignmentPtr extends Ptr<FIRRolloutAssignment, FIRRolloutAssignmentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRRolloutAssignment.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIRRolloutAssignment() {}
    protected FIRRolloutAssignment(Handle h, long handle) { super(h, handle); }
    protected FIRRolloutAssignment(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRolloutId:variantId:templateVersion:parameterKey:parameterValue:")
    public FIRRolloutAssignment(String rolloutId, String variantId, long templateVersion, String parameterKey, String parameterValue) { super((SkipInit) null); initObject(init(rolloutId, variantId, templateVersion, parameterKey, parameterValue)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "rolloutId")
    public native String getRolloutId();
    @Property(selector = "setRolloutId:")
    public native void setRolloutId(String v);
    @Property(selector = "variantId")
    public native String getVariantId();
    @Property(selector = "setVariantId:")
    public native void setVariantId(String v);
    @Property(selector = "templateVersion")
    public native long getTemplateVersion();
    @Property(selector = "setTemplateVersion:")
    public native void setTemplateVersion(long v);
    @Property(selector = "parameterKey")
    public native String getParameterKey();
    @Property(selector = "setParameterKey:")
    public native void setParameterKey(String v);
    @Property(selector = "parameterValue")
    public native String getParameterValue();
    @Property(selector = "setParameterValue:")
    public native void setParameterValue(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRolloutId:variantId:templateVersion:parameterKey:parameterValue:")
    protected native @Pointer long init(String rolloutId, String variantId, long templateVersion, String parameterKey, String parameterValue);
    /*</methods>*/
}
