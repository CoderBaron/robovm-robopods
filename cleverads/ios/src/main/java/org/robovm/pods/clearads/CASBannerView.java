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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("CleverAdsSolutions.CASBannerView")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CASBannerView/*</name>*/ 
    extends /*<extends>*/CASBannerInternal/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CASBannerViewPtr extends Ptr<CASBannerView, CASBannerViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CASBannerView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CASBannerView() {}
    protected CASBannerView(Handle h, long handle) { super(h, handle); }
    protected CASBannerView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAdSize:manager:")
    public CASBannerView(CASSize adSize, CASMediationManager manager) { super((SkipInit) null); initObject(init(adSize, manager)); }
    @Method(selector = "initWithAdSize:origin:manager:")
    public CASBannerView(CASSize adSize, @ByVal CGPoint origin, CASMediationManager manager) { super((SkipInit) null); initObject(init(adSize, origin, manager)); }
    @Method(selector = "initWithCoder:")
    public CASBannerView(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "manager")
    public native CASMediationManager getManager();
    @Property(selector = "setManager:")
    public native void setManager(CASMediationManager v);
    @Property(selector = "adSize")
    public native CASSize getAdSize();
    @Property(selector = "setAdSize:")
    public native void setAdSize(CASSize v);
    @Property(selector = "rootViewController")
    public native UIViewController getRootViewController();
    @Property(selector = "setRootViewController:", strongRef = true)
    public native void setRootViewController(UIViewController v);
    @Property(selector = "adDelegate")
    public native CASBannerDelegate getAdDelegate();
    @Property(selector = "setAdDelegate:", strongRef = true)
    public native void setAdDelegate(CASBannerDelegate v);
    @Property(selector = "isAdReady")
    public native boolean isAdReady();
    @Property(selector = "isAutoloadEnabled")
    public native boolean isAutoloadEnabled();
    @Property(selector = "setIsAutoloadEnabled:")
    public native void setIsAutoloadEnabled(boolean v);
    @Property(selector = "refreshInterval")
    public native @MachineSizedSInt long getRefreshInterval();
    @Property(selector = "setRefreshInterval:")
    public native void setRefreshInterval(@MachineSizedSInt long v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAdSize:manager:")
    protected native @Pointer long init(CASSize adSize, CASMediationManager manager);
    @Method(selector = "initWithAdSize:origin:manager:")
    protected native @Pointer long init(CASSize adSize, @ByVal CGPoint origin, CASMediationManager manager);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "disableAdRefresh")
    public native void disableAdRefresh();
    @Method(selector = "loadNextAd")
    public native void loadNextAd();
    @Method(selector = "destroy")
    public native void destroy();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute attribute);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute semanticContentAttribute, UIUserInterfaceLayoutDirection layoutDirection);
    /*</methods>*/
}
