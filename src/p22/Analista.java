package p22;

public class Analista extends Empleado{
	
	private int gradoDeResponsabilidad;
	private boolean participacionGobierno;
	
	
	public Analista(int gradoR, boolean part, String nombre, String dni, double sueldo) {
		
		super(nombre, dni, sueldo);
		this.gradoDeResponsabilidad = gradoR;
		this.participacionGobierno = part;
		
	}
	
	
	public double calcularSueldoMensual() {
		
		if (gradoDeResponsabilidad > 0 && gradoDeResponsabilidad < 10) {
			sueldo += 1000;
		}
		else if (gradoDeResponsabilidad > 9 && gradoDeResponsabilidad < 20) {
			sueldo += 1100;
		}
		else if (gradoDeResponsabilidad > 19 && gradoDeResponsabilidad < 30) {
			sueldo += 1200;
		}
		else if (gradoDeResponsabilidad > 29 && gradoDeResponsabilidad < 40) {
			sueldo += 1300;
		}
		else if (gradoDeResponsabilidad > 39 && gradoDeResponsabilidad < 50) {
			sueldo += 1400;
		}
		else if (gradoDeResponsabilidad > 49 && gradoDeResponsabilidad < 60) {
			sueldo += 1500;
		}
		else if (gradoDeResponsabilidad > 59 && gradoDeResponsabilidad < 70) {
			sueldo += 1600;
		}
		else if (gradoDeResponsabilidad > 69 && gradoDeResponsabilidad < 80) {
			sueldo += 1700;
		}
		else if (gradoDeResponsabilidad > 79 && gradoDeResponsabilidad < 90) {
			sueldo += 1800;
		}
		else if (gradoDeResponsabilidad > 89 && gradoDeResponsabilidad < 100) {
			sueldo += 1900;
		}
		
		if (participacionGobierno) {
			sueldo += 5000;
		}
		
		double retencion = sueldo/20;
		sueldo -= retencion;
		sueldo /= 14;
		
		return sueldo;
		
	}
	
	public double calcularPagaExtra() {
		
		return 2*calcularSueldoMensual();
		
	}
	

}
