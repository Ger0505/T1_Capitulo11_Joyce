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
public class EquipmentWithLesson extends  Equipment{

    public EquipmentWithLesson(Integer type) {
        super(type);
        setFee(getFee()+27);
    }

    @Override
    public String lessonPolicy() {
        return "This type of rental require a lesson for $27.00";
    }
    
}
