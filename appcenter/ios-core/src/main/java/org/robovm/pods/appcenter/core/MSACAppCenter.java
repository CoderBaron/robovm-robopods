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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSACAppCenter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MSACAppCenterPtr extends Ptr<MSACAppCenter, MSACAppCenterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSACAppCenter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MSACAppCenter() {}
    protected MSACAppCenter(Handle h, long handle) { super(h, handle); }
    protected MSACAppCenter(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isConfigured")
    public static native boolean isConfigured();
    @Property(selector = "isRunningInAppCenterTestCloud")
    public static native boolean isRunningInAppCenterTestCloud();
    @Property(selector = "isEnabled")
    public static native boolean isEnabled();
    @Property(selector = "setEnabled:")
    public static native void setEnabled(boolean v);
    @Property(selector = "isNetworkRequestsAllowed")
    public static native boolean isNetworkRequestsAllowed();
    @Property(selector = "setNetworkRequestsAllowed:")
    public static native void setNetworkRequestsAllowed(boolean v);
    @Property(selector = "logLevel")
    public static native MSACLogLevel getLogLevel();
    @Property(selector = "setLogLevel:")
    public static native void setLogLevel(MSACLogLevel v);
    @Property(selector = "logUrl")
    public static native String getLogUrl();
    @Property(selector = "setLogUrl:")
    public static native void setLogUrl(String v);
    @Property(selector = "dataResidencyRegion")
    public static native String getDataResidencyRegion();
    @Property(selector = "setDataResidencyRegion:")
    public static native void setDataResidencyRegion(String v);
    @Property(selector = "logHandler")
    public static native @Block("(@Block,,,,,)") VoidBlock6<Block0<String>, MSACLogLevel, NSString, BytePtr, BytePtr, Integer> getLogHandler();
    @Property(selector = "setLogHandler:")
    public static native void setLogHandler(@Block("(@Block,,,,,)") VoidBlock6<Block0<String>, MSACLogLevel, NSString, BytePtr, BytePtr, Integer> v);
    @Property(selector = "wrapperSdk")
    public static native MSACWrapperSdk getWrapperSdk();
    @Property(selector = "setWrapperSdk:")
    public static native void setWrapperSdk(MSACWrapperSdk v);
    @Property(selector = "isAppDelegateForwarderEnabled")
    public static native boolean isAppDelegateForwarderEnabled();
    @Property(selector = "installId")
    public static native NSUUID getInstallId();
    @Property(selector = "isDebuggerAttached")
    public static native boolean isDebuggerAttached();
    @Property(selector = "sdkVersion")
    public static native String getSdkVersion();
    @Property(selector = "userId")
    public static native String getUserId();
    @Property(selector = "setUserId:")
    public static native void setUserId(String v);
    @Property(selector = "countryCode")
    public static native String getCountryCode();
    @Property(selector = "setCountryCode:")
    public static native void setCountryCode(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "sharedInstance")
    public static native MSACAppCenter sharedInstance();
    @Method(selector = "configureWithAppSecret:")
    public static native void configure(String appSecret);
    @Method(selector = "configure")
    public static native void configure();
    @Method(selector = "start:withServices:")
    public static native void start(String appSecret, NSArray<?> services);
    @Method(selector = "startWithServices:")
    public static native void start(NSArray<?> services);
    @Method(selector = "startService:")
    public static native void startService(Class<?> service);
    @Method(selector = "startFromLibraryWithServices:")
    public static native void startFromLibrary(NSArray<?> services);
    @Method(selector = "setMaxStorageSize:completionHandler:")
    public static native void setMaxStorageSize(@MachineSizedSInt long sizeInBytes, @Block VoidBooleanBlock completionHandler);
    /*</methods>*/
}
