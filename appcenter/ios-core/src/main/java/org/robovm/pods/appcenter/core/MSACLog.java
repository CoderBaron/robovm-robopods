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
package org.robovm.pods.appcenter.core;

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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MSACLog/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "type")
    String getType();
    @Property(selector = "setType:")
    void setType(String v);
    @Property(selector = "timestamp")
    NSDate getTimestamp();
    @Property(selector = "setTimestamp:")
    void setTimestamp(NSDate v);
    @Property(selector = "sid")
    String getSid();
    @Property(selector = "setSid:")
    void setSid(String v);
    @Property(selector = "distributionGroupId")
    String getDistributionGroupId();
    @Property(selector = "setDistributionGroupId:")
    void setDistributionGroupId(String v);
    @Property(selector = "dataResidencyRegion")
    String getDataResidencyRegion();
    @Property(selector = "setDataResidencyRegion:")
    void setDataResidencyRegion(String v);
    @Property(selector = "userId")
    String getUserId();
    @Property(selector = "setUserId:")
    void setUserId(String v);
    @Property(selector = "device")
    MSACDevice getDevice();
    @Property(selector = "setDevice:")
    void setDevice(MSACDevice v);
    @Property(selector = "tag")
    NSObject getTag();
    @Property(selector = "setTag:")
    void setTag(NSObject v);
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "isValid")
    boolean isValid();
    @Method(selector = "addTransmissionTargetToken:")
    void addTransmissionTargetToken(String token);
    @Method(selector = "transmissionTargetTokens")
    NSSet<?> transmissionTargetTokens();
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
