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
package org.robovm.pods.facebook.gamingservices;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.pods.facebook.corebasics.*;
import org.robovm.pods.facebook.core.*;
import org.robovm.pods.facebook.share.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKChooseContextContent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKValidatable/*</implements>*/ {

    /*<ptr>*/public static class FBSDKChooseContextContentPtr extends Ptr<FBSDKChooseContextContent, FBSDKChooseContextContentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKChooseContextContent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKChooseContextContent() {}
    protected FBSDKChooseContextContent(Handle h, long handle) { super(h, handle); }
    protected FBSDKChooseContextContent(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "filter")
    public native FBSDKChooseContextFilter getFilter();
    @Property(selector = "setFilter:")
    public native void setFilter(FBSDKChooseContextFilter v);
    @Property(selector = "maxParticipants")
    public native @MachineSizedSInt long getMaxParticipants();
    @Property(selector = "setMaxParticipants:")
    public native void setMaxParticipants(@MachineSizedSInt long v);
    @Property(selector = "minParticipants")
    public native @MachineSizedSInt long getMinParticipants();
    @Property(selector = "setMinParticipants:")
    public native void setMinParticipants(@MachineSizedSInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    public boolean validate() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = validate(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "validateAndReturnError:")
    public native boolean validate(NSError.NSErrorPtr error);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    @Method(selector = "filtersNameForFilters:")
    public static native String getFiltersName(FBSDKChooseContextFilter filter);
    /*</methods>*/
}
