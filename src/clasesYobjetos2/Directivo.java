package clasesYobjetos2;

public class Directivo extends Empleado {
	
	public Directivo() {
		this.nombre = "";
	}
	
	public Directivo(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Directivo [nombre=" + nombre + "]";
	}
}
