package JuegoPersonal;

import java.util.Scanner;

public class Menu {

	public static Juego actualJ = new Juego();

	public static void main(String[] args) {
		
		inicioMenu();

	}



	public static void inicioMenu() {

		System.out.println("Elija una opcion: 1-Jugar / 2-Ver personajes / 3-Salir");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch(n) {

		case 1:
			actualJ.iniciar();
			inicioMenu();
			break;
		case 2:
			.verPersonajes();
			inicioMenu();
			break;
		case 3:
			System.out.println("¡¡¡Hasta pronto!!!");
			break;

		}

	}
}
