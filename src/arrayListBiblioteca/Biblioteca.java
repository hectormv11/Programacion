package arrayListBiblioteca;

import java.util.ArrayList;

public class Biblioteca {
	
	private ArrayList<Libro> lista;

	public Biblioteca() {
		lista = new ArrayList <Libro>();
	}

	public int agregarLibro(Libro libro) {
		
		if(libro == null) return 0;
		lista.add(libro);
		
		return -1;
		
	}

	public Libro buscarLibroPorTitulo(String titulo) {
		
		/*for()(Libro librolista : Libro){*/
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getTitulo().equals(titulo)) {
				return lista.get(i);
			}
		}
		
		return null;
	}

	public Libro buscarLibroPorAutor(String autor) {
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getAutor().equals(autor)) {
				return lista.get(i);
			}
		}
		
		return null;
	}


	public void mostrarLibrosDisponibles() {
		System.out.println("Libros disponibles en la biblioteca:");
		for (int i = 0; i < lista.size(); i++) {
			if (!lista.get(i).estaPrestado()) {
				System.out.println("----------");
				System.out.println(lista.get(i).toString());
			}
		}
			
	}
 


}
