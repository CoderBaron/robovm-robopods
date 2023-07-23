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
package org.robovm.pods.firebase.database;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRDataSnapshot/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRDataSnapshotPtr extends Ptr<FIRDataSnapshot, FIRDataSnapshotPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRDataSnapshot.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FIRDataSnapshot() {}
    protected FIRDataSnapshot(Handle h, long handle) { super(h, handle); }
    protected FIRDataSnapshot(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "value")
    public native NSObject getValue();
    @Property(selector = "childrenCount")
    public native @MachineSizedUInt long getChildrenCount();
    @Property(selector = "ref")
    public native FIRDatabaseReference getRef();
    @Property(selector = "key")
    public native String getKey();
    @Property(selector = "children")
    public native NSEnumerator<FIRDataSnapshot> getChildren();
    @Property(selector = "priority")
    public native NSObject getPriority();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "childSnapshotForPath:")
    public native FIRDataSnapshot child(String childPathString);
    @Method(selector = "hasChild:")
    public native boolean hasChild(String childPathString);
    @Method(selector = "hasChildren")
    public native boolean hasChildren();
    @Method(selector = "exists")
    public native boolean exists();
    @Method(selector = "valueInExportFormat")
    public native NSObject valueInExportFormat();
    /*</methods>*/
}
