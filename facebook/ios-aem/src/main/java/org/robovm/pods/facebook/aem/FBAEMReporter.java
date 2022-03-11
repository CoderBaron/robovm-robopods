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
package org.robovm.pods.facebook.aem;

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

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBAEMReporter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBAEMReporterPtr extends Ptr<FBAEMReporter, FBAEMReporterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBAEMReporter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBAEMReporter() {}
    protected FBAEMReporter(Handle h, long handle) { super(h, handle); }
    protected FBAEMReporter(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @deprecated use configureWithNetworker:appID:reporter: instead.
     */
    @Deprecated
    @Method(selector = "configureWithNetworker:appID:")
    public static native void configure(FBAEMNetworking networker, String appID);
    @Method(selector = "configureWithNetworker:appID:reporter:")
    public static native void configure(FBAEMNetworking networker, String appID, FBSKAdNetworkReporting reporter);
    @Method(selector = "enable")
    public static native void enable();
    @Method(selector = "setConversionFilteringEnabled:")
    public static native void setConversionFilteringEnabled(boolean enabled);
    @Method(selector = "setCatalogMatchingEnabled:")
    public static native void setCatalogMatchingEnabled(boolean enabled);
    @Method(selector = "handleURL:")
    public static native void handleURL(NSURL url);
    @Method(selector = "recordAndUpdateEvent:currency:value:parameters:")
    public static native void recordAndUpdateEvent(String event, String currency, NSNumber value, NSDictionary<NSString, ?> parameters);
    /*</methods>*/
}
