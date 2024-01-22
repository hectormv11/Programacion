package abstract1;

public class Rectangulo extends FiguraGeometrica {

	private double base;
	private double altura;
	
	public Rectangulo(String color, double base, double altura) {
		
		this.color = color;
		this.base = base;
		this.altura = altura;
	}
	
	public double calcularArea() {
		
		return Math.ceil(base*altura);
		
	}

	void imprimirDetalles() {
		
		System.out.println(color + ", " + base + ", " + altura + ", " + calcularArea());
		
	}

}
