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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRQuerySnapshot/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRQuerySnapshotPtr extends Ptr<FIRQuerySnapshot, FIRQuerySnapshotPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRQuerySnapshot.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIRQuerySnapshot() {}
    protected FIRQuerySnapshot(Handle h, long handle) { super(h, handle); }
    protected FIRQuerySnapshot(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "query")
    public native FIRQuery getQuery();
    @Property(selector = "metadata")
    public native FIRSnapshotMetadata getMetadata();
    @Property(selector = "isEmpty")
    public native boolean isEmpty();
    @Property(selector = "count")
    public native @MachineSizedSInt long size();
    @Property(selector = "documents")
    public native NSArray<FIRQueryDocumentSnapshot> getDocuments();
    @Property(selector = "documentChanges")
    public native NSArray<FIRDocumentChange> getDocumentChanges();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "documentChangesWithIncludeMetadataChanges:")
    public native NSArray<FIRDocumentChange> getDocumentChanges(boolean includeMetadataChanges);
    /*</methods>*/
}
