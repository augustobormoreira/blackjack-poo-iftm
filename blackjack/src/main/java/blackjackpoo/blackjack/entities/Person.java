/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackpoo.blackjack.entities;
import java.util.ArrayList;

/**
 *
 * @author Gustim
 */
public class Person {
    private int score;
    private ArrayList<Card> hand;
    
    public Person(){
        this.score = 0;
        this.hand = new ArrayList<>();
    }
    
    public Person(int score, ArrayList hand){
        this.score = score;
        this.hand = hand;
    }
    
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public ArrayList getHand() {
        return hand;
    }

    public void setHand(ArrayList hand) {
        this.hand = hand;
    }
    
    
}
