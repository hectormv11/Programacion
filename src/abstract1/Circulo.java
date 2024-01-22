package abstract1;

public class Circulo extends FiguraGeometrica {
	
	private double radio;
	
	public Circulo(String color, double radio) {
		
		this.color = color;
		this.radio = radio;
	}



	public double calcularArea() {
		
		return Math.ceil(2*Math.PI*radio);
		
	}

	void imprimirDetalles() {
		
		System.out.println(color + ", " + radio + ", " + calcularArea());
		
	}
	

}
