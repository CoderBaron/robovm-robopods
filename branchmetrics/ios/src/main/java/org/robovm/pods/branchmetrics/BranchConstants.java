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
package org.robovm.pods.branchmetrics;

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
import org.robovm.apple.corespotlight.*;
import org.robovm.apple.uniformtypeid.*;
import org.robovm.apple.linkpresentation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BranchConstants/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(BranchConstants.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_DEVELOPER_IDENTITY", optional=true)
    public static native String getRequestKeyDeveloperIdentity();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_RANDOMIZED_BUNDLE_TOKEN", optional=true)
    public static native String getRequestKeyRandomizedBundleToken();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_RANDOMIZED_DEVICE_TOKEN", optional=true)
    public static native String getRequestKeyRandomizedDeviceToken();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_SESSION_ID", optional=true)
    public static native String getRequestKeySessionId();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_ACTION", optional=true)
    public static native String getRequestKeyAction();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_STATE", optional=true)
    public static native String getRequestKeyState();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_BUCKET", optional=true)
    public static native String getRequestKeyBucket();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_AMOUNT", optional=true)
    public static native String getRequestKeyAmount();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_LENGTH", optional=true)
    public static native String getRequestKeyLength();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_DIRECTION", optional=true)
    public static native String getRequestKeyDirection();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_STARTING_TRANSACTION_ID", optional=true)
    public static native String getRequestKeyStartingTransactionId();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_REFERRAL_USAGE_TYPE", optional=true)
    public static native String getRequestKeyReferralUsageType();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_REFERRAL_REWARD_LOCATION", optional=true)
    public static native String getRequestKeyReferralRewardLocation();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_REFERRAL_TYPE", optional=true)
    public static native String getRequestKeyReferralType();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_REFERRAL_CREATION_SOURCE", optional=true)
    public static native String getRequestKeyReferralCreationSource();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_REFERRAL_PREFIX", optional=true)
    public static native String getRequestKeyReferralPrefix();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_REFERRAL_EXPIRATION", optional=true)
    public static native String getRequestKeyReferralExpiration();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_URL_SOURCE", optional=true)
    public static native String getRequestKeyUrlSource();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_URL_TAGS", optional=true)
    public static native String getRequestKeyUrlTags();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_URL_LINK_TYPE", optional=true)
    public static native String getRequestKeyUrlLinkType();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_URL_ALIAS", optional=true)
    public static native String getRequestKeyUrlAlias();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_URL_CHANNEL", optional=true)
    public static native String getRequestKeyUrlChannel();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_URL_FEATURE", optional=true)
    public static native String getRequestKeyUrlFeature();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_URL_STAGE", optional=true)
    public static native String getRequestKeyUrlStage();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_URL_CAMPAIGN", optional=true)
    public static native String getRequestKeyUrlCampaign();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_URL_DURATION", optional=true)
    public static native String getRequestKeyUrlDuration();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_URL_DATA", optional=true)
    public static native String getRequestKeyUrlData();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_URL_IGNORE_UA_STRING", optional=true)
    public static native String getRequestKeyUrlIgnoreUaString();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_HARDWARE_ID", optional=true)
    public static native String getRequestKeyHardwareId();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_HARDWARE_ID_TYPE", optional=true)
    public static native String getRequestKeyHardwareIdType();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_IS_HARDWARE_ID_REAL", optional=true)
    public static native String getRequestKeyIsHardwareIdReal();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_IOS_VENDOR_ID", optional=true)
    public static native String getRequestKeyIosVendorId();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_AD_TRACKING_ENABLED", optional=true)
    public static native String getRequestKeyAdTrackingEnabled();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_OPTED_IN_STATUS", optional=true)
    public static native String getRequestKeyOptedInStatus();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_FIRST_OPT_IN", optional=true)
    public static native String getRequestKeyFirstOptIn();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_DEBUG", optional=true)
    public static native String getRequestKeyDebug();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_BUNDLE_ID", optional=true)
    public static native String getRequestKeyBundleId();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_TEAM_ID", optional=true)
    public static native String getRequestKeyTeamId();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_APP_VERSION", optional=true)
    public static native String getRequestKeyAppVersion();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_OS", optional=true)
    public static native String getRequestKeyOs();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_OS_VERSION", optional=true)
    public static native String getRequestKeyOsVersion();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_URI_SCHEME", optional=true)
    public static native String getRequestKeyUriScheme();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_CHECKED_FACEBOOK_APPLINKS", optional=true)
    public static native String getRequestKeyCheckedFacebookApplinks();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_CHECKED_APPLE_AD_ATTRIBUTION", optional=true)
    public static native String getRequestKeyCheckedAppleAdAttribution();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_LINK_IDENTIFIER", optional=true)
    public static native String getRequestKeyLinkIdentifier();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_SPOTLIGHT_IDENTIFIER", optional=true)
    public static native String getRequestKeySpotlightIdentifier();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_UNIVERSAL_LINK_URL", optional=true)
    public static native String getRequestKeyUniversalLinkUrl();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_LOCAL_URL", optional=true)
    public static native String getRequestKeyLocalUrl();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_INITIAL_REFERRER", optional=true)
    public static native String getRequestKeyInitialReferrer();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_BRAND", optional=true)
    public static native String getRequestKeyBrand();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_MODEL", optional=true)
    public static native String getRequestKeyModel();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_SCREEN_WIDTH", optional=true)
    public static native String getRequestKeyScreenWidth();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_SCREEN_HEIGHT", optional=true)
    public static native String getRequestKeyScreenHeight();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_IS_SIMULATOR", optional=true)
    public static native String getRequestKeyIsSimulator();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_LOG", optional=true)
    public static native String getRequestKeyLog();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_EXTERNAL_INTENT_URI", optional=true)
    public static native String getRequestKeyExternalIntentUri();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_INSTRUMENTATION", optional=true)
    public static native String getRequestKeyInstrumentation();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_APPLE_RECEIPT", optional=true)
    public static native String getRequestKeyAppleReceipt();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_APPLE_TESTFLIGHT", optional=true)
    public static native String getRequestKeyAppleTestflight();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_APP_CLIP_BUNDLE_ID", optional=true)
    public static native String getRequestKeyAppClipBundleId();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_LATEST_APP_CLIP_INSTALL_TIME", optional=true)
    public static native String getRequestKeyLatestAppClipInstallTime();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_APP_CLIP_RANDOMIZED_DEVICE_TOKEN", optional=true)
    public static native String getRequestKeyAppClipRandomizedDeviceToken();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_APP_CLIP_RANDOMIZED_BUNDLE_TOKEN", optional=true)
    public static native String getRequestKeyAppClipRandomizedBundleToken();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_PARTNER_PARAMETERS", optional=true)
    public static native String getRequestKeyPartnerParameters();
    @GlobalValue(symbol="BRANCH_REQUEST_METADATA_KEY_SCANTIME_WINDOW", optional=true)
    public static native String getRequestMetadataKeyScantimeWindow();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_REFERRER_GBRAID", optional=true)
    public static native String getRequestKeyReferrerGbraid();
    @GlobalValue(symbol="BRANCH_REQUEST_ENDPOINT_SET_IDENTITY", optional=true)
    public static native String getRequestEndpointSetIdentity();
    @GlobalValue(symbol="BRANCH_REQUEST_ENDPOINT_APP_LINK_SETTINGS", optional=true)
    public static native String getRequestEndpointAppLinkSettings();
    @GlobalValue(symbol="BRANCH_REQUEST_ENDPOINT_LOGOUT", optional=true)
    public static native String getRequestEndpointLogout();
    @GlobalValue(symbol="BRANCH_REQUEST_ENDPOINT_USER_COMPLETED_ACTION", optional=true)
    public static native String getRequestEndpointUserCompletedAction();
    @GlobalValue(symbol="BRANCH_REQUEST_ENDPOINT_GET_SHORT_URL", optional=true)
    public static native String getRequestEndpointGetShortUrl();
    @GlobalValue(symbol="BRANCH_REQUEST_ENDPOINT_CLOSE", optional=true)
    public static native String getRequestEndpointClose();
    @GlobalValue(symbol="BRANCH_REQUEST_ENDPOINT_OPEN", optional=true)
    public static native String getRequestEndpointOpen();
    @GlobalValue(symbol="BRANCH_REQUEST_ENDPOINT_INSTALL", optional=true)
    public static native String getRequestEndpointInstall();
    @GlobalValue(symbol="BRANCH_REQUEST_ENDPOINT_REGISTER_VIEW", optional=true)
    public static native String getRequestEndpointRegisterView();
    @GlobalValue(symbol="BRANCH_REQUEST_ENDPOINT_CPID", optional=true)
    public static native String getRequestEndpointCpid();
    @GlobalValue(symbol="BRANCH_REQUEST_ENDPOINT_LATD", optional=true)
    public static native String getRequestEndpointLatd();
    @GlobalValue(symbol="BRANCH_RESPONSE_KEY_RANDOMIZED_BUNDLE_TOKEN", optional=true)
    public static native String getResponseKeyRandomizedBundleToken();
    @GlobalValue(symbol="BRANCH_RESPONSE_KEY_SESSION_ID", optional=true)
    public static native String getResponseKeySessionId();
    @GlobalValue(symbol="BRANCH_RESPONSE_KEY_USER_URL", optional=true)
    public static native String getResponseKeyUserUrl();
    @GlobalValue(symbol="BRANCH_RESPONSE_KEY_INSTALL_PARAMS", optional=true)
    public static native String getResponseKeyInstallParams();
    @GlobalValue(symbol="BRANCH_RESPONSE_KEY_REFERRER", optional=true)
    public static native String getResponseKeyReferrer();
    @GlobalValue(symbol="BRANCH_RESPONSE_KEY_REFERREE", optional=true)
    public static native String getResponseKeyReferree();
    @GlobalValue(symbol="BRANCH_RESPONSE_KEY_URL", optional=true)
    public static native String getResponseKeyUrl();
    @GlobalValue(symbol="BRANCH_RESPONSE_KEY_SPOTLIGHT_IDENTIFIER", optional=true)
    public static native String getResponseKeySpotlightIdentifier();
    @GlobalValue(symbol="BRANCH_RESPONSE_KEY_DEVELOPER_IDENTITY", optional=true)
    public static native String getResponseKeyDeveloperIdentity();
    @GlobalValue(symbol="BRANCH_RESPONSE_KEY_RANDOMIZED_DEVICE_TOKEN", optional=true)
    public static native String getResponseKeyRandomizedDeviceToken();
    @GlobalValue(symbol="BRANCH_RESPONSE_KEY_SESSION_DATA", optional=true)
    public static native String getResponseKeySessionData();
    @GlobalValue(symbol="BRANCH_RESPONSE_KEY_CLICKED_BRANCH_LINK", optional=true)
    public static native String getResponseKeyClickedBranchLink();
    @GlobalValue(symbol="BRANCH_RESPONSE_KEY_BRANCH_VIEW_DATA", optional=true)
    public static native String getResponseKeyBranchViewData();
    @GlobalValue(symbol="BRANCH_RESPONSE_KEY_BRANCH_REFERRING_LINK", optional=true)
    public static native String getResponseKeyBranchReferringLink();
    @GlobalValue(symbol="BRANCH_RESPONSE_KEY_INVOKE_REGISTER_APP", optional=true)
    public static native String getResponseKeyInvokeRegisterApp();
    @GlobalValue(symbol="BRANCH_RESPONSE_KEY_UPDATE_CONVERSION_VALUE", optional=true)
    public static native String getResponseKeyUpdateConversionValue();
    @GlobalValue(symbol="BRANCH_RESPONSE_KEY_COARSE_KEY", optional=true)
    public static native String getResponseKeyCoarseKey();
    @GlobalValue(symbol="BRANCH_RESPONSE_KEY_UPDATE_IS_LOCKED", optional=true)
    public static native String getResponseKeyUpdateIsLocked();
    @GlobalValue(symbol="BRANCH_RESPONSE_KEY_ASCENDING_ONLY", optional=true)
    public static native String getResponseKeyAscendingOnly();
    @GlobalValue(symbol="BRANCH_LINK_DATA_KEY_OG_TITLE", optional=true)
    public static native String getLinkDataKeyOgTitle();
    @GlobalValue(symbol="BRANCH_LINK_DATA_KEY_OG_DESCRIPTION", optional=true)
    public static native String getLinkDataKeyOgDescription();
    @GlobalValue(symbol="BRANCH_LINK_DATA_KEY_OG_IMAGE_URL", optional=true)
    public static native String getLinkDataKeyOgImageUrl();
    @GlobalValue(symbol="BRANCH_LINK_DATA_KEY_TITLE", optional=true)
    public static native String getLinkDataKeyTitle();
    @GlobalValue(symbol="BRANCH_LINK_DATA_KEY_DESCRIPTION", optional=true)
    public static native String getLinkDataKeyDescription();
    @GlobalValue(symbol="BRANCH_LINK_DATA_KEY_PUBLICLY_INDEXABLE", optional=true)
    public static native String getLinkDataKeyPubliclyIndexable();
    @GlobalValue(symbol="BRANCH_LINK_DATA_KEY_LOCALLY_INDEXABLE", optional=true)
    public static native String getLinkDataKeyLocallyIndexable();
    @GlobalValue(symbol="BRANCH_LINK_DATA_KEY_TYPE", optional=true)
    public static native String getLinkDataKeyType();
    @GlobalValue(symbol="BRANCH_LINK_DATA_KEY_THUMBNAIL_URL", optional=true)
    public static native String getLinkDataKeyThumbnailUrl();
    @GlobalValue(symbol="BRANCH_LINK_DATA_KEY_KEYWORDS", optional=true)
    public static native String getLinkDataKeyKeywords();
    @GlobalValue(symbol="BRANCH_LINK_DATA_KEY_CANONICAL_IDENTIFIER", optional=true)
    public static native String getLinkDataKeyCanonicalIdentifier();
    @GlobalValue(symbol="BRANCH_LINK_DATA_KEY_CANONICAL_URL", optional=true)
    public static native String getLinkDataKeyCanonicalUrl();
    @GlobalValue(symbol="BRANCH_LINK_DATA_KEY_CONTENT_EXPIRATION_DATE", optional=true)
    public static native String getLinkDataKeyContentExpirationDate();
    @GlobalValue(symbol="BRANCH_LINK_DATA_KEY_CONTENT_TYPE", optional=true)
    public static native String getLinkDataKeyContentType();
    @GlobalValue(symbol="BRANCH_LINK_DATA_KEY_EMAIL_SUBJECT", optional=true)
    public static native String getLinkDataKeyEmailSubject();
    @GlobalValue(symbol="BRANCH_LINK_DATA_KEY_EMAIL_HTML_HEADER", optional=true)
    public static native String getLinkDataKeyEmailHtmlHeader();
    @GlobalValue(symbol="BRANCH_LINK_DATA_KEY_EMAIL_HTML_FOOTER", optional=true)
    public static native String getLinkDataKeyEmailHtmlFooter();
    @GlobalValue(symbol="BRANCH_LINK_DATA_KEY_EMAIL_HTML_LINK_TEXT", optional=true)
    public static native String getLinkDataKeyEmailHtmlLinkText();
    @GlobalValue(symbol="BRANCH_SPOTLIGHT_PREFIX", optional=true)
    public static native String getSpotlightPrefix();
    @GlobalValue(symbol="BRANCH_MANIFEST_VERSION_KEY", optional=true)
    public static native String getManifestVersionKey();
    @GlobalValue(symbol="BRANCH_HASH_MODE_KEY", optional=true)
    public static native String getHashModeKey();
    @GlobalValue(symbol="BRANCH_MANIFEST_KEY", optional=true)
    public static native String getManifestKey();
    @GlobalValue(symbol="BRANCH_PATH_KEY", optional=true)
    public static native String getPathKey();
    @GlobalValue(symbol="BRANCH_FILTERED_KEYS", optional=true)
    public static native String getFilteredKeys();
    @GlobalValue(symbol="BRANCH_MAX_TEXT_LEN_KEY", optional=true)
    public static native String getMaxTextLenKey();
    @GlobalValue(symbol="BRANCH_MAX_VIEW_HISTORY_LENGTH", optional=true)
    public static native String getMaxViewHistoryLength();
    @GlobalValue(symbol="BRANCH_MAX_PACKET_SIZE_KEY", optional=true)
    public static native String getMaxPacketSizeKey();
    @GlobalValue(symbol="BRANCH_CONTENT_DISCOVER_KEY", optional=true)
    public static native String getContentDiscoverKey();
    @GlobalValue(symbol="BRANCH_BUNDLE_IDENTIFIER", optional=true)
    public static native String getBundleIdentifier();
    @GlobalValue(symbol="BRANCH_TIME_STAMP_KEY", optional=true)
    public static native String getTimeStampKey();
    @GlobalValue(symbol="BRANCH_TIME_STAMP_CLOSE_KEY", optional=true)
    public static native String getTimeStampCloseKey();
    @GlobalValue(symbol="BRANCH_NAV_PATH_KEY", optional=true)
    public static native String getNavPathKey();
    @GlobalValue(symbol="BRANCH_REFERRAL_LINK_KEY", optional=true)
    public static native String getReferralLinkKey();
    @GlobalValue(symbol="BRANCH_CONTENT_LINK_KEY", optional=true)
    public static native String getContentLinkKey();
    @GlobalValue(symbol="BRANCH_CONTENT_META_DATA_KEY", optional=true)
    public static native String getContentMetaDataKey();
    @GlobalValue(symbol="BRANCH_VIEW_KEY", optional=true)
    public static native String getViewKey();
    @GlobalValue(symbol="BRANCH_CONTENT_DATA_KEY", optional=true)
    public static native String getContentDataKey();
    @GlobalValue(symbol="BRANCH_CONTENT_KEYS_KEY", optional=true)
    public static native String getContentKeysKey();
    @GlobalValue(symbol="BRANCH_PACKAGE_NAME_KEY", optional=true)
    public static native String getPackageNameKey();
    @GlobalValue(symbol="BRANCH_ENTITIES_KEY", optional=true)
    public static native String getEntitiesKey();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_SEARCH_AD", optional=true)
    public static native String getRequestKeySearchAd();
    @GlobalValue(symbol="BRANCH_REQUEST_KEY_APPLE_ATTRIBUTION_TOKEN", optional=true)
    public static native String getRequestKeyAppleAttributionToken();
    @GlobalValue(symbol="BRANCH_CRASHLYTICS_SDK_VERSION_KEY", optional=true)
    public static native String getCrashlyticsSdkVersionKey();
    @GlobalValue(symbol="BRANCH_CRASHLYTICS_LOW_MEMORY_KEY", optional=true)
    public static native String getCrashlyticsLowMemoryKey();
    @GlobalValue(symbol="BRANCH_URL_QUERY_PARAM_GBRAID", optional=true)
    public static native String getUrlQueryParamGbraid();
    @GlobalValue(symbol="BRANCH_FEATURE_TAG_SHARE", optional=true)
    public static native String getFeatureTagShare();
    @GlobalValue(symbol="BRANCH_FEATURE_TAG_REFERRAL", optional=true)
    public static native String getFeatureTagReferral();
    @GlobalValue(symbol="BRANCH_FEATURE_TAG_INVITE", optional=true)
    public static native String getFeatureTagInvite();
    @GlobalValue(symbol="BRANCH_FEATURE_TAG_DEAL", optional=true)
    public static native String getFeatureTagDeal();
    @GlobalValue(symbol="BRANCH_FEATURE_TAG_GIFT", optional=true)
    public static native String getFeatureTagGift();
    @GlobalValue(symbol="BRANCH_INIT_KEY_CHANNEL", optional=true)
    public static native String getInitKeyChannel();
    @GlobalValue(symbol="BRANCH_INIT_KEY_FEATURE", optional=true)
    public static native String getInitKeyFeature();
    @GlobalValue(symbol="BRANCH_INIT_KEY_TAGS", optional=true)
    public static native String getInitKeyTags();
    @GlobalValue(symbol="BRANCH_INIT_KEY_CAMPAIGN", optional=true)
    public static native String getInitKeyCampaign();
    @GlobalValue(symbol="BRANCH_INIT_KEY_STAGE", optional=true)
    public static native String getInitKeyStage();
    @GlobalValue(symbol="BRANCH_INIT_KEY_CREATION_SOURCE", optional=true)
    public static native String getInitKeyCreationSource();
    @GlobalValue(symbol="BRANCH_INIT_KEY_REFERRER", optional=true)
    public static native String getInitKeyReferrer();
    @GlobalValue(symbol="BRANCH_INIT_KEY_PHONE_NUMBER", optional=true)
    public static native String getInitKeyPhoneNumber();
    @GlobalValue(symbol="BRANCH_INIT_KEY_IS_FIRST_SESSION", optional=true)
    public static native String getInitKeyIsFirstSession();
    @GlobalValue(symbol="BRANCH_INIT_KEY_CLICKED_BRANCH_LINK", optional=true)
    public static native String getInitKeyClickedBranchLink();
    /*</methods>*/
}
