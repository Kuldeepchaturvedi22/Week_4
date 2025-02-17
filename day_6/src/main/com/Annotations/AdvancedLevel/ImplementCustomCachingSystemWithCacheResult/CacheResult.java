package com.Annotations.AdvancedLevel.ImplementCustomCachingSystemWithCacheResult;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define the CacheResult annotation with runtime retention
@Retention(RetentionPolicy.RUNTIME)
public @interface CacheResult {
}