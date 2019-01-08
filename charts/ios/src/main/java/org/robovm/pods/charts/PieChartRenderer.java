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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC6Charts16PieChartRenderer")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PieChartRenderer/*</name>*/ 
    extends /*<extends>*/ChartDataRendererBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PieChartRendererPtr extends Ptr<PieChartRenderer, PieChartRendererPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PieChartRenderer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PieChartRenderer() {}
    protected PieChartRenderer(Handle h, long handle) { super(h, handle); }
    protected PieChartRenderer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithChart:animator:viewPortHandler:")
    public PieChartRenderer(PieChartView chart, ChartAnimator animator, ChartViewPortHandler viewPortHandler) { super((SkipInit) null); initObject(init(chart, animator, viewPortHandler)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "chart")
    public native PieChartView getChart();
    @Property(selector = "setChart:", strongRef = true)
    public native void setChart(PieChartView v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithChart:animator:viewPortHandler:")
    protected native @Pointer long init(PieChartView chart, ChartAnimator animator, ChartViewPortHandler viewPortHandler);
    @Method(selector = "drawDataWithContext:")
    public native void drawData(CGContext context);
    @Method(selector = "calculateMinimumRadiusForSpacedSliceWithCenter:radius:angle:arcStartPointX:arcStartPointY:startAngle:sweepAngle:")
    public native @MachineSizedFloat double calculateMinimumRadiusForSpacedSliceWithCenter(@ByVal CGPoint center, @MachineSizedFloat double radius, @MachineSizedFloat double angle, @MachineSizedFloat double arcStartPointX, @MachineSizedFloat double arcStartPointY, @MachineSizedFloat double startAngle, @MachineSizedFloat double sweepAngle);
    @Method(selector = "getSliceSpaceWithDataSet:")
    public native @MachineSizedFloat double getSliceSpace(IPieChartDataSet dataSet);
    @Method(selector = "drawDataSetWithContext:dataSet:")
    public native void drawDataSet(CGContext context, IPieChartDataSet dataSet);
    @Method(selector = "drawValuesWithContext:")
    public native void drawValues(CGContext context);
    @Method(selector = "drawExtrasWithContext:")
    public native void drawExtras(CGContext context);
    @Method(selector = "drawHighlightedWithContext:indices:")
    public native void drawHighlighted(CGContext context, NSArray<ChartHighlight> indices);
    /*</methods>*/
}
