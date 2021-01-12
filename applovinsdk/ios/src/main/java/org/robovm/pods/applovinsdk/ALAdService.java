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
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALAdService/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ALAdServicePtr extends Ptr<ALAdService, ALAdServicePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ALAdService.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ALAdService() {}
    protected ALAdService(Handle h, long handle) { super(h, handle); }
    protected ALAdService(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "bidToken")
    public native String getBidToken();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "loadNextAd:andNotify:")
    public native void loadNextAd(ALAdSize adSize, ALAdLoadDelegate delegate);
    @Method(selector = "loadNextAdForZoneIdentifier:andNotify:")
    public native void loadNextAdForZoneIdentifier(String zoneIdentifier, ALAdLoadDelegate delegate);
    @Method(selector = "loadNextAdForAdToken:andNotify:")
    public native void loadNextAdForAdToken(String adToken, ALAdLoadDelegate delegate);
    @Method(selector = "loadNextAdForZoneIdentifiers:andNotify:")
    public native void loadNextAdForZoneIdentifiers(NSArray<NSString> zoneIdentifiers, ALAdLoadDelegate delegate);
    /**
     * @deprecated Manually preloading ads in the background has been deprecated and will be removed in a future SDK version. Please use [ALAdService loadNextAd:andNotify:] to load ads to display.
     */
    @Deprecated
    @Method(selector = "preloadAdOfSize:")
    public native void preloadAdOfSize(ALAdSize adSize);
    /**
     * @deprecated Manually preloading ads in the background has been deprecated and will be removed in a future SDK version. Please use [ALAdService loadNextAdForZoneIdentifier:andNotify:] to load ads to display.
     */
    @Deprecated
    @Method(selector = "preloadAdForZoneIdentifier:")
    public native void preloadAdForZoneIdentifier(String zoneIdentifier);
    /**
     * @deprecated Manually preloading ads in the background has been deprecated and will be removed in a future SDK version. Please use [ALAdService loadNextAd:andNotify:] to load ads to display.
     */
    @Deprecated
    @Method(selector = "hasPreloadedAdOfSize:")
    public native boolean hasPreloadedAdOfSize(ALAdSize adSize);
    /**
     * @deprecated Manually preloading ads in the background has been deprecated and will be removed in a future SDK version. Please use [ALAdService loadNextAdForZoneIdentifier:andNotify:] to load ads to display.
     */
    @Deprecated
    @Method(selector = "hasPreloadedAdForZoneIdentifier:")
    public native boolean hasPreloadedAdForZoneIdentifier(String zoneIdentifier);
    /*</methods>*/
}
