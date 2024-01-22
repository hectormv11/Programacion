package p23;

public class Main {
	
	public static void main(String[] args) {
		
		Circulo c1 = new Circulo("circulo 1", "amarillo", 1.5);
		System.out.println(Math.ceil(c1.calcularArea()));
		System.out.println(Math.ceil(c1.calcularLongitud()));
		System.out.println(c1.getColor() + ", " + c1.getNombre());
		
		Rectangulo r1 = new Rectangulo(5, 2, "rectangulo 1", "amarillo");
		System.out.println(Math.ceil(r1.calcularArea()));
		System.out.println(Math.ceil(r1.calcularPerimetro()));
		System.out.println(c1.getColor() + ", " + r1.getNombre());
		
	}
	
	}
