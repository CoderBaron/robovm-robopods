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
package org.robovm.pods.ironsource;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ISConcurrentMutableDictionary/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ISConcurrentMutableDictionaryPtr extends Ptr<ISConcurrentMutableDictionary, ISConcurrentMutableDictionaryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ISConcurrentMutableDictionary.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ISConcurrentMutableDictionary() {}
    protected ISConcurrentMutableDictionary(Handle h, long handle) { super(h, handle); }
    protected ISConcurrentMutableDictionary(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initCommon")
    public static  ISConcurrentMutableDictionary createCommon() {
       ISConcurrentMutableDictionary res = new ISConcurrentMutableDictionary((SkipInit) null);
       res.initObject(res.initCommon());
       return res;
    }
    @Method(selector = "initWithCapacity:")
    public ISConcurrentMutableDictionary(@MachineSizedUInt long numItems) { super((SkipInit) null); initObject(init(numItems)); }
    @Method(selector = "initWithContentsOfFile:")
    public ISConcurrentMutableDictionary(String path) { super((SkipInit) null); initObject(init(path)); }
    @Method(selector = "initWithContentsOfURL:")
    public ISConcurrentMutableDictionary(NSURL url) { super((SkipInit) null); initObject(init(url)); }
    @Method(selector = "initWithCoder:")
    public ISConcurrentMutableDictionary(NSCoder aDecoder) { super((SkipInit) null); initObject(init(aDecoder)); }
    @Method(selector = "initWithDictionary:")
    public ISConcurrentMutableDictionary(NSMutableDictionary<?, ?> dictionary) { super((SkipInit) null); initObject(init(dictionary)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initCommon")
    protected native @Pointer long initCommon();
    @Method(selector = "initWithCapacity:")
    protected native @Pointer long init(@MachineSizedUInt long numItems);
    @Method(selector = "initWithContentsOfFile:")
    protected native @Pointer long init(String path);
    @Method(selector = "initWithContentsOfURL:")
    protected native @Pointer long init(NSURL url);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder aDecoder);
    @Method(selector = "initWithDictionary:")
    protected native @Pointer long init(NSMutableDictionary<?, ?> dictionary);
    @Method(selector = "count")
    public native @MachineSizedUInt long count();
    @Method(selector = "objectForKey:")
    public native NSObject objectForKey(NSObject key);
    @Method(selector = "keyEnumerator")
    public native NSEnumerator<?> keyEnumerator();
    @Method(selector = "setObject:forKey:")
    public native void setObject(NSObject object, NSObject key);
    @Method(selector = "setDictionary:")
    public native void setDictionary(NSDictionary<?, ?> otherDictionary);
    @Method(selector = "addEntriesFromDictionary:")
    public native void addEntriesFromDictionary(NSDictionary<?, ?> otherDictionary);
    @Method(selector = "removeObjectForKey:")
    public native void removeObjectForKey(NSObject key);
    @Method(selector = "removeObjectsForKeys:")
    public native void removeObjectsForKeys(NSArray<?> keyArray);
    @Method(selector = "removeAllObjects")
    public native void removeAllObjects();
    @Method(selector = "allKeys")
    public native NSArray<?> allKeys();
    @Method(selector = "allValues")
    public native NSArray<?> allValues();
    @Method(selector = "allData")
    public native NSDictionary<?, ?> allData();
    @Method(selector = "hasObjectForKey:")
    public native boolean hasObjectForKey(NSObject key);
    @Method(selector = "dictionary")
    public static native ISConcurrentMutableDictionary dictionary();
    /*</methods>*/
}
