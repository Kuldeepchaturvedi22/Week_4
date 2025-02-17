package com.Annotations.Exercise.UseDeprecatedToMarkOldMethod;

class LegacyAPI {
    // Mark the oldFeature method as deprecated
    @Deprecated
    public void oldFeature() {
        System.out.println("This is the old feature");
    }

    // Define the newFeature method
    public void newFeature() {
        System.out.println("This is the new feature");
    }
}


public class Main {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();

        // Call the deprecated method
        api.oldFeature();

        // Call the new method
        api.newFeature();
    }
}
