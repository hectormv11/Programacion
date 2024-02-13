package proyecto2;

public class Avion {
	
	Billete[][] asientos;
	
	public Avion() {
		
		asientos = new Billete[10][6];
		
	}
	
	public void imprimirAsientos() {
		
		for (int i = 0; i < asientos.length; i++) {
			for (int j = 0; j < asientos[i].length; j++) {
				System.out.print(asientos[i][j]);
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		
	}

}
