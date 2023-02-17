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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BNCProduct/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BNCProductPtr extends Ptr<BNCProduct, BNCProductPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BNCProduct.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BNCProduct() {}
    protected BNCProduct(Handle h, long handle) { super(h, handle); }
    protected BNCProduct(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sku")
    public native String getSku();
    @Property(selector = "setSku:")
    public native void setSku(String v);
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "price")
    public native NSDecimalNumber getPrice();
    @Property(selector = "setPrice:")
    public native void setPrice(NSDecimalNumber v);
    @Property(selector = "quantity")
    public native NSNumber getQuantity();
    @Property(selector = "setQuantity:")
    public native void setQuantity(NSNumber v);
    @Property(selector = "brand")
    public native String getBrand();
    @Property(selector = "setBrand:")
    public native void setBrand(String v);
    @Property(selector = "category")
    public native String getCategory();
    @Property(selector = "setCategory:")
    public native void setCategory(String v);
    @Property(selector = "variant")
    public native String getVariant();
    @Property(selector = "setVariant:")
    public native void setVariant(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
