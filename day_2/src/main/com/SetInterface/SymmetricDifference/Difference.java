package com.SetInterface.SymmetricDifference;

import java.util.HashSet;
import java.util.Set;

public class Difference {
    // Method to compute the symmetric difference of two sets
    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> symmetricDiff = new HashSet<>(set1);
        symmetricDiff.addAll(set2);
        Set<Integer> temp = new HashSet<>(set1);
        temp.retainAll(set2);
        symmetricDiff.removeAll(temp);
        return symmetricDiff;
    }
}