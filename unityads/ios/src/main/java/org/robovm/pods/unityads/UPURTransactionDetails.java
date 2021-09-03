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
package org.robovm.pods.unityads;

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
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UPURTransactionDetails/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UPURTransactionDetailsPtr extends Ptr<UPURTransactionDetails, UPURTransactionDetailsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UPURTransactionDetails.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UPURTransactionDetails() {}
    protected UPURTransactionDetails(Handle h, long handle) { super(h, handle); }
    protected UPURTransactionDetails(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "productId")
    public native String getProductId();
    @Property(selector = "transactionId")
    public native String getTransactionId();
    @Property(selector = "receipt")
    public native String getReceipt();
    @Property(selector = "price")
    public native NSDecimalNumber getPrice();
    @Property(selector = "currency")
    public native String getCurrency();
    @Property(selector = "extras")
    public native NSDictionary<?, ?> getExtras();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "build:")
    public static native UPURTransactionDetails build(@Block VoidBlock1<UPURTransactionDetailsBuilder> buildBlock);
    /*</methods>*/
}
