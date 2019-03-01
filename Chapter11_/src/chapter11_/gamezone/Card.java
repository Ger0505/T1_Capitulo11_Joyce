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
public class Card {
    final int CARDS_IN_SUIT = 13;
    final char [] TYPE ={'s','h','d','c'};
    
    
    private int valor = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
    private char tipo = TYPE[((int)(Math.random()*100)%3)];

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
