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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC6Charts16ChartHighlighter")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartHighlighter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements IChartHighlighter/*</implements>*/ {

    /*<ptr>*/public static class ChartHighlighterPtr extends Ptr<ChartHighlighter, ChartHighlighterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartHighlighter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ChartHighlighter() {}
    protected ChartHighlighter(Handle h, long handle) { super(h, handle); }
    protected ChartHighlighter(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithChart:")
    public ChartHighlighter(ChartDataProvider chart) { super((SkipInit) null); initObject(init(chart)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "chart")
    public native ChartDataProvider getChart();
    @Property(selector = "setChart:", strongRef = true)
    public native void setChart(ChartDataProvider v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithChart:")
    protected native @Pointer long init(ChartDataProvider chart);
    @Method(selector = "getHighlightWithX:y:")
    public native ChartHighlight getHighlight(@MachineSizedFloat double x, @MachineSizedFloat double y);
    @Method(selector = "getValsForTouchWithX:y:")
    public native @ByVal CGPoint getValsForTouch(@MachineSizedFloat double x, @MachineSizedFloat double y);
    @Method(selector = "getHighlightWithXValue:x:y:")
    public native ChartHighlight getHighlight(double xVal, @MachineSizedFloat double x, @MachineSizedFloat double y);
    @Method(selector = "getHighlightsWithXValue:x:y:")
    public native NSArray<ChartHighlight> getHighlights(double xValue, @MachineSizedFloat double x, @MachineSizedFloat double y);
    /*</methods>*/
}
