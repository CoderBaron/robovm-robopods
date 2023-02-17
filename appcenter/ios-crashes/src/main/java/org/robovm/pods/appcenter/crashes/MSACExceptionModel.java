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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSACExceptionModel/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MSACSerializableObject, NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class MSACExceptionModelPtr extends Ptr<MSACExceptionModel, MSACExceptionModelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSACExceptionModel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MSACExceptionModel() {}
    protected MSACExceptionModel(Handle h, long handle) { super(h, handle); }
    protected MSACExceptionModel(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithError:")
    public MSACExceptionModel(NSError error) { super((SkipInit) null); initObject(init(error)); }
    @Method(selector = "initWithType:exceptionMessage:stackTrace:")
    public MSACExceptionModel(String exceptionType, String exceptionMessage, NSArray<NSString> stackTrace) { super((SkipInit) null); initObject(init(exceptionType, exceptionMessage, stackTrace)); }
    @Method(selector = "initWithException:")
    public MSACExceptionModel(NSException exception) { super((SkipInit) null); initObject(init(exception)); }
    @Method(selector = "initWithCoder:")
    public MSACExceptionModel(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "type")
    public native String getType();
    @Property(selector = "setType:")
    public native void setType(String v);
    @Property(selector = "message")
    public native String getMessage();
    @Property(selector = "setMessage:")
    public native void setMessage(String v);
    @Property(selector = "stackTrace")
    public native String getStackTrace();
    @Property(selector = "setStackTrace:")
    public native void setStackTrace(String v);
    @Property(selector = "frames")
    public native NSArray<MSACStackFrame> getFrames();
    @Property(selector = "setFrames:")
    public native void setFrames(NSArray<MSACStackFrame> v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithError:")
    protected native @Pointer long init(NSError error);
    @Method(selector = "initWithType:exceptionMessage:stackTrace:")
    protected native @Pointer long init(String exceptionType, String exceptionMessage, NSArray<NSString> stackTrace);
    @Method(selector = "initWithException:")
    protected native @Pointer long init(NSException exception);
    @Method(selector = "isValid")
    public native boolean isValid();
    @Method(selector = "serializeToDictionary")
    public native NSMutableDictionary<?, ?> serializeToDictionary();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
