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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALTargetingData/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ALTargetingDataPtr extends Ptr<ALTargetingData, ALTargetingDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ALTargetingData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ALTargetingData() {}
    protected ALTargetingData(Handle h, long handle) { super(h, handle); }
    protected ALTargetingData(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "yearOfBirth")
    public native NSNumber getYearOfBirth();
    @Property(selector = "setYearOfBirth:")
    public native void setYearOfBirth(NSNumber v);
    @Property(selector = "gender")
    public native ALGender getGender();
    @Property(selector = "setGender:")
    public native void setGender(ALGender v);
    @Property(selector = "maximumAdContentRating")
    public native ALAdContentRating getMaximumAdContentRating();
    @Property(selector = "setMaximumAdContentRating:")
    public native void setMaximumAdContentRating(ALAdContentRating v);
    @Property(selector = "email")
    public native String getEmail();
    @Property(selector = "setEmail:")
    public native void setEmail(String v);
    @Property(selector = "phoneNumber")
    public native String getPhoneNumber();
    @Property(selector = "setPhoneNumber:")
    public native void setPhoneNumber(String v);
    @Property(selector = "keywords")
    public native NSArray<NSString> getKeywords();
    @Property(selector = "setKeywords:")
    public native void setKeywords(NSArray<NSString> v);
    @Property(selector = "interests")
    public native NSArray<NSString> getInterests();
    @Property(selector = "setInterests:")
    public native void setInterests(NSArray<NSString> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "clearAll")
    public native void clearAll();
    /*</methods>*/
}
