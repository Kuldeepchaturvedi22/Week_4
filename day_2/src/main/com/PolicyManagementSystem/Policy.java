package com.PolicyManagementSystem;

// Class representing an insurance policy
public class Policy implements Comparable<Policy> {
    private String policyNumber;
    private String policyholderName;
    private String expiryDate;
    private String coverageType;
    private double premiumAmount;

    // Constructor to initialize policy attributes
    public Policy(String policyNumber, String policyholderName, String expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    // Getters for policy attributes
    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyholderName() {
        return policyholderName;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    // Method to compare policies based on expiry date
    @Override
    public int compareTo(Policy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    // Override equals method to compare policies based on policy number
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Policy policy = (Policy) o;

        return policyNumber.equals(policy.policyNumber);
    }

    // Override hashCode method to generate hash based on policy number
    @Override
    public int hashCode() {
        return policyNumber.hashCode();
    }

    // Override toString method to provide string representation of policy
    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", policyholderName='" + policyholderName + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", coverageType='" + coverageType + '\'' +
                ", premiumAmount=" + premiumAmount +
                '}';
    }
}