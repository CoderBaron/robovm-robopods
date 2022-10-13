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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CASMediationUnit/*</name>*/ 
    extends /*<extends>*/CASRequestUnit/*</extends>*/ 
    /*<implements>*/implements CASStatusHandler/*</implements>*/ {

    /*<ptr>*/public static class CASMediationUnitPtr extends Ptr<CASMediationUnit, CASMediationUnitPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CASMediationUnit.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CASMediationUnit() {}
    protected CASMediationUnit(Handle h, long handle) { super(h, handle); }
    protected CASMediationUnit(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adType")
    public native CASType getAdType();
    @Property(selector = "setAdType:")
    public native void setAdType(CASType v);
    @Property(selector = "creativeIdentifier")
    public native String getCreativeIdentifier();
    @Property(selector = "setCreativeIdentifier:")
    public native void setCreativeIdentifier(String v);
    @Property(selector = "cpm")
    public native double getCpm();
    @Property(selector = "setCpm:")
    public native void setCpm(double v);
    @Property(selector = "error")
    public native String getError();
    @Property(selector = "setError:")
    public native void setError(String v);
    @Property(selector = "priceAccuracy")
    public native CASPriceAccuracy getPriceAccuracy();
    @Property(selector = "setPriceAccuracy:")
    public native void setPriceAccuracy(CASPriceAccuracy v);
    @Property(selector = "network")
    public native String getNetwork();
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "status")
    public native String getStatus();
    @Property(selector = "versionInfo")
    public native String getVersionInfo();
    @Property(selector = "impressionDepth")
    public native @MachineSizedSInt long getImpressionDepth();
    @Property(selector = "lifetimeRevenue")
    public native double getLifetimeRevenue();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "toggleIgnoreMode")
    public native void toggleIgnoreMode();
    @Method(selector = "isAdCached")
    public native boolean isAdCached();
    /*</methods>*/
}
