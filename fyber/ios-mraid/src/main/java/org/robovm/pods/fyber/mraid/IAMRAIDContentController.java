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
package org.robovm.pods.fyber.mraid;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.pods.fyber.core.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IAMRAIDContentController/*</name>*/ 
    extends /*<extends>*/IAContentController/*</extends>*/ 
    /*<implements>*/implements IAInterfaceBuilder, IAMRAIDContentControllerBuilder/*</implements>*/ {

    /*<ptr>*/public static class IAMRAIDContentControllerPtr extends Ptr<IAMRAIDContentController, IAMRAIDContentControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IAMRAIDContentController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public IAMRAIDContentController() {}
    protected IAMRAIDContentController(Handle h, long handle) { super(h, handle); }
    protected IAMRAIDContentController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "MRAIDContentDelegate")
    public native IAMRAIDContentDelegate getMRAIDContentDelegate();
    @Property(selector = "setMRAIDContentDelegate:", strongRef = true)
    public native void setMRAIDContentDelegate(IAMRAIDContentDelegate v);
    @Property(selector = "isContentAwareBackground")
    public native boolean isContentAwareBackground();
    @Property(selector = "setContentAwareBackground:")
    public native void setContentAwareBackground(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "build:")
    public static native IAMRAIDContentController build(@Block VoidBlock1<IAMRAIDContentControllerBuilder> buildBlock);
    /*</methods>*/
}
