package com.PersonalizedMealPlanGenerator;

// definition of VegetarianMeal class which implements MealPlan
public class VegetarianMeal implements MealPlan{
    // declaring attributes of this class
    private String type;
    private String name;
    private int caloriesInKcal;

    // parameterized constructor to initialize the objects
    VegetarianMeal(String name, int calories) {
        this.name = name;
        this.caloriesInKcal = calories;
        this.type = "Vegetarian Meal";
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
