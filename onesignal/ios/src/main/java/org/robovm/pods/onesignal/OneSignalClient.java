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
package org.robovm.pods.onesignal;

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
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OneSignalClient/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OneSignalClientPtr extends Ptr<OneSignalClient, OneSignalClientPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OneSignalClient.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OneSignalClient() {}
    protected OneSignalClient(Handle h, long handle) { super(h, handle); }
    protected OneSignalClient(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "executeRequest:onSuccess:onFailure:")
    public native void executeRequest(OneSignalRequest request, @Block VoidBlock1<NSDictionary<?, ?>> successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "executeSynchronousRequest:onSuccess:onFailure:")
    public native void executeSynchronousRequest(OneSignalRequest request, @Block VoidBlock1<NSDictionary<?, ?>> successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "executeDataRequest:onSuccess:onFailure:")
    public native void executeDataRequest(OneSignalRequest request, @Block VoidBlock1<NSData> successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "executeSimultaneousRequests:withSuccess:onFailure:")
    public native void executeSimultaneousRequests(NSDictionary<NSString, OneSignalRequest> requests, @Block VoidBlock1<NSDictionary<NSString, NSDictionary>> successBlock, @Block VoidBlock1<NSDictionary<NSString, NSError>> failureBlock);
    @Method(selector = "executeSimultaneousRequests:withCompletion:")
    public native void executeSimultaneousRequests(NSDictionary<NSString, OneSignalRequest> requests, @Block VoidBlock1<NSDictionary<?, ?>> completionBlock);
    @Method(selector = "sharedClient")
    public static native OneSignalClient sharedClient();
    /*</methods>*/
}
