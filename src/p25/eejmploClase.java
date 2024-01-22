package p25;


public class eejmploClase {

	public static void main(String[] args) {

		int[][] numeros = { {1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5} }; //array bidimensional

		imprimirArray(numeros);

		for (int i = 0; i < numeros.length; i++) {
			int ultimaPosicion = numeros[i].length - 1;
			numeros[i][ultimaPosicion] = 0;
		}
		
		imprimirArray(numeros);

	}

	public static void imprimirArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}

			System.out.print("\n");
		}
	}



}
