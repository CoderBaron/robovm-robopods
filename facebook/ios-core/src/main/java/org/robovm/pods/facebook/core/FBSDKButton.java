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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKButton/*</name>*/ 
    extends /*<extends>*/FBSDKImpressionLoggingButton/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKButtonPtr extends Ptr<FBSDKButton, FBSDKButtonPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKButton.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKButton() {}
    protected FBSDKButton(Handle h, long handle) { super(h, handle); }
    protected FBSDKButton(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public FBSDKButton(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public FBSDKButton(NSCoder coder) { super(coder); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithFrame:primaryAction:")
    public FBSDKButton(@ByVal CGRect frame, UIAction primaryAction) { super(frame, primaryAction); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isImplicitlyDisabled")
    public native boolean isImplicitlyDisabled();
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "checkImplicitlyDisabled")
    public native void checkImplicitlyDisabled();
    @Method(selector = "configureWithIcon:title:backgroundColor:highlightedColor:")
    public native void configure(FBSDKIcon icon, String title, UIColor backgroundColor, UIColor highlightedColor);
    @Method(selector = "configureWithIcon:title:backgroundColor:highlightedColor:selectedTitle:selectedIcon:selectedColor:selectedHighlightedColor:")
    public native void configure(FBSDKIcon icon, String title, UIColor backgroundColor, UIColor highlightedColor, String selectedTitle, FBSDKIcon selectedIcon, UIColor selectedColor, UIColor selectedHighlightedColor);
    @Method(selector = "defaultBackgroundColor")
    public native UIColor defaultBackgroundColor();
    @Method(selector = "sizeThatFits:title:")
    public native @ByVal CGSize getSizeThatFits(@ByVal CGSize size, String title);
    @Method(selector = "textSizeForText:font:constrainedSize:lineBreakMode:")
    public native @ByVal CGSize getTextSizeForText(String text, UIFont font, @ByVal CGSize constrainedSize, NSLineBreakMode lineBreakMode);
    @Method(selector = "logTapEventWithEventName:parameters:")
    public native void logTapEvent(String eventName, NSDictionary<NSString, ?> parameters);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "systemButtonWithImage:target:action:")
    public static native FBSDKButton getSystemButtonWithImage(UIImage image, NSObject target, Selector action);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "systemButtonWithPrimaryAction:")
    public static native FBSDKButton getSystemButtonWithPrimaryAction(UIAction primaryAction);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute attribute);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute semanticContentAttribute, UIUserInterfaceLayoutDirection layoutDirection);
    /*</methods>*/
}
