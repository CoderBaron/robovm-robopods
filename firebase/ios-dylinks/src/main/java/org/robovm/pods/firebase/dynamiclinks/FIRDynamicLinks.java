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
package org.robovm.pods.firebase.dynamiclinks;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @deprecated Firebase Dynamic Links is deprecated and the service will shut down on August 25, 2025.
 */
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRDynamicLinks/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRDynamicLinksPtr extends Ptr<FIRDynamicLinks, FIRDynamicLinksPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRDynamicLinks.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FIRDynamicLinks() {}
    protected FIRDynamicLinks(Handle h, long handle) { super(h, handle); }
    protected FIRDynamicLinks(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "shouldHandleDynamicLinkFromCustomSchemeURL:")
    public native boolean shouldHandleDynamicLinkFromCustomSchemeURL(NSURL url);
    @Method(selector = "dynamicLinkFromCustomSchemeURL:")
    public native FIRDynamicLink dynamicLinkFromCustomSchemeURL(NSURL url);
    @Method(selector = "dynamicLinkFromUniversalLinkURL:completion:")
    public native void dynamicLinkFromUniversalLinkURL(NSURL url, @Block VoidBlock2<FIRDynamicLink, NSError> completion);
    /**
     * @deprecated Use dynamicLinkFromUniversalLinkURL:completion: instead.
     */
    @Deprecated
    @Method(selector = "dynamicLinkFromUniversalLinkURL:")
    public native FIRDynamicLink dynamicLinkFromUniversalLinkURL(NSURL url);
    @Method(selector = "handleUniversalLink:completion:")
    public native boolean handleUniversalLink(NSURL url, @Block VoidBlock2<FIRDynamicLink, NSError> completion);
    @Method(selector = "resolveShortLink:completion:")
    public native void resolveShortLink(NSURL url, @Block VoidBlock2<NSURL, NSError> completion);
    @Method(selector = "matchesShortLinkFormat:")
    public native boolean matchesShortLinkFormat(NSURL url);
    @Method(selector = "dynamicLinks")
    public static native FIRDynamicLinks dynamicLinks();
    @Method(selector = "performDiagnosticsWithCompletion:")
    public static native void performDiagnostics(@Block VoidBlock2<NSString, Boolean> completionHandler);
    /*</methods>*/
}
