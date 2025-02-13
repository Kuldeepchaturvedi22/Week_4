package com.MapInterface.MergeTwoMaps;

import java.util.HashMap;
import java.util.Map;

public class Merge {
    // Method to merge two maps
    public static Map<Character, Integer> merge(Map<Character, Integer> map1, Map<Character, Integer> map2) {
        Map<Character, Integer> mergedMap = new HashMap<>(map1);

        // Iterate through each entry in the second map
        for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
            // If the key exists in the merged map, sum the values
            mergedMap.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        return mergedMap;
    }
}