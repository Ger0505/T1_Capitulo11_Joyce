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
public abstract class Book {
    private String name;
    protected Double price;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
    
    public abstract void setPrice();

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", price= $" + price + '}';
    }
    
    
}
