package Practica1;
import java.util.*;


/**
 * Al construir un programa java alrededor de esta clase se ejecuta un constructor que genera un equipo de futbol aleatorio
 */

public class Equipo {
	protected String nombre;
	private String estadio;
	private int fundacion;
	protected Jugador[] jugadores = new Jugador[11]; 
	protected int puntos;
	protected int partidosGanados;
	protected int partidosPerdidos;
	protected int partidosEmpatados;
	protected int golesFavor;
	private int i;
	Random rn = new Random();
	
	
	/*
	 * Pre: ---
	 * Post: Este es el constructor que genera el equipo con caracteristicas aleatorias, desde el que a su vez se llama a la clase Jugador
	 * para crear los jugadores
	 */
	
	public Equipo() {
		System.out.println("-----------------------------------------");
		this.nombre = generarNombre();
		this.estadio = generarEstadio();
		this.fundacion = rn.nextInt((2021 - 1900) + 1) + 1900;
		this.partidosGanados = rn.nextInt(14);
		this.partidosPerdidos = rn.nextInt(14 - partidosGanados);
		this.partidosEmpatados = 14 - (partidosGanados + partidosPerdidos);
		this.puntos = (partidosGanados * 2) + partidosEmpatados;
		System.out.println(nombre + " | " + estadio + " | " + fundacion);
		System.out.println("PG: " + partidosGanados + " | PE: " + partidosEmpatados + " | PP: " + partidosPerdidos + " | Puntos: " + puntos);
		
		//Suma los goles que ha metido cada jugador para obtener los goles a favor de cada equipo
		for (i = 0; i <= jugadores.length - 1; i++) {
			this.jugadores[i] = new Jugador();
			golesFavor += jugadores[i].goles;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}

	public int getFundacion() {
		return fundacion;
	}

	public void setFundacion(int fundacion) {
		this.fundacion = fundacion;
	}

	public Jugador[] getJugadores() {
		return jugadores;
	}

	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getPartidosGanados() {
		return partidosGanados;
	}

	public void setPartidosGanados(int partidosGanados) {
		this.partidosGanados = partidosGanados;
	}

	public int getPartidosPerdidos() {
		return partidosPerdidos;
	}

	public void setPartidosPerdidos(int partidosPerdidos) {
		this.partidosPerdidos = partidosPerdidos;
	}

	public int getPartidosEmpatados() {
		return partidosEmpatados;
	}

	public void setPartidosEmpatados(int partidosEmpatados) {
		this.partidosEmpatados = partidosEmpatados;
	}
	
	
	/**
	 * Pre: ---
	 * Post: Esta funcion genera el nombre del equipo de forma aleatoria en funcion de unos nombres predefinidos, juntados por la propia funcion
	 */
	
	private String generarNombre() {
		String[] nombre1 = {"Real", "FC", "Atletico", "CF", "CD", "Club Futbol", "Real Club", "Deportivo"};
		String[] nombre2 = {"Madrid", "Barcelona", "Zaragoza", "Huesca", "Teruel", "Sevilla", "Getafe", "Villarreal", "Betis", "Granada", "Mallorca", "Girona", "Malaga", "Cadiz", "Valencia", "La Coruña"};
		nombre = nombre1[rn.nextInt((4) + 1)] + " " + nombre2[rn.nextInt((9) + 1)];
		return nombre;
	}
	
	
	/**
	 * Pre: ---
	 * Post: Esta funcion genera el nombre del estadio de forma aleatoria en funcion de unos nombres predefinidos, juntados por la propia funcion
	 */
	
	private String generarEstadio() {
		String[] nombre1 = {"Santiago", "Camp", "Wanda", "Olimpico", "San", "La"};
		String[] nombre2 = {"Bernabeu", "Nou", "Metropolitano", "Romareda", "Mames", "Sanchez-Pizjuan", "Rosaleda", "Villamarin", "Cartuja"};
		estadio = nombre1[rn.nextInt((5) + 1)] + " " + nombre2[rn.nextInt((8) + 1)];
		return estadio;
	}
	
	
}