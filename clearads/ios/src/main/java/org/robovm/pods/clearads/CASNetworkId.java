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
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/CASNetworkId/*</name>*/ implements ValuedEnum {
    /*<values>*/
    GoogleAds(0L),
    LiftoffMonetize(1L),
    Kidoz(2L),
    Chartboost(3L),
    UnityAds(4L),
    AppLovin(5L),
    SuperAwesome(6L),
    AdColony(8L),
    AudienceNetwork(9L),
    InMobi(10L),
    DTExchange(11L),
    MyTarget(12L),
    Crosspromo(13L),
    IronSource(14L),
    YandexAds(15L),
    HyprMX(16L),
    Smaato(18L),
    Bigo(19L),
    Tapjoy(20L),
    Mintegral(23L),
    Pangle(24L),
    CASExchange(30L),
    LastPageAd(31L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/CASNetworkId/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/CASNetworkId/*</name>*/ valueOf(long n) {
        for (/*<name>*/CASNetworkId/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/CASNetworkId/*</name>*/.class.getName());
    }
}