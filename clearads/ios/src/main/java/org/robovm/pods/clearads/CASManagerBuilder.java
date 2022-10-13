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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CASManagerBuilder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CASManagerBuilderPtr extends Ptr<CASManagerBuilder, CASManagerBuilderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CASManagerBuilder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CASManagerBuilder() {}
    protected CASManagerBuilder(Handle h, long handle) { super(h, handle); }
    protected CASManagerBuilder(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "withCompletionHandler:")
    public native CASManagerBuilder withCompletionHandler(@Block VoidBlock1<CASInitialConfig> handler);
    @Method(selector = "withTestAdMode:")
    public native CASManagerBuilder withTestAdMode(boolean test);
    @Method(selector = "withAdFlags:")
    public native CASManagerBuilder withAdFlags(CASTypeFlags adTypes);
    @Method(selector = "withUserID:")
    public native CASManagerBuilder withUserID(String userID);
    @Method(selector = "withMediationExtras:forKey:")
    public native CASManagerBuilder withMediationExtras(String value, String key);
    @Method(selector = "withFramework:version:")
    public native CASManagerBuilder withFramework(String name, String version);
    @Method(selector = "createWithCasId:")
    public native CASMediationManager createMediationManager(String identifier);
    /*</methods>*/
}
