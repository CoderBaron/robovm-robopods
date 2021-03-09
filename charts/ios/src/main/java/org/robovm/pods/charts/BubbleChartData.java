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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC6Charts15BubbleChartData")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BubbleChartData/*</name>*/ 
    extends /*<extends>*/BarLineScatterCandleBubbleChartData/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BubbleChartDataPtr extends Ptr<BubbleChartData, BubbleChartDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BubbleChartData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BubbleChartData() {}
    protected BubbleChartData(Handle h, long handle) { super(h, handle); }
    protected BubbleChartData(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDataSets:")
    public BubbleChartData(NSArray<?> dataSets) { super((SkipInit) null); initObject(init(dataSets)); }
    @Method(selector = "initWithDataSet:")
    public BubbleChartData(ChartDataSetProtocol dataSet) { super(dataSet); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDataSets:")
    protected native @Pointer long init(NSArray<?> dataSets);
    @Method(selector = "setHighlightCircleWidth:")
    public native void setHighlightCircleWidth(@MachineSizedFloat double width);
    /*</methods>*/
}
