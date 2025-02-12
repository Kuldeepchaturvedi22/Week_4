package com.AI_DrivenResumeScreeningSystem;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductManager extends JobRole{

    // specifying required skills while creating a constructor
    ProductManager(){
        super("Product Manager", new ArrayList<>(Arrays.asList("AWS", "Project management Tools", "Testing")));
    }
}
