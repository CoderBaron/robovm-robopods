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
package org.robovm.pods.facebook.gamingservices;

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
import org.robovm.apple.uikit.*;
import org.robovm.pods.facebook.corebasics.*;
import org.robovm.pods.facebook.core.*;
import org.robovm.pods.facebook.share.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKGamingContext/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKGamingContextPtr extends Ptr<FBSDKGamingContext, FBSDKGamingContextPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKGamingContext.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKGamingContext() {}
    protected FBSDKGamingContext(Handle h, long handle) { super(h, handle); }
    protected FBSDKGamingContext(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:size:")
    public FBSDKGamingContext(String identifier, @MachineSizedSInt long size) { super((SkipInit) null); initObject(init(identifier, size)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "size")
    public native @MachineSizedSInt long getSize();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:size:")
    protected native @Pointer long init(String identifier, @MachineSizedSInt long size);
    @Method(selector = "currentContext")
    public static native FBSDKGamingContext getCurrentContext();
    @Method(selector = "setCurrentContext:")
    public static native void setCurrentContext(FBSDKGamingContext value);
    /*</methods>*/
}
