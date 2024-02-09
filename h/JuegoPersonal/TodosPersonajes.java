package JuegoPersonal;

public class TodosPersonajes {
	
	static Personaje[] array; 
			
	public TodosPersonajes() {
		
		array = new Personaje[20];
		
	}
	
	public void llenarArray() {
		
		array[0] = new tropa1v("guisante", 1, 1);
		array[1] = new tropa1v("guisante", 1, 1);
		array[2] = new tropa1v("guisante", 1, 1);
		array[3] = new tropa1v("nuez", 0, 6);
		array[4] = new tropa1v("nuez", 0, 6);
		
		array[5] = new tropa2v("repetidora", 2, 2);
		array[5] = new tropa2v("repetidora", 2, 2);
		array[5] = new tropa2v("repetidora", 2, 2);
		array[8] = new tropa2v("cacahuete", 2, 3);
		array[9] = new tropa2v("cacahuete", 2, 3);
	
		array[10] = new tropa3v("zanahoria", 3, 3);
		array[11] = new tropa3v("zanahoria", 2, 3);
		array[12] = new tropa3v("zanahoria", 2, 3);
		array[13] = new tropa3v("tronco", 0, 4);
		array[14] = new tropa3v("fuego", 0, 4);
		
		array[15] = new tropa1v("castaña", 0, 3);
		array[16] = new tropa1v("castaña", 0, 3);
		array[17] = new tropa1v("castaña", 0, 3);
		array[18] = new tropa1v("tripitidora", 1, 5);
		array[19] = new tropa1v("tripitidora", 1, 5);
		
	}
	
}

