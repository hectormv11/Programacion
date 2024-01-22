package interfaces;

public class Departamento {
	
	Empleado[] em;
	
	public Departamento() {
		
		em = new Empleado[40];
		
	}
	

	public boolean agragarEmpleado(Empleado otro) {
		
		for (int i = 0; i < em.length; i++) {
			
			if(em[i] == null) {
				em[i] = otro;
				return true;
			}
			
		}
		return false;
	}
	
	public double calcularCostoTotal(){
		
		double totalMes = 0;
		
		for (int i = 0; i < em.length; i++) {
			
			Empleado actual = em[i];
			
			if(actual != null) {
				
				totalMes += actual.calcularSalarioTotal();

			}
			
		}
		
		return totalMes;
		
	}

}
