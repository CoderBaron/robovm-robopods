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
package org.robovm.pods.facebook.login;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.pods.facebook.core.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @deprecated `FBSDKReferralManager` is deprecated and will be removed in the next major release
 */
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKReferralManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKReferralManagerPtr extends Ptr<FBSDKReferralManager, FBSDKReferralManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKReferralManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKReferralManager() {}
    protected FBSDKReferralManager(Handle h, long handle) { super(h, handle); }
    protected FBSDKReferralManager(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithViewController:")
    public FBSDKReferralManager(UIViewController viewController) { super((SkipInit) null); initObject(initWithViewController$(viewController)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithViewController:")
    protected native @Pointer long initWithViewController$(UIViewController viewController);
    @Method(selector = "startReferralWithCompletionHandler:")
    public native void startReferralWithCompletionHandler$(@Block VoidBlock2<FBSDKReferralManagerResult, NSError> handler);
    /*</methods>*/
}
