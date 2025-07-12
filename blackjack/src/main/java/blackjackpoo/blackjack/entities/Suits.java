package Modelo;

public enum Suits { // peguei a ideia de um video de um gringo, se quiser que eu tiro é só falar;
	HEARTS,
	DIAMONDS,
	CLUBS,
	SPADES;
	
public String toString() {
	switch(this) {
		case HEARTS: return "copas";
		case DIAMONDS: return "ouros";
		case CLUBS: return "paus";
		case SPADES: return "espadas";
		default: return "";
		}
	}

}