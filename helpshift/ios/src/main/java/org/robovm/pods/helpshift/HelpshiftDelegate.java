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
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Library(Library.INTERNAL)
    public static class EventDataKeys {
        static { Bro.bind(EventDataKeys.class); }

        @GlobalValue(symbol="HelpshiftEventDataVisible", optional=true)
        public static native NSString visible();
        @GlobalValue(symbol="HelpshiftEventDataMessage", optional=true)
        public static native NSString message();
        @GlobalValue(symbol="HelpshiftEventDataLatestIssueId", optional=true)
        public static native NSString latestIssueId();
        @GlobalValue(symbol="HelpshiftEventDataLatestIssuePublishId", optional=true)
        public static native NSString latestIssuePublishId();
        @GlobalValue(symbol="HelpshiftEventDataIsIssueOpen", optional=true)
        public static native NSString isIssueOpen();
        @GlobalValue(symbol="HelpshiftEventDataMessageType", optional=true)
        public static native NSString messageType();
        @GlobalValue(symbol="HelpshiftEventDataMessageTypeText", optional=true)
        public static native NSString messageTypeText();
        @GlobalValue(symbol="HelpshiftEventDataMessageTypeAttachment", optional=true)
        public static native NSString messageTypeAttachment();
        @GlobalValue(symbol="HelpshiftEventDataMessageBody", optional=true)
        public static native NSString messageBody();
        @GlobalValue(symbol="HelpshiftEventDataRating", optional=true)
        public static native NSString rating();
        @GlobalValue(symbol="HelpshiftEventDataAdditionalFeedback", optional=true)
        public static native NSString additionalFeedback();
        @GlobalValue(symbol="HelpshiftEventDataUnreadMessageCount", optional=true)
        public static native NSString unreadMessageCount();
        @GlobalValue(symbol="HelpshiftEventDataUnreadMessageCountIsFromCache", optional=true)
        public static native NSString unreadMessageCountIsFromCache();
        @GlobalValue(symbol="HelpshiftEventDataActionType", optional=true)
        public static native NSString actionType();
        @GlobalValue(symbol="HelpshiftEventDataActionTypeCall", optional=true)
        public static native NSString actionTypeCall();
        @GlobalValue(symbol="HelpshiftEventDataActionTypeLink", optional=true)
        public static native NSString actionTypeLink();
        @GlobalValue(symbol="HelpshiftEventDataActionData", optional=true)
        public static native NSString actionData();
        @GlobalValue(symbol="HelpshiftEventDataPublishID", optional=true)
        public static native NSString publishID();
        @GlobalValue(symbol="HelpshiftEventDataCreatedTime", optional=true)
        public static native NSString createdTime();
        @GlobalValue(symbol="HelpshiftEventDataAttachments", optional=true)
        public static native NSString attachments();
        @GlobalValue(symbol="HelpshiftEventDataURL", optional=true)
        public static native NSString URL();
        @GlobalValue(symbol="HelpshiftEventDataContentType", optional=true)
        public static native NSString contentType();
        @GlobalValue(symbol="HelpshiftEventDataFileName", optional=true)
        public static native NSString fileName();
        @GlobalValue(symbol="HelpshiftEventDataSize", optional=true)
        public static native NSString size();
        @GlobalValue(symbol="HelpshiftEventDataMessageTypeAppReviewRequest", optional=true)
        public static native NSString messageTypeAppReviewRequest();
        @GlobalValue(symbol="HelpshiftEventDataMessageTypeScreenshotRequest", optional=true)
        public static native NSString messageTypeScreenshotRequest();
    }

    @Library(Library.INTERNAL)
    public static class EventNames {
        static { Bro.bind(EventNames.class); }

        @GlobalValue(symbol="HelpshiftEventNameWidgetToggle", optional=true)
        public static native NSString widgetToggle();
        @GlobalValue(symbol="HelpshiftEventNameConversationStart", optional=true)
        public static native NSString conversationStart();
        @GlobalValue(symbol="HelpshiftEventNameConversationStatus", optional=true)
        public static native NSString conversationStatus();
        @GlobalValue(symbol="HelpshiftEventNameMessageAdd", optional=true)
        public static native NSString messageAdd();
        @GlobalValue(symbol="HelpshiftEventNameCSATSubmit", optional=true)
        public static native NSString CSATSubmit();
        @GlobalValue(symbol="HelpshiftEventNameConversationEnd", optional=true)
        public static native NSString conversationEnd();
        @GlobalValue(symbol="HelpshiftEventNameConversationRejected", optional=true)
        public static native NSString conversationRejected();
        @GlobalValue(symbol="HelpshiftEventNameConversationResolved", optional=true)
        public static native NSString conversationResolved();
        @GlobalValue(symbol="HelpshiftEventNameConversationReopened", optional=true)
        public static native NSString conversationReopened();
        @GlobalValue(symbol="HelpshiftEventNameReceivedUnreadMessageCount", optional=true)
        public static native NSString receivedUnreadMessageCount();
        @GlobalValue(symbol="HelpshiftEventNameSessionStarted", optional=true)
        public static native NSString sessionStarted();
        @GlobalValue(symbol="HelpshiftEventNameSessionEnded", optional=true)
        public static native NSString sessionEnded();
        @GlobalValue(symbol="HelpshiftEventNameUserClickOnAction", optional=true)
        public static native NSString userClickOnAction();
        @GlobalValue(symbol="HelpshiftEventNameAgentMessageReceived", optional=true)
        public static native NSString agentMessageReceived();
    }
    
    @Method(selector = "handleHelpshiftEvent:withData:")
    void handleHelpshiftEvent(String eventName, NSDictionary<?, ?> data);
    @Method(selector = "authenticationFailedForUserWithReason:")
    void authenticationFailed(HelpshiftAuthenticationFailureReason reason);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
