package interfaces;

public class EmpleadoPorHoras implements Empleado{
	
	private final double salarioBase = 400;
	private int numHoras;
	private String nombre;
	
	

	public EmpleadoPorHoras(int numHoras, String nombre) {
		
		this.numHoras = numHoras;
		this.nombre = nombre;
	}

	@Override
	public String getNombre() {

		return this.nombre;
		
	}

	@Override
	public double getSalario() {

		return this.salarioBase;
		
	}

	@Override
	public double calcularSalarioTotal() {

		return salarioBase + 25*numHoras;
		
	}
	
	

}
