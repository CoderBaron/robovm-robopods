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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRDatabaseReference/*</name>*/ 
    extends /*<extends>*/FIRDatabaseQuery/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRDatabaseReferencePtr extends Ptr<FIRDatabaseReference, FIRDatabaseReferencePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRDatabaseReference.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FIRDatabaseReference() {}
    protected FIRDatabaseReference(Handle h, long handle) { super(h, handle); }
    protected FIRDatabaseReference(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "parent")
    public native FIRDatabaseReference getParent();
    @Property(selector = "root")
    public native FIRDatabaseReference getRoot();
    @Property(selector = "key")
    public native String getKey();
    @Property(selector = "URL")
    public native String getURL();
    @Property(selector = "database")
    public native FIRDatabase getDatabase();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "child:")
    public native FIRDatabaseReference child(String pathString);
    @Method(selector = "childByAutoId")
    public native FIRDatabaseReference push();
    @Method(selector = "setValue:")
    public native void setValue(NSObject value);
    @Method(selector = "setValue:withCompletionBlock:")
    public native void setValue(NSObject value, @Block VoidBlock2<NSError, FIRDatabaseReference> block);
    @Method(selector = "setValue:andPriority:")
    public native void setValue(NSObject value, NSObject priority);
    @Method(selector = "setValue:andPriority:withCompletionBlock:")
    public native void setValue(NSObject value, NSObject priority, @Block VoidBlock2<NSError, FIRDatabaseReference> block);
    @Method(selector = "removeValue")
    public native void removeValue();
    @Method(selector = "removeValueWithCompletionBlock:")
    public native void removeValue(@Block VoidBlock2<NSError, FIRDatabaseReference> block);
    @Method(selector = "setPriority:")
    public native void setPriority(NSObject priority);
    @Method(selector = "setPriority:withCompletionBlock:")
    public native void setPriority(NSObject priority, @Block VoidBlock2<NSError, FIRDatabaseReference> block);
    @Method(selector = "updateChildValues:")
    public native void updateChildValues(NSDictionary<?, ?> values);
    @Method(selector = "updateChildValues:withCompletionBlock:")
    public native void updateChildren(NSDictionary<?, ?> values, @Block VoidBlock2<NSError, FIRDatabaseReference> block);
    @Method(selector = "observeEventType:withBlock:")
    public native @MachineSizedUInt long observeEvent(FIRDataEventType eventType, @Block VoidBlock1<FIRDataSnapshot> block);
    @Method(selector = "observeEventType:andPreviousSiblingKeyWithBlock:")
    public native @MachineSizedUInt long observeEvent(FIRDataEventType eventType, @Block VoidBlock2<FIRDataSnapshot, NSString> block);
    @Method(selector = "observeEventType:withBlock:withCancelBlock:")
    public native @MachineSizedUInt long observeEvent(FIRDataEventType eventType, @Block VoidBlock1<FIRDataSnapshot> block, @Block VoidBlock1<NSError> cancelBlock);
    @Method(selector = "observeEventType:andPreviousSiblingKeyWithBlock:withCancelBlock:")
    public native @MachineSizedUInt long observeEvent(FIRDataEventType eventType, @Block VoidBlock2<FIRDataSnapshot, NSString> block, @Block VoidBlock1<NSError> cancelBlock);
    @Method(selector = "observeSingleEventOfType:withBlock:")
    public native void observeSingleEvent(FIRDataEventType eventType, @Block VoidBlock1<FIRDataSnapshot> block);
    @Method(selector = "observeSingleEventOfType:andPreviousSiblingKeyWithBlock:")
    public native void observeSingleEvent(FIRDataEventType eventType, @Block VoidBlock2<FIRDataSnapshot, NSString> block);
    @Method(selector = "observeSingleEventOfType:withBlock:withCancelBlock:")
    public native void observeSingleEvent(FIRDataEventType eventType, @Block VoidBlock1<FIRDataSnapshot> block, @Block VoidBlock1<NSError> cancelBlock);
    @Method(selector = "observeSingleEventOfType:andPreviousSiblingKeyWithBlock:withCancelBlock:")
    public native void observeSingleEvent(FIRDataEventType eventType, @Block VoidBlock2<FIRDataSnapshot, NSString> block, @Block VoidBlock1<NSError> cancelBlock);
    @Method(selector = "getDataWithCompletionBlock:")
    public native void getData(@Block VoidBlock2<NSError, FIRDataSnapshot> block);
    @Method(selector = "removeObserverWithHandle:")
    public native void removeObserver(@MachineSizedUInt long handle);
    @Method(selector = "keepSynced:")
    public native void keepSynced(boolean keepSynced);
    @Method(selector = "removeAllObservers")
    public native void removeAllObservers();
    @Method(selector = "queryLimitedToFirst:")
    public native FIRDatabaseQuery limitToFirst(@MachineSizedUInt long limit);
    @Method(selector = "queryLimitedToLast:")
    public native FIRDatabaseQuery limitToLast(@MachineSizedUInt long limit);
    @Method(selector = "queryOrderedByChild:")
    public native FIRDatabaseQuery orderByChild(String key);
    @Method(selector = "queryOrderedByKey")
    public native FIRDatabaseQuery orderByKey();
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
    @Method(selector = "queryEqualToValue:")
    public native FIRDatabaseQuery equalTo(NSObject value);
    @Method(selector = "queryEqualToValue:childKey:")
    public native FIRDatabaseQuery equalTo(NSObject value, String childKey);
    @Method(selector = "onDisconnectSetValue:")
    public native void onDisconnectSetValue(NSObject value);
    @Method(selector = "onDisconnectSetValue:withCompletionBlock:")
    public native void onDisconnectSetValue(NSObject value, @Block VoidBlock2<NSError, FIRDatabaseReference> block);
    @Method(selector = "onDisconnectSetValue:andPriority:")
    public native void onDisconnectSetValue(NSObject value, NSObject priority);
    @Method(selector = "onDisconnectSetValue:andPriority:withCompletionBlock:")
    public native void onDisconnectSetValue(NSObject value, NSObject priority, @Block VoidBlock2<NSError, FIRDatabaseReference> block);
    @Method(selector = "onDisconnectRemoveValue")
    public native void onDisconnectRemoveValue();
    @Method(selector = "onDisconnectRemoveValueWithCompletionBlock:")
    public native void onDisconnectRemoveValue(@Block VoidBlock2<NSError, FIRDatabaseReference> block);
    @Method(selector = "onDisconnectUpdateChildValues:")
    public native void onDisconnectUpdateChildValues(NSDictionary<?, ?> values);
    @Method(selector = "onDisconnectUpdateChildValues:withCompletionBlock:")
    public native void onDisconnectUpdateChildren(NSDictionary<?, ?> values, @Block VoidBlock2<NSError, FIRDatabaseReference> block);
    @Method(selector = "cancelDisconnectOperations")
    public native void cancelDisconnectOperations();
    @Method(selector = "cancelDisconnectOperationsWithCompletionBlock:")
    public native void cancelDisconnectOperations(@Block VoidBlock2<NSError, FIRDatabaseReference> block);
    @Method(selector = "runTransactionBlock:")
    public native void runTransactionBlock(@Block Block1<FIRMutableData, FIRTransactionResult> block);
    @Method(selector = "runTransactionBlock:andCompletionBlock:")
    public native void runTransactionBlock(@Block Block1<FIRMutableData, FIRTransactionResult> block, @Block VoidBlock3<NSError, Boolean, FIRDataSnapshot> completionBlock);
    @Method(selector = "runTransactionBlock:andCompletionBlock:withLocalEvents:")
    public native void runTransactionBlock(@Block Block1<FIRMutableData, FIRTransactionResult> block, @Block VoidBlock3<NSError, Boolean, FIRDataSnapshot> completionBlock, boolean localEvents);
    @Method(selector = "description")
    public native String description();
    @Method(selector = "goOffline")
    public static native void goOffline();
    @Method(selector = "goOnline")
    public static native void goOnline();
    /*</methods>*/
}
