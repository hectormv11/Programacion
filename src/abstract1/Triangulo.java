package abstract1;

public class Triangulo extends FiguraGeometrica {
	
	private double base;
	private double altura;
	
	public Triangulo(String color, double base, double altura) {
		
		this.color = color;
		this.base = base;
		this.altura = altura;
	}



	public double calcularArea() {
		
		return Math.ceil(base*altura/2);
		
	}
	
	public void imprimirDetalles() {
		
		System.out.println(color + ", " + base + ", " + altura + ", " + calcularArea());

		
	}

}
