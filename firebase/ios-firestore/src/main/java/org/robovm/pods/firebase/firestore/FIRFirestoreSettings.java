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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRFirestoreSettings/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRFirestoreSettingsPtr extends Ptr<FIRFirestoreSettings, FIRFirestoreSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRFirestoreSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FIRFirestoreSettings() {}
    protected FIRFirestoreSettings(Handle h, long handle) { super(h, handle); }
    protected FIRFirestoreSettings(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "host")
    public native String getHost();
    @Property(selector = "setHost:")
    public native void setHost(String v);
    @Property(selector = "isSSLEnabled")
    public native boolean isSslEnabled();
    @Property(selector = "setSslEnabled:")
    public native void setSslEnabled(boolean v);
    @Property(selector = "dispatchQueue")
    public native DispatchQueue getDispatchQueue();
    @Property(selector = "setDispatchQueue:")
    public native void setDispatchQueue(DispatchQueue v);
    /**
     * @deprecated This field is deprecated. Use `cacheSettings` instead.
     */
    @Deprecated
    @Property(selector = "isPersistenceEnabled")
    public native boolean isPersistenceEnabled();
    /**
     * @deprecated This field is deprecated. Use `cacheSettings` instead.
     */
    @Deprecated
    @Property(selector = "setPersistenceEnabled:")
    public native void setPersistenceEnabled(boolean v);
    /**
     * @deprecated This field is deprecated. Use `cacheSettings` instead.
     */
    @Deprecated
    @Property(selector = "cacheSizeBytes")
    public native long getCacheSizeBytes();
    /**
     * @deprecated This field is deprecated. Use `cacheSettings` instead.
     */
    @Deprecated
    @Property(selector = "setCacheSizeBytes:")
    public native void setCacheSizeBytes(long v);
    @Property(selector = "cacheSettings")
    public native <T0 extends Object & FIRLocalCacheSettings & NSObjectProtocol> T0 getCacheSettings();
    @Property(selector = "setCacheSettings:")
    public native <T0 extends Object & FIRLocalCacheSettings & NSObjectProtocol> void setCacheSettings(T0 v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="kFIRFirestoreCacheSizeUnlimited", optional=true)
    public static native long FirestoreCacheSizeUnlimited();
    
    
    /*</methods>*/
}
