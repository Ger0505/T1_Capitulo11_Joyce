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
public class Life extends Insurance{
    public Life() {
        this.type = "Life";
        setCost();
    }
    
    

    @Override
    public void setCost() {
        this.price = 36.0;
    }
}
