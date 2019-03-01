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
public class Health extends Insurance{

    public Health() {
        this.type = "Health";
        setCost();
    }
    
    

    @Override
    public void setCost() {
        this.price = 196.0;
    }
    
}
