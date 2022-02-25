package ejerciciosArrayList3;

public class Tupla {
	String nombre, dni;
	
	public Tupla() {
		this.nombre = "";
		this.dni = "";
	}
	
	public Tupla(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
}
