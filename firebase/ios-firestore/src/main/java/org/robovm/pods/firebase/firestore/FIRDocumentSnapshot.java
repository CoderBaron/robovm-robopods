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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRDocumentSnapshot/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRDocumentSnapshotPtr extends Ptr<FIRDocumentSnapshot, FIRDocumentSnapshotPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRDocumentSnapshot.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIRDocumentSnapshot() {}
    protected FIRDocumentSnapshot(Handle h, long handle) { super(h, handle); }
    protected FIRDocumentSnapshot(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "exists")
    public native boolean exists();
    @Property(selector = "reference")
    public native FIRDocumentReference getReference();
    @Property(selector = "documentID")
    public native String getId();
    @Property(selector = "metadata")
    public native FIRSnapshotMetadata getMetadata();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "data")
    public native NSDictionary<NSString, ?> getData();
    @Method(selector = "dataWithServerTimestampBehavior:")
    public native NSDictionary<NSString, ?> getData(FIRServerTimestampBehavior serverTimestampBehavior);
    @Method(selector = "valueForField:")
    public native NSObject getValue(NSObject field);
    @Method(selector = "valueForField:serverTimestampBehavior:")
    public native NSObject getValue(NSObject field, FIRServerTimestampBehavior serverTimestampBehavior);
    @Method(selector = "objectForKeyedSubscript:")
    public native NSObject get(NSObject key);
    /*</methods>*/
}
