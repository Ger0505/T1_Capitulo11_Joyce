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
public class Chevy extends Auto{

    public Chevy() {
        this.make = "Chevy";
        setPrice();
    }
    
    

    @Override
    public void setPrice() {
        this.price = 20000;
    }
    
}
