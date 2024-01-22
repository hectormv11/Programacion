package p24;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Carrito {
	
	Producto[] pr;
	
	public Carrito() {
		
		pr = new Producto[20];
		
	}
	
	public boolean agragarProducto(Producto otro) {
		
		for (int i = 0; i < pr.length; i++) {
			
			if(pr[i] == null) {
				pr[i] = otro;
				return true;
			}
			
		}
		return false;
	}
	
	public double calcularCostoTotal(){
		
		double total = 0;
		
		for (int i = 0; i < pr.length; i++) {
			
			Producto actual = pr[i];
			
			if(actual != null) {
				
				total += actual.getPrecioTotal();

			}
			
		}
		
		return total;
		
	}
	
	public String getInfo() {
		
		double total = 0;
		
		StringBuffer str = new StringBuffer();
		
		for (int i = 0; i < pr.length; i++) {
			
			Producto actual = pr[i];
			
			if(actual != null) {
				
				str.append(pr[i].getNombre() + "\n");
				total += pr[i].getPrecioTotal();

			}
			
		}
		
		str.append(total + " €" + "\n");
		str.append(fecha() + "\n");
		str.append("-------------------");
		
		return str.toString();
		
	}
	
	public String fecha() {

		LocalDate fechaActual = LocalDate.now();

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String fechaFormato = fechaActual.format(formato);

		return fechaFormato;
	}

}
