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
public class Square extends GeometricFigure{

    public Square(Integer lado) {
        this.height = this.width = lado;
        this.figure = "Square";
        this.area = area();
    }
    
    @Override
    public Double area(){
        return (double)this.height*this.width;
    }

    
}
