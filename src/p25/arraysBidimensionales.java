package p25;

import java.util.Random;

public class arraysBidimensionales {

	public static void main(String[] args) {

		int[][] matriz = {{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};
		int[][] matriz2 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

		//sumarPares(matriz);

		//rellenarCeros(matriz);
		//imprimirArray(matriz);

		//rellenarDeNumerosAleatorios(matriz);
		//imprimirArray(matriz);

		//sonIguales(matriz, matriz2);
		
		//diagonal(matriz);
		
		imprimirArray(transponer(matriz));

	}
	
	public static int[][] transponer(int[][] otro) {
		
		int[][] nueva = new int[otro[0].length][otro.length];
		
		for (int i = 0; i < nueva.length; i++) {
			
			for (int j = 0; j < nueva[i].length; j++) {
				
				nueva[i][j] = otro[j][i];
				
			}
			
		}
		
		return nueva;

	}

	public static void diagonal(int[][] otro) {

		int suma = 0;

		for (int i = 0; i < otro.length; i++) {
			for (int j = 0; j < otro[i].length; j++) {
				
				if (i==j) {
					suma += otro[i][j];
				}
				

			}
		}
		
		
		System.out.println(suma);

	}

	

	public static void sonIguales(int[][] primera, int[][] segunda) {

		int aciertos = 0;

		if(primera.length == segunda.length && primera[0].length == segunda[0].length) {

			for (int i = 0; i < primera.length; i++) {

				for (int j = 0; j < primera[i].length; j++) {

					if(primera[i][j] == segunda[i][j]) {

						aciertos++;

					}

				}

			}

		}

		if(aciertos != 12) {
			System.out.println("Son diferentes");
		}
		else
			System.out.println("Son iguales");

	}

	public static void sumarPares(int[][] otro) {

		int suma = 0;

		for (int i = 0; i < otro.length; i++) {

			for (int j = 0; j < otro[i].length; j++) {

				if(otro[i][j]%2 == 0) {

					suma += otro[i][j];

				}

			}

		}

		System.out.println(suma);

	}

	public static void rellenarCeros(int[][] otro) {

		for (int i = 0; i < otro.length; i++) {

			for (int j = 0; j < otro[i].length; j++) {

				otro[i][j] = 0;

			}

		}

	}

	public static void rellenarDeNumerosAleatorios(int[][] otro) {

		Random r = new Random();
		int valorDado; 

		for (int i = 0; i < otro.length; i++) {

			for (int j = 0; j < otro[i].length; j++) {

				valorDado =  r.nextInt(20)+1;
				otro[i][j] = valorDado;


			}

		}

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
