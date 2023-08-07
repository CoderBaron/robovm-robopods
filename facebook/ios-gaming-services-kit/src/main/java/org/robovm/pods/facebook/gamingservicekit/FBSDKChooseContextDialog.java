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
package org.robovm.pods.facebook.gamingservicekit;

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
import org.robovm.pods.facebook.corebasics.*;
import org.robovm.pods.facebook.core.*;
import org.robovm.pods.facebook.share.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKChooseContextDialog/*</name>*/ 
    extends /*<extends>*/FBSDKContextWebDialog/*</extends>*/ 
    /*<implements>*/implements FBSDKShowable/*</implements>*/ {

    /*<ptr>*/public static class FBSDKChooseContextDialogPtr extends Ptr<FBSDKChooseContextDialog, FBSDKChooseContextDialogPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKChooseContextDialog.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKChooseContextDialog() {}
    protected FBSDKChooseContextDialog(Handle h, long handle) { super(h, handle); }
    protected FBSDKChooseContextDialog(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithContent:delegate:")
    public FBSDKChooseContextDialog(FBSDKChooseContextContent content, FBSDKContextDialogDelegate delegate) { super((SkipInit) null); initObject(init(content, delegate)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithContent:delegate:")
    protected native @Pointer long init(FBSDKChooseContextContent content, FBSDKContextDialogDelegate delegate);
    @Method(selector = "show")
    public native boolean show();
    @Method(selector = "validateAndReturnError:")
    public native boolean validateAndReturnError(NSError.NSErrorPtr error);
    @Method(selector = "application:openURL:sourceApplication:annotation:")
    public native boolean openURL(UIApplication application, NSURL url, String sourceApplication, NSObject annotation);
    @Method(selector = "canOpenURL:forApplication:sourceApplication:annotation:")
    public native boolean canOpenURL(NSURL url, UIApplication application, String sourceApplication, NSObject annotation);
    /*</methods>*/
}
