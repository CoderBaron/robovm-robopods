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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKGamingPayloadObserver/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKApplicationObserving/*</implements>*/ {

    /*<ptr>*/public static class FBSDKGamingPayloadObserverPtr extends Ptr<FBSDKGamingPayloadObserver, FBSDKGamingPayloadObserverPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKGamingPayloadObserver.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKGamingPayloadObserver() {}
    protected FBSDKGamingPayloadObserver(Handle h, long handle) { super(h, handle); }
    protected FBSDKGamingPayloadObserver(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDelegate:")
    public FBSDKGamingPayloadObserver(FBSDKGamingPayloadDelegate delegate) { super((SkipInit) null); initObject(init(delegate)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native FBSDKGamingPayloadDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(FBSDKGamingPayloadDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDelegate:")
    protected native @Pointer long init(FBSDKGamingPayloadDelegate delegate);
    @Method(selector = "application:openURL:sourceApplication:annotation:")
    public native boolean openURL(UIApplication application, NSURL url, String sourceApplication, NSObject annotation);
    @Method(selector = "applicationDidBecomeActive:")
    public native void applicationDidBecomeActive(UIApplication application);
    @Method(selector = "applicationWillResignActive:")
    public native void applicationWillResignActive(UIApplication application);
    @Method(selector = "applicationDidEnterBackground:")
    public native void applicationDidEnterBackground(UIApplication application);
    @Method(selector = "application:didFinishLaunchingWithOptions:")
    public native boolean didFinishLaunching(UIApplication application, NSDictionary<NSString, ?> launchOptions);
    /*</methods>*/
}
