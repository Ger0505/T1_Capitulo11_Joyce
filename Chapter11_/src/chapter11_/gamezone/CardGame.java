/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_.gamezone;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Gerardo A A
 */
public abstract class CardGame {
    protected Integer dealt_cards;
    private ArrayList<Card> deck;

    public CardGame() {
        deck = new ArrayList<>();
        for(int i = 0 ;i<52;i++){
            deck.add(new Card());
        }
        
    }
    
    public void shuffle(){
         int cantidad = deck.size();
        Random az = new Random();
        for(int k=cantidad-1;k>=1;k--){
            int p = az.nextInt(k);
            Card tmp = deck.get(p);
            deck.set(p,deck.get(k));
            deck.set(k, tmp);
        }
    }
    
    public abstract void displayDescription();
    public abstract void deal();        
            
}
