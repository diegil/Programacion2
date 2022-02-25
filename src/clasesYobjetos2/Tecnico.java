package clasesYobjetos2;

public class Tecnico extends Operario {
	
	public Tecnico() {
		this.nombre = "";
	}
	
	public Tecnico(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Tecnico [nombre=" + nombre + "]";
	}
}
