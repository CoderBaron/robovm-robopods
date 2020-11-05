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
package org.robovm.pods.appcenter.analytics;

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
import org.robovm.pods.appcenter.core.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/MSFlags/*</name>*/ extends Bits</*<name>*/MSFlags/*</name>*/> {
    /*<values>*/
    public static final MSFlags None = new MSFlags(0L);
    public static final MSFlags Normal = new MSFlags(1L);
    public static final MSFlags Critical = new MSFlags(2L);
    /**
     * @deprecated please use MSFlagsNormal
     */
    @Deprecated
    public static final MSFlags PersistenceNormal = new MSFlags(1L);
    /**
     * @deprecated please use MSFlagsCritical
     */
    @Deprecated
    public static final MSFlags PersistenceCritical = new MSFlags(2L);
    public static final MSFlags Default = new MSFlags(1L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MSFlags/*</name>*/[] values = _values(/*<name>*/MSFlags/*</name>*/.class);

    public /*<name>*/MSFlags/*</name>*/(long value) { super(value); }
    private /*<name>*/MSFlags/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MSFlags/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MSFlags/*</name>*/(value, mask);
    }
    protected /*<name>*/MSFlags/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MSFlags/*</name>*/[] values() {
        return values.clone();
    }
}