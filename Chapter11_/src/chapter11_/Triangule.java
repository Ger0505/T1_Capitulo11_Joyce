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
public class Triangule extends GeometricFigure implements SidedObject{
    public Triangule(Integer altura,Integer base) {
        this.height = altura;
        this.width = base;
        this.figure = "Triangule";
        this.area = area();
    }
    
    @Override
    public Double area(){
        return (double)(this.height*this.width)/2;
    }

    @Override
    public void displaySide() {
        System.out.println("Lados 3");
    }
}
