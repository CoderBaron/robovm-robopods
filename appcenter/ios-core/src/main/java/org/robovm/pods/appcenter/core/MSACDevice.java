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
package org.robovm.pods.appcenter.core;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSACDevice/*</name>*/ 
    extends /*<extends>*/MSACWrapperSdk/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class MSACDevicePtr extends Ptr<MSACDevice, MSACDevicePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSACDevice.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MSACDevice() {}
    protected MSACDevice(Handle h, long handle) { super(h, handle); }
    protected MSACDevice(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithWrapperSdkVersion:wrapperSdkName:wrapperRuntimeVersion:liveUpdateReleaseLabel:liveUpdateDeploymentKey:liveUpdatePackageHash:")
    public MSACDevice(String wrapperSdkVersion, String wrapperSdkName, String wrapperRuntimeVersion, String liveUpdateReleaseLabel, String liveUpdateDeploymentKey, String liveUpdatePackageHash) { super(wrapperSdkVersion, wrapperSdkName, wrapperRuntimeVersion, liveUpdateReleaseLabel, liveUpdateDeploymentKey, liveUpdatePackageHash); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sdkName")
    public native String getSdkName();
    @Property(selector = "sdkVersion")
    public native String getSdkVersion();
    @Property(selector = "model")
    public native String getModel();
    @Property(selector = "oemName")
    public native String getOemName();
    @Property(selector = "osName")
    public native String getOsName();
    @Property(selector = "osVersion")
    public native String getOsVersion();
    @Property(selector = "osBuild")
    public native String getOsBuild();
    @Property(selector = "osApiLevel")
    public native NSNumber getOsApiLevel();
    @Property(selector = "locale")
    public native String getLocale();
    @Property(selector = "timeZoneOffset")
    public native NSNumber getTimeZoneOffset();
    @Property(selector = "screenSize")
    public native String getScreenSize();
    @Property(selector = "appVersion")
    public native String getAppVersion();
    @Property(selector = "carrierName")
    public native String getCarrierName();
    @Property(selector = "carrierCountry")
    public native String getCarrierCountry();
    @Property(selector = "appBuild")
    public native String getAppBuild();
    @Property(selector = "appNamespace")
    public native String getAppNamespace();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
