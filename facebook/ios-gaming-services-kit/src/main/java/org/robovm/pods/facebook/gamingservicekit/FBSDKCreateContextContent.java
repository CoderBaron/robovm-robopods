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
package org.robovm.pods.facebook.gamingservicekit;

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
import org.robovm.apple.uikit.*;
import org.robovm.pods.facebook.corebasics.*;
import org.robovm.pods.facebook.core.*;
import org.robovm.pods.facebook.share.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKCreateContextContent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKValidatable/*</implements>*/ {

    /*<ptr>*/public static class FBSDKCreateContextContentPtr extends Ptr<FBSDKCreateContextContent, FBSDKCreateContextContentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKCreateContextContent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKCreateContextContent() {}
    protected FBSDKCreateContextContent(Handle h, long handle) { super(h, handle); }
    protected FBSDKCreateContextContent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initDialogContentWithPlayerID:")
    public FBSDKCreateContextContent(String playerID) { super((SkipInit) null); initObject(init(playerID)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "playerID")
    public native String getPlayerID();
    @Property(selector = "setPlayerID:")
    public native void setPlayerID(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initDialogContentWithPlayerID:")
    protected native @Pointer long init(String playerID);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    public boolean validate() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = validate(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "validateAndReturnError:")
    public native boolean validate(NSError.NSErrorPtr error);
    /*</methods>*/
}
