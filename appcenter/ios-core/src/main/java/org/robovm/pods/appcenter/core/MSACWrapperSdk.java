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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSACWrapperSdk/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class MSACWrapperSdkPtr extends Ptr<MSACWrapperSdk, MSACWrapperSdkPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSACWrapperSdk.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MSACWrapperSdk() {}
    protected MSACWrapperSdk(Handle h, long handle) { super(h, handle); }
    protected MSACWrapperSdk(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithWrapperSdkVersion:wrapperSdkName:wrapperRuntimeVersion:liveUpdateReleaseLabel:liveUpdateDeploymentKey:liveUpdatePackageHash:")
    public MSACWrapperSdk(String wrapperSdkVersion, String wrapperSdkName, String wrapperRuntimeVersion, String liveUpdateReleaseLabel, String liveUpdateDeploymentKey, String liveUpdatePackageHash) { super((SkipInit) null); initObject(init(wrapperSdkVersion, wrapperSdkName, wrapperRuntimeVersion, liveUpdateReleaseLabel, liveUpdateDeploymentKey, liveUpdatePackageHash)); }
    @Method(selector = "initWithCoder:")
    public MSACWrapperSdk(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "wrapperSdkVersion")
    public native String getWrapperSdkVersion();
    @Property(selector = "wrapperSdkName")
    public native String getWrapperSdkName();
    @Property(selector = "wrapperRuntimeVersion")
    public native String getWrapperRuntimeVersion();
    @Property(selector = "liveUpdateReleaseLabel")
    public native String getLiveUpdateReleaseLabel();
    @Property(selector = "liveUpdateDeploymentKey")
    public native String getLiveUpdateDeploymentKey();
    @Property(selector = "liveUpdatePackageHash")
    public native String getLiveUpdatePackageHash();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithWrapperSdkVersion:wrapperSdkName:wrapperRuntimeVersion:liveUpdateReleaseLabel:liveUpdateDeploymentKey:liveUpdatePackageHash:")
    protected native @Pointer long init(String wrapperSdkVersion, String wrapperSdkName, String wrapperRuntimeVersion, String liveUpdateReleaseLabel, String liveUpdateDeploymentKey, String liveUpdatePackageHash);
    @Method(selector = "isValid")
    public native boolean isValid();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
