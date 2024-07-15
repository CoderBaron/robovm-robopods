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
package org.robovm.pods.firebase.firestore;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRAggregateField/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRAggregateFieldPtr extends Ptr<FIRAggregateField, FIRAggregateFieldPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRAggregateField.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIRAggregateField() {}
    protected FIRAggregateField(Handle h, long handle) { super(h, handle); }
    protected FIRAggregateField(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "aggregateFieldForCount")
    public static native FIRAggregateField aggregateFieldForCount();
    @Method(selector = "aggregateFieldForSumOfField:")
    public static native FIRAggregateField aggregateFieldForSumOfField(String field);
    @Method(selector = "aggregateFieldForSumOfFieldPath:")
    public static native FIRAggregateField aggregateFieldForSumOfFieldPath(FIRFieldPath fieldPath);
    @Method(selector = "aggregateFieldForAverageOfField:")
    public static native FIRAggregateField aggregateFieldForAverageOfField(String field);
    @Method(selector = "aggregateFieldForAverageOfFieldPath:")
    public static native FIRAggregateField aggregateFieldForAverageOfFieldPath(FIRFieldPath fieldPath);
    /*</methods>*/
}
