package com.Annotations.AdvancedLevel.ImplementRoleBasedAccessControlWithRoleAllowed;

public class Main {
    public static void main(String[] args) {
        // Create an instance of AdminService
        AdminService adminService = new AdminService();

        // Create a User with ADMIN role
        User adminUser = new User("ADMIN");

        // Create a User with USER role
        User normalUser = new User("USER");

        // Test access with ADMIN user
        AccessControl.invokeMethod(adminService, "performAdminTask", adminUser);

        // Test access with USER user
        AccessControl.invokeMethod(adminService, "performAdminTask", normalUser);
    }
}