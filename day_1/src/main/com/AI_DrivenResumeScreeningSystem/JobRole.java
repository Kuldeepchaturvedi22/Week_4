package com.AI_DrivenResumeScreeningSystem;

import java.util.HashSet;
import java.util.List;

public abstract class JobRole {
    String title;
    static List<String>requiredSkills;

    JobRole(String title, List<String>skills){
        this.title = title;
        requiredSkills = skills;
    }

    public static boolean isEligible(List<String> skills){
        return new HashSet<>(skills).containsAll(requiredSkills);
    }
}
