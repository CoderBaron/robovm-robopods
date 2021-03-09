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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartIndexAxisValueFormatter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements ChartAxisValueFormatter/*</implements>*/ {

    /*<ptr>*/public static class ChartIndexAxisValueFormatterPtr extends Ptr<ChartIndexAxisValueFormatter, ChartIndexAxisValueFormatterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartIndexAxisValueFormatter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ChartIndexAxisValueFormatter() {}
    protected ChartIndexAxisValueFormatter(Handle h, long handle) { super(h, handle); }
    protected ChartIndexAxisValueFormatter(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithValues:")
    public ChartIndexAxisValueFormatter(NSArray<NSString> values) { super((SkipInit) null); initObject(init(values)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "values")
    public native NSArray<NSString> getValues();
    @Property(selector = "setValues:")
    public native void setValues(NSArray<NSString> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithValues:")
    protected native @Pointer long init(NSArray<NSString> values);
    @Method(selector = "stringForValue:axis:")
    public native String getStringForValue(double value, ChartAxisBase axis);
    @Method(selector = "withValues:")
    public static native ChartIndexAxisValueFormatter withValues(NSArray<NSString> values);
    /*</methods>*/
}
