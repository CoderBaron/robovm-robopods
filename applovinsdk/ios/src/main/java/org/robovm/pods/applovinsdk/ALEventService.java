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
package org.robovm.pods.applovinsdk;

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
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALEventService/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ALEventServicePtr extends Ptr<ALEventService, ALEventServicePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ALEventService.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ALEventService() {}
    protected ALEventService(Handle h, long handle) { super(h, handle); }
    protected ALEventService(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "superProperties")
    public native NSDictionary<NSString, ?> getSuperProperties();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setSuperProperty:forKey:")
    public native void setSuperProperty(NSObject superProperty, String key);
    @Method(selector = "trackEvent:")
    public native void trackEvent(String eventName);
    @Method(selector = "trackEvent:parameters:")
    public native void trackEvent(String eventName, ALEventParameters parameters);
    @Method(selector = "trackInAppPurchaseWithTransactionIdentifier:parameters:")
    public native void trackInAppPurchase(String transactionIdentifier, ALEventParameters parameters);
    @Method(selector = "trackCheckoutWithTransactionIdentifier:parameters:")
    public native void trackCheckout(String transactionIdentifier, ALEventParameters parameters);
    /*</methods>*/
}
