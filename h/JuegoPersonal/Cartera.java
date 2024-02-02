package JuegoPersonal;

public class Cartera {

	int saldo = 0;

	public Cartera() {

		this.saldo = 1000;

	}

	public void verCartera() {
		
		StringBuffer str = new StringBuffer();
		
		str.append("-------------------\n");
		str.append("Saldo: " + saldo + "€\n");
		str.append("-------------------");

		System.out.println(str.toString());

	}

}
