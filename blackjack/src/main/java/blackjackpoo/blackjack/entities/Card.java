package Modelo;

public class Card {
	private int value;
	private Suits suit;
	private String path;
	
	public Card(int value, Suits suit, String path) {
		this.value = value;
		this.suit = suit;
		this.path = path;
	}
	
	public int getValue() {
		return value;
	}
	
	public Suits getSuit() {
		return suit;
	}
	
	public String toString() {
		return value + " de " + suit;
	}
}
