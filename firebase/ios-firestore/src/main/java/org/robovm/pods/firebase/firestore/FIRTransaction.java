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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRTransaction/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRTransactionPtr extends Ptr<FIRTransaction, FIRTransactionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRTransaction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIRTransaction() {}
    protected FIRTransaction(Handle h, long handle) { super(h, handle); }
    protected FIRTransaction(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setData:forDocument:")
    public native FIRTransaction set(NSDictionary<NSString, ?> data, FIRDocumentReference document);
    @Method(selector = "setData:forDocument:merge:")
    public native FIRTransaction set(NSDictionary<NSString, ?> data, FIRDocumentReference document, boolean merge);
    @Method(selector = "setData:forDocument:mergeFields:")
    public native FIRTransaction set(NSDictionary<NSString, ?> data, FIRDocumentReference document, NSArray<?> mergeFields);
    @Method(selector = "updateData:forDocument:")
    public native FIRTransaction update(NSDictionary<?, ?> fields, FIRDocumentReference document);
    @Method(selector = "deleteDocument:")
    public native FIRTransaction delete(FIRDocumentReference document);
    public FIRDocumentSnapshot get(FIRDocumentReference document) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       FIRDocumentSnapshot result = get(document, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "getDocument:error:")
    private native FIRDocumentSnapshot get(FIRDocumentReference document, NSError.NSErrorPtr error);
    /*</methods>*/
}
