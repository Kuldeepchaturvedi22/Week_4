package com.MapInterface.InvertMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a new HashMap and populate it with some values
        Map<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('A', 1);
        hashMap.put('B', 2);
        hashMap.put('C', 1);

        // Invert the map using the InvertMap class
        Map<Integer, List<Character>> invertedMap = InvertMap.invert(hashMap);

        // Print the inverted map
        System.out.println(invertedMap);
    }
}