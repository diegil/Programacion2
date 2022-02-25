package Practica3;

/**
 * Al construir un programa java alrededor de esta clase se crea la clase Usobici, usada para guardar los numeros de ambas estaciones
 */

public class Usobici {
	private String estacionRetiro;
	private String estacionAnclaje;
	
	/**
	 * Pre: ---
	 * Post: Este es el constructor de Usobici, el cual guarda los numeros de las dos estaciones pasadas desde el main "Tarea2"
	 */
	
	public Usobici(String estacionRetiro, String estacionAnclaje) {
		this.estacionRetiro = estacionRetiro;
		this.estacionAnclaje = estacionAnclaje;
	}
	public String getEstacionRetiro() {
		return estacionRetiro;
	}

	public void setEstacionRetiro(String estacionRetiro) {
		this.estacionRetiro = estacionRetiro;
	}

	public String getEstacionAnclaje() {
		return estacionAnclaje;
	}

	public void setEstacionAnclaje(String estacionAnclaje) {
		this.estacionAnclaje = estacionAnclaje;
	}

	@Override
	public String toString() {
		return "Usobici [estacionRetiro=" + estacionRetiro + ", estacionAnclaje=" + estacionAnclaje + "]";
	}
}