package interfaces;

public class EmpleadoAsalariado implements Empleado{
	
	private final double salarioBase = 1500;
	private int numProyectos;
	private String Nombre;
	
	public EmpleadoAsalariado(int numProyectos, String nombre) {
		
		this.numProyectos = numProyectos;
		this.Nombre = nombre;
		
	}

	@Override
	public String getNombre() {

		return this.Nombre;
		
	}


	@Override
	public double getSalario() {

		return this.salarioBase;
	
	}

	@Override
	public double calcularSalarioTotal() {

		return salarioBase + 200*numProyectos;
	
	}
	
	

}
