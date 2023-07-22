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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKGamingVideoUploader/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKGamingVideoUploaderPtr extends Ptr<FBSDKGamingVideoUploader, FBSDKGamingVideoUploaderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKGamingVideoUploader.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKGamingVideoUploader() {}
    protected FBSDKGamingVideoUploader(Handle h, long handle) { super(h, handle); }
    protected FBSDKGamingVideoUploader(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "uploadVideoWithConfiguration:andResultCompletion:")
    public static native void uploadVideo(FBSDKGamingVideoUploaderConfiguration configuration, @Block VoidBlock3<Boolean, NSDictionary<NSString, ?>, NSError> completion);
    @Method(selector = "uploadVideoWithConfiguration:completion:andProgressHandler:")
    public static native void uploadVideo(FBSDKGamingVideoUploaderConfiguration configuration, @Block VoidBlock3<Boolean, NSDictionary<NSString, ?>, NSError> completion, @Block VoidBlock3<Long, Long, Long> progressHandler);
    /*</methods>*/
}
