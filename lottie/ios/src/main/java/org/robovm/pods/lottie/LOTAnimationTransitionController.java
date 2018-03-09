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
package org.robovm.pods.lottie;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LOTAnimationTransitionController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIViewControllerAnimatedTransitioning/*</implements>*/ {

    /*<ptr>*/public static class LOTAnimationTransitionControllerPtr extends Ptr<LOTAnimationTransitionController, LOTAnimationTransitionControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LOTAnimationTransitionController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public LOTAnimationTransitionController() {}
    protected LOTAnimationTransitionController(Handle h, long handle) { super(h, handle); }
    protected LOTAnimationTransitionController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAnimationNamed:fromLayerNamed:toLayerNamed:applyAnimationTransform:")
    public LOTAnimationTransitionController(String animation, String fromLayer, String toLayer, boolean applyAnimationTransform) { super((SkipInit) null); initObject(init(animation, fromLayer, toLayer, applyAnimationTransform)); }
    @Method(selector = "initWithAnimationNamed:fromLayerNamed:toLayerNamed:applyAnimationTransform:inBundle:")
    public LOTAnimationTransitionController(String animation, String fromLayer, String toLayer, boolean applyAnimationTransform, NSBundle bundle) { super((SkipInit) null); initObject(init(animation, fromLayer, toLayer, applyAnimationTransform, bundle)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAnimationNamed:fromLayerNamed:toLayerNamed:applyAnimationTransform:")
    protected native @Pointer long init(String animation, String fromLayer, String toLayer, boolean applyAnimationTransform);
    @Method(selector = "initWithAnimationNamed:fromLayerNamed:toLayerNamed:applyAnimationTransform:inBundle:")
    protected native @Pointer long init(String animation, String fromLayer, String toLayer, boolean applyAnimationTransform, NSBundle bundle);
    @Method(selector = "transitionDuration:")
    public native double getTransitionDuration(UIViewControllerContextTransitioning transitionContext);
    @Method(selector = "animateTransition:")
    public native void animateTransition(UIViewControllerContextTransitioning transitionContext);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "interruptibleAnimatorForTransition:")
    public native UIViewImplicitlyAnimating getInterruptibleAnimator(UIViewControllerContextTransitioning transitionContext);
    @Method(selector = "animationEnded:")
    public native void animationEnded(boolean transitionCompleted);
    /*</methods>*/
}
