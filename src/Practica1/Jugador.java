package Practica1;
import java.util.*;

/**
 * Al construir un programa java alrededor de esta clase se ejecuta un constructor que genera un jugador aleatorio
 */

public class Jugador {
	protected String nombre;
	private int dorsal;
	protected int goles;
	private int tarjetasAmarillas;
	protected int tarjetasRojas;
	Random rn = new Random();
	
	/*
	 * Pre: ---
	 * Post: Este es el constructor que genera el jugador con caracteristicas aleatorias 
	 */
	
	public Jugador() {
		this.nombre = generarNombre();
		this.dorsal = rn.nextInt((99) + 1);
		this.goles = rn.nextInt((40) + 1);
		this.tarjetasAmarillas = rn.nextInt((20) + 1);
		this.tarjetasRojas = rn.nextInt((15) + 1);
		System.out.println(nombre + " " + dorsal + " | Goles: " + goles + " | Tajetas amarillas: " + tarjetasAmarillas + " | Tarjetas rojas: " + tarjetasRojas);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	public int getTarjetasAmarillas() {
		return tarjetasAmarillas;
	}

	public void setTarjetasAmarillas(int tarjetasAmarillas) {
		this.tarjetasAmarillas = tarjetasAmarillas;
	}

	public int getTarjetasRojas() {
		return tarjetasRojas;
	}

	public void setTarjetasRojas(int tarjetasRojas) {
		this.tarjetasRojas = tarjetasRojas;
	}
	
	
	/**
	 * Pre: ---
	 * Post: Esta funcion es llamada por el constructor para generar un nombre aleatorio a partir de unos nombres y apellidos predefinidos
	 */
	
	private String generarNombre() {
		String[] nombres = {"Pedro", "Juan", "Luis", "Alvaro", "Mario", "Diego", "Nacho", "Ruben", "Marcos", "Javier"};
		String[] apellidos = {"Fernandez", "Hernandez", "Lopez", "Gonzalez", "Diaz", "Garcia", "Sanchez", "Perez", "Martin", "Jimenez"};
		nombre = nombres[rn.nextInt((9) + 1)] + " " + apellidos[rn.nextInt((9) + 1)] + " " + apellidos[rn.nextInt((9) + 1)];
		return nombre;
	}
}