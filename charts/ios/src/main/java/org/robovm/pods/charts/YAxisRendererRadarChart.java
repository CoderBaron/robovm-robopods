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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC6Charts23YAxisRendererRadarChart")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/YAxisRendererRadarChart/*</name>*/ 
    extends /*<extends>*/ChartYAxisRenderer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class YAxisRendererRadarChartPtr extends Ptr<YAxisRendererRadarChart, YAxisRendererRadarChartPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(YAxisRendererRadarChart.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected YAxisRendererRadarChart() {}
    protected YAxisRendererRadarChart(Handle h, long handle) { super(h, handle); }
    protected YAxisRendererRadarChart(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithViewPortHandler:yAxis:chart:")
    public YAxisRendererRadarChart(ChartViewPortHandler viewPortHandler, ChartYAxis yAxis, RadarChartView chart) { super((SkipInit) null); initObject(init(viewPortHandler, yAxis, chart)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithViewPortHandler:yAxis:chart:")
    protected native @Pointer long init(ChartViewPortHandler viewPortHandler, ChartYAxis yAxis, RadarChartView chart);
    @Method(selector = "computeAxisValuesWithMin:max:")
    public native void computeAxisValues(double yMin, double yMax);
    @Method(selector = "renderAxisLabelsWithContext:")
    public native void renderAxisLabels(CGContext context);
    @Method(selector = "renderLimitLinesWithContext:")
    public native void renderLimitLines(CGContext context);
    /*</methods>*/
}
