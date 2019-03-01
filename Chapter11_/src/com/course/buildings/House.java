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
public class House extends Buildings{
    private Integer bedrooms;
    private Integer baths;

    public Integer getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    public Integer getBaths() {
        return baths;
    }

    public void setBaths(Integer baths) {
        this.baths = baths;
    }

    @Override
    public String toString() {
        return "House{" + "bedrooms=" + bedrooms + ", baths=" + baths +" "+ super.toString();
    }
    
    
    
}
