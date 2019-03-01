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
public class UseAuto {
    public static void useAuto(){
        Chevy chevy = new Chevy();
        Ford ford = new Ford();
        
        System.out.println("MARCA:"+chevy.getMake()+" COSTO: $"+chevy.getPrice());
        System.out.println("MARCA:"+ford.getMake()+" COSTO: $"+ford.getPrice());
    }
}
