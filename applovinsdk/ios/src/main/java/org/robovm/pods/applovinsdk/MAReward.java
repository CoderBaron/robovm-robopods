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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MAReward/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MARewardPtr extends Ptr<MAReward, MARewardPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MAReward.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MAReward() {}
    protected MAReward(Handle h, long handle) { super(h, handle); }
    protected MAReward(SkipInit skipInit) { super(skipInit); }
    public MAReward(@MachineSizedSInt long amount, String label) { super((Handle) null, create(amount, label)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "defaultLabel")
    public static native String getDefaultLabel();
    @Property(selector = "defaultAmount")
    public static native @MachineSizedSInt long getDefaultAmount();
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "amount")
    public native @MachineSizedSInt long getAmount();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "reward")
    public static native MAReward reward();
    @Method(selector = "rewardWithAmount:label:")
    protected static native @Pointer long create(@MachineSizedSInt long amount, String label);
    /*</methods>*/
}
