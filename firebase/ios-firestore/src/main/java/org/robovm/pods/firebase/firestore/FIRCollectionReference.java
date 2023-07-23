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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRCollectionReference/*</name>*/ 
    extends /*<extends>*/FIRQuery/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRCollectionReferencePtr extends Ptr<FIRCollectionReference, FIRCollectionReferencePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRCollectionReference.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIRCollectionReference() {}
    protected FIRCollectionReference(Handle h, long handle) { super(h, handle); }
    protected FIRCollectionReference(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "collectionID")
    public native String getId();
    @Property(selector = "parent")
    public native FIRDocumentReference getParent();
    @Property(selector = "path")
    public native String getPath();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "documentWithAutoID")
    public native FIRDocumentReference document();
    @Method(selector = "documentWithPath:")
    public native FIRDocumentReference document(String documentPath);
    @Method(selector = "addDocumentWithData:")
    public native FIRDocumentReference addDocument(NSDictionary<NSString, ?> data);
    @Method(selector = "addDocumentWithData:completion:")
    public native FIRDocumentReference addDocument(NSDictionary<NSString, ?> data, @Block VoidBlock1<NSError> completion);
    /*</methods>*/
}
