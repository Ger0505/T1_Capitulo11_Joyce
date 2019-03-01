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
public abstract class Insurance {
    protected String type;
    protected Double price;
    
    public abstract void setCost();

    @Override
    public String toString() {
        return "Insurance{" + "type=" + type + ", price=" + price + '}';
    }
    
}
