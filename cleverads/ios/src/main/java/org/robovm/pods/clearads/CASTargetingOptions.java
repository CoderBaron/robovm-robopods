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
package org.robovm.pods.clearads;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CASTargetingOptions/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CASTargetingOptionsPtr extends Ptr<CASTargetingOptions, CASTargetingOptionsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CASTargetingOptions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CASTargetingOptions() {}
    protected CASTargetingOptions(Handle h, long handle) { super(h, handle); }
    protected CASTargetingOptions(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setGender:")
    public native void setGender(Gender gender);
    @Method(selector = "getGender")
    public native Gender getGender();
    @Method(selector = "setAge:")
    public native void setAge(@MachineSizedSInt long age);
    @Method(selector = "getAge")
    public native @MachineSizedSInt long getAge();
    @Method(selector = "setLocationWithLatitude:longitude:")
    public native void setLocation(double latitude, double longitude);
    @Method(selector = "clearLocation")
    public native void clearLocation();
    @Method(selector = "setLocationCollectionEnabled:")
    public native void setLocationCollectionEnabled(boolean enabled);
    @Method(selector = "getLocationCollectionEnabled")
    public native boolean getLocationCollectionEnabled();
    @Method(selector = "setKeywords:")
    public native void setKeywords(NSArray<NSString> keywords);
    @Method(selector = "getKeywords")
    public native NSArray<NSString> getKeywords();
    @Method(selector = "setContentUrl:")
    public native void setContentUrl(String url);
    @Method(selector = "getContentUrl")
    public native String getContentUrl();
    /*</methods>*/
}
