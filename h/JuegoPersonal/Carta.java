package JuegoPersonal;

import java.util.Random;

public class Carta {

	int numero;
	int palo;

	public Carta() {

	}

	public void crearCarta() {
		
		Random r = new Random();
		numero = r.nextInt(10)+1;
		palo = r.nextInt(10)+1;
		
		
	}

}
