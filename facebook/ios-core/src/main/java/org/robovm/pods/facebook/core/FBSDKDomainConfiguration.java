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
package org.robovm.pods.facebook.core;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.webkit.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.storekit.*;
import org.robovm.pods.facebook.corebasics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKDomainConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol, NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class FBSDKDomainConfigurationPtr extends Ptr<FBSDKDomainConfiguration, FBSDKDomainConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKDomainConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKDomainConfiguration() {}
    protected FBSDKDomainConfiguration(Handle h, long handle) { super(h, handle); }
    protected FBSDKDomainConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTimestamp:domainInfo:")
    public FBSDKDomainConfiguration(NSDate timestamp, NSDictionary<?, ?> domainInfo) { super((SkipInit) null); initObject(init(timestamp, domainInfo)); }
    @Method(selector = "initWithCoder:")
    public FBSDKDomainConfiguration(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "timestamp")
    public native NSDate getTimestamp();
    @Property(selector = "version")
    public native @MachineSizedSInt long getVersion();
    @Property(selector = "domainInfo")
    public native NSDictionary<?, ?> getDomainInfo();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTimestamp:domainInfo:")
    protected native @Pointer long init(NSDate timestamp, NSDictionary<?, ?> domainInfo);
    @Method(selector = "setDefaultDomainInfo")
    public static native void setDefaultDomainInfo();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
