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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKURLScheme/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(FBSDKURLScheme.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @deprecated `URLScheme.facebookApp` is deprecated and will be removed in the next major release; please use `URLScheme.facebookAPI` instead
     */
    @Deprecated
    @GlobalValue(symbol="FBSDKURLSchemeFacebookApp", optional=true)
    public static native String FacebookApp();
    @GlobalValue(symbol="FBSDKURLSchemeFacebookAPI", optional=true)
    public static native String FacebookAPI();
    /**
     * @deprecated `URLScheme.facebookShareExtension` is deprecated and will be removed in the next major release; please use `URLScheme.facebookAPI` instead
     */
    @Deprecated
    @GlobalValue(symbol="FBSDKURLSchemeFacebookShareExtension", optional=true)
    public static native String FacebookShareExtension();
    @GlobalValue(symbol="FBSDKURLSchemeMessengerApp", optional=true)
    public static native String MessengerApp();
    /**
     * @deprecated `URLScheme.masqueradePlayer` is deprecated and will be removed in the next major release
     */
    @Deprecated
    @GlobalValue(symbol="FBSDKURLSchemeMasqueradePlayer", optional=true)
    public static native String MasqueradePlayer();
    @GlobalValue(symbol="FBSDKURLSchemeHTTPS", optional=true)
    public static native String HTTPS();
    @GlobalValue(symbol="FBSDKURLSchemeHTTP", optional=true)
    public static native String HTTP();
    @GlobalValue(symbol="FBSDKURLSchemeWeb", optional=true)
    public static native String Web();
    /*</methods>*/
}
