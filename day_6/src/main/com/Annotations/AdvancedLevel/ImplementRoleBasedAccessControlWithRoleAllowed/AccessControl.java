package com.Annotations.AdvancedLevel.ImplementRoleBasedAccessControlWithRoleAllowed;

import java.lang.reflect.Method;

// Class to validate access and invoke methods
public class AccessControl {

    // Method to invoke a method with role validation
    public static void invokeMethod(Object obj, String methodName, User user) {
        try {
            // Get the method to be invoked
            Method method = obj.getClass().getMethod(methodName);

            // Check if the method has the RoleAllowed annotation
            if (method.isAnnotationPresent(RoleAllowed.class)) {
                // Get the RoleAllowed annotation
                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);

                // Validate the user role
                if (roleAllowed.value().equals(user.getRole())) {
                    method.invoke(obj); // Invoke the method if the role matches
                } else {
                    System.out.println("Access Denied!"); // Print access denied if the role does not match
                }
            } else {
                method.invoke(obj); // Invoke the method if no RoleAllowed annotation is present
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}