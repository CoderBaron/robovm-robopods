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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC18CleverAdsSolutions19CASMNativeAdContent")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CASMNativeAdContent/*</name>*/ 
    extends /*<extends>*/CASNativeAdContent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CASMNativeAdContentPtr extends Ptr<CASMNativeAdContent, CASMNativeAdContentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CASMNativeAdContent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CASMNativeAdContent() {}
    protected CASMNativeAdContent(Handle h, long handle) { super(h, handle); }
    protected CASMNativeAdContent(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "headline")
    public native String getHeadline();
    @Property(selector = "setHeadline:")
    public native void setHeadline(String v);
    @Property(selector = "body")
    public native String getBody();
    @Property(selector = "setBody:")
    public native void setBody(String v);
    @Property(selector = "callToAction")
    public native String getCallToAction();
    @Property(selector = "setCallToAction:")
    public native void setCallToAction(String v);
    @Property(selector = "icon")
    public native UIImage getIcon();
    @Property(selector = "setIcon:")
    public native void setIcon(UIImage v);
    @Property(selector = "iconURL")
    public native NSURL getIconURL();
    @Property(selector = "setIconURL:")
    public native void setIconURL(NSURL v);
    @Property(selector = "starRating")
    public native NSNumber getStarRating();
    @Property(selector = "setStarRating:")
    public native void setStarRating(NSNumber v);
    @Property(selector = "advertiser")
    public native String getAdvertiser();
    @Property(selector = "setAdvertiser:")
    public native void setAdvertiser(String v);
    @Property(selector = "store")
    public native String getStore();
    @Property(selector = "setStore:")
    public native void setStore(String v);
    @Property(selector = "price")
    public native String getPrice();
    @Property(selector = "setPrice:")
    public native void setPrice(String v);
    @Property(selector = "hasVideoContent")
    public native boolean hasVideoContent();
    @Property(selector = "setHasVideoContent:")
    public native void setHasVideoContent(boolean v);
    @Property(selector = "mediaContentAspectRatio")
    public native @MachineSizedFloat double getMediaContentAspectRatio();
    @Property(selector = "setMediaContentAspectRatio:")
    public native void setMediaContentAspectRatio(@MachineSizedFloat double v);
    @Property(selector = "mediaImage")
    public native UIImage getMediaImage();
    @Property(selector = "setMediaImage:")
    public native void setMediaImage(UIImage v);
    @Property(selector = "mediaImageURL")
    public native NSURL getMediaImageURL();
    @Property(selector = "setMediaImageURL:")
    public native void setMediaImageURL(NSURL v);
    @Property(selector = "reviewCount")
    public native String getReviewCount();
    @Property(selector = "setReviewCount:")
    public native void setReviewCount(String v);
    @Property(selector = "adLabel")
    public native String getAdLabel();
    @Property(selector = "setAdLabel:")
    public native void setAdLabel(String v);
    @Property(selector = "adChoicesContent")
    public native UIView getAdChoicesContent();
    @Property(selector = "setAdChoicesContent:")
    public native void setAdChoicesContent(UIView v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "createMediaContentView")
    public native UIView createMediaContentView();
    /*</methods>*/
}
