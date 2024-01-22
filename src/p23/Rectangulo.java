package p23;

public class Rectangulo extends Figura{
	
	double base;
	double altura;
	
	public Rectangulo(double base, double altura, String nombre, String color) {
		super(nombre, color);
		this.base = base;
		this.altura = altura;
	}
	
	public double calcularPerimetro() {
		
		return 2*(base + altura);
		
	}
	
	public double calcularArea() {
		
		return base*altura;
		
	}

}
