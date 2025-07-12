package Modelo;

import java.util.Random;

public class Baralho {
	private Card[] cartas = new Card[52];
	private int proxCarta = 0;
	
	public void baralho() {
		
		int montante = 0;
		
		for(int i = 2; i < 10;i++) {
			cartas[montante++] = new Card(i,Suits.SPADES,"");
			cartas[montante++] = new Card(i,Suits.HEARTS,"");
			cartas[montante++] = new Card(i,Suits.DIAMONDS,"");
			cartas[montante++] = new Card(i,Suits.CLUBS,"");
			
		}
		
		cartas[montante++] = new Card(10, Suits.SPADES, ""); //J de espadas
		cartas[montante++] = new Card(10, Suits.HEARTS, ""); //J de copas
		cartas[montante++] = new Card(10, Suits.DIAMONDS, ""); //J de ouros
		cartas[montante++] = new Card(10, Suits.CLUBS, ""); //J de paus
		
		cartas[montante++] = new Card(10, Suits.SPADES, ""); //Q de espadas
		cartas[montante++] = new Card(10, Suits.HEARTS, ""); //Q de copas
		cartas[montante++] = new Card(10, Suits.DIAMONDS, ""); //Q de ouros
		cartas[montante++] = new Card(10, Suits.CLUBS, ""); //Q de paus
		
		cartas[montante++] = new Card(10, Suits.SPADES, ""); //K de espadas
		cartas[montante++] = new Card(10, Suits.HEARTS, ""); //K de copas
		cartas[montante++] = new Card(10, Suits.DIAMONDS, ""); //K de ouros
		cartas[montante++] = new Card(10, Suits.CLUBS, ""); //K de paus
		
		cartas[montante++] = new Card(11, Suits.SPADES, "");   //Às de espadas
		cartas[montante++] = new Card(11, Suits.HEARTS, "");   //Às de copas
		cartas[montante++] = new Card(11, Suits.DIAMONDS, ""); //Às de ouros
		
		embaralhar();
}
	
	public void embaralhar() {
		Random r = new Random();
		for(int i = 0; i < cartas.length; i++) {
			int j = r.nextInt(cartas.length);
			Card temp = cartas[i];
			cartas[i] = cartas[j];
			cartas[j] = temp;
		}
	}
	
	public Card puxarCarta() {
		if(proxCarta >= cartas.length) {
			throw new IllegalStateException("Baralho não tem nada!");
		}
		return cartas[proxCarta ++];
	}
	
	public boolean temCartas() {
		return proxCarta < cartas.length;
	}
}
