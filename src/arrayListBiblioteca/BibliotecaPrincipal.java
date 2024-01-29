package arrayListBiblioteca;

public class BibliotecaPrincipal {

	public static void main(String[] args) {
	    Biblioteca biblioteca = new Biblioteca();

	    Libro libro1 = new Libro("El código da Vinci", "Dan Brown");
	    Libro libro2 = new Libro("Arséne Lupin", "Maurice Leblanc");
	    Libro libro3 = new Libro("El arte de la negociación", "Desconocido");

	    biblioteca.agregarLibro(libro1);
	    biblioteca.agregarLibro(libro2);
	    biblioteca.agregarLibro(libro3);


	    biblioteca.mostrarLibrosDisponibles();
	}

	
}
