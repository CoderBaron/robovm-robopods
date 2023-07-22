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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKContextDialogPresenter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKContextDialogPresenterPtr extends Ptr<FBSDKContextDialogPresenter, FBSDKContextDialogPresenterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKContextDialogPresenter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKContextDialogPresenter() {}
    protected FBSDKContextDialogPresenter(Handle h, long handle) { super(h, handle); }
    protected FBSDKContextDialogPresenter(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    public boolean makeAndShowCreateContextDialog(FBSDKCreateContextContent content, FBSDKContextDialogDelegate delegate) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = makeAndShowCreateContextDialog(content, delegate, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "makeAndShowCreateContextDialogWithContent:delegate:error:")
    private native boolean makeAndShowCreateContextDialog(FBSDKCreateContextContent content, FBSDKContextDialogDelegate delegate, NSError.NSErrorPtr error);
    public boolean makeAndShowSwitchContextDialog(FBSDKSwitchContextContent content, FBSDKContextDialogDelegate delegate) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = makeAndShowSwitchContextDialog(content, delegate, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "makeAndShowSwitchContextDialogWithContent:delegate:error:")
    private native boolean makeAndShowSwitchContextDialog(FBSDKSwitchContextContent content, FBSDKContextDialogDelegate delegate, NSError.NSErrorPtr error);
    @Method(selector = "makeAndShowChooseContextDialogWithContent:delegate:")
    public native void makeAndShowChooseContextDialog(FBSDKChooseContextContent content, FBSDKContextDialogDelegate delegate);
    /*</methods>*/
}
