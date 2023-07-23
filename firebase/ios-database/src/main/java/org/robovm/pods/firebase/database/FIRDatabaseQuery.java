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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRDatabaseQuery/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRDatabaseQueryPtr extends Ptr<FIRDatabaseQuery, FIRDatabaseQueryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRDatabaseQuery.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FIRDatabaseQuery() {}
    protected FIRDatabaseQuery(Handle h, long handle) { super(h, handle); }
    protected FIRDatabaseQuery(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "ref")
    public native FIRDatabaseReference getRef();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "observeEventType:withBlock:")
    public native @MachineSizedUInt long observeEvent(FIRDataEventType eventType, @Block VoidBlock1<FIRDataSnapshot> block);
    @Method(selector = "observeEventType:andPreviousSiblingKeyWithBlock:")
    public native @MachineSizedUInt long observeEvent(FIRDataEventType eventType, @Block VoidBlock2<FIRDataSnapshot, NSString> block);
    @Method(selector = "observeEventType:withBlock:withCancelBlock:")
    public native @MachineSizedUInt long observeEvent(FIRDataEventType eventType, @Block VoidBlock1<FIRDataSnapshot> block, @Block VoidBlock1<NSError> cancelBlock);
    @Method(selector = "observeEventType:andPreviousSiblingKeyWithBlock:withCancelBlock:")
    public native @MachineSizedUInt long observeEvent(FIRDataEventType eventType, @Block VoidBlock2<FIRDataSnapshot, NSString> block, @Block VoidBlock1<NSError> cancelBlock);
    @Method(selector = "getDataWithCompletionBlock:")
    public native void getData(@Block VoidBlock2<NSError, FIRDataSnapshot> block);
    @Method(selector = "observeSingleEventOfType:withBlock:")
    public native void observeSingleEvent(FIRDataEventType eventType, @Block VoidBlock1<FIRDataSnapshot> block);
    @Method(selector = "observeSingleEventOfType:andPreviousSiblingKeyWithBlock:")
    public native void observeSingleEvent(FIRDataEventType eventType, @Block VoidBlock2<FIRDataSnapshot, NSString> block);
    @Method(selector = "observeSingleEventOfType:withBlock:withCancelBlock:")
    public native void observeSingleEvent(FIRDataEventType eventType, @Block VoidBlock1<FIRDataSnapshot> block, @Block VoidBlock1<NSError> cancelBlock);
    @Method(selector = "observeSingleEventOfType:andPreviousSiblingKeyWithBlock:withCancelBlock:")
    public native void observeSingleEvent(FIRDataEventType eventType, @Block VoidBlock2<FIRDataSnapshot, NSString> block, @Block VoidBlock1<NSError> cancelBlock);
    @Method(selector = "removeObserverWithHandle:")
    public native void removeObserver(@MachineSizedUInt long handle);
    @Method(selector = "removeAllObservers")
    public native void removeAllObservers();
    @Method(selector = "keepSynced:")
    public native void keepSynced(boolean keepSynced);
    @Method(selector = "queryLimitedToFirst:")
    public native FIRDatabaseQuery limitToFirst(@MachineSizedUInt long limit);
    @Method(selector = "queryLimitedToLast:")
    public native FIRDatabaseQuery limitToLast(@MachineSizedUInt long limit);
    @Method(selector = "queryOrderedByChild:")
    public native FIRDatabaseQuery orderByChild(String key);
    @Method(selector = "queryOrderedByKey")
    public native FIRDatabaseQuery orderByKey();
    @Method(selector = "queryOrderedByValue")
    public native FIRDatabaseQuery orderByValue();
    @Method(selector = "queryOrderedByPriority")
    public native FIRDatabaseQuery orderByPriority();
    @Method(selector = "queryStartingAtValue:")
    public native FIRDatabaseQuery startAt(NSObject startValue);
    @Method(selector = "queryStartingAtValue:childKey:")
    public native FIRDatabaseQuery startAt(NSObject startValue, String childKey);
    @Method(selector = "queryStartingAfterValue:")
    public native FIRDatabaseQuery startAfter(NSObject startAfterValue);
    @Method(selector = "queryStartingAfterValue:childKey:")
    public native FIRDatabaseQuery startAfter(NSObject startAfterValue, String childKey);
    @Method(selector = "queryEndingAtValue:")
    public native FIRDatabaseQuery endAt(NSObject endValue);
    @Method(selector = "queryEndingAtValue:childKey:")
    public native FIRDatabaseQuery endAt(NSObject endValue, String childKey);
    @Method(selector = "queryEndingBeforeValue:")
    public native FIRDatabaseQuery endBefore(NSObject endValue);
    @Method(selector = "queryEndingBeforeValue:childKey:")
    public native FIRDatabaseQuery endBefore(NSObject endValue, String childKey);
    @Method(selector = "queryEqualToValue:")
    public native FIRDatabaseQuery equalTo(NSObject value);
    @Method(selector = "queryEqualToValue:childKey:")
    public native FIRDatabaseQuery equalTo(NSObject value, String childKey);
    /*</methods>*/
}
