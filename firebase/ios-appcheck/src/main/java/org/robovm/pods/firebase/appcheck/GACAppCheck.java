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
package org.robovm.pods.firebase.appcheck;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GACAppCheck/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements GACAppCheckProtocol/*</implements>*/ {

    /*<ptr>*/public static class GACAppCheckPtr extends Ptr<GACAppCheck, GACAppCheckPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GACAppCheck.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected GACAppCheck() {}
    protected GACAppCheck(Handle h, long handle) { super(h, handle); }
    protected GACAppCheck(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithServiceName:resourceName:appCheckProvider:settings:tokenDelegate:keychainAccessGroup:")
    public GACAppCheck(String serviceName, String resourceName, GACAppCheckProvider appCheckProvider, GACAppCheckSettingsProtocol settings, GACAppCheckTokenDelegate tokenDelegate, String accessGroup) { super((SkipInit) null); initObject(init(serviceName, resourceName, appCheckProvider, settings, tokenDelegate, accessGroup)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="AppCheckCoreVersionNumber", optional=true)
    public static native double getVersionNumber();
    @GlobalValue(symbol="AppCheckCoreVersionString", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) BytePtr getVersionString();
    
    @Method(selector = "initWithServiceName:resourceName:appCheckProvider:settings:tokenDelegate:keychainAccessGroup:")
    protected native @Pointer long init(String serviceName, String resourceName, GACAppCheckProvider appCheckProvider, GACAppCheckSettingsProtocol settings, GACAppCheckTokenDelegate tokenDelegate, String accessGroup);
    @Method(selector = "tokenForcingRefresh:completion:")
    public native void tokenForcingRefresh(boolean forcingRefresh, @Block VoidBlock1<GACAppCheckTokenResult> handler);
    @Method(selector = "limitedUseTokenWithCompletion:")
    public native void limitedUseToken(@Block VoidBlock1<GACAppCheckTokenResult> handler);
    /*</methods>*/
}
