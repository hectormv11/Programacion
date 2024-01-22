package p22;

public class Programador extends Empleado{
	
	private int numProyectos;

	public Programador(int numProyectos, String nom, String dni, double sueldo) {
		
		super(nom, dni, sueldo);
		this.numProyectos = numProyectos;
	}
	
	
	public double calcularSueldoMensual() {
		
		sueldo += 1000*numProyectos;
		
		double retencion = sueldo/15;
		sueldo -= retencion;
		sueldo /= 12;
		
		return sueldo;
		
	}

}
