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
package org.robovm.pods.branchmetrics;

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
import org.robovm.apple.corespotlight.*;
import org.robovm.apple.uniformtypeid.*;
import org.robovm.apple.linkpresentation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BranchCommerceEventRequest/*</name>*/ 
    extends /*<extends>*/BNCServerRequest/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class BranchCommerceEventRequestPtr extends Ptr<BranchCommerceEventRequest, BranchCommerceEventRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BranchCommerceEventRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BranchCommerceEventRequest() {}
    protected BranchCommerceEventRequest(Handle h, long handle) { super(h, handle); }
    protected BranchCommerceEventRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCommerceEvent:metadata:completion:")
    public BranchCommerceEventRequest(BNCCommerceEvent commerceEvent, NSDictionary<?, ?> dictionary, @Block VoidBlock2<NSDictionary<?, ?>, NSError> callBack) { super((SkipInit) null); initObject(init(commerceEvent, dictionary, callBack)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCommerceEvent:metadata:completion:")
    protected native @Pointer long init(BNCCommerceEvent commerceEvent, NSDictionary<?, ?> dictionary, @Block VoidBlock2<NSDictionary<?, ?>, NSError> callBack);
    /*</methods>*/
}
