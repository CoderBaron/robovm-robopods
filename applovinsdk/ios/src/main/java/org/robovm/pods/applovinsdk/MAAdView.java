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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MAAdView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MAAdViewPtr extends Ptr<MAAdView, MAAdViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MAAdView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MAAdView() {}
    protected MAAdView(Handle h, long handle) { super(h, handle); }
    protected MAAdView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAdUnitIdentifier:")
    public MAAdView(String adUnitIdentifier) { super((SkipInit) null); initObject(init(adUnitIdentifier)); }
    @Method(selector = "initWithAdUnitIdentifier:sdk:")
    public MAAdView(String adUnitIdentifier, ALSdk sdk) { super((SkipInit) null); initObject(init(adUnitIdentifier, sdk)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native MAAdViewAdDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(MAAdViewAdDelegate v);
    @Property(selector = "placement")
    public native String getPlacement();
    @Property(selector = "setPlacement:")
    public native void setPlacement(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAdUnitIdentifier:")
    protected native @Pointer long init(String adUnitIdentifier);
    @Method(selector = "initWithAdUnitIdentifier:sdk:")
    protected native @Pointer long init(String adUnitIdentifier, ALSdk sdk);
    @Method(selector = "setExtraParameterForKey:value:")
    public native void setExtraParameter(String key, String value);
    @Method(selector = "loadAd")
    public native void loadAd();
    @Method(selector = "startAutoRefresh")
    public native void startAutoRefresh();
    @Method(selector = "stopAutoRefresh")
    public native void stopAutoRefresh();
    /*</methods>*/
}
