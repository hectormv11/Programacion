package p22;
import java.text.Normalizer;


public class Empleado {
	
	String nombre;
	String dni;
	String email;
	public double sueldo;
	
	public Empleado(String nombre, String dni, double sueldo) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.email = generarEmail();
		this.sueldo = sueldo;
	}
	
	
	public void mostrarInfo() {
		
		System.out.println("Nombre: " + nombre);
		System.out.println("DNI: " + dni);
		System.out.println("Email: " + email);
		System.out.println("Sueldo al mes: " + Math.ceil(sueldo));
		
	}
	
	public String generarEmail() {
		
		String dni = this.dni.toLowerCase();
		String nom = nombre.toLowerCase();
		nom = normalizeUsingJavaText(nom);

		Character parts = dni.charAt(8);
		
		Character parts1 = nom.charAt(0);
		Character parts2 = nom.charAt(1);
		Character parts3 = nom.charAt(2);
		
		Character parts4 = dni.charAt(7);
		Character parts5 = dni.charAt(6);
		Character parts6 = dni.charAt(5);
		Character parts7 = dni.charAt(4);
		
		String emailGaenerado = parts.toString() + parts1.toString() + parts2.toString() + parts3.toString() + parts7.toString() + parts6.toString() + parts5.toString() + parts4.toString() + "@micompany.com";
		
		return emailGaenerado;
		
	}
	
	private static String normalizeUsingJavaText(String source){
	    source = Normalizer.normalize(source, Normalizer.Form.NFD);
	    return source.replaceAll("[^\\p{ASCII}]", "");
	}


}
