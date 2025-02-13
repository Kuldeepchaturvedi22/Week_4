package com.PolicyManagementSystem;

import java.util.*;

// Class to manage policies using different types of sets
public class PolicyManagement {
    private Set<Policy> hashSet = new HashSet<>();
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private Set<Policy> treeSet = new TreeSet<>();

    // Method to add a policy to all sets
    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    // Method to remove a policy from all sets
    public void removePolicy(Policy policy) {
        hashSet.remove(policy);
        linkedHashSet.remove(policy);
        treeSet.remove(policy);
    }

    // Method to retrieve all unique policies
    public Set<Policy> getAllUniquePolicies() {
        return new HashSet<>(hashSet);
    }

    // Method to retrieve policies expiring soon (within the next 30 days)
    public Set<Policy> getPoliciesExpiringSoon() {
        Set<Policy> expiringSoon = new HashSet<>();
        List<String> soonDays = Arrays.asList("Day 1", "Day 2");

        for (Policy policy : treeSet) {
            if (soonDays.contains(policy.getExpiryDate())) {
                expiringSoon.add(policy);
            }
        }
        return expiringSoon;
    }

    // Method to retrieve policies by coverage type
    public Set<Policy> getPoliciesByCoverageType(String coverageType) {
        Set<Policy> policies = new HashSet<>();
        for (Policy policy : hashSet) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                policies.add(policy);
            }
        }
        return policies;
    }

    // Method to retrieve duplicate policies based on policy numbers
    public Set<Policy> getDuplicatePolicies() {
        Set<Policy> duplicates = new HashSet<>();
        Set<String> policyNumbers = new HashSet<>();
        for (Policy policy : hashSet) {
            if (!policyNumbers.add(policy.getPolicyNumber())) {
                duplicates.add(policy);
            }
        }
        return duplicates;
    }

    // Method to compare performance of different sets (to be implemented)
    public void comparePerformance() {
        // Implement performance comparison logic here
    }
}