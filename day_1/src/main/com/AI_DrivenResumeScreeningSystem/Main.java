package com.AI_DrivenResumeScreeningSystem;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // creating softwareEngineer object initialize the requiredSkills
        SoftwareEngineer softwareEngineer = new SoftwareEngineer();
        Resume<SoftwareEngineer> resume1 = new Resume<>("Anshik", new ArrayList<>(Arrays.asList("Java", "SpringBoot", "Angular", "JUnit")), softwareEngineer);
        System.out.println("Is candidate eligible for the position : " + resume1.isMatched(resume1, softwareEngineer));

        // creating dataScientist object initialize the requiredSkills
        DataScientist dataScientist = new DataScientist();
        Resume<DataScientist> resume2 = new Resume<>("Aayush", new ArrayList<>(Arrays.asList("Python", "PowerBI", "Visual Basics", "Java")), dataScientist);
        System.out.println("Is candidate eligible for the position : " + resume2.isMatched(resume2, dataScientist));

        // creating productManager object initialize the requiredSkills
        ProductManager productManager = new ProductManager();
        Resume<ProductManager> resume3 = new Resume<>("Durgesh", new ArrayList<>(Arrays.asList("AWS", "Project management Tools", "Testing")), productManager);
        System.out.println("Is candidate eligible for the position : " + resume3.isMatched(resume3, productManager));
    }
}
