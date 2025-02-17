package com.Annotations.AdvancedLevel.ImplementRoleBasedAccessControlWithRoleAllowed;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define the RoleAllowed annotation with runtime retention
@Retention(RetentionPolicy.RUNTIME)
public @interface RoleAllowed {
    String value();
}