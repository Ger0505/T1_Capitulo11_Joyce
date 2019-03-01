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
public class IncomingPhoneCall extends PhoneCall{

    public IncomingPhoneCall(String phone_number) {
        super(phone_number);
        this.price = 0.02;
    }

    @Override
    public String getPhoneNumber() {
        return this.phone_number;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public void display() {
        System.out.println("Numero:"+this.phone_number+" Precio:"+this.price);
    }
    
}
