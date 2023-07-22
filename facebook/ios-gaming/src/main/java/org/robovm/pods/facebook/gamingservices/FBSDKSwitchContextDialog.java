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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKSwitchContextDialog/*</name>*/ 
    extends /*<extends>*/FBSDKContextWebDialog/*</extends>*/ 
    /*<implements>*/implements FBSDKShowable/*</implements>*/ {

    /*<ptr>*/public static class FBSDKSwitchContextDialogPtr extends Ptr<FBSDKSwitchContextDialog, FBSDKSwitchContextDialogPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKSwitchContextDialog.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKSwitchContextDialog() {}
    protected FBSDKSwitchContextDialog(Handle h, long handle) { super(h, handle); }
    protected FBSDKSwitchContextDialog(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithContent:windowFinder:delegate:")
    public FBSDKSwitchContextDialog(FBSDKSwitchContextContent content, FBSDKWindowFinding windowFinder, FBSDKContextDialogDelegate delegate) { super((SkipInit) null); initObject(init(content, windowFinder, delegate)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithContent:windowFinder:delegate:")
    protected native @Pointer long init(FBSDKSwitchContextContent content, FBSDKWindowFinding windowFinder, FBSDKContextDialogDelegate delegate);
    @Method(selector = "show")
    public native boolean show();
    public boolean validate() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = validate(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "validateAndReturnError:")
    private native boolean validate(NSError.NSErrorPtr error);
    /*</methods>*/
}
