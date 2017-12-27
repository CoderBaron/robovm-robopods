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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC6Charts13LineChartView")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LineChartView/*</name>*/ 
    extends /*<extends>*/BarLineChartViewBase/*</extends>*/ 
    /*<implements>*/implements LineChartDataProvider/*</implements>*/ {

    /*<ptr>*/public static class LineChartViewPtr extends Ptr<LineChartView, LineChartViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LineChartView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public LineChartView() {}
    protected LineChartView(Handle h, long handle) { super(h, handle); }
    protected LineChartView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public LineChartView(@ByVal CGRect frame) { super((SkipInit) null); initObject(initWithFrame(frame)); }
    @Method(selector = "initWithCoder:")
    public LineChartView(NSCoder aDecoder) { super((SkipInit) null); initObject(initWithCoder(aDecoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "lineData")
    public native LineChartData getLineData();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initialize")
    public native void initialize();
    @Method(selector = "initWithFrame:")
    protected native @Pointer long initWithFrame(@ByVal CGRect frame);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long initWithCoder(NSCoder aDecoder);
    @Method(selector = "getAxis:")
    public native ChartYAxis getAxis(AxisDependency axis);
    /*</methods>*/
}