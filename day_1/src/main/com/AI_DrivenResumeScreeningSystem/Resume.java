package com.AI_DrivenResumeScreeningSystem;

import java.util.List;

public class Resume <T extends JobRole>{
    String name;
    List<String>skills;
    T jobRole;      // this will be the jobRole object that will help in comparing the resume

    Resume(String name, List<String>skills, T jobRole){
        this.name = name;
        this.skills = skills;
        this.jobRole = jobRole;
    }

    public <T extends JobRole> boolean isMatched (Resume<T> resume, T jobrole){

        // checking reference of each object and then comparing the skills
        if(jobrole instanceof SoftwareEngineer){
            return JobRole.isEligible(resume.skills);
        }
        if(jobrole instanceof DataScientist){
            return JobRole.isEligible(resume.skills);
        }
        if(jobrole instanceof ProductManager){
            return JobRole.isEligible(resume.skills);
        }

        return false;
    }
}
