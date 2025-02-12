package com.AI_DrivenResumeScreeningSystem;

import java.util.ArrayList;
import java.util.Arrays;

public class SoftwareEngineer extends JobRole{

    // specifying required skills while creating a constructor
    SoftwareEngineer(){
        super("Software Engineer", new ArrayList<>(Arrays.asList("Java", "SpringBoot", "Angular", "JUnit")));
    }

}
