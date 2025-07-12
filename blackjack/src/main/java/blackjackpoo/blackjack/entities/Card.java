/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackpoo.blackjack.entities;

/**
 *
 * @author Gustim
 */
public class Card {
    private int value;
    private Suits suit;
    private String path;
    
    public Card(){
        this.value = 0;
        this.suit = null;
        this.path = "";
    }
    
    public Card(int value, Suits suit, String path){
        if(value > 10){
            this.value = 10;
        } else if(value == 1){
            this.value = 11;
        } else{
            this.value = value;
        }
        this.suit = suit;
        this.path = "./assets/" + path;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Suits getSuit() {
        return suit;
    }

    public void setSuit(Suits suit) {
        this.suit = suit;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Card{" + "value=" + value + ", suit=" + suit + ", path=" + path + '}';
    }
    
    
}
