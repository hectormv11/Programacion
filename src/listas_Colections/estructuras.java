package listas_Colections;

import java.util.ArrayList;

public class estructuras {
	
	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList <String>();
		
		lista.add("Héctor");
		lista.add(null);
		lista.add("Love");
		lista.add("Lucía");
		
		lista.remove(1);
		
		Integer in = 2; //Quita la posicion
		int i = 2; //Quita la posicion con ese valor
		
		lista.remove(i);
	}

}
