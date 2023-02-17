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
package org.robovm.pods.appcenter.crashes;

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
import org.robovm.pods.appcenter.core.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSACWrapperExceptionModel/*</name>*/ 
    extends /*<extends>*/MSACExceptionModel/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class MSACWrapperExceptionModelPtr extends Ptr<MSACWrapperExceptionModel, MSACWrapperExceptionModelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSACWrapperExceptionModel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MSACWrapperExceptionModel() {}
    protected MSACWrapperExceptionModel(Handle h, long handle) { super(h, handle); }
    protected MSACWrapperExceptionModel(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithError:")
    public MSACWrapperExceptionModel(NSError error) { super(error); }
    @Method(selector = "initWithType:exceptionMessage:stackTrace:")
    public MSACWrapperExceptionModel(String exceptionType, String exceptionMessage, NSArray<NSString> stackTrace) { super(exceptionType, exceptionMessage, stackTrace); }
    @Method(selector = "initWithException:")
    public MSACWrapperExceptionModel(NSException exception) { super(exception); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "innerExceptions")
    public native NSArray<MSACWrapperExceptionModel> getInnerExceptions();
    @Property(selector = "setInnerExceptions:")
    public native void setInnerExceptions(NSArray<MSACWrapperExceptionModel> v);
    @Property(selector = "wrapperSdkName")
    public native String getWrapperSdkName();
    @Property(selector = "setWrapperSdkName:")
    public native void setWrapperSdkName(String v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
