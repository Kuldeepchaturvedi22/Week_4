package com.PolicyManagementSystem;

public class Main {
    public static void main(String[] args) {
        // Create an instance of PolicyManagement to manage policies
        PolicyManagement policyManagement = new PolicyManagement();

        // Create policy objects with sample data
        Policy policy1 = new Policy("P001", "John", "Day 1", "Health", 500.0);
        Policy policy2 = new Policy("P002", "Bob", "Day 2", "Vehicle", 300.0);
        Policy policy3 = new Policy("P003", "Alice", "Day 3", "Home", 400.0);

        // Add policies to the policy management system
        policyManagement.addPolicy(policy1);
        policyManagement.addPolicy(policy2);
        policyManagement.addPolicy(policy3);

        // Retrieve and display all unique policies
        System.out.println("All Unique Policies: " + policyManagement.getAllUniquePolicies());

        // Retrieve and display policies expiring soon (within the next 30 days)
        System.out.println("Policies Expiring Soon: " + policyManagement.getPoliciesExpiringSoon());

        // Retrieve and display policies with a specific coverage type (e.g., Health)
        System.out.println("Policies with Coverage Type 'Health': " + policyManagement.getPoliciesByCoverageType("Health"));

        // Retrieve and display duplicate policies based on policy numbers
        System.out.println("Duplicate Policies: " + policyManagement.getDuplicatePolicies());
    }
}