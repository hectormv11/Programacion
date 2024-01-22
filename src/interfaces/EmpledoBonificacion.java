package interfaces;

public class EmpledoBonificacion implements Empleado{
	
	private double salarioBase;
	private String nombre;

	public EmpledoBonificacion(double salarioBase, String nombre) {
		
		this.salarioBase = salarioBase;
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

		return this.salarioBase;
	
	}

}
