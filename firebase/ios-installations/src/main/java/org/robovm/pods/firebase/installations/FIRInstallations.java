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
package org.robovm.pods.firebase.installations;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRInstallations/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRInstallationsPtr extends Ptr<FIRInstallations, FIRInstallationsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRInstallations.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIRInstallations() {}
    protected FIRInstallations(Handle h, long handle) { super(h, handle); }
    protected FIRInstallations(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library(Library.INTERNAL)
    public static class Keys {
        static { Bro.bind(Keys.class); }

        @GlobalValue(symbol="kFIRInstallationIDDidChangeNotificationAppNameKey", optional=true)
        public static native NSString AppName();
    }

    @Library(Library.INTERNAL)
    public static class Notifications {
        static { Bro.bind(Notifications.class); }

        @GlobalValue(symbol="FIRInstallationIDDidChangeNotification", optional=true)
        public static native NSString InstallationIDDidChange();
    }
    
    @Method(selector = "installationIDWithCompletion:")
    public native void getInstallationID(@Block VoidBlock2<NSString, NSError> completion);
    @Method(selector = "authTokenWithCompletion:")
    public native void getAuthToken(@Block VoidBlock2<FIRInstallationsAuthTokenResult, NSError> completion);
    @Method(selector = "authTokenForcingRefresh:completion:")
    public native void getAuthTokenForcingRefresh(boolean forceRefresh, @Block VoidBlock2<FIRInstallationsAuthTokenResult, NSError> completion);
    @Method(selector = "deleteWithCompletion:")
    public native void delete(@Block VoidBlock1<NSError> completion);
    @Method(selector = "installations")
    public static native FIRInstallations installations();
    @Method(selector = "installationsWithApp:")
    public static native FIRInstallations installations(org.robovm.pods.firebase.core.FIRApp application);
    /*</methods>*/
}
