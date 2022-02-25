package clasesYobjetos2;

public class Oficial extends Operario {
	
	public Oficial() {
		this.nombre = "";
	}
	
	public Oficial(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Oficial [nombre=" + nombre + "]";
	}
}
