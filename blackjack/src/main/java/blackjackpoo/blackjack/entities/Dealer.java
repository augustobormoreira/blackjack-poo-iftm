package Modelo;

public class Dealer extends Person{
	private boolean canDrawCard;
	
	public Dealer() {
		super();
		this.canDrawCard = true;
	}
	
	public boolean isCanDrawCard() {
		return canDrawCard;
	}
	
	public void setCanDrawCard(boolean canDrawCard) {
		this.canDrawCard = canDrawCard;
	}
	
	public boolean deveComprar() {
		return this.getScore() < 17;
	}
	
	
    @Override
    public void mostrarMao() {
    	System.out.println("Mão do Dealer: ");
    	super.mostrarMao();
    }
}
