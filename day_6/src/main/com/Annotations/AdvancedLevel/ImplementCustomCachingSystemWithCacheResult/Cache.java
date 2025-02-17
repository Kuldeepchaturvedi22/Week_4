package com.Annotations.AdvancedLevel.ImplementCustomCachingSystemWithCacheResult;

import java.util.HashMap;
import java.util.Map;

// Class to handle caching using a HashMap
public class Cache {
    private static final Map<String, Object> cache = new HashMap<>();

    // Method to get a cached result
    public static Object get(String key) {
        return cache.get(key);
    }

    // Method to put a result in the cache
    public static void put(String key, Object value) {
        cache.put(key, value);
    }
}