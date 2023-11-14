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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRQuery/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRQueryPtr extends Ptr<FIRQuery, FIRQueryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRQuery.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIRQuery() {}
    protected FIRQuery(Handle h, long handle) { super(h, handle); }
    protected FIRQuery(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "firestore")
    public native FIRFirestore getFirestore();
    @Property(selector = "count")
    public native FIRAggregateQuery getCount();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getDocumentsWithCompletion:")
    public native void getDocuments(@Block VoidBlock2<FIRQuerySnapshot, NSError> completion);
    @Method(selector = "getDocumentsWithSource:completion:")
    public native void getDocuments(FIRFirestoreSource source, @Block VoidBlock2<FIRQuerySnapshot, NSError> completion);
    @Method(selector = "addSnapshotListener:")
    public native FIRListenerRegistration addSnapshotListener(@Block VoidBlock2<FIRQuerySnapshot, NSError> listener);
    @Method(selector = "addSnapshotListenerWithIncludeMetadataChanges:listener:")
    public native FIRListenerRegistration addSnapshotListener(boolean includeMetadataChanges, @Block VoidBlock2<FIRQuerySnapshot, NSError> listener);
    @Method(selector = "queryWhereFilter:")
    public native FIRQuery queryWhereFilter(FIRFilter filter);
    @Method(selector = "queryWhereField:isEqualTo:")
    public native FIRQuery queryWhereFieldIsEqualTo(String field, NSObject value);
    @Method(selector = "queryWhereFieldPath:isNotEqualTo:")
    public native FIRQuery queryWhereFieldPathIsNotEqualTo(FIRFieldPath path, NSObject value);
    @Method(selector = "queryWhereField:isNotEqualTo:")
    public native FIRQuery queryWhereFieldIsNotEqualTo(String field, NSObject value);
    @Method(selector = "queryWhereFieldPath:isEqualTo:")
    public native FIRQuery queryWhereFieldPathIsEqualTo(FIRFieldPath path, NSObject value);
    @Method(selector = "queryWhereField:isLessThan:")
    public native FIRQuery queryWhereFieldIsLessThan(String field, NSObject value);
    @Method(selector = "queryWhereFieldPath:isLessThan:")
    public native FIRQuery queryWhereFieldPathIsLessThan(FIRFieldPath path, NSObject value);
    @Method(selector = "queryWhereField:isLessThanOrEqualTo:")
    public native FIRQuery queryWhereFieldIsLessThanOrEqualTo(String field, NSObject value);
    @Method(selector = "queryWhereFieldPath:isLessThanOrEqualTo:")
    public native FIRQuery queryWhereFieldPathIsLessThanOrEqualTo(FIRFieldPath path, NSObject value);
    @Method(selector = "queryWhereField:isGreaterThan:")
    public native FIRQuery queryWhereFieldIsGreaterThan(String field, NSObject value);
    @Method(selector = "queryWhereFieldPath:isGreaterThan:")
    public native FIRQuery queryWhereFieldPathIsGreaterThan(FIRFieldPath path, NSObject value);
    @Method(selector = "queryWhereField:isGreaterThanOrEqualTo:")
    public native FIRQuery queryWhereFieldIsGreaterThanOrEqualTo(String field, NSObject value);
    @Method(selector = "queryWhereFieldPath:isGreaterThanOrEqualTo:")
    public native FIRQuery queryWhereFieldPathIsGreaterThanOrEqualTo(FIRFieldPath path, NSObject value);
    @Method(selector = "queryWhereField:arrayContains:")
    public native FIRQuery queryWhereFieldArrayContains(String field, NSObject value);
    @Method(selector = "queryWhereFieldPath:arrayContains:")
    public native FIRQuery queryWhereFieldPathArrayContains(FIRFieldPath path, NSObject value);
    @Method(selector = "queryWhereField:arrayContainsAny:")
    public native FIRQuery queryWhereFieldArrayContainsAny(String field, NSArray<?> values);
    @Method(selector = "queryWhereFieldPath:arrayContainsAny:")
    public native FIRQuery queryWhereFieldPathArrayContainsAny(FIRFieldPath path, NSArray<?> values);
    @Method(selector = "queryWhereField:in:")
    public native FIRQuery queryWhereFieldIn(String field, NSArray<?> values);
    @Method(selector = "queryWhereFieldPath:in:")
    public native FIRQuery queryWhereFieldPathIn(FIRFieldPath path, NSArray<?> values);
    @Method(selector = "queryWhereField:notIn:")
    public native FIRQuery queryWhereFieldNotIn(String field, NSArray<?> values);
    @Method(selector = "queryWhereFieldPath:notIn:")
    public native FIRQuery queryWhereFieldPathNotIn(FIRFieldPath path, NSArray<?> values);
    @Method(selector = "queryFilteredUsingPredicate:")
    public native FIRQuery queryFilteredUsingPredicate(NSPredicate predicate);
    @Method(selector = "queryOrderedByField:")
    public native FIRQuery queryOrderedByField(String field);
    @Method(selector = "queryOrderedByFieldPath:")
    public native FIRQuery queryOrderedByFieldPath(FIRFieldPath path);
    @Method(selector = "queryOrderedByField:descending:")
    public native FIRQuery queryOrderedByFieldDescending(String field, boolean descending);
    @Method(selector = "queryOrderedByFieldPath:descending:")
    public native FIRQuery queryOrderedByFieldPathDescending(FIRFieldPath path, boolean descending);
    @Method(selector = "queryLimitedTo:")
    public native FIRQuery queryLimitedTo(@MachineSizedSInt long limit);
    @Method(selector = "queryLimitedToLast:")
    public native FIRQuery queryLimitedToLast(@MachineSizedSInt long limit);
    @Method(selector = "queryStartingAtDocument:")
    public native FIRQuery queryStartingAtDocument(FIRDocumentSnapshot document);
    @Method(selector = "queryStartingAtValues:")
    public native FIRQuery queryStartingAtValues(NSArray<?> fieldValues);
    @Method(selector = "queryStartingAfterDocument:")
    public native FIRQuery queryStartingAfterDocument(FIRDocumentSnapshot document);
    @Method(selector = "queryStartingAfterValues:")
    public native FIRQuery queryStartingAfterValues(NSArray<?> fieldValues);
    @Method(selector = "queryEndingBeforeDocument:")
    public native FIRQuery queryEndingBeforeDocument(FIRDocumentSnapshot document);
    @Method(selector = "queryEndingBeforeValues:")
    public native FIRQuery queryEndingBeforeValues(NSArray<?> fieldValues);
    @Method(selector = "queryEndingAtDocument:")
    public native FIRQuery queryEndingAtDocument(FIRDocumentSnapshot document);
    @Method(selector = "queryEndingAtValues:")
    public native FIRQuery queryEndingAtValues(NSArray<?> fieldValues);
    @Method(selector = "aggregate:")
    public native FIRAggregateQuery aggregate(NSArray<FIRAggregateField> aggregateFields);
    /*</methods>*/
}
