package Game;

public abstract class Personaje {

	protected String nombre;
	protected int coste;
	protected int vida;
	protected int ataque;

	abstract void imprimirPersonaje();
	abstract String infoPersonaje();

}
