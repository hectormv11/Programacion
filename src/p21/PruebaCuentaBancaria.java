package p21;

public class PruebaCuentaBancaria {
	
	public static void main(String[] args) {
		
		CuentaBancaria cuenta1 = new CuentaBancaria("Hector", 1000.05);
		CuentaBancaria cuenta2 = new CuentaBancaria("David", 100);
		
		cuenta1.ingresarDinero(1000);
		cuenta2.retirarDinero(50.5);
		
		cuenta1.infoCuentas();
		cuenta2.infoCuentas();
		
		cuenta2.retirarDinero(50);
		cuenta2.infoCuentas();
		
		System.out.println(CuentaBancaria.totalCuentas);
	}

}
