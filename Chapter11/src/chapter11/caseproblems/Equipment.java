/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11.caseproblems;

/**
 *
 * @author Gerardo A A
 */
public abstract class Equipment {
    public static final String[] EQUIPMENT = {"Jet ski","pontoon boat", "Rowboat","Canoe",
"Kayak", "Beach chair","Umbrella","Other"};
    public static final Integer[] SURCHARGES = {50,40,15,12,10,2,1,0};
    
    private Integer type;
    private String name;
    private Integer fee;

    public Equipment(Integer type) {
        if(type>=0 || type<=6)
            this.type = type;
        else
            this.type = 7;
        this.name = EQUIPMENT[type];
        this.fee = SURCHARGES[type];
    }

    public void setFee(Integer fee) {
        this.fee = fee;
    }
    
    
    public Integer getFee() {
        return fee;
    }

    public Integer getType() {
        return type;
    }

    public String getName() {
        return name;
    }
    
    
    
    public abstract String lessonPolicy();    
}
