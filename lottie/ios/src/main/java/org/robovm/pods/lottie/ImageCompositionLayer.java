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
package org.robovm.pods.lottie;

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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC6Lottie21ImageCompositionLayer")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ImageCompositionLayer/*</name>*/ 
    extends /*<extends>*/CompositionLayer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ImageCompositionLayerPtr extends Ptr<ImageCompositionLayer, ImageCompositionLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ImageCompositionLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ImageCompositionLayer() {}
    protected ImageCompositionLayer(Handle h, long handle) { super(h, handle); }
    protected ImageCompositionLayer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLayer:")
    public ImageCompositionLayer(NSObject layer) { super((SkipInit) null); initObject(init(layer)); }
    @Method(selector = "initWithCoder:")
    public ImageCompositionLayer(NSCoder _) { super((SkipInit) null); initObject(init(_)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLayer:")
    protected native @Pointer long init(NSObject layer);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder _);
    @Method(selector = "defaultValueForKey:")
    public static native NSObject getDefaultValue(String key);
    @Method(selector = "needsDisplayForKey:")
    public static native boolean needsDisplay(String key);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "cornerCurveExpansionFactor:")
    public static native @MachineSizedFloat double cornerCurveExpansionFactor(CALayerCornerCurve curve);
    @Method(selector = "defaultActionForKey:")
    public static native CAAction getDefaultAction(String event);
    /*</methods>*/
}
