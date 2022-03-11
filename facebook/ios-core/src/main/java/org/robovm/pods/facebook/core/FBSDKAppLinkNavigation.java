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
package org.robovm.pods.facebook.core;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.webkit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKAppLinkNavigation/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKAppLinkNavigationPtr extends Ptr<FBSDKAppLinkNavigation, FBSDKAppLinkNavigationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKAppLinkNavigation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKAppLinkNavigation() {}
    protected FBSDKAppLinkNavigation(Handle h, long handle) { super(h, handle); }
    protected FBSDKAppLinkNavigation(SkipInit skipInit) { super(skipInit); }
    public FBSDKAppLinkNavigation(FBSDKAppLink appLink, NSDictionary<NSString, ?> extras, NSDictionary<NSString, ?> appLinkData, FBSDKSettingsProtocol settings) { super((Handle) null, create(appLink, extras, appLinkData, settings)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "defaultResolver")
    public static native FBSDKAppLinkResolving getDefaultResolver();
    @Property(selector = "setDefaultResolver:")
    public static native void setDefaultResolver(FBSDKAppLinkResolving v);
    @Property(selector = "extras")
    public native NSDictionary<NSString, ?> getExtras();
    @Property(selector = "appLinkData")
    public native NSDictionary<NSString, ?> getAppLinkData();
    @Property(selector = "appLink")
    public native FBSDKAppLink getAppLink();
    @Property(selector = "navigationType")
    public native FBSDKAppLinkNavigationType getNavigationType();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "navigate:")
    public native FBSDKAppLinkNavigationType navigate(NSError.NSErrorPtr error);
    @Method(selector = "navigationWithAppLink:extras:appLinkData:settings:")
    protected static native @Pointer long create(FBSDKAppLink appLink, NSDictionary<NSString, ?> extras, NSDictionary<NSString, ?> appLinkData, FBSDKSettingsProtocol settings);
    @Method(selector = "callbackAppLinkDataForAppWithName:url:")
    public static native NSDictionary<?, ?> getCallbackAppLinkData(String appName, String url);
    @Method(selector = "resolveAppLink:handler:")
    public static native void resolveAppLink(NSURL destination, @Block VoidBlock2<FBSDKAppLink, NSError> handler);
    @Method(selector = "resolveAppLink:resolver:handler:")
    public static native void resolveAppLink(NSURL destination, FBSDKAppLinkResolving resolver, @Block VoidBlock2<FBSDKAppLink, NSError> handler);
    public static FBSDKAppLinkNavigationType navigateToAppLink(FBSDKAppLink link) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       FBSDKAppLinkNavigationType result = navigateToAppLink(link, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "navigateToAppLink:error:")
    private static native FBSDKAppLinkNavigationType navigateToAppLink(FBSDKAppLink link, NSError.NSErrorPtr error);
    @Method(selector = "navigationTypeForLink:")
    public static native FBSDKAppLinkNavigationType navigationTypeForLink(FBSDKAppLink link);
    @Method(selector = "navigateToURL:handler:")
    public static native void navigateToURL(NSURL destination, @Block VoidBlock2<FBSDKAppLinkNavigationType, NSError> handler);
    @Method(selector = "navigateToURL:resolver:handler:")
    public static native void navigateToURL(NSURL destination, FBSDKAppLinkResolving resolver, @Block VoidBlock2<FBSDKAppLinkNavigationType, NSError> handler);
    /*</methods>*/
}
