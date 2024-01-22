package p24;

public class ProductoEnPack implements Producto{
	
	String nombre;
	double precioPack;
	int numUnidades;
	final int cantidad = 1;
	
	
	public ProductoEnPack(String nombre, double precioPack, int numUnidades) {
		
		this.nombre = nombre;
		this.precioPack = precioPack;
		this.numUnidades = numUnidades;
	}

	public double getPrecioTotal() {
		
		return precioPack;
		
	}
	
	@Override
	public String getInfo() {

		StringBuffer str = new StringBuffer();
		
		str.append(nombre + "\n");
		str.append(getPrecioTotal() + "\n");
		str.append(cantidad + "\n");
		str.append("**************");
		
		return str.toString();
		
	}
	
	@Override
	public String getNombre() {
		return nombre;
	}
	

}
