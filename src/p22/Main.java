package p22;

public class Main {
	
	public static void main(String[] args) {
		
		Programador p1 = new Programador(30, "Héctor", "12346394V", 75000);
		
		p1.calcularSueldoMensual();
		p1.mostrarInfo();
		
		Analista a1 = new Analista(100, true, "Vinicius jr", "12345678Z", 100000000);
		a1.calcularSueldoMensual();
		a1.mostrarInfo();
		System.out.println((a1.calcularPagaExtra()));
		
	}

}
