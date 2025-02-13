package com.MapInterface.FindKeyWithHighestValue;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a new HashMap and populate it with some values
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 10);
        map.put('B', 20);
        map.put('C', 15);

        // Find the key with the highest value using the HighestValueKey class
        Character maxKey = HighestValueKey.findKeyWithHighestValue(map);

        // Print the key with the highest value
        System.out.println("Key with the highest value: " + maxKey); // Output: B
    }
}