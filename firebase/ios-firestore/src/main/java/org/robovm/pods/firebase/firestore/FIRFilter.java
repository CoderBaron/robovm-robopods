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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRFilter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRFilterPtr extends Ptr<FIRFilter, FIRFilterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRFilter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FIRFilter() {}
    protected FIRFilter(Handle h, long handle) { super(h, handle); }
    protected FIRFilter(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "filterWhereField:isEqualTo:")
    public static native FIRFilter filterWhereFieldIsEqualT(String field, NSObject value);
    @Method(selector = "filterWhereFieldPath:isEqualTo:")
    public static native FIRFilter filterWhereFieldPathIsEqualTo(FIRFieldPath path, NSObject value);
    @Method(selector = "filterWhereField:isNotEqualTo:")
    public static native FIRFilter filterWhereFieldIsNotEqualTo(String field, NSObject value);
    @Method(selector = "filterWhereFieldPath:isNotEqualTo:")
    public static native FIRFilter filterWhereFieldPathIsNotEqualTo(FIRFieldPath path, NSObject value);
    @Method(selector = "filterWhereField:isGreaterThan:")
    public static native FIRFilter filterWhereFieldIsGreaterThan(String field, NSObject value);
    @Method(selector = "filterWhereFieldPath:isGreaterThan:")
    public static native FIRFilter filterWhereFieldPathIsGreaterThan(FIRFieldPath path, NSObject value);
    @Method(selector = "filterWhereField:isGreaterThanOrEqualTo:")
    public static native FIRFilter filterWhereFieldIsGreaterThanOrEqualTo(String field, NSObject value);
    @Method(selector = "filterWhereFieldPath:isGreaterThanOrEqualTo:")
    public static native FIRFilter filterWhereFieldPathIsGreaterThanOrEqualTo(FIRFieldPath path, NSObject value);
    @Method(selector = "filterWhereField:isLessThan:")
    public static native FIRFilter filterWhereFieldIsLessThan(String field, NSObject value);
    @Method(selector = "filterWhereFieldPath:isLessThan:")
    public static native FIRFilter filterWhereFieldPathIsLessThan(FIRFieldPath path, NSObject value);
    @Method(selector = "filterWhereField:isLessThanOrEqualTo:")
    public static native FIRFilter filterWhereFieldIsLessThanOrEqualTo(String field, NSObject value);
    @Method(selector = "filterWhereFieldPath:isLessThanOrEqualTo:")
    public static native FIRFilter filterWhereFieldPathIsLessThanOrEqualTo(FIRFieldPath path, NSObject value);
    @Method(selector = "filterWhereField:arrayContains:")
    public static native FIRFilter filterWhereFieldArrayContains(String field, NSObject value);
    @Method(selector = "filterWhereFieldPath:arrayContains:")
    public static native FIRFilter filterWhereFieldPathArrayContains(FIRFieldPath path, NSObject value);
    @Method(selector = "filterWhereField:arrayContainsAny:")
    public static native FIRFilter filterWhereFieldArrayContainsAny(String field, NSArray<?> values);
    @Method(selector = "filterWhereFieldPath:arrayContainsAny:")
    public static native FIRFilter filterWhereFieldPathArrayContainsAny(FIRFieldPath path, NSArray<?> values);
    @Method(selector = "filterWhereField:in:")
    public static native FIRFilter filterWhereFieldIn(String field, NSArray<?> values);
    @Method(selector = "filterWhereFieldPath:in:")
    public static native FIRFilter filterWhereFieldPathIn(FIRFieldPath path, NSArray<?> values);
    @Method(selector = "filterWhereField:notIn:")
    public static native FIRFilter filterWhereFieldNotIn(String field, NSArray<?> values);
    @Method(selector = "filterWhereFieldPath:notIn:")
    public static native FIRFilter filterWhereFieldPathNotIn(FIRFieldPath path, NSArray<?> values);
    @Method(selector = "orFilterWithFilters:")
    public static native FIRFilter orFilter(NSArray<FIRFilter> filters);
    @Method(selector = "andFilterWithFilters:")
    public static native FIRFilter andFilter(NSArray<FIRFilter> filters);
    /*</methods>*/
}
