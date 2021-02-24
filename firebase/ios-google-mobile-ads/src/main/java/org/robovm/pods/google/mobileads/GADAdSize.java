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
package org.robovm.pods.google.mobileads;

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
import org.robovm.apple.storekit.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADAdSize/*</name>*/ 
    extends /*<extends>*/Struct<GADAdSize>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADAdSizePtr extends Ptr<GADAdSize, GADAdSizePtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(GADAdSize.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADAdSize() {}
    public GADAdSize(CGSize size, @MachineSizedUInt long flags) {
        this.setSize(size);
        this.setFlags(flags);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @ByVal CGSize getSize();
    @StructMember(0) public native GADAdSize setSize(@ByVal CGSize size);
    @StructMember(1) public native @MachineSizedUInt long getFlags();
    @StructMember(1) public native GADAdSize setFlags(@MachineSizedUInt long flags);
    /*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="kGADAdSizeBanner", optional=true)
    public static native @ByVal GADAdSize Banner();
    @GlobalValue(symbol="kGADAdSizeLargeBanner", optional=true)
    public static native @ByVal GADAdSize LargeBanner();
    @GlobalValue(symbol="kGADAdSizeMediumRectangle", optional=true)
    public static native @ByVal GADAdSize MediumRectangle();
    @GlobalValue(symbol="kGADAdSizeFullBanner", optional=true)
    public static native @ByVal GADAdSize FullBanner();
    @GlobalValue(symbol="kGADAdSizeLeaderboard", optional=true)
    public static native @ByVal GADAdSize Leaderboard();
    @GlobalValue(symbol="kGADAdSizeSkyscraper", optional=true)
    public static native @ByVal GADAdSize Skyscraper();
    @GlobalValue(symbol="kGADAdSizeFluid", optional=true)
    public static native @ByVal GADAdSize Fluid();
    @GlobalValue(symbol="kGADAdSizeInvalid", optional=true)
    public static native @ByVal GADAdSize Invalid();
    /**
     * @deprecated Use GADPortraitAnchoredAdaptiveBannerAdSizeWithWidth.
     */
    @Deprecated
    @GlobalValue(symbol="kGADAdSizeSmartBannerPortrait", optional=true)
    public static native @ByVal GADAdSize SmartBannerPortrait();
    /**
     * @deprecated Use GADLandscapeAnchoredAdaptiveBannerAdSizeWithWidth
     */
    @Deprecated
    @GlobalValue(symbol="kGADAdSizeSmartBannerLandscape", optional=true)
    public static native @ByVal GADAdSize SmartBannerLandscape();
    
    @Bridge(symbol="GADPortraitAnchoredAdaptiveBannerAdSizeWithWidth", optional=true)
    public static native @ByVal GADAdSize getPortraitAnchoredAdaptiveBannerAdSize(@MachineSizedFloat double width);
    @Bridge(symbol="GADLandscapeAnchoredAdaptiveBannerAdSizeWithWidth", optional=true)
    public static native @ByVal GADAdSize getLandscapeAnchoredAdaptiveBannerAdSize(@MachineSizedFloat double width);
    @Bridge(symbol="GADCurrentOrientationAnchoredAdaptiveBannerAdSizeWithWidth", optional=true)
    public static native @ByVal GADAdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(@MachineSizedFloat double width);
    @Bridge(symbol="GADAdSizeFromCGSize", optional=true)
    public static native @ByVal GADAdSize createFromCGSize(@ByVal CGSize size);
    @Bridge(symbol="GADAdSizeFullWidthPortraitWithHeight", optional=true)
    public static native @ByVal GADAdSize getAdSizeFullWidthPortrait(@MachineSizedFloat double height);
    @Bridge(symbol="GADAdSizeFullWidthLandscapeWithHeight", optional=true)
    public static native @ByVal GADAdSize getAdSizeFullWidthLandscape(@MachineSizedFloat double height);
    public boolean equals(GADAdSize size2) { return equals(this, size2); }
    @Bridge(symbol="GADAdSizeEqualToSize", optional=true)
    private static native boolean equals(@ByVal GADAdSize size1, @ByVal GADAdSize size2);
    public CGSize toCGSize() { return toCGSize(this); }
    @Bridge(symbol="CGSizeFromGADAdSize", optional=true)
    private static native @ByVal CGSize toCGSize(@ByVal GADAdSize size);
    public boolean isValid() { return isValid(this); }
    @Bridge(symbol="IsGADAdSizeValid", optional=true)
    private static native boolean isValid(@ByVal GADAdSize size);
    public boolean isFluid() { return isFluid(this); }
    @Bridge(symbol="GADAdSizeIsFluid", optional=true)
    private static native boolean isFluid(@ByVal GADAdSize size);
    public String toString() { return toString(this); }
    @Bridge(symbol="NSStringFromGADAdSize", optional=true)
    private static native String toString(@ByVal GADAdSize size);
    public NSValue toNSValue() { return toNSValue(this); }
    @Bridge(symbol="NSValueFromGADAdSize", optional=true)
    private static native NSValue toNSValue(@ByVal GADAdSize size);
    @Bridge(symbol="GADAdSizeFromNSValue", optional=true)
    public static native @ByVal GADAdSize createFromFromNSValue(NSValue value);
    public GADAdSize getClosestValidSize(NSArray<NSValue> possibleAdSizes) { return getClosestValidSize(this, possibleAdSizes); }
    @Bridge(symbol="GADClosestValidSizeForAdSizes", optional=true)
    private static native @ByVal GADAdSize getClosestValidSize(@ByVal GADAdSize original, NSArray<NSValue> possibleAdSizes);
    /*</methods>*/
}
