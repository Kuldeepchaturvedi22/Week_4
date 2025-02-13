package com.SetInterface.FindSubsets;

import java.util.Set;

public class FindSubset {
    // Method to check if one set is a subset of another
    public static boolean isSubset(Set<Integer> subset, Set<Integer> set) {
        return set.containsAll(subset);
    }
}