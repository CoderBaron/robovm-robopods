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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKGameRequestURLProvider/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKGameRequestURLProviderPtr extends Ptr<FBSDKGameRequestURLProvider, FBSDKGameRequestURLProviderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKGameRequestURLProvider.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKGameRequestURLProvider() {}
    protected FBSDKGameRequestURLProvider(Handle h, long handle) { super(h, handle); }
    protected FBSDKGameRequestURLProvider(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "createDeepLinkURLWithQueryDictionary:")
    public static native NSURL createDeepLinkURL(NSDictionary<NSString, ?> queryDictionary);
    @Method(selector = "filtersNameForFilters:")
    public static native String getFiltersName(FBSDKGameRequestFilter filters);
    @Method(selector = "actionTypeNameForActionType:")
    public static native String getActionTypeName(FBSDKGameRequestActionType actionType);
    /*</methods>*/
}
