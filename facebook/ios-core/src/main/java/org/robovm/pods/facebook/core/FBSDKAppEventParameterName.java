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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKAppEventParameterName/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(FBSDKAppEventParameterName.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="FBSDKAppEventParameterNameContent", optional=true)
    public static native NSString Content();
    @GlobalValue(symbol="FBSDKAppEventParameterNameContentID", optional=true)
    public static native NSString ContentID();
    @GlobalValue(symbol="FBSDKAppEventParameterNameContentType", optional=true)
    public static native NSString ContentType();
    @GlobalValue(symbol="FBSDKAppEventParameterNameCurrency", optional=true)
    public static native NSString Currency();
    @GlobalValue(symbol="FBSDKAppEventParameterNameDescription", optional=true)
    public static native NSString Description();
    @GlobalValue(symbol="FBSDKAppEventParameterNameLevel", optional=true)
    public static native NSString Level();
    @GlobalValue(symbol="FBSDKAppEventParameterNameMaxRatingValue", optional=true)
    public static native NSString MaxRatingValue();
    @GlobalValue(symbol="FBSDKAppEventParameterNameNumItems", optional=true)
    public static native NSString NumItems();
    @GlobalValue(symbol="FBSDKAppEventParameterNamePaymentInfoAvailable", optional=true)
    public static native NSString PaymentInfoAvailable();
    @GlobalValue(symbol="FBSDKAppEventParameterNameRegistrationMethod", optional=true)
    public static native NSString RegistrationMethod();
    @GlobalValue(symbol="FBSDKAppEventParameterNameSearchString", optional=true)
    public static native NSString SearchString();
    @GlobalValue(symbol="FBSDKAppEventParameterNameSuccess", optional=true)
    public static native NSString Success();
    @GlobalValue(symbol="FBSDKAppEventParameterNameAdType", optional=true)
    public static native NSString AdType();
    @GlobalValue(symbol="FBSDKAppEventParameterNameOrderID", optional=true)
    public static native NSString OrderID();
    @GlobalValue(symbol="FBSDKAppEventParameterNameEventName", optional=true)
    public static native NSString EventName();
    @GlobalValue(symbol="FBSDKAppEventParameterNameLogTime", optional=true)
    public static native NSString LogTime();
    /*</methods>*/
}
