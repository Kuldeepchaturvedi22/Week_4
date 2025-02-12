package com.PersonalizedMealPlanGenerator;

import java.util.ArrayList;
import java.util.List;

// definition of generic class Meal with bounded type parameters
public class Meal <T extends MealPlan> {
    List<T> meal; // list of objects that extend MealPlan interface

    // non-parameterized constructor
    Meal() {
        meal = new ArrayList<>(); // initializing the list
    }

    // created a method to add the object in the list
    public void addMeal(T obj) {
        meal.add(obj);
    }

    // method to display the state of all the objects in the list
    public void displayAllMeal() {
        for (MealPlan obj : meal) {
            obj.displayMealPlan();
            System.out.println();
        }
    }
}
