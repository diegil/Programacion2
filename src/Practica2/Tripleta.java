package Practica2;

/**
 * Al construir un programa java alrededor de esta clase se crea la clase Tripleta, usada para guardar la generacion
 * y las celulas vivas y nuevas de esta
 */

public class Tripleta {
	private int generacion, vivas, nuevas;
	
	/**
	 * Pre: ---
	 * Post: Estos son los constructores de la Tripleta, solo se usa el segundo, cuando se pasan los datos de cada generacion
	 */
	
	public Tripleta() {
		this.generacion = 0;
		this.vivas = 0;
		this.nuevas = 0;
	}
	
	public Tripleta(int generacion, int vivas, int nuevas) {
		this.generacion = generacion;
		this.vivas = vivas;
		this.nuevas = nuevas;
	}

	public int getGeneracion() {
		return generacion;
	}

	public void setGeneracion(int generacion) {
		this.generacion = generacion;
	}

	public int getVivas() {
		return vivas;
	}

	public void setVivas(int vivas) {
		this.vivas = vivas;
	}

	public int getNuevas() {
		return nuevas;
	}

	public void setNuevas(int nuevas) {
		this.nuevas = nuevas;
	}
	
	/**
	 * Pre: ---
	 * Post: Esta funcion toString cuando es llamada muestra los datos de la generacion indicada en el main
	 */

	@Override
	public String toString() {
		System.out.println();
		return "Generacion: " + generacion + " | Vivas: " + vivas + " | Nuevas: " + nuevas;
	}
}