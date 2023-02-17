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
package org.robovm.pods.helpshift;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/HelpshiftDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*/
    public static class EventDataKeys {
        public static final String visible = "visible";
        public static final String message = "message";
        public static final String latestIssueId = "latestIssueId";
        public static final String latestIssuePublishId = "latestIssuePublishId";
        public static final String isIssueOpen = "open";
        public static final String messageType = "type";
        public static final String messageTypeText = "text";
        public static final String messageTypeAttachment = "attachment";
        public static final String messageBody = "body";
        public static final String rating = "rating";
        public static final String additionalFeedback = "additionalFeedback";
        public static final String unreadMessageCount = "count";
        public static final String unreadMessageCountIsFromCache = "fromCache";
    }

    public static class EventNames {
        public static final String widgetToggle = "widgetToggle";
        public static final String conversationStart = "conversationStart";
        public static final String conversationStatus = "conversationStatus";
        public static final String messageAdd = "messageAdd";
        public static final String cSATSubmit = "csatSubmit";
        public static final String conversationEnd = "conversationEnd";
        public static final String conversationRejected = "conversationRejected";
        public static final String conversationResolved = "conversationResolved";
        public static final String conversationReopened = "conversationReopened";
        public static final String receivedUnreadMessageCount = "receivedUnreadMessageCount";
        public static final String sessionStarted = "helpshiftSessionStarted";
        public static final String sessionEnded = "helpshiftSessionEnded";
    }
    /*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "handleHelpshiftEvent:withData:")
    void handleHelpshiftEvent(String eventName, NSDictionary<?, ?> data);
    @Method(selector = "authenticationFailedForUserWithReason:")
    void authenticationFailed(HelpshiftAuthenticationFailureReason reason);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
