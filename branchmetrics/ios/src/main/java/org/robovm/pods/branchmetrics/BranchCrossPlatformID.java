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
package org.robovm.pods.branchmetrics;

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
import org.robovm.apple.corespotlight.*;
import org.robovm.apple.uniformtypeid.*;
import org.robovm.apple.linkpresentation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BranchCrossPlatformID/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BranchCrossPlatformIDPtr extends Ptr<BranchCrossPlatformID, BranchCrossPlatformIDPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BranchCrossPlatformID.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BranchCrossPlatformID() {}
    protected BranchCrossPlatformID(Handle h, long handle) { super(h, handle); }
    protected BranchCrossPlatformID(SkipInit skipInit) { super(skipInit); }
    public BranchCrossPlatformID(NSDictionary<?, ?> json) { super((Handle) null, buildFromJSON(json)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "crossPlatformID")
    public native String getCrossPlatformID();
    @Property(selector = "developerID")
    public native String getDeveloperID();
    @Property(selector = "pastCrossPlatformIDs")
    public native NSArray<NSString> getPastCrossPlatformIDs();
    @Property(selector = "probabiliticCrossPlatformIDs")
    public native NSArray<BranchProbabilisticCrossPlatformID> getProbabiliticCrossPlatformIDs();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "buildFromJSON:")
    protected static native @Pointer long buildFromJSON(NSDictionary<?, ?> json);
    @Method(selector = "requestCrossPlatformIdData:key:completion:")
    public static native void requestCrossPlatformIdData(BNCServerInterface serverInterface, String key, @Block VoidBlock1<BranchCrossPlatformID> completion);
    /*</methods>*/
}
