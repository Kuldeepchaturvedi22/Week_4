package com.Junit.BasicJUnitTest.StringUtilityMethodsTest;

public class Main {
    // Method to reverse a given string
    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Method to check if a given string is a palindrome
    public boolean isPalindrome(String str) {
        String reversed = reverse(str);
        return str.equals(reversed);
    }

    // Method to convert a given string to uppercase
    public String toUpperCase(String str) {
        return str.toUpperCase();
    }
}