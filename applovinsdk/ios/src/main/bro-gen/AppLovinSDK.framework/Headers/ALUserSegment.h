//
//  ALUserSegment.h
//  AppLovinSDK
//
//  Created by Thomas So on 10/30/20.
//

NS_ASSUME_NONNULL_BEGIN

/**
 * User segments allow AppLovin to serve ads by using custom-defined rules that are based on which segment the user is in. User segments are custom strings of
 * 32 alphanumeric characters or less.
 */
@interface ALUserSegment : NSObject

/**
 * A custom user segment name with 32 alphanumeric characters or less, as defined in your AppLovin dashboard.
 */
@property (nonatomic, copy, nullable) NSString *name __deprecated_msg("This method is deprecated and will be removed in a future SDK version. Please initialize a ALUserSegment instance in ALSdkInitializationConfiguration");

- (instancetype)initWithName:(NSString *)name;

- (instancetype)init __attribute__((unavailable("Please initialize a ALUserSegment instance in ALSdkInitializationConfiguration")));
+ (instancetype)new NS_UNAVAILABLE;

@end

NS_ASSUME_NONNULL_END
