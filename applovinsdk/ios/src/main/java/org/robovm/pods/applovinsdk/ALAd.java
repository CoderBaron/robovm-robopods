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
import org.robovm.apple.safariservices.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALAd/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ALAdPtr extends Ptr<ALAd, ALAdPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ALAd.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ALAd() {}
    protected ALAd(Handle h, long handle) { super(h, handle); }
    protected ALAd(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "size")
    public native ALAdSize getSize();
    @Property(selector = "type")
    public native ALAdType getType();
    @Property(selector = "zoneIdentifier")
    public native String getZoneIdentifier();
    /**
     * @deprecated This API has been deprecated and will be removed in a future release.
     */
    @Deprecated
    @Property(selector = "adIdNumber")
    public native NSNumber getAdIdNumber();
    /**
     * @deprecated This API has been deprecated and will be removed in a future release.
     */
    @Deprecated
    @Property(selector = "isVideoAd")
    public native boolean isVideoAd();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @deprecated This API has been deprecated and will be removed in a future release.
     */
    @Deprecated
    @Method(selector = "adValueForKey:")
    public native String adValueForKey(String key);
    /**
     * @deprecated This API has been deprecated and will be removed in a future release.
     */
    @Deprecated
    @Method(selector = "adValueForKey:defaultValue:")
    public native String getAdValue(String key, String defaultValue);
    /*</methods>*/
}
