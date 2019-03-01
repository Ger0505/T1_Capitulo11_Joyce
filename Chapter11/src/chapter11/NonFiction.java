/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11;

/**
 *
 * @author Gerardo A A
 */
public class NonFiction extends Book{
    public NonFiction(String name) {
        super(name);
        setPrice();
    }
    

    @Override
    public void setPrice() {
        this.price = 37.99;
    }
}
