package com.example.projectlist;

import java.util.ArrayList;
import java.util.List;

public class ProjectExpert {
    List<String> getProjectNames(String project) {
        List<String> projectName = new ArrayList<>();
        if (project.equals("Academic")) {
            projectName.add("1. University Management System");
            projectName.add("2. Result Analysis System");
            projectName.add("3. Automated Syllabus Maker");
        } else if (project.equals("Business")) {
            projectName.add("1. Ecommerce Site");
            projectName.add("2. Daraz Clone");
            projectName.add("3. Stock Management System");
        }else {
            projectName.add("1. Hospital Management System");
            projectName.add("2. Medicine Management System");
            projectName.add("3. Patient Record System");
        }

        return projectName;
    }
}
