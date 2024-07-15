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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ISNativeAdView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ISNativeAdViewPtr extends Ptr<ISNativeAdView, ISNativeAdViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ISNativeAdView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ISNativeAdView() {}
    protected ISNativeAdView(Handle h, long handle) { super(h, handle); }
    protected ISNativeAdView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public ISNativeAdView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public ISNativeAdView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adAppIcon")
    public native UIImageView getAdAppIcon();
    @Property(selector = "setAdAppIcon:", strongRef = true)
    public native void setAdAppIcon(UIImageView v);
    @Property(selector = "adTitleView")
    public native UILabel getAdTitleView();
    @Property(selector = "setAdTitleView:", strongRef = true)
    public native void setAdTitleView(UILabel v);
    @Property(selector = "adAdvertiserView")
    public native UILabel getAdAdvertiserView();
    @Property(selector = "setAdAdvertiserView:", strongRef = true)
    public native void setAdAdvertiserView(UILabel v);
    @Property(selector = "adBodyView")
    public native UILabel getAdBodyView();
    @Property(selector = "setAdBodyView:", strongRef = true)
    public native void setAdBodyView(UILabel v);
    @Property(selector = "adMediaView")
    public native LevelPlayMediaView getAdMediaView();
    @Property(selector = "setAdMediaView:", strongRef = true)
    public native void setAdMediaView(LevelPlayMediaView v);
    @Property(selector = "adCallToActionView")
    public native UIButton getAdCallToActionView();
    @Property(selector = "setAdCallToActionView:", strongRef = true)
    public native void setAdCallToActionView(UIButton v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "registerNativeAdViews:")
    public native void registerNativeAdViews(LevelPlayNativeAd nativeAd);
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
