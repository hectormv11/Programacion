package p24;

public class ProductoAGranel implements Producto{
	
	String nombre;
	double precioKilo;
	double cantidad;
	
	public ProductoAGranel(String nombre, double precioKilo, double cantidad) {
		
		this.nombre = nombre;
		this.precioKilo = precioKilo;
		this.cantidad = cantidad;
	}

	public double getPrecioTotal() {
		
		return precioKilo*cantidad/1000;
		
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
