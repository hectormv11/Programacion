package p21;

public class CuentaBancaria {
	
	private String titular;
	private double saldo;
	static int totalCuentas;
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//Constructor
	public CuentaBancaria(String titulares, double saldo) {
		
		this.titular = titulares;
		this.saldo = saldo;
		
		totalCuentas++;
		
	}
	
	//Metodos
	public void ingresarDinero(double cantidad) {
		
		double saldoActual = getSaldo();
		
		saldoActual = saldoActual + cantidad;
		
		setSaldo(saldoActual);
		
	}
	
	public void retirarDinero(double cantidad) {
		
		double saldoActual = getSaldo();
		
		if(saldoActual >= cantidad) {
			
			saldoActual = saldoActual - cantidad;
			setSaldo(saldoActual);
			
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		
	}
	
	public static void mostrarSaldo() {
		
		System.out.println(totalCuentas); 
	
	}
	
	public void infoCuentas() {
		
		System.out.println(getTitular());
		System.out.println(getSaldo());
		
	}

	

}
