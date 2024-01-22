package p23;

public class Circulo extends Figura {
	
	double radio;

	public Circulo(String nombre, String color, double radio) {
		super(nombre, color);
		this.radio = radio;
	}
	
	public double calcularLongitud() {
		
		return 2*Math.PI*radio;
		
	}
	
	public double calcularArea() {
		
		return Math.PI*Math.pow(radio, 2);
		
	}

}
