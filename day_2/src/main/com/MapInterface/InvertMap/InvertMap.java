package com.MapInterface.InvertMap;

import java.util.*;

public class InvertMap {
    // Method to invert the given map
    public static Map<Integer, List<Character>> invert(Map<Character, Integer> hashMap) {
        Map<Integer, List<Character>> invertedMap = new HashMap<>();
        Iterator<Map.Entry<Character, Integer>> iterator = hashMap.entrySet().iterator();

        // Iterate through each entry in the original map
        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> entry = iterator.next();
            // If the key (integer) is not already in the inverted map, add it with a new list
            invertedMap.putIfAbsent(entry.getValue(), new ArrayList<>());
            // Add the character to the list corresponding to the integer key
            invertedMap.get(entry.getValue()).add(entry.getKey());
        }
        return invertedMap;
    }
}