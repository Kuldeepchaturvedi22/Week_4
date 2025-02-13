package com.ListInterface.FindElementFrequency;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindFrequency {

    // Method to find the frequency of each element in the list
    public static Map<String, Integer> frequency(List<String> list) {
        Map<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            // If the element is not in the map, add it with a frequency of 1
            if (!hashMap.containsKey(list.get(i))) {
                hashMap.put(list.get(i), 1);
            } else {
                // If the element is already in the map, increment its frequency
                hashMap.put(list.get(i), hashMap.get(list.get(i)) + 1);
            }
        }
        return hashMap;
    }
}