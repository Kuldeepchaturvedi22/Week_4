package com.Annotations.AdvancedLevel.ImplementCustomCachingSystemWithCacheResult;

import java.lang.reflect.Method;

// Class to handle method invocation with caching
public class CacheHandler {

    // Method to invoke a method with caching
    public static Object invokeMethod(Object obj, String methodName, Object... args) {
        try {
            // Get the method to be invoked
            Method method = obj.getClass().getMethod(methodName, int.class);

            // Check if the method has the CacheResult annotation
            if (method.isAnnotationPresent(CacheResult.class)) {
                // Generate a cache key based on method name and arguments
                String key = methodName + "_" + args[0].toString();

                // Check if the result is already in the cache
                Object cachedResult = Cache.get(key);
                if (cachedResult != null) {
                    return cachedResult; // Return the cached result
                }

                // Invoke the method and cache the result
                Object result = method.invoke(obj, args);
                Cache.put(key, result);
                return result;
            } else {
                // Invoke the method without caching
                return method.invoke(obj, args);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}