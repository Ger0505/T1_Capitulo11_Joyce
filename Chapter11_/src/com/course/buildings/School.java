/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.buildings;

/**
 *
 * @author Gerardo A A
 */
public class School extends Buildings{
    private Integer classrooms;
    private String level;

    public Integer getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(Integer classrooms) {
        this.classrooms = classrooms;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "School{" + "classrooms=" + classrooms + ", level=" + level +" "+ super.toString();
    }
    
    
    
    
}
