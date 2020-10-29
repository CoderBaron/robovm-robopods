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
package org.robovm.pods.firebase.storage;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRStorageReference/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRStorageReferencePtr extends Ptr<FIRStorageReference, FIRStorageReferencePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRStorageReference.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FIRStorageReference() {}
    protected FIRStorageReference(Handle h, long handle) { super(h, handle); }
    protected FIRStorageReference(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "storage")
    public native FIRStorage getStorage();
    @Property(selector = "bucket")
    public native String getBucket();
    @Property(selector = "fullPath")
    public native String getFullPath();
    @Property(selector = "name")
    public native String getName();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "root")
    public native FIRStorageReference root();
    @Method(selector = "parent")
    public native FIRStorageReference parent();
    @Method(selector = "child:")
    public native FIRStorageReference child(String path);
    @Method(selector = "putData:")
    public native FIRStorageUploadTask putData(NSData uploadData);
    @Method(selector = "putData:metadata:")
    public native FIRStorageUploadTask putData(NSData uploadData, FIRStorageMetadata metadata);
    @Method(selector = "putData:metadata:completion:")
    public native FIRStorageUploadTask putData(NSData uploadData, FIRStorageMetadata metadata, @Block VoidBlock2<FIRStorageMetadata, NSError> completion);
    @Method(selector = "putFile:")
    public native FIRStorageUploadTask putFile(NSURL fileURL);
    @Method(selector = "putFile:metadata:")
    public native FIRStorageUploadTask putFile(NSURL fileURL, FIRStorageMetadata metadata);
    @Method(selector = "putFile:metadata:completion:")
    public native FIRStorageUploadTask putFile(NSURL fileURL, FIRStorageMetadata metadata, @Block VoidBlock2<FIRStorageMetadata, NSError> completion);
    @Method(selector = "dataWithMaxSize:completion:")
    public native FIRStorageDownloadTask data(long size, @Block VoidBlock2<NSData, NSError> completion);
    @Method(selector = "downloadURLWithCompletion:")
    public native void downloadURL(@Block VoidBlock2<NSURL, NSError> completion);
    @Method(selector = "writeToFile:")
    public native FIRStorageDownloadTask writeToFile(NSURL fileURL);
    @Method(selector = "writeToFile:completion:")
    public native FIRStorageDownloadTask writeToFile(NSURL fileURL, @Block VoidBlock2<NSURL, NSError> completion);
    @Method(selector = "listAllWithCompletion:")
    public native void listAll(@Block VoidBlock2<FIRStorageListResult, NSError> completion);
    @Method(selector = "listWithMaxResults:completion:")
    public native void list(long maxResults, @Block VoidBlock2<FIRStorageListResult, NSError> completion);
    @Method(selector = "listWithMaxResults:pageToken:completion:")
    public native void list(long maxResults, String pageToken, @Block VoidBlock2<FIRStorageListResult, NSError> completion);
    @Method(selector = "metadataWithCompletion:")
    public native void metadata(@Block VoidBlock2<FIRStorageMetadata, NSError> completion);
    @Method(selector = "updateMetadata:completion:")
    public native void updateMetadata(FIRStorageMetadata metadata, @Block VoidBlock2<FIRStorageMetadata, NSError> completion);
    @Method(selector = "deleteWithCompletion:")
    public native void deleteWithCompletion$(@Block VoidBlock1<NSError> completion);
    /*</methods>*/
}
