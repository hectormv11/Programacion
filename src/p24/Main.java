package p24;

public class Main {
	
	public static void main(String[] args) {
		

		Carrito c = new Carrito();
		
		Producto p1 = new ProductoEnPack("Leche", 2, 6);
		Producto p2 = new ProductoAGranel("Gominolas", 0.5, 6000);
		Producto p3 = new ProductoAGranel("Fruta", 2, 10000);
		Producto p4 = new ProductoSuelto("Cocacola 2l", 1.90);
		
		System.out.println(p1.getInfo());
		System.out.println(p4.getInfo());
		System.out.println(p2.getInfo());
		
		
		c.agragarProducto(p1);
		c.agragarProducto(p2);
		c.agragarProducto(p3);
		c.agragarProducto(p4);
		
		
		System.out.println(c.getInfo());
		
	}
}
