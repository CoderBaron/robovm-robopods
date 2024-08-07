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
package org.robovm.pods.facebook.audience;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBAdExtraHint/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBAdExtraHintPtr extends Ptr<FBAdExtraHint, FBAdExtraHintPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBAdExtraHint.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBAdExtraHint() {}
    protected FBAdExtraHint(Handle h, long handle) { super(h, handle); }
    protected FBAdExtraHint(SkipInit skipInit) { super(skipInit); }
    /**
     * @deprecated Keywords are no longer used in Audience Network
     */
    @Deprecated
    @Method(selector = "initWithKeywords:")
    public FBAdExtraHint(NSArray<NSString> keywords) { super((SkipInit) null); initObject(init(keywords)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @deprecated Extra hints are no longer used in Audience Network
     */
    @Deprecated
    @Property(selector = "contentURL")
    public native String getContentURL();
    /**
     * @deprecated Extra hints are no longer used in Audience Network
     */
    @Deprecated
    @Property(selector = "setContentURL:")
    public native void setContentURL(String v);
    /**
     * @deprecated Extra hints are no longer used in Audience Network
     */
    @Deprecated
    @Property(selector = "extraData")
    public native String getExtraData();
    /**
     * @deprecated Extra hints are no longer used in Audience Network
     */
    @Deprecated
    @Property(selector = "setExtraData:")
    public native void setExtraData(String v);
    /**
     * @deprecated Extra hints are no longer used in Audience Network
     */
    @Deprecated
    @Property(selector = "mediationData")
    public native String getMediationData();
    /**
     * @deprecated Extra hints are no longer used in Audience Network
     */
    @Deprecated
    @Property(selector = "setMediationData:")
    public native void setMediationData(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @deprecated Keywords are no longer used in Audience Network
     */
    @Deprecated
    @Method(selector = "initWithKeywords:")
    protected native @Pointer long init(NSArray<NSString> keywords);
    /**
     * @deprecated Keywords are no longer used in Audience Network
     */
    @Deprecated
    @Method(selector = "addKeyword:")
    public native void addKeyword(FBAdExtraHintKeyword keyword);
    /**
     * @deprecated Keywords are no longer used in Audience Network
     */
    @Deprecated
    @Method(selector = "removeKeyword:")
    public native void removeKeyword(FBAdExtraHintKeyword keyword);
    /*</methods>*/
}
