/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_.gamezone;

/**
 *
 * @author Gerardo A A
 */
public abstract class Alien {
     protected Integer eyes;
    protected String color;
    protected Integer arms;

    public Alien(Integer eyes, String color, Integer arms) {
        this.eyes = eyes;
        this.color = color;
        this.arms = arms;
    }

    @Override
    public String toString() {
        return "Alien{" + "eyes=" + eyes + ", color=" + color + ", name=" + arms + '}';
    }
    
}
