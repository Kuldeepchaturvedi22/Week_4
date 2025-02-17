package com.Annotations.AdvancedLevel.ImplementRoleBasedAccessControlWithRoleAllowed;

// Define a service class with methods to be restricted
public class AdminService {

    // Apply the RoleAllowed annotation to restrict access to ADMIN role
    @RoleAllowed("ADMIN")
    public void performAdminTask() {
        System.out.println("Admin task performed");
    }
}