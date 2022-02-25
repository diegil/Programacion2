package ejerciciosArrayList2;

public class Tupla {
	String nombre;
	int edad;
	
	public Tupla() {
		this.nombre = "";
		this.edad = 0;
	}
	
	public Tupla(int edad) {
		this.nombre = "";
		this.edad = edad;
	}
	
	public Tupla(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}	
}