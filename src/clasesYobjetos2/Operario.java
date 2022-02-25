package clasesYobjetos2;

public class Operario extends Empleado {
	
	public Operario() {
		this.nombre = "";
	}
	
	public Operario(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Operario [nombre=" + nombre + "]";
	}
}