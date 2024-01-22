package p24;

public class ProductoSuelto implements Producto{
	
	String nombre;
	double precioUnidad;
	final int cantidad = 1;
	
	public ProductoSuelto(String nombre, double precioUnidad) {
		
		this.nombre = nombre;
		this.precioUnidad = precioUnidad;
	}

	@Override
	public double getPrecioTotal() {
		
		return precioUnidad;
		
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
