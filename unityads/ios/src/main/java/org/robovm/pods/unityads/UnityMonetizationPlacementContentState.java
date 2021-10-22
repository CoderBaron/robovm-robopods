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
package org.robovm.pods.unityads;

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
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class) @Library(Library.INTERNAL)/*</annotations>*/
public enum /*<name>*/UnityMonetizationPlacementContentState/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Ready(0L),
    NotAvailable(1L),
    Disabled(2L),
    Waiting(3L),
    NoFill(4L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(UnityMonetizationPlacementContentState.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*/
    @Bridge(symbol="NSStringFromPlacementContentState", optional=true)
    public native String toString();
    @Bridge(symbol="PlacementContentStateFromNSString", optional=true)
    public static native UnityMonetizationPlacementContentState fromString(String p0);
    /*</methods>*/

    private final long n;

    private /*<name>*/UnityMonetizationPlacementContentState/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/UnityMonetizationPlacementContentState/*</name>*/ valueOf(long n) {
        for (/*<name>*/UnityMonetizationPlacementContentState/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/UnityMonetizationPlacementContentState/*</name>*/.class.getName());
    }
}