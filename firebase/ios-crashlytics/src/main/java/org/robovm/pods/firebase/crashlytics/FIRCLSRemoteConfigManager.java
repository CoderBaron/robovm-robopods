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
package org.robovm.pods.firebase.crashlytics;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRCLSRemoteConfigManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRCLSRemoteConfigManagerPtr extends Ptr<FIRCLSRemoteConfigManager, FIRCLSRemoteConfigManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRCLSRemoteConfigManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIRCLSRemoteConfigManager() {}
    protected FIRCLSRemoteConfigManager(Handle h, long handle) { super(h, handle); }
    protected FIRCLSRemoteConfigManager(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRemoteConfig:persistenceDelegate:")
    public FIRCLSRemoteConfigManager(FIRRemoteConfigInterop remoteConfig, FIRCLSPersistenceLog persistenceDelegate) { super((SkipInit) null); initObject(init(remoteConfig, persistenceDelegate)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "rolloutAssignment")
    public native NSArray<FIRRolloutAssignment> getRolloutAssignment();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRemoteConfig:persistenceDelegate:")
    protected native @Pointer long init(FIRRemoteConfigInterop remoteConfig, FIRCLSPersistenceLog persistenceDelegate);
    @Method(selector = "updateRolloutsStateWithRolloutsState:reportID:")
    public native void updateRolloutsState(FIRRolloutsState rolloutsState, String reportID);
    @Method(selector = "getRolloutAssignmentsEncodedJsonString")
    public native String getRolloutAssignmentsEncodedJsonString();
    /*</methods>*/
}
