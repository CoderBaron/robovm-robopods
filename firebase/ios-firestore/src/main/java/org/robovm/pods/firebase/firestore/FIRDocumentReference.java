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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRDocumentReference/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRDocumentReferencePtr extends Ptr<FIRDocumentReference, FIRDocumentReferencePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRDocumentReference.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIRDocumentReference() {}
    protected FIRDocumentReference(Handle h, long handle) { super(h, handle); }
    protected FIRDocumentReference(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "documentID")
    public native String getId();
    @Property(selector = "parent")
    public native FIRCollectionReference getParent();
    @Property(selector = "firestore")
    public native FIRFirestore getFirestore();
    @Property(selector = "path")
    public native String getPath();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "collectionWithPath:")
    public native FIRCollectionReference collection(String collectionPath);
    @Method(selector = "setData:")
    public native void set(NSDictionary<NSString, ?> documentData);
    @Method(selector = "setData:merge:")
    public native void set(NSDictionary<NSString, ?> documentData, boolean merge);
    @Method(selector = "setData:mergeFields:")
    public native void set(NSDictionary<NSString, ?> documentData, NSArray<?> mergeFields);
    @Method(selector = "setData:completion:")
    public native void set(NSDictionary<NSString, ?> documentData, @Block VoidBlock1<NSError> completion);
    @Method(selector = "setData:merge:completion:")
    public native void set(NSDictionary<NSString, ?> documentData, boolean merge, @Block VoidBlock1<NSError> completion);
    @Method(selector = "setData:mergeFields:completion:")
    public native void set(NSDictionary<NSString, ?> documentData, NSArray<?> mergeFields, @Block VoidBlock1<NSError> completion);
    @Method(selector = "updateData:")
    public native void update(NSDictionary<?, ?> fields);
    @Method(selector = "updateData:completion:")
    public native void update(NSDictionary<?, ?> fields, @Block VoidBlock1<NSError> completion);
    @Method(selector = "deleteDocument")
    public native void delete();
    @Method(selector = "deleteDocumentWithCompletion:")
    public native void delete(@Block VoidBlock1<NSError> completion);
    @Method(selector = "getDocumentWithCompletion:")
    public native void get(@Block VoidBlock2<FIRDocumentSnapshot, NSError> completion);
    @Method(selector = "getDocumentWithSource:completion:")
    public native void get(FIRFirestoreSource source, @Block VoidBlock2<FIRDocumentSnapshot, NSError> completion);
    @Method(selector = "addSnapshotListener:")
    public native FIRListenerRegistration addSnapshotListener(@Block VoidBlock2<FIRDocumentSnapshot, NSError> listener);
    @Method(selector = "addSnapshotListenerWithIncludeMetadataChanges:listener:")
    public native FIRListenerRegistration addSnapshotListener(boolean includeMetadataChanges, @Block VoidBlock2<FIRDocumentSnapshot, NSError> listener);
    @Method(selector = "addSnapshotListenerWithOptions:listener:")
    public native FIRListenerRegistration addSnapshotListener(FIRSnapshotListenOptions options, @Block VoidBlock2<FIRDocumentSnapshot, NSError> listener);
    /*</methods>*/
}
