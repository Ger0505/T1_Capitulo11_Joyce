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
public class BookArray {
    public static void bookArray(){
        Book[] libro = new Book[10];
        libro[0] = new Fiction("Anas");
        libro[1] = new Fiction("Pistolas");
        libro[2] = new Fiction("Aliens");
        libro[3] = new Fiction("Querer");
        libro[4] = new Fiction("Aliento");
        libro[5] = new NonFiction("Historias de una Geisa");
        libro[6] = new NonFiction("Gerardo Acevedo");
        libro[7] = new NonFiction("Relatos");
        libro[8] = new NonFiction("Programación en Java");
        libro[9] = new NonFiction("Constitución Politica de los Estados Unidos Mexicanos");
        
        for(Book book: libro){
            System.out.println(book.toString());
        }
    }
}
