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
package org.robovm.pods.charts;

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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC8DGCharts15BubbleChartView")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BubbleChartView/*</name>*/ 
    extends /*<extends>*/BarLineChartViewBase/*</extends>*/ 
    /*<implements>*/implements BubbleChartDataProvider/*</implements>*/ {

    /*<ptr>*/public static class BubbleChartViewPtr extends Ptr<BubbleChartView, BubbleChartViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BubbleChartView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BubbleChartView() {}
    protected BubbleChartView(Handle h, long handle) { super(h, handle); }
    protected BubbleChartView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public BubbleChartView(@ByVal CGRect frame) { super((SkipInit) null); initObject(init(frame)); }
    @Method(selector = "initWithCoder:")
    public BubbleChartView(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "bubbleData")
    public native BubbleChartData getBubbleData();
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFrame:")
    protected native @Pointer long init(@ByVal CGRect frame);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
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
