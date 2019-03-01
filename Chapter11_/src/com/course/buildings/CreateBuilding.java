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
public class CreateBuilding {
    public static void createBuildings(){
        House house = new House();
        School school = new School();
        house.setBaths(2);
        house.setBedrooms(3);
        house.setFootage(10);
        house.setFootage(3);
        school.setStories(12);
        school.setFootage(11);
        school.setClassrooms(20);
        school.setLevel("KinderGarder");
        System.out.println(house.toString());
        System.out.println(school.toString());
        
    }
}
