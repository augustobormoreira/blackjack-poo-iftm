package Modelo;

public class Player extends Person{
	private double chips;
	private String name;
	
	public Player(double chips, String name) {
		super();
		this.name = name;
		this.chips = chips;
	}

	public double getChips() {
		return chips;
	}

	public String getName() {
		return name;
	}
	
	public void ganharFichas(double valor) {
		this.chips += chips;
	}
	
	public void perderFichas(double valor) {
		this.chips -= valor;
		if(this.chips < 0) {
			this.chips = 0;
		}
	}
	
	@Override
	public void mostrarMao() {
		System.out.println("Mao do jogador: " + name + ":");
		super.mostrarMao();
	}
}
