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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC6Charts18BubbleChartDataSet")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BubbleChartDataSet/*</name>*/ 
    extends /*<extends>*/BarLineScatterCandleBubbleChartDataSet/*</extends>*/ 
    /*<implements>*/implements IBubbleChartDataSet/*</implements>*/ {

    /*<ptr>*/public static class BubbleChartDataSetPtr extends Ptr<BubbleChartDataSet, BubbleChartDataSetPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BubbleChartDataSet.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BubbleChartDataSet() {}
    protected BubbleChartDataSet(Handle h, long handle) { super(h, handle); }
    protected BubbleChartDataSet(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEntries:label:")
    public BubbleChartDataSet(NSArray<ChartDataEntry> entries, String label) { super((SkipInit) null); initObject(init(entries, label)); }
    @Method(selector = "initWithLabel:")
    public BubbleChartDataSet(String label) { super(label); }
    @Method(selector = "initWithEntries:")
    public BubbleChartDataSet(NSArray<ChartDataEntry> entries) { super(entries); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "maxSize")
    public native @MachineSizedFloat double getMaxSize();
    @Property(selector = "normalizeSizeEnabled")
    public native boolean normalizeSizeEnabled();
    @Property(selector = "setNormalizeSizeEnabled:")
    public native void setNormalizeSizeEnabled(boolean v);
    @Property(selector = "isNormalizeSizeEnabled")
    public native boolean isNormalizeSizeEnabled();
    @Property(selector = "highlightCircleWidth")
    public native @MachineSizedFloat double getHighlightCircleWidth();
    @Property(selector = "setHighlightCircleWidth:")
    public native void setHighlightCircleWidth(@MachineSizedFloat double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "copyWithZone:")
    public native NSObject copy(NSZone zone);
    @Method(selector = "initWithEntries:label:")
    protected native @Pointer long init(NSArray<ChartDataEntry> entries, String label);
    /*</methods>*/
}
