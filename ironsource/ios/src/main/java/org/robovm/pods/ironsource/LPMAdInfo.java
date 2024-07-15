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
package org.robovm.pods.ironsource;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LPMAdInfo/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class LPMAdInfoPtr extends Ptr<LPMAdInfo, LPMAdInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LPMAdInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public LPMAdInfo() {}
    protected LPMAdInfo(Handle h, long handle) { super(h, handle); }
    protected LPMAdInfo(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adUnitId")
    public native String getAdUnitId();
    @Property(selector = "setAdUnitId:")
    public native void setAdUnitId(String v);
    @Property(selector = "placementName")
    public native String getPlacementName();
    @Property(selector = "setPlacementName:")
    public native void setPlacementName(String v);
    @Property(selector = "adSize")
    public native LPMAdSize getAdSize();
    @Property(selector = "setAdSize:")
    public native void setAdSize(LPMAdSize v);
    @Property(selector = "adFormat")
    public native String getAdFormat();
    @Property(selector = "setAdFormat:")
    public native void setAdFormat(String v);
    @Property(selector = "auction_id")
    public native String getAuction_id();
    @Property(selector = "setAuction_id:")
    public native void setAuction_id(String v);
    @Property(selector = "country")
    public native String getCountry();
    @Property(selector = "setCountry:")
    public native void setCountry(String v);
    @Property(selector = "ab")
    public native String getAb();
    @Property(selector = "setAb:")
    public native void setAb(String v);
    @Property(selector = "segment_name")
    public native String getSegment_name();
    @Property(selector = "setSegment_name:")
    public native void setSegment_name(String v);
    @Property(selector = "ad_network")
    public native String getAd_network();
    @Property(selector = "setAd_network:")
    public native void setAd_network(String v);
    @Property(selector = "instance_name")
    public native String getInstance_name();
    @Property(selector = "setInstance_name:")
    public native void setInstance_name(String v);
    @Property(selector = "instance_id")
    public native String getInstance_id();
    @Property(selector = "setInstance_id:")
    public native void setInstance_id(String v);
    @Property(selector = "revenue")
    public native NSNumber getRevenue();
    @Property(selector = "setRevenue:")
    public native void setRevenue(NSNumber v);
    @Property(selector = "precision")
    public native String getPrecision();
    @Property(selector = "setPrecision:")
    public native void setPrecision(String v);
    @Property(selector = "encrypted_cpm")
    public native String getEncrypted_cpm();
    @Property(selector = "setEncrypted_cpm:")
    public native void setEncrypted_cpm(String v);
    @Property(selector = "conversion_value")
    public native NSNumber getConversion_value();
    @Property(selector = "setConversion_value:")
    public native void setConversion_value(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
