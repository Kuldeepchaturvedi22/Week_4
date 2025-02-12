package com.PersonalizedMealPlanGenerator;

import java.util.Scanner;

// definition of Main class
public class Main {
    // main method
    public static void main(String[] args) {
        Meal<MealPlan> meal = new Meal<>(); // object of Meal class
        Scanner sc = new Scanner(System.in); // object of scanner class

        // creating meal plan for all meal types
        MealPlan vegetarian1 = new VegetarianMeal("Veg1", 225);
        MealPlan vegetarian2 = new VegetarianMeal("Veg2", 350);

        MealPlan vegan1 = new VeganMeal("Vegan1", 300);
        MealPlan vegan2 = new VeganMeal("Vegan2", 250);

        MealPlan keto1 = new KetoMeal("Keto1", 400);
        MealPlan keto2 = new KetoMeal("Keto2", 450);

        MealPlan highProtein1 = new HighProteinMeal("High Protein 1", 450);
        MealPlan highProtein2 = new HighProteinMeal("High Protein 2", 350);

        // adding all meals to the meal list
        meal.addMeal(vegetarian1);
        meal.addMeal(vegan1);
        meal.addMeal(keto1);
        meal.addMeal(highProtein1);
        meal.addMeal(vegetarian2);
        meal.addMeal(vegan2);
        meal.addMeal(keto2);
        meal.addMeal(highProtein2);

        // displaying details of all meals
        System.out.println("Displaying All Meals:");
        meal.displayAllMeal();
    }
}

