package Modelo;

public class Person {
	protected int score;
	protected Card[] mao = new Card[5]; // Ter no máximo 11 cartas 
	protected int cartasNaMao = 0;
	
	
	public Person() {
		this.score = 0;
	}
	
	public void receberCarta(Card carta) {
		if(cartasNaMao >= mao.length) {
			System.out.println("Sua mão está cheia!!!!");
			return;
		}
		
		mao[cartasNaMao++] = carta;
		score += carta.getValue();
	}
	
	public int getScore() {
		return score;
	}
	
	public void mostrarMao() {
		System.out.println("A mão do jogador é: ");
		for(int i = 0; i < cartasNaMao; i++) {
			System.out.println(mao[i]);
		}
		System.out.println("Total: " + score);
	}
	
	public void resetarMao() {
		score = 0;
		cartasNaMao = 0;
		
		for(int i = 0; i < mao.length; i++) {
			mao[i] = null;
		}
	}
	
}
