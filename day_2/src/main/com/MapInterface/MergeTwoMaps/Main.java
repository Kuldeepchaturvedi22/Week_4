package com.MapInterface.MergeTwoMaps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create two HashMaps and populate them with some values
        Map<Character, Integer> map1 = new HashMap<>();
        map1.put('A', 1);
        map1.put('B', 2);

        Map<Character, Integer> map2 = new HashMap<>();
        map2.put('B', 3);
        map2.put('C', 4);

        // Merge the two maps using the MergeMaps class
        Map<Character, Integer> mergedMap = Merge.merge(map1, map2);

        // Print the merged map
        System.out.println("Merged map: " + mergedMap); // Output: {A=1, B=5, C=4}
    }
}