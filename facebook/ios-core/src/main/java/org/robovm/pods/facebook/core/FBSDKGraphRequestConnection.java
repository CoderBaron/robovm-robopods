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
package org.robovm.pods.facebook.core;

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
import org.robovm.apple.webkit.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.storekit.*;
import org.robovm.pods.facebook.corebasics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKGraphRequestConnection/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKGraphRequestConnecting/*</implements>*/ {

    /*<ptr>*/public static class FBSDKGraphRequestConnectionPtr extends Ptr<FBSDKGraphRequestConnection, FBSDKGraphRequestConnectionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKGraphRequestConnection.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKGraphRequestConnection() {}
    protected FBSDKGraphRequestConnection(Handle h, long handle) { super(h, handle); }
    protected FBSDKGraphRequestConnection(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "defaultConnectionTimeout")
    public static native double getDefaultConnectionTimeout();
    @Property(selector = "setDefaultConnectionTimeout:")
    public static native void setDefaultConnectionTimeout(double v);
    @Property(selector = "delegate")
    public native FBSDKGraphRequestConnectionDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(FBSDKGraphRequestConnectionDelegate v);
    @Property(selector = "timeout")
    public native double getTimeout();
    @Property(selector = "setTimeout:")
    public native void setTimeout(double v);
    @Property(selector = "urlResponse")
    public native NSHTTPURLResponse getUrlResponse();
    @Property(selector = "delegateQueue")
    public native NSOperationQueue getDelegateQueue();
    @Property(selector = "setDelegateQueue:")
    public native void setDelegateQueue(NSOperationQueue v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addRequest:completion:")
    public native void addRequest(FBSDKGraphRequestProtocol request, @Block VoidBlock3<FBSDKGraphRequestConnecting, NSObject, NSError> completion);
    @Method(selector = "addRequest:name:completion:")
    public native void addRequest(FBSDKGraphRequestProtocol request, String name, @Block VoidBlock3<FBSDKGraphRequestConnecting, NSObject, NSError> completion);
    @Method(selector = "addRequest:parameters:completion:")
    public native void addRequest(FBSDKGraphRequestProtocol request, NSDictionary<NSString, ?> parameters, @Block VoidBlock3<FBSDKGraphRequestConnecting, NSObject, NSError> completion);
    @Method(selector = "cancel")
    public native void cancel();
    @Method(selector = "start")
    public native void start();
    @Method(selector = "overrideGraphAPIVersion:")
    public native void overrideGraphAPIVersion(String version);
    @Method(selector = "setCanMakeRequests")
    public static native void setCanMakeRequests();
    @Method(selector = "setDidFetchDomainConfiguration")
    public static native void setDidFetchDomainConfiguration();
    /*</methods>*/
}
