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
public class InternationalDivision extends Division{
    private String country;
    private String language;

    public InternationalDivision(String country, String language, String name, Integer number) {
        super(name, number);
        this.country = country;
        this.language = language;
    }
    
    @Override
    public void display(){
        System.out.println("Country:"+this.country+" Language:"+this.language+" Name:"+this.name+" Number:"+this.number);
    }
}
