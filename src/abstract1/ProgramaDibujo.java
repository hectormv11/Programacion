package abstract1;

public class ProgramaDibujo {
	
	public static void main(String[] args) {
		
		Circulo c = new Circulo("amarillo", 5);
		Rectangulo r = new Rectangulo("rojo", 5, 2);
		Triangulo t = new Triangulo("verde", 7, 5);

		c.imprimirDetalles();
		System.out.println("------------------");
		r.imprimirDetalles();
		System.out.println("------------------");
		t.imprimirDetalles();
		
	}

}
