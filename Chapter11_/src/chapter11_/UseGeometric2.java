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
public class UseGeometric2 {
    public static void useGeometric2(){
        Square2 square = new Square2(12);
        Triangule2 triangule = new Triangule2(5,2);
        
        System.out.println(square.toString());
        square.displaySide();
        System.out.println(triangule.toString());
        triangule.displaySide();
    }
}
