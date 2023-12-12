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
package org.robovm.pods.ironsource;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ISBaseBanner/*</name>*/ 
    extends /*<extends>*/ISBaseAdAdapter/*</extends>*/ 
    /*<implements>*/implements ISAdapterBannerProtocol/*</implements>*/ {

    /*<ptr>*/public static class ISBaseBannerPtr extends Ptr<ISBaseBanner, ISBaseBannerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ISBaseBanner.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ISBaseBanner() {}
    protected ISBaseBanner(Handle h, long handle) { super(h, handle); }
    protected ISBaseBanner(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "init:")
    public ISBaseBanner(ISAdapterConfig providerConfig) { super((SkipInit) null); initObject(init(providerConfig)); }
    @Method(selector = "initWithAdUnit:adapterConfig:")
    public ISBaseBanner(ISAdUnit adUnit, ISAdapterConfig adapterConfig) { super(adUnit, adapterConfig); }
    @Method(selector = "initWithAdUnit:adapterConfig:adUnitObjectId:")
    public ISBaseBanner(ISAdUnit adUnit, ISAdapterConfig adapterConfig, NSUUID adUnitObjectId) { super(adUnit, adapterConfig, adUnitObjectId); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "init:")
    protected native @Pointer long init(ISAdapterConfig providerConfig);
    @Method(selector = "loadAdWithAdData:viewController:size:delegate:")
    public native void loadAd(ISAdData adData, UIViewController viewController, ISBannerSize size, ISBannerAdDelegate delegate);
    @Method(selector = "destroyAdWithAdData:")
    public native void destroyAd(ISAdData adData);
    @Method(selector = "isSupportAdaptiveBanner")
    public native boolean isSupportAdaptiveBanner();
    /*</methods>*/
}
