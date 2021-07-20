#if 0
#elif defined(__arm64__) && __arm64__
// Generated by Apple Swift version 5.4.2 (swiftlang-1205.0.28.2 clang-1205.0.19.57)
#ifndef POLLFISH_SWIFT_H
#define POLLFISH_SWIFT_H
#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wgcc-compat"

#if !defined(__has_include)
# define __has_include(x) 0
#endif
#if !defined(__has_attribute)
# define __has_attribute(x) 0
#endif
#if !defined(__has_feature)
# define __has_feature(x) 0
#endif
#if !defined(__has_warning)
# define __has_warning(x) 0
#endif

#if __has_include(<swift/objc-prologue.h>)
# include <swift/objc-prologue.h>
#endif

#pragma clang diagnostic ignored "-Wauto-import"
#include <Foundation/Foundation.h>
#include <stdint.h>
#include <stddef.h>
#include <stdbool.h>

#if !defined(SWIFT_TYPEDEFS)
# define SWIFT_TYPEDEFS 1
# if __has_include(<uchar.h>)
#  include <uchar.h>
# elif !defined(__cplusplus)
typedef uint_least16_t char16_t;
typedef uint_least32_t char32_t;
# endif
typedef float swift_float2  __attribute__((__ext_vector_type__(2)));
typedef float swift_float3  __attribute__((__ext_vector_type__(3)));
typedef float swift_float4  __attribute__((__ext_vector_type__(4)));
typedef double swift_double2  __attribute__((__ext_vector_type__(2)));
typedef double swift_double3  __attribute__((__ext_vector_type__(3)));
typedef double swift_double4  __attribute__((__ext_vector_type__(4)));
typedef int swift_int2  __attribute__((__ext_vector_type__(2)));
typedef int swift_int3  __attribute__((__ext_vector_type__(3)));
typedef int swift_int4  __attribute__((__ext_vector_type__(4)));
typedef unsigned int swift_uint2  __attribute__((__ext_vector_type__(2)));
typedef unsigned int swift_uint3  __attribute__((__ext_vector_type__(3)));
typedef unsigned int swift_uint4  __attribute__((__ext_vector_type__(4)));
#endif

#if !defined(SWIFT_PASTE)
# define SWIFT_PASTE_HELPER(x, y) x##y
# define SWIFT_PASTE(x, y) SWIFT_PASTE_HELPER(x, y)
#endif
#if !defined(SWIFT_METATYPE)
# define SWIFT_METATYPE(X) Class
#endif
#if !defined(SWIFT_CLASS_PROPERTY)
# if __has_feature(objc_class_property)
#  define SWIFT_CLASS_PROPERTY(...) __VA_ARGS__
# else
#  define SWIFT_CLASS_PROPERTY(...)
# endif
#endif

#if __has_attribute(objc_runtime_name)
# define SWIFT_RUNTIME_NAME(X) __attribute__((objc_runtime_name(X)))
#else
# define SWIFT_RUNTIME_NAME(X)
#endif
#if __has_attribute(swift_name)
# define SWIFT_COMPILE_NAME(X) __attribute__((swift_name(X)))
#else
# define SWIFT_COMPILE_NAME(X)
#endif
#if __has_attribute(objc_method_family)
# define SWIFT_METHOD_FAMILY(X) __attribute__((objc_method_family(X)))
#else
# define SWIFT_METHOD_FAMILY(X)
#endif
#if __has_attribute(noescape)
# define SWIFT_NOESCAPE __attribute__((noescape))
#else
# define SWIFT_NOESCAPE
#endif
#if __has_attribute(ns_consumed)
# define SWIFT_RELEASES_ARGUMENT __attribute__((ns_consumed))
#else
# define SWIFT_RELEASES_ARGUMENT
#endif
#if __has_attribute(warn_unused_result)
# define SWIFT_WARN_UNUSED_RESULT __attribute__((warn_unused_result))
#else
# define SWIFT_WARN_UNUSED_RESULT
#endif
#if __has_attribute(noreturn)
# define SWIFT_NORETURN __attribute__((noreturn))
#else
# define SWIFT_NORETURN
#endif
#if !defined(SWIFT_CLASS_EXTRA)
# define SWIFT_CLASS_EXTRA
#endif
#if !defined(SWIFT_PROTOCOL_EXTRA)
# define SWIFT_PROTOCOL_EXTRA
#endif
#if !defined(SWIFT_ENUM_EXTRA)
# define SWIFT_ENUM_EXTRA
#endif
#if !defined(SWIFT_CLASS)
# if __has_attribute(objc_subclassing_restricted)
#  define SWIFT_CLASS(SWIFT_NAME) SWIFT_RUNTIME_NAME(SWIFT_NAME) __attribute__((objc_subclassing_restricted)) SWIFT_CLASS_EXTRA
#  define SWIFT_CLASS_NAMED(SWIFT_NAME) __attribute__((objc_subclassing_restricted)) SWIFT_COMPILE_NAME(SWIFT_NAME) SWIFT_CLASS_EXTRA
# else
#  define SWIFT_CLASS(SWIFT_NAME) SWIFT_RUNTIME_NAME(SWIFT_NAME) SWIFT_CLASS_EXTRA
#  define SWIFT_CLASS_NAMED(SWIFT_NAME) SWIFT_COMPILE_NAME(SWIFT_NAME) SWIFT_CLASS_EXTRA
# endif
#endif
#if !defined(SWIFT_RESILIENT_CLASS)
# if __has_attribute(objc_class_stub)
#  define SWIFT_RESILIENT_CLASS(SWIFT_NAME) SWIFT_CLASS(SWIFT_NAME) __attribute__((objc_class_stub))
#  define SWIFT_RESILIENT_CLASS_NAMED(SWIFT_NAME) __attribute__((objc_class_stub)) SWIFT_CLASS_NAMED(SWIFT_NAME)
# else
#  define SWIFT_RESILIENT_CLASS(SWIFT_NAME) SWIFT_CLASS(SWIFT_NAME)
#  define SWIFT_RESILIENT_CLASS_NAMED(SWIFT_NAME) SWIFT_CLASS_NAMED(SWIFT_NAME)
# endif
#endif

#if !defined(SWIFT_PROTOCOL)
# define SWIFT_PROTOCOL(SWIFT_NAME) SWIFT_RUNTIME_NAME(SWIFT_NAME) SWIFT_PROTOCOL_EXTRA
# define SWIFT_PROTOCOL_NAMED(SWIFT_NAME) SWIFT_COMPILE_NAME(SWIFT_NAME) SWIFT_PROTOCOL_EXTRA
#endif

#if !defined(SWIFT_EXTENSION)
# define SWIFT_EXTENSION(M) SWIFT_PASTE(M##_Swift_, __LINE__)
#endif

#if !defined(OBJC_DESIGNATED_INITIALIZER)
# if __has_attribute(objc_designated_initializer)
#  define OBJC_DESIGNATED_INITIALIZER __attribute__((objc_designated_initializer))
# else
#  define OBJC_DESIGNATED_INITIALIZER
# endif
#endif
#if !defined(SWIFT_ENUM_ATTR)
# if defined(__has_attribute) && __has_attribute(enum_extensibility)
#  define SWIFT_ENUM_ATTR(_extensibility) __attribute__((enum_extensibility(_extensibility)))
# else
#  define SWIFT_ENUM_ATTR(_extensibility)
# endif
#endif
#if !defined(SWIFT_ENUM)
# define SWIFT_ENUM(_type, _name, _extensibility) enum _name : _type _name; enum SWIFT_ENUM_ATTR(_extensibility) SWIFT_ENUM_EXTRA _name : _type
# if __has_feature(generalized_swift_name)
#  define SWIFT_ENUM_NAMED(_type, _name, SWIFT_NAME, _extensibility) enum _name : _type _name SWIFT_COMPILE_NAME(SWIFT_NAME); enum SWIFT_COMPILE_NAME(SWIFT_NAME) SWIFT_ENUM_ATTR(_extensibility) SWIFT_ENUM_EXTRA _name : _type
# else
#  define SWIFT_ENUM_NAMED(_type, _name, SWIFT_NAME, _extensibility) SWIFT_ENUM(_type, _name, _extensibility)
# endif
#endif
#if !defined(SWIFT_UNAVAILABLE)
# define SWIFT_UNAVAILABLE __attribute__((unavailable))
#endif
#if !defined(SWIFT_UNAVAILABLE_MSG)
# define SWIFT_UNAVAILABLE_MSG(msg) __attribute__((unavailable(msg)))
#endif
#if !defined(SWIFT_AVAILABILITY)
# define SWIFT_AVAILABILITY(plat, ...) __attribute__((availability(plat, __VA_ARGS__)))
#endif
#if !defined(SWIFT_WEAK_IMPORT)
# define SWIFT_WEAK_IMPORT __attribute__((weak_import))
#endif
#if !defined(SWIFT_DEPRECATED)
# define SWIFT_DEPRECATED __attribute__((deprecated))
#endif
#if !defined(SWIFT_DEPRECATED_MSG)
# define SWIFT_DEPRECATED_MSG(...) __attribute__((deprecated(__VA_ARGS__)))
#endif
#if __has_feature(attribute_diagnose_if_objc)
# define SWIFT_DEPRECATED_OBJC(Msg) __attribute__((diagnose_if(1, Msg, "warning")))
#else
# define SWIFT_DEPRECATED_OBJC(Msg) SWIFT_DEPRECATED_MSG(Msg)
#endif
#if !defined(IBSegueAction)
# define IBSegueAction
#endif
#if __has_feature(modules)
#if __has_warning("-Watimport-in-framework-header")
#pragma clang diagnostic ignored "-Watimport-in-framework-header"
#endif
@import ObjectiveC;
#endif

#pragma clang diagnostic ignored "-Wproperty-attribute-mismatch"
#pragma clang diagnostic ignored "-Wduplicate-method-arg"
#if __has_warning("-Wpragma-clang-attribute")
# pragma clang diagnostic ignored "-Wpragma-clang-attribute"
#endif
#pragma clang diagnostic ignored "-Wunknown-pragmas"
#pragma clang diagnostic ignored "-Wnullability"

#if __has_attribute(external_source_symbol)
# pragma push_macro("any")
# undef any
# pragma clang attribute push(__attribute__((external_source_symbol(language="Swift", defined_in="Pollfish",generated_declaration))), apply_to=any(function,enum,objc_interface,objc_category,objc_protocol))
# pragma pop_macro("any")
#endif

typedef SWIFT_ENUM(NSInteger, Career, open) {
  CareerAgricultureForesrtyFishingOrHunting = 0,
  CareerArtsEntetainmentOrRecreation = 1,
  CareerBroadcasting = 2,
  CareerConstruction = 3,
  CareerEducation = 4,
  CareerFinanceAndInsurance = 5,
  CareerGovernmentAndPublicAdministration = 6,
  CareerHealthCareAndSocialAssistance = 7,
  CareerHomemaker = 8,
  CareerHotelAndFoodServices = 9,
  CareerInformationOther = 10,
  CareerInformationServicesAndData = 11,
  CareerLegalServices = 12,
  CareerManufacturingComputerAndElectronics = 13,
  CareerManufacturingOther = 14,
  CareerMilitary = 15,
  CareerMining = 16,
  CareerProcessing = 17,
  CareerPublishing = 18,
  CareerRealEstateRentalOrLeasing = 19,
  CareerReligious = 20,
  CareerRetail = 21,
  CareerRetired = 22,
  CareerScientificOrTechnicalServices = 23,
  CareerSoftware = 24,
  CareerStudent = 25,
  CareerTelecommunications = 26,
  CareerTransportAndWarehousing = 27,
  CareerUnemployed = 28,
  CareerEnergyUtilitiesOilAndGas = 29,
  CareerWholesale = 30,
  CareerOther = 31,
  CareerAdvertising = 32,
  CareerAutomotive = 33,
  CareerConsulting = 34,
  CareerFashionApparel = 35,
  CareerHumanResources = 36,
  CareerMarketResearch = 37,
  CareerMarketingSales = 38,
  CareerShippingDistribution = 39,
  CareerPersonalServices = 40,
  CareerSecurity = 41,
};

typedef SWIFT_ENUM(NSInteger, Education, open) {
  EducationElementarySchool = 0,
  EducationMiddleSchool = 1,
  EducationHighSchool = 2,
  EducationVocationalTechnicalCollege = 3,
  EducationUniversity = 4,
  EducationPostGraduate = 5,
};

typedef SWIFT_ENUM(NSInteger, Employment, open) {
  EmploymentEmployedForWages = 0,
  EmploymentSelfEmployed = 1,
  EmploymentUnemployedLooking = 2,
  EmploymentUnemployedNotLooking = 3,
  EmploymentHomemaker = 4,
  EmploymentStudent = 5,
  EmploymentMilitary = 6,
  EmploymentRetired = 7,
  EmploymentUnableToWork = 8,
  EmploymentOther = 9,
};


typedef SWIFT_ENUM(NSInteger, Gender, open) {
  GenderFemale = 1,
  GenderMale = 2,
  GenderOther = 3,
};

typedef SWIFT_ENUM(NSInteger, Income, open) {
  IncomeLowerI = 0,
  IncomeLowerII = 1,
  IncomeMiddleI = 2,
  IncomeMiddleII = 3,
  IncomeHighI = 4,
  IncomeHighII = 5,
  IncomeHighIII = 6,
  IncomePreferNotToSay = 7,
};

typedef SWIFT_ENUM(NSInteger, IndicatorPosition, open) {
  IndicatorPositionTopLeft = 0,
  IndicatorPositionTopRight = 1,
  IndicatorPositionMiddleLeft = 2,
  IndicatorPositionMiddleRight = 3,
  IndicatorPositionBottomLeft = 4,
  IndicatorPositionBottomRight = 5,
};

typedef SWIFT_ENUM(NSInteger, MaritalStatus, open) {
  MaritalStatusSingle = 0,
  MaritalStatusMarried = 1,
  MaritalStatusDivorced = 2,
  MaritalStatusLivingWithParent = 3,
  MaritalStatusSeparated = 4,
  MaritalStatusWidowed = 5,
  MaritalStatusPreferNotToSay = 6,
};

typedef SWIFT_ENUM(NSInteger, NumberOfEmployees, open) {
  NumberOfEmployeesOne = 0,
  NumberOfEmployeesTwoToFive = 1,
  NumberOfEmployeesSixToTen = 2,
  NumberOfEmployeesElevenToTwentyFive = 3,
  NumberOfEmployeesTwentySixToFifty = 4,
  NumberOfEmployeesFiftyOneToHundrend = 5,
  NumberOfEmployeesHundrendOneToTwoHundrendsFifty = 6,
  NumberOfEmployeesTwoHundrendsFiftyOneToFiveHundrends = 7,
  NumberOfEmployeesFiveHundrendsOneToThousand = 8,
  NumberOfEmployeesThousandOneToFiveThousands = 9,
  NumberOfEmployeesGreaterThanFiveThousands = 10,
  NumberOfEmployeesDoNotWork = 11,
  NumberOfEmployeesPreferNotToSay = 12,
};

typedef SWIFT_ENUM(NSInteger, OrganizationRole, open) {
  OrganizationRoleOwnerPartner = 0,
  OrganizationRolePresidentCeoChairperson = 1,
  OrganizationRoleCLevelExecutive = 2,
  OrganizationRoleMiddleMangement = 3,
  OrganizationRoleChiefFinancialOfficer = 4,
  OrganizationRoleChiefTechnicalOfficer = 5,
  OrganizationRoleSeniorMangement = 6,
  OrganizationRoleDirector = 7,
  OrganizationRoleHrManagement = 8,
  OrganizationRoleProductManager = 9,
  OrganizationRoleSupplyManagement = 10,
  OrganizationRoleProjectManagement = 11,
  OrganizationRoleSalesManager = 12,
  OrganizationRoleBusinessAdministrator = 13,
  OrganizationRoleSupervisor = 14,
  OrganizationRoleAdministrativeClerical = 15,
  OrganizationRoleCraftsman = 16,
  OrganizationRoleForeman = 17,
  OrganizationRoleTechnicalStaff = 18,
  OrganizationRoleFacultyStaff = 19,
  OrganizationRoleSalesStatff = 20,
  OrganizationRoleBuyerPurchasingAgent = 21,
  OrganizationRoleOtherNonManagement = 22,
  OrganizationRoleNotWork = 23,
  OrganizationRolePreferNotToSay = 24,
};

typedef SWIFT_ENUM(NSInteger, Parental, open) {
  ParentalZero = 0,
  ParentalOne = 1,
  ParentalTwo = 2,
  ParentalThree = 3,
  ParentalFour = 4,
  ParentalFive = 5,
  ParentalSixOrMore = 6,
  ParentalPreferNotToSay = 7,
};

typedef SWIFT_ENUM(NSInteger, Platform, open) {
  PlatformNative = 0,
  PlatformFlutter = 1,
  PlatformCordova = 2,
  PlatformUnity = 3,
  PlatformAdMob = 4,
  PlatformMoPub = 5,
  PlatformReactNative = 6,
};


SWIFT_CLASS("_TtC8Pollfish8Pollfish")
@interface Pollfish : NSObject
- (nonnull instancetype)init SWIFT_UNAVAILABLE;
+ (nonnull instancetype)new SWIFT_UNAVAILABLE_MSG("-init is unavailable");
@end



@class PollfishParams;
@protocol PollfishDelegate;
@class NSNumber;

@interface Pollfish (SWIFT_EXTENSION(Pollfish))
+ (void)initWith:(PollfishParams * _Nonnull)params delegate:(id <PollfishDelegate> _Nullable)delegate SWIFT_METHOD_FAMILY(none);
+ (void)show;
+ (void)hide;
+ (BOOL)isPollfishPresent SWIFT_WARN_UNUSED_RESULT;
+ (BOOL)isPollfishPanelOpen SWIFT_WARN_UNUSED_RESULT;
@end


@class SurveyInfo;

SWIFT_PROTOCOL("_TtP8Pollfish16PollfishDelegate_")
@protocol PollfishDelegate
@optional
- (void)pollfishOpened;
- (void)pollfishClosed;
- (void)pollfishSurveyReceivedWithSurveyInfo:(SurveyInfo * _Nullable)surveyInfo;
- (void)pollfishSurveyCompletedWithSurveyInfo:(SurveyInfo * _Nonnull)surveyInfo;
- (void)pollfishSurveyNotAvailable;
- (void)pollfishUserRejectedSurvey;
- (void)pollfishUserNotEligible;
@end

@class NSString;
enum SurveyFormat : NSInteger;
@class UserProperties;
@class UIView;
@class RewardInfo;

SWIFT_CLASS("_TtC8Pollfish14PollfishParams")
@interface PollfishParams : NSObject
- (nonnull instancetype)init:(NSString * _Nonnull)apiKey OBJC_DESIGNATED_INITIALIZER;
- (PollfishParams * _Nonnull)rewardMode:(BOOL)rewardMode;
- (PollfishParams * _Nonnull)releaseMode:(BOOL)releaseMode;
- (PollfishParams * _Nonnull)offerwallMode:(BOOL)offerwallMode;
- (PollfishParams * _Nonnull)requestUUID:(NSString * _Nonnull)requestUUID;
- (PollfishParams * _Nonnull)surveyFormat:(enum SurveyFormat)surveyFormat;
- (PollfishParams * _Nonnull)userProperties:(UserProperties * _Nonnull)userProperties;
- (PollfishParams * _Nonnull)indicatorPosition:(enum IndicatorPosition)indicatorPosition;
- (PollfishParams * _Nonnull)indicatorPadding:(NSInteger)indicatorPadding;
- (PollfishParams * _Nonnull)viewContainer:(UIView * _Nonnull)viewContainer;
- (PollfishParams * _Nonnull)rewardInfo:(RewardInfo * _Nonnull)rewardInfo;
- (PollfishParams * _Nonnull)signature:(NSString * _Nonnull)signature;
- (PollfishParams * _Nonnull)clickId:(NSString * _Nonnull)clickId;
- (PollfishParams * _Nonnull)platform:(enum Platform)platform;
- (nonnull instancetype)init SWIFT_UNAVAILABLE;
+ (nonnull instancetype)new SWIFT_UNAVAILABLE_MSG("-init is unavailable");
@end

typedef SWIFT_ENUM(NSInteger, Race, open) {
  RaceArab = 0,
  RaceAsian = 1,
  RaceBlack = 2,
  RaceWhite = 3,
  RaceHispanic = 4,
  RaceLatino = 5,
  RaceMultiracial = 6,
  RaceOther = 7,
  RacePreferNotToSay = 8,
};


SWIFT_CLASS("_TtC8Pollfish10RewardInfo")
@interface RewardInfo : NSObject
- (nullable instancetype)initWithRewardName:(NSString * _Nonnull)rewardName rewardConversion:(float)rewardConversion OBJC_DESIGNATED_INITIALIZER;
@property (nonatomic, readonly, copy) NSString * _Nonnull description;
- (nonnull instancetype)init SWIFT_UNAVAILABLE;
+ (nonnull instancetype)new SWIFT_UNAVAILABLE_MSG("-init is unavailable");
@end

typedef SWIFT_ENUM(NSInteger, SpokenLanguage, open) {
  SpokenLanguageEnglish = 0,
  SpokenLanguageArabic = 1,
  SpokenLanguageBulgarian = 2,
  SpokenLanguageChinese = 3,
  SpokenLanguageCzech = 4,
  SpokenLanguageDanish = 5,
  SpokenLanguageDutch = 6,
  SpokenLanguageFilipino = 7,
  SpokenLanguageThai = 8,
  SpokenLanguageFinnish = 9,
  SpokenLanguageFrench = 10,
  SpokenLanguageGerman = 11,
  SpokenLanguageGreek = 12,
  SpokenLanguageHindi = 13,
  SpokenLanguageIndonesian = 14,
  SpokenLanguageItalian = 15,
  SpokenLanguageJapanese = 16,
  SpokenLanguagePolish = 17,
  SpokenLanguagePortuguese = 18,
  SpokenLanguageRomanian = 19,
  SpokenLanguageRussian = 21,
  SpokenLanguageSerbian = 22,
  SpokenLanguageSpanish = 23,
  SpokenLanguageSwedish = 24,
  SpokenLanguageTurkish = 25,
  SpokenLanguageVietnamese = 26,
  SpokenLanguageKorean = 27,
  SpokenLanguageHungarian = 28,
  SpokenLanguageChineseTraditional = 29,
  SpokenLanguageNorwegian = 30,
  SpokenLanguageEgyptian = 31,
  SpokenLanguageUkrainian = 32,
  SpokenLanguageHebrew = 33,
  SpokenLanguageBengali = 34,
  SpokenLanguageSlovak = 35,
  SpokenLanguagePersian = 36,
  SpokenLanguageAzerbaijani = 37,
  SpokenLanguageGeorgian = 38,
  SpokenLanguageLithuanian = 39,
  SpokenLanguagePunjabi = 40,
  SpokenLanguagePashto = 41,
  SpokenLanguageEstonian = 42,
  SpokenLanguageUzbek = 43,
};

typedef SWIFT_ENUM(NSInteger, SurveyFormat, open) {
  SurveyFormatBasic = 0,
  SurveyFormatPlayful = 1,
  SurveyFormatRandom = 2,
  SurveyFormatThirdParty = 3,
};


SWIFT_CLASS("_TtC8Pollfish10SurveyInfo")
@interface SurveyInfo : NSObject
@property (nonatomic, readonly, strong) NSNumber * _Nullable cpa;
@property (nonatomic, readonly, strong) NSNumber * _Nullable loi;
@property (nonatomic, readonly, strong) NSNumber * _Nullable ir;
@property (nonatomic, readonly, copy) NSString * _Nullable surveyClass;
@property (nonatomic, readonly, copy) NSString * _Nullable rewardName;
@property (nonatomic, readonly, strong) NSNumber * _Nullable rewardValue;
@property (nonatomic, readonly, strong) NSNumber * _Nullable remainingCompletes;
@property (nonatomic, readonly, copy) NSString * _Nonnull description;
- (nonnull instancetype)init SWIFT_UNAVAILABLE;
+ (nonnull instancetype)new SWIFT_UNAVAILABLE_MSG("-init is unavailable");
@end








@class NSArray;

SWIFT_CLASS("_TtC8Pollfish14UserProperties")
@interface UserProperties : NSObject
- (UserProperties * _Nonnull)gender:(enum Gender)gender;
- (UserProperties * _Nonnull)yearOfBirth:(NSInteger)yearOfBirth;
- (UserProperties * _Nonnull)maritalStatus:(enum MaritalStatus)maritalStatus;
- (UserProperties * _Nonnull)parental:(enum Parental)parental;
- (UserProperties * _Nonnull)education:(enum Education)education;
- (UserProperties * _Nonnull)employment:(enum Employment)employment;
- (UserProperties * _Nonnull)career:(enum Career)career;
- (UserProperties * _Nonnull)race:(enum Race)race;
- (UserProperties * _Nonnull)income:(enum Income)income;
- (UserProperties * _Nonnull)spokenLanguages:(NSArray * _Nonnull)spokenLanguages;
- (UserProperties * _Nonnull)organizationRole:(enum OrganizationRole)organizationRole;
- (UserProperties * _Nonnull)numberOfEmployees:(enum NumberOfEmployees)numberOfEmployees;
- (UserProperties * _Nonnull)postalData:(NSString * _Nonnull)postalData;
- (UserProperties * _Nonnull)customAttribute:(NSString * _Nonnull)value forKey:(NSString * _Nonnull)forKey;
- (nonnull instancetype)init OBJC_DESIGNATED_INITIALIZER;
@end


#if __has_attribute(external_source_symbol)
# pragma clang attribute pop
#endif
#pragma clang diagnostic pop
#endif

#elif defined(__ARM_ARCH_7A__) && __ARM_ARCH_7A__
// Generated by Apple Swift version 5.4.2 (swiftlang-1205.0.28.2 clang-1205.0.19.57)
#ifndef POLLFISH_SWIFT_H
#define POLLFISH_SWIFT_H
#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wgcc-compat"

#if !defined(__has_include)
# define __has_include(x) 0
#endif
#if !defined(__has_attribute)
# define __has_attribute(x) 0
#endif
#if !defined(__has_feature)
# define __has_feature(x) 0
#endif
#if !defined(__has_warning)
# define __has_warning(x) 0
#endif

#if __has_include(<swift/objc-prologue.h>)
# include <swift/objc-prologue.h>
#endif

#pragma clang diagnostic ignored "-Wauto-import"
#include <Foundation/Foundation.h>
#include <stdint.h>
#include <stddef.h>
#include <stdbool.h>

#if !defined(SWIFT_TYPEDEFS)
# define SWIFT_TYPEDEFS 1
# if __has_include(<uchar.h>)
#  include <uchar.h>
# elif !defined(__cplusplus)
typedef uint_least16_t char16_t;
typedef uint_least32_t char32_t;
# endif
typedef float swift_float2  __attribute__((__ext_vector_type__(2)));
typedef float swift_float3  __attribute__((__ext_vector_type__(3)));
typedef float swift_float4  __attribute__((__ext_vector_type__(4)));
typedef double swift_double2  __attribute__((__ext_vector_type__(2)));
typedef double swift_double3  __attribute__((__ext_vector_type__(3)));
typedef double swift_double4  __attribute__((__ext_vector_type__(4)));
typedef int swift_int2  __attribute__((__ext_vector_type__(2)));
typedef int swift_int3  __attribute__((__ext_vector_type__(3)));
typedef int swift_int4  __attribute__((__ext_vector_type__(4)));
typedef unsigned int swift_uint2  __attribute__((__ext_vector_type__(2)));
typedef unsigned int swift_uint3  __attribute__((__ext_vector_type__(3)));
typedef unsigned int swift_uint4  __attribute__((__ext_vector_type__(4)));
#endif

#if !defined(SWIFT_PASTE)
# define SWIFT_PASTE_HELPER(x, y) x##y
# define SWIFT_PASTE(x, y) SWIFT_PASTE_HELPER(x, y)
#endif
#if !defined(SWIFT_METATYPE)
# define SWIFT_METATYPE(X) Class
#endif
#if !defined(SWIFT_CLASS_PROPERTY)
# if __has_feature(objc_class_property)
#  define SWIFT_CLASS_PROPERTY(...) __VA_ARGS__
# else
#  define SWIFT_CLASS_PROPERTY(...)
# endif
#endif

#if __has_attribute(objc_runtime_name)
# define SWIFT_RUNTIME_NAME(X) __attribute__((objc_runtime_name(X)))
#else
# define SWIFT_RUNTIME_NAME(X)
#endif
#if __has_attribute(swift_name)
# define SWIFT_COMPILE_NAME(X) __attribute__((swift_name(X)))
#else
# define SWIFT_COMPILE_NAME(X)
#endif
#if __has_attribute(objc_method_family)
# define SWIFT_METHOD_FAMILY(X) __attribute__((objc_method_family(X)))
#else
# define SWIFT_METHOD_FAMILY(X)
#endif
#if __has_attribute(noescape)
# define SWIFT_NOESCAPE __attribute__((noescape))
#else
# define SWIFT_NOESCAPE
#endif
#if __has_attribute(ns_consumed)
# define SWIFT_RELEASES_ARGUMENT __attribute__((ns_consumed))
#else
# define SWIFT_RELEASES_ARGUMENT
#endif
#if __has_attribute(warn_unused_result)
# define SWIFT_WARN_UNUSED_RESULT __attribute__((warn_unused_result))
#else
# define SWIFT_WARN_UNUSED_RESULT
#endif
#if __has_attribute(noreturn)
# define SWIFT_NORETURN __attribute__((noreturn))
#else
# define SWIFT_NORETURN
#endif
#if !defined(SWIFT_CLASS_EXTRA)
# define SWIFT_CLASS_EXTRA
#endif
#if !defined(SWIFT_PROTOCOL_EXTRA)
# define SWIFT_PROTOCOL_EXTRA
#endif
#if !defined(SWIFT_ENUM_EXTRA)
# define SWIFT_ENUM_EXTRA
#endif
#if !defined(SWIFT_CLASS)
# if __has_attribute(objc_subclassing_restricted)
#  define SWIFT_CLASS(SWIFT_NAME) SWIFT_RUNTIME_NAME(SWIFT_NAME) __attribute__((objc_subclassing_restricted)) SWIFT_CLASS_EXTRA
#  define SWIFT_CLASS_NAMED(SWIFT_NAME) __attribute__((objc_subclassing_restricted)) SWIFT_COMPILE_NAME(SWIFT_NAME) SWIFT_CLASS_EXTRA
# else
#  define SWIFT_CLASS(SWIFT_NAME) SWIFT_RUNTIME_NAME(SWIFT_NAME) SWIFT_CLASS_EXTRA
#  define SWIFT_CLASS_NAMED(SWIFT_NAME) SWIFT_COMPILE_NAME(SWIFT_NAME) SWIFT_CLASS_EXTRA
# endif
#endif
#if !defined(SWIFT_RESILIENT_CLASS)
# if __has_attribute(objc_class_stub)
#  define SWIFT_RESILIENT_CLASS(SWIFT_NAME) SWIFT_CLASS(SWIFT_NAME) __attribute__((objc_class_stub))
#  define SWIFT_RESILIENT_CLASS_NAMED(SWIFT_NAME) __attribute__((objc_class_stub)) SWIFT_CLASS_NAMED(SWIFT_NAME)
# else
#  define SWIFT_RESILIENT_CLASS(SWIFT_NAME) SWIFT_CLASS(SWIFT_NAME)
#  define SWIFT_RESILIENT_CLASS_NAMED(SWIFT_NAME) SWIFT_CLASS_NAMED(SWIFT_NAME)
# endif
#endif

#if !defined(SWIFT_PROTOCOL)
# define SWIFT_PROTOCOL(SWIFT_NAME) SWIFT_RUNTIME_NAME(SWIFT_NAME) SWIFT_PROTOCOL_EXTRA
# define SWIFT_PROTOCOL_NAMED(SWIFT_NAME) SWIFT_COMPILE_NAME(SWIFT_NAME) SWIFT_PROTOCOL_EXTRA
#endif

#if !defined(SWIFT_EXTENSION)
# define SWIFT_EXTENSION(M) SWIFT_PASTE(M##_Swift_, __LINE__)
#endif

#if !defined(OBJC_DESIGNATED_INITIALIZER)
# if __has_attribute(objc_designated_initializer)
#  define OBJC_DESIGNATED_INITIALIZER __attribute__((objc_designated_initializer))
# else
#  define OBJC_DESIGNATED_INITIALIZER
# endif
#endif
#if !defined(SWIFT_ENUM_ATTR)
# if defined(__has_attribute) && __has_attribute(enum_extensibility)
#  define SWIFT_ENUM_ATTR(_extensibility) __attribute__((enum_extensibility(_extensibility)))
# else
#  define SWIFT_ENUM_ATTR(_extensibility)
# endif
#endif
#if !defined(SWIFT_ENUM)
# define SWIFT_ENUM(_type, _name, _extensibility) enum _name : _type _name; enum SWIFT_ENUM_ATTR(_extensibility) SWIFT_ENUM_EXTRA _name : _type
# if __has_feature(generalized_swift_name)
#  define SWIFT_ENUM_NAMED(_type, _name, SWIFT_NAME, _extensibility) enum _name : _type _name SWIFT_COMPILE_NAME(SWIFT_NAME); enum SWIFT_COMPILE_NAME(SWIFT_NAME) SWIFT_ENUM_ATTR(_extensibility) SWIFT_ENUM_EXTRA _name : _type
# else
#  define SWIFT_ENUM_NAMED(_type, _name, SWIFT_NAME, _extensibility) SWIFT_ENUM(_type, _name, _extensibility)
# endif
#endif
#if !defined(SWIFT_UNAVAILABLE)
# define SWIFT_UNAVAILABLE __attribute__((unavailable))
#endif
#if !defined(SWIFT_UNAVAILABLE_MSG)
# define SWIFT_UNAVAILABLE_MSG(msg) __attribute__((unavailable(msg)))
#endif
#if !defined(SWIFT_AVAILABILITY)
# define SWIFT_AVAILABILITY(plat, ...) __attribute__((availability(plat, __VA_ARGS__)))
#endif
#if !defined(SWIFT_WEAK_IMPORT)
# define SWIFT_WEAK_IMPORT __attribute__((weak_import))
#endif
#if !defined(SWIFT_DEPRECATED)
# define SWIFT_DEPRECATED __attribute__((deprecated))
#endif
#if !defined(SWIFT_DEPRECATED_MSG)
# define SWIFT_DEPRECATED_MSG(...) __attribute__((deprecated(__VA_ARGS__)))
#endif
#if __has_feature(attribute_diagnose_if_objc)
# define SWIFT_DEPRECATED_OBJC(Msg) __attribute__((diagnose_if(1, Msg, "warning")))
#else
# define SWIFT_DEPRECATED_OBJC(Msg) SWIFT_DEPRECATED_MSG(Msg)
#endif
#if !defined(IBSegueAction)
# define IBSegueAction
#endif
#if __has_feature(modules)
#if __has_warning("-Watimport-in-framework-header")
#pragma clang diagnostic ignored "-Watimport-in-framework-header"
#endif
@import ObjectiveC;
#endif

#pragma clang diagnostic ignored "-Wproperty-attribute-mismatch"
#pragma clang diagnostic ignored "-Wduplicate-method-arg"
#if __has_warning("-Wpragma-clang-attribute")
# pragma clang diagnostic ignored "-Wpragma-clang-attribute"
#endif
#pragma clang diagnostic ignored "-Wunknown-pragmas"
#pragma clang diagnostic ignored "-Wnullability"

#if __has_attribute(external_source_symbol)
# pragma push_macro("any")
# undef any
# pragma clang attribute push(__attribute__((external_source_symbol(language="Swift", defined_in="Pollfish",generated_declaration))), apply_to=any(function,enum,objc_interface,objc_category,objc_protocol))
# pragma pop_macro("any")
#endif

typedef SWIFT_ENUM(NSInteger, Career, open) {
  CareerAgricultureForesrtyFishingOrHunting = 0,
  CareerArtsEntetainmentOrRecreation = 1,
  CareerBroadcasting = 2,
  CareerConstruction = 3,
  CareerEducation = 4,
  CareerFinanceAndInsurance = 5,
  CareerGovernmentAndPublicAdministration = 6,
  CareerHealthCareAndSocialAssistance = 7,
  CareerHomemaker = 8,
  CareerHotelAndFoodServices = 9,
  CareerInformationOther = 10,
  CareerInformationServicesAndData = 11,
  CareerLegalServices = 12,
  CareerManufacturingComputerAndElectronics = 13,
  CareerManufacturingOther = 14,
  CareerMilitary = 15,
  CareerMining = 16,
  CareerProcessing = 17,
  CareerPublishing = 18,
  CareerRealEstateRentalOrLeasing = 19,
  CareerReligious = 20,
  CareerRetail = 21,
  CareerRetired = 22,
  CareerScientificOrTechnicalServices = 23,
  CareerSoftware = 24,
  CareerStudent = 25,
  CareerTelecommunications = 26,
  CareerTransportAndWarehousing = 27,
  CareerUnemployed = 28,
  CareerEnergyUtilitiesOilAndGas = 29,
  CareerWholesale = 30,
  CareerOther = 31,
  CareerAdvertising = 32,
  CareerAutomotive = 33,
  CareerConsulting = 34,
  CareerFashionApparel = 35,
  CareerHumanResources = 36,
  CareerMarketResearch = 37,
  CareerMarketingSales = 38,
  CareerShippingDistribution = 39,
  CareerPersonalServices = 40,
  CareerSecurity = 41,
};

typedef SWIFT_ENUM(NSInteger, Education, open) {
  EducationElementarySchool = 0,
  EducationMiddleSchool = 1,
  EducationHighSchool = 2,
  EducationVocationalTechnicalCollege = 3,
  EducationUniversity = 4,
  EducationPostGraduate = 5,
};

typedef SWIFT_ENUM(NSInteger, Employment, open) {
  EmploymentEmployedForWages = 0,
  EmploymentSelfEmployed = 1,
  EmploymentUnemployedLooking = 2,
  EmploymentUnemployedNotLooking = 3,
  EmploymentHomemaker = 4,
  EmploymentStudent = 5,
  EmploymentMilitary = 6,
  EmploymentRetired = 7,
  EmploymentUnableToWork = 8,
  EmploymentOther = 9,
};


typedef SWIFT_ENUM(NSInteger, Gender, open) {
  GenderFemale = 1,
  GenderMale = 2,
  GenderOther = 3,
};

typedef SWIFT_ENUM(NSInteger, Income, open) {
  IncomeLowerI = 0,
  IncomeLowerII = 1,
  IncomeMiddleI = 2,
  IncomeMiddleII = 3,
  IncomeHighI = 4,
  IncomeHighII = 5,
  IncomeHighIII = 6,
  IncomePreferNotToSay = 7,
};

typedef SWIFT_ENUM(NSInteger, IndicatorPosition, open) {
  IndicatorPositionTopLeft = 0,
  IndicatorPositionTopRight = 1,
  IndicatorPositionMiddleLeft = 2,
  IndicatorPositionMiddleRight = 3,
  IndicatorPositionBottomLeft = 4,
  IndicatorPositionBottomRight = 5,
};

typedef SWIFT_ENUM(NSInteger, MaritalStatus, open) {
  MaritalStatusSingle = 0,
  MaritalStatusMarried = 1,
  MaritalStatusDivorced = 2,
  MaritalStatusLivingWithParent = 3,
  MaritalStatusSeparated = 4,
  MaritalStatusWidowed = 5,
  MaritalStatusPreferNotToSay = 6,
};

typedef SWIFT_ENUM(NSInteger, NumberOfEmployees, open) {
  NumberOfEmployeesOne = 0,
  NumberOfEmployeesTwoToFive = 1,
  NumberOfEmployeesSixToTen = 2,
  NumberOfEmployeesElevenToTwentyFive = 3,
  NumberOfEmployeesTwentySixToFifty = 4,
  NumberOfEmployeesFiftyOneToHundrend = 5,
  NumberOfEmployeesHundrendOneToTwoHundrendsFifty = 6,
  NumberOfEmployeesTwoHundrendsFiftyOneToFiveHundrends = 7,
  NumberOfEmployeesFiveHundrendsOneToThousand = 8,
  NumberOfEmployeesThousandOneToFiveThousands = 9,
  NumberOfEmployeesGreaterThanFiveThousands = 10,
  NumberOfEmployeesDoNotWork = 11,
  NumberOfEmployeesPreferNotToSay = 12,
};

typedef SWIFT_ENUM(NSInteger, OrganizationRole, open) {
  OrganizationRoleOwnerPartner = 0,
  OrganizationRolePresidentCeoChairperson = 1,
  OrganizationRoleCLevelExecutive = 2,
  OrganizationRoleMiddleMangement = 3,
  OrganizationRoleChiefFinancialOfficer = 4,
  OrganizationRoleChiefTechnicalOfficer = 5,
  OrganizationRoleSeniorMangement = 6,
  OrganizationRoleDirector = 7,
  OrganizationRoleHrManagement = 8,
  OrganizationRoleProductManager = 9,
  OrganizationRoleSupplyManagement = 10,
  OrganizationRoleProjectManagement = 11,
  OrganizationRoleSalesManager = 12,
  OrganizationRoleBusinessAdministrator = 13,
  OrganizationRoleSupervisor = 14,
  OrganizationRoleAdministrativeClerical = 15,
  OrganizationRoleCraftsman = 16,
  OrganizationRoleForeman = 17,
  OrganizationRoleTechnicalStaff = 18,
  OrganizationRoleFacultyStaff = 19,
  OrganizationRoleSalesStatff = 20,
  OrganizationRoleBuyerPurchasingAgent = 21,
  OrganizationRoleOtherNonManagement = 22,
  OrganizationRoleNotWork = 23,
  OrganizationRolePreferNotToSay = 24,
};

typedef SWIFT_ENUM(NSInteger, Parental, open) {
  ParentalZero = 0,
  ParentalOne = 1,
  ParentalTwo = 2,
  ParentalThree = 3,
  ParentalFour = 4,
  ParentalFive = 5,
  ParentalSixOrMore = 6,
  ParentalPreferNotToSay = 7,
};

typedef SWIFT_ENUM(NSInteger, Platform, open) {
  PlatformNative = 0,
  PlatformFlutter = 1,
  PlatformCordova = 2,
  PlatformUnity = 3,
  PlatformAdMob = 4,
  PlatformMoPub = 5,
  PlatformReactNative = 6,
};


SWIFT_CLASS("_TtC8Pollfish8Pollfish")
@interface Pollfish : NSObject
- (nonnull instancetype)init SWIFT_UNAVAILABLE;
+ (nonnull instancetype)new SWIFT_UNAVAILABLE_MSG("-init is unavailable");
@end



@class PollfishParams;
@protocol PollfishDelegate;
@class NSNumber;

@interface Pollfish (SWIFT_EXTENSION(Pollfish))
+ (void)initWith:(PollfishParams * _Nonnull)params delegate:(id <PollfishDelegate> _Nullable)delegate SWIFT_METHOD_FAMILY(none);
+ (void)show;
+ (void)hide;
+ (BOOL)isPollfishPresent SWIFT_WARN_UNUSED_RESULT;
+ (BOOL)isPollfishPanelOpen SWIFT_WARN_UNUSED_RESULT;
@end


@class SurveyInfo;

SWIFT_PROTOCOL("_TtP8Pollfish16PollfishDelegate_")
@protocol PollfishDelegate
@optional
- (void)pollfishOpened;
- (void)pollfishClosed;
- (void)pollfishSurveyReceivedWithSurveyInfo:(SurveyInfo * _Nullable)surveyInfo;
- (void)pollfishSurveyCompletedWithSurveyInfo:(SurveyInfo * _Nonnull)surveyInfo;
- (void)pollfishSurveyNotAvailable;
- (void)pollfishUserRejectedSurvey;
- (void)pollfishUserNotEligible;
@end

@class NSString;
enum SurveyFormat : NSInteger;
@class UserProperties;
@class UIView;
@class RewardInfo;

SWIFT_CLASS("_TtC8Pollfish14PollfishParams")
@interface PollfishParams : NSObject
- (nonnull instancetype)init:(NSString * _Nonnull)apiKey OBJC_DESIGNATED_INITIALIZER;
- (PollfishParams * _Nonnull)rewardMode:(BOOL)rewardMode;
- (PollfishParams * _Nonnull)releaseMode:(BOOL)releaseMode;
- (PollfishParams * _Nonnull)offerwallMode:(BOOL)offerwallMode;
- (PollfishParams * _Nonnull)requestUUID:(NSString * _Nonnull)requestUUID;
- (PollfishParams * _Nonnull)surveyFormat:(enum SurveyFormat)surveyFormat;
- (PollfishParams * _Nonnull)userProperties:(UserProperties * _Nonnull)userProperties;
- (PollfishParams * _Nonnull)indicatorPosition:(enum IndicatorPosition)indicatorPosition;
- (PollfishParams * _Nonnull)indicatorPadding:(NSInteger)indicatorPadding;
- (PollfishParams * _Nonnull)viewContainer:(UIView * _Nonnull)viewContainer;
- (PollfishParams * _Nonnull)rewardInfo:(RewardInfo * _Nonnull)rewardInfo;
- (PollfishParams * _Nonnull)signature:(NSString * _Nonnull)signature;
- (PollfishParams * _Nonnull)clickId:(NSString * _Nonnull)clickId;
- (PollfishParams * _Nonnull)platform:(enum Platform)platform;
- (nonnull instancetype)init SWIFT_UNAVAILABLE;
+ (nonnull instancetype)new SWIFT_UNAVAILABLE_MSG("-init is unavailable");
@end

typedef SWIFT_ENUM(NSInteger, Race, open) {
  RaceArab = 0,
  RaceAsian = 1,
  RaceBlack = 2,
  RaceWhite = 3,
  RaceHispanic = 4,
  RaceLatino = 5,
  RaceMultiracial = 6,
  RaceOther = 7,
  RacePreferNotToSay = 8,
};


SWIFT_CLASS("_TtC8Pollfish10RewardInfo")
@interface RewardInfo : NSObject
- (nullable instancetype)initWithRewardName:(NSString * _Nonnull)rewardName rewardConversion:(float)rewardConversion OBJC_DESIGNATED_INITIALIZER;
@property (nonatomic, readonly, copy) NSString * _Nonnull description;
- (nonnull instancetype)init SWIFT_UNAVAILABLE;
+ (nonnull instancetype)new SWIFT_UNAVAILABLE_MSG("-init is unavailable");
@end

typedef SWIFT_ENUM(NSInteger, SpokenLanguage, open) {
  SpokenLanguageEnglish = 0,
  SpokenLanguageArabic = 1,
  SpokenLanguageBulgarian = 2,
  SpokenLanguageChinese = 3,
  SpokenLanguageCzech = 4,
  SpokenLanguageDanish = 5,
  SpokenLanguageDutch = 6,
  SpokenLanguageFilipino = 7,
  SpokenLanguageThai = 8,
  SpokenLanguageFinnish = 9,
  SpokenLanguageFrench = 10,
  SpokenLanguageGerman = 11,
  SpokenLanguageGreek = 12,
  SpokenLanguageHindi = 13,
  SpokenLanguageIndonesian = 14,
  SpokenLanguageItalian = 15,
  SpokenLanguageJapanese = 16,
  SpokenLanguagePolish = 17,
  SpokenLanguagePortuguese = 18,
  SpokenLanguageRomanian = 19,
  SpokenLanguageRussian = 21,
  SpokenLanguageSerbian = 22,
  SpokenLanguageSpanish = 23,
  SpokenLanguageSwedish = 24,
  SpokenLanguageTurkish = 25,
  SpokenLanguageVietnamese = 26,
  SpokenLanguageKorean = 27,
  SpokenLanguageHungarian = 28,
  SpokenLanguageChineseTraditional = 29,
  SpokenLanguageNorwegian = 30,
  SpokenLanguageEgyptian = 31,
  SpokenLanguageUkrainian = 32,
  SpokenLanguageHebrew = 33,
  SpokenLanguageBengali = 34,
  SpokenLanguageSlovak = 35,
  SpokenLanguagePersian = 36,
  SpokenLanguageAzerbaijani = 37,
  SpokenLanguageGeorgian = 38,
  SpokenLanguageLithuanian = 39,
  SpokenLanguagePunjabi = 40,
  SpokenLanguagePashto = 41,
  SpokenLanguageEstonian = 42,
  SpokenLanguageUzbek = 43,
};

typedef SWIFT_ENUM(NSInteger, SurveyFormat, open) {
  SurveyFormatBasic = 0,
  SurveyFormatPlayful = 1,
  SurveyFormatRandom = 2,
  SurveyFormatThirdParty = 3,
};


SWIFT_CLASS("_TtC8Pollfish10SurveyInfo")
@interface SurveyInfo : NSObject
@property (nonatomic, readonly, strong) NSNumber * _Nullable cpa;
@property (nonatomic, readonly, strong) NSNumber * _Nullable loi;
@property (nonatomic, readonly, strong) NSNumber * _Nullable ir;
@property (nonatomic, readonly, copy) NSString * _Nullable surveyClass;
@property (nonatomic, readonly, copy) NSString * _Nullable rewardName;
@property (nonatomic, readonly, strong) NSNumber * _Nullable rewardValue;
@property (nonatomic, readonly, strong) NSNumber * _Nullable remainingCompletes;
@property (nonatomic, readonly, copy) NSString * _Nonnull description;
- (nonnull instancetype)init SWIFT_UNAVAILABLE;
+ (nonnull instancetype)new SWIFT_UNAVAILABLE_MSG("-init is unavailable");
@end








@class NSArray;

SWIFT_CLASS("_TtC8Pollfish14UserProperties")
@interface UserProperties : NSObject
- (UserProperties * _Nonnull)gender:(enum Gender)gender;
- (UserProperties * _Nonnull)yearOfBirth:(NSInteger)yearOfBirth;
- (UserProperties * _Nonnull)maritalStatus:(enum MaritalStatus)maritalStatus;
- (UserProperties * _Nonnull)parental:(enum Parental)parental;
- (UserProperties * _Nonnull)education:(enum Education)education;
- (UserProperties * _Nonnull)employment:(enum Employment)employment;
- (UserProperties * _Nonnull)career:(enum Career)career;
- (UserProperties * _Nonnull)race:(enum Race)race;
- (UserProperties * _Nonnull)income:(enum Income)income;
- (UserProperties * _Nonnull)spokenLanguages:(NSArray * _Nonnull)spokenLanguages;
- (UserProperties * _Nonnull)organizationRole:(enum OrganizationRole)organizationRole;
- (UserProperties * _Nonnull)numberOfEmployees:(enum NumberOfEmployees)numberOfEmployees;
- (UserProperties * _Nonnull)postalData:(NSString * _Nonnull)postalData;
- (UserProperties * _Nonnull)customAttribute:(NSString * _Nonnull)value forKey:(NSString * _Nonnull)forKey;
- (nonnull instancetype)init OBJC_DESIGNATED_INITIALIZER;
@end


#if __has_attribute(external_source_symbol)
# pragma clang attribute pop
#endif
#pragma clang diagnostic pop
#endif

#endif
