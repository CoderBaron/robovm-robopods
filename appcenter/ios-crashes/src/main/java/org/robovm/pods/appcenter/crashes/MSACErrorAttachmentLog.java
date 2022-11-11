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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSACErrorAttachmentLog/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MSACErrorAttachmentLogPtr extends Ptr<MSACErrorAttachmentLog, MSACErrorAttachmentLogPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSACErrorAttachmentLog.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MSACErrorAttachmentLog() {}
    protected MSACErrorAttachmentLog(Handle h, long handle) { super(h, handle); }
    protected MSACErrorAttachmentLog(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFilename:attachmentBinary:contentType:")
    public MSACErrorAttachmentLog(String filename, NSData data, String contentType) { super((SkipInit) null); initObject(init(filename, data, contentType)); }
    @Method(selector = "initWithFilename:attachmentText:")
    public MSACErrorAttachmentLog(String filename, String text) { super((SkipInit) null); initObject(init(filename, text)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "contentType")
    public native String getContentType();
    @Property(selector = "setContentType:")
    public native void setContentType(String v);
    @Property(selector = "filename")
    public native String getFilename();
    @Property(selector = "setFilename:")
    public native void setFilename(String v);
    @Property(selector = "data")
    public native NSData getData();
    @Property(selector = "setData:")
    public native void setData(NSData v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFilename:attachmentBinary:contentType:")
    protected native @Pointer long init(String filename, NSData data, String contentType);
    @Method(selector = "initWithFilename:attachmentText:")
    protected native @Pointer long init(String filename, String text);
    /*</methods>*/
}
