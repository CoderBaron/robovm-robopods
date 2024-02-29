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
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALMediationProviders/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(ALMediationProviders.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="ALMediationProviderAdMarvel", optional=true)
    public static native NSString AdMarvel();
    @GlobalValue(symbol="ALMediationProviderAdMob", optional=true)
    public static native NSString AdMob();
    @GlobalValue(symbol="ALMediationProviderAerServ", optional=true)
    public static native NSString AerServ();
    @GlobalValue(symbol="ALMediationProviderAppodeal", optional=true)
    public static native NSString Appodeal();
    @GlobalValue(symbol="ALMediationProviderFusePowered", optional=true)
    public static native NSString FusePowered();
    @GlobalValue(symbol="ALMediationProviderFyber", optional=true)
    public static native NSString Fyber();
    @GlobalValue(symbol="ALMediationProviderHeyzap", optional=true)
    public static native NSString Heyzap();
    @GlobalValue(symbol="ALMediationProviderHyprMX", optional=true)
    public static native NSString HyprMX();
    @GlobalValue(symbol="ALMediationProviderIronsource", optional=true)
    public static native NSString Ironsource();
    @GlobalValue(symbol="ALMediationProviderMAX", optional=true)
    public static native NSString MAX();
    @GlobalValue(symbol="ALMediationProviderMoPub", optional=true)
    public static native NSString MoPub();
    @GlobalValue(symbol="ALMediationProviderTapdaq", optional=true)
    public static native NSString Tapdaq();
    /*</methods>*/
}
