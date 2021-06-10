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
package org.robovm.pods.fyber.core;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IASDKCore/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements IAInterfaceSingleton/*</implements>*/ {

    /*<ptr>*/public static class IASDKCorePtr extends Ptr<IASDKCore, IASDKCorePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IASDKCore.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public IASDKCore() {}
    protected IASDKCore(Handle h, long handle) { super(h, handle); }
    protected IASDKCore(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "appID")
    public native String getAppID();
    @Property(selector = "isInitialised")
    public native boolean isInitialised();
    @Property(selector = "publisherAppStoreID")
    public native String getPublisherAppStoreID();
    @Property(selector = "setPublisherAppStoreID:")
    public native void setPublisherAppStoreID(String v);
    @Property(selector = "isAppFirstTimeInit")
    public native boolean isAppFirstTimeInit();
    @Property(selector = "setIsAppFirstTimeInit:")
    public native void setIsAppFirstTimeInit(boolean v);
    @Property(selector = "globalAdDelegate")
    public native IAGlobalAdDelegate getGlobalAdDelegate();
    @Property(selector = "setGlobalAdDelegate:", strongRef = true)
    public native void setGlobalAdDelegate(IAGlobalAdDelegate v);
    @Property(selector = "GDPRConsent")
    public native IAGDPRConsentType getGDPRConsent();
    @Property(selector = "setGDPRConsent:")
    public native void setGDPRConsent(IAGDPRConsentType v);
    @Property(selector = "GDPRConsentString")
    public native String getGDPRConsentString();
    @Property(selector = "setGDPRConsentString:")
    public native void setGDPRConsentString(String v);
    @Property(selector = "CCPAString")
    public native String getCCPAString();
    @Property(selector = "setCCPAString:")
    public native void setCCPAString(String v);
    @Property(selector = "userID")
    public native String getUserID();
    @Property(selector = "setUserID:")
    public native void setUserID(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAppID:")
    public native void init(String appID);
    @Method(selector = "initWithAppID:completionBlock:completionQueue:")
    public native void init(String appID, @Block VoidBlock2<Boolean, NSError> completionBlock, DispatchQueue completionQueue);
    @Method(selector = "version")
    public native String version();
    @Method(selector = "clearGDPRConsentData")
    public native void clearGDPRConsentData();
    @Method(selector = "sharedInstance")
    public static native IASDKCore sharedInstance();
    /*</methods>*/
}
