/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_.gamezone;

import java.util.ArrayList;

/**
 *
 * @author Gerardo A A
 */
public class Poker extends CardGame{

    public Poker() {
        this.dealt_cards = 5;
    }

    @Override
    public void displayDescription() {
        System.out.println("No se como se juega el Poker pero bueno");
    }

    @Override
    public void deal() {
        ArrayList<Card> cartas = new ArrayList<>();
        for(int i = 0; i<this.dealt_cards;i++){
            cartas.add(new Card());
        }
        
        for(Card c:cartas){
            System.out.println(c.getTipo()+" "+c.getValor());
        }
    }
    
}
