/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_;

/**
 *
 * @author Gerardo A A
 */
public class DomesticDivision extends Division{
    private String state;

    public DomesticDivision(String state, String name, Integer number) {
        super(name, number);
        this.state = state;
    }
    
    @Override
    public void display(){
        System.out.println("State:"+this.state+" Name:"+this.name+" Number:"+this.number);
    }
}
