package com.MapInterface.FindKeyWithHighestValue;

import java.util.Map;

public class HighestValueKey {
    // Method to find the key with the highest value in the given map
    public static Character findKeyWithHighestValue(Map<Character, Integer> map) {
        Character maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        // Iterate through each entry in the map
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            // Update maxKey and maxValue if the current value is greater than maxValue
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }
}