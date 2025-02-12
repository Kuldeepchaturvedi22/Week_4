package com.PersonalizedMealPlanGenerator;

// definition of KetoMeal class which implements MealPlan
public class KetoMeal implements MealPlan{
    // declaring attributes of this class
    private String type;
    private String name;
    private int caloriesInKcal;

    // parameterized constructor to initialize the objects
    KetoMeal(String name, int calories) {
        this.name = name;
        this.caloriesInKcal = calories;
        this.type = "Keto Meal";
    }

    // overriding all abstract methods of MealPlan interface
    @Override
    public void displayMealPlan(){
        System.out.println("Meal Type: " + this.getType());
        System.out.println("Name of the meal: " + this.getName() + ", Calories: " + this.getCaloriesInKcal());
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getCaloriesInKcal() {
        return this.caloriesInKcal;
    }

    @Override
    public String getType() {
        return this.type;
    }
}
