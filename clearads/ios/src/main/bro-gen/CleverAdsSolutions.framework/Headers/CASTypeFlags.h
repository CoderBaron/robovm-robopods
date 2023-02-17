//
//  CASTypeFlags.h
//  CleverAdsSolutions
//
//  Copyright © 2023 Clever Ads Solutions. All rights reserved.
//

#ifndef CASTypeFlags_h
#define CASTypeFlags_h
typedef NS_OPTIONS (NSUInteger, CASTypeFlags){
    CASTypeFlagsNone = 0,
    CASTypeFlagsBanner = 1 << 0,
    CASTypeFlagsInterstitial = 1 << 1,
    CASTypeFlagsRewarded = 1 << 2,
    CASTypeFlagsNative = 1 << 3,
    CASTypeFlagsOpenApp = 1 << 6,
    CASTypeFlagsEverything = CASTypeFlagsBanner | CASTypeFlagsInterstitial | CASTypeFlagsRewarded
};

#endif /* CASTypeFlags_h */
