package clasesYobjetos;
import java.util.*;
public class Persona {
	private String nombre, dni = "", sexo;
	private int edad;
	private double peso, altura;
	
	public Persona() {
		this.nombre = "";
		this.dni = "";
		this.sexo = "";
		this.edad = 0;
		this.peso = 0;
		this.altura = 0;
	}
	
	public Persona(String nombre, String sexo, int edad) {
		this.nombre = nombre;
		this.dni = "";
		this.sexo = sexo;
		this.edad = edad;
		this.peso = 0;
		this.altura = 0;
	}
	
	public Persona(String nombre, String sexo, int edad, double peso, double altura) {
		this.nombre = nombre;
		this.dni = generaDni();
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		comprobarSexo();
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
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public int calcularMC() {
		int ideal, mc;
		mc = (int)(this.peso/Math.pow(this.altura, 2));
		if (mc < 20) {
			ideal = -1;
		}else if (mc > 20 && mc < 25) {
			ideal = 0;
		}else {
			ideal = 1;
		}
		return ideal;
	}
	
	public boolean esMayorDeEdad(){
		boolean mayor = false;
		if (this.edad > 18) {
			mayor = true;
		}
		return mayor;
	}
	
	private void comprobarSexo() {
		if (!this.sexo.equals("H") && !this.sexo.equals("M")) {
			this.sexo = "H";
		}
	}
	
	@Override
	public String toString() {
		String comoString;
		comoString = "Nombre: " + this.nombre + " DNI: " + this.dni + " Sexo: " + this.sexo + " Edad: " + this.edad + " Peso: " + this.peso + " Altura: " + this.altura;
		return comoString;
	}
	
	private String generaDni() {
		Random rn = new Random();
		String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N"};
		for (int i = 0; i <= 8; i++) {
			int randomN = rn.nextInt(9);
			dni = dni + "" + randomN;
		}
		dni = dni + letras[rn.nextInt(letras.length)];
		return dni;
	}
}