/*
 * Copyright (c) 2015, RoboVM AB. All Rights Reserved.
 *
 * Redistribution and use is subject to the RoboVM Software License terms
 * available at (http://robovm.com)
 *
 * This notice and attribution to RoboVM AB may not be removed.
 */
package org.robovm.pods.fabric.twitter;

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
import org.robovm.apple.accounts.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.mediaplayer.*;
import org.robovm.apple.social.*;
import org.robovm.apple.uikit.*;
import org.robovm.pods.fabric.twitter.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TWTRUser/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding, TWTRJSONConvertible/*</implements>*/ {

    /*<ptr>*/public static class TWTRUserPtr extends Ptr<TWTRUser, TWTRUserPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TWTRUser.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TWTRUser() {}
    protected TWTRUser(Handle h, long handle) { super(h, handle); }
    protected TWTRUser(SkipInit skipInit) { super(skipInit); }
    public TWTRUser(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    public TWTRUser(NSDictionary<?, ?> jsonDictionary) { super((SkipInit) null); initObject(init(jsonDictionary)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "userID")
    public native String getUserID();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "screenName")
    public native String getScreenName();
    @Property(selector = "isVerified")
    public native boolean isVerified();
    @Property(selector = "isProtected")
    public native boolean isProtected();
    @Property(selector = "profileImageURL")
    public native String getProfileImageURL();
    @Property(selector = "profileImageMiniURL")
    public native String getProfileImageMiniURL();
    @Property(selector = "profileImageLargeURL")
    public native String getProfileImageLargeURL();
    @Property(selector = "formattedScreenName")
    public native String getFormattedScreenName();
    @Property(selector = "profileURL")
    public native NSURL getProfileURL();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    @Method(selector = "initWithJSONDictionary:")
    protected native @Pointer long init(NSDictionary<?, ?> jsonDictionary);
    /*</methods>*/
}
