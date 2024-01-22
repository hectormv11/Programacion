package interfaces;

public class Main {
	
	public static void main(String[] args) {
		
		Departamento dpto = new Departamento();
		
		Empleado as1 = new EmpleadoAsalariado(10, "Hector");
		Empleado as2 = new EmpleadoAsalariado(20, "Maria");

		
		Empleado ph1 = new EmpleadoPorHoras(9, "Pepito");
		Empleado ph2 = new EmpleadoPorHoras(2, "Juan");
		
		
		Empleado b1 = new EmpledoBonificacion(9, "Pepito");
		Empleado b2 = new EmpledoBonificacion(2, "Juan");
		
		
		dpto.agragarEmpleado(as1);
		dpto.agragarEmpleado(as2);
		dpto.agragarEmpleado(ph1);
		dpto.agragarEmpleado(ph2);
		dpto.agragarEmpleado(b1);
		dpto.agragarEmpleado(b2);
		
		System.out.println(dpto.calcularCostoTotal());

		
	}

}
