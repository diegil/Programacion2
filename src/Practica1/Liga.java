package Practica1;

/**
 * Al construir un programa java alrededor de esta clase se ejecuta un constructor que genera una liga de futbol desde la que se crearan las
 * diferentes consultas del main
 */

public class Liga {
	private String nombre;
	public  Equipo[] equipos = new Equipo[15];
	private int i;

	/**
	 * Pre: ---
	 * Post: Este es el constructor de la liga desde el cual se llama a la clase Equipo para crear los equipos
	 */
	
	public Liga() {
		this.nombre = "Liga Practica";
		System.out.println("LIGA");
		for (i = 0; i <= equipos.length - 1; i++) {
			this.equipos[i] = new Equipo();
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Equipo[] getEquipos() {
		return equipos;
	}

	public void setEquipos(Equipo[] equipos) {
		this.equipos = equipos;
	}
	
	/**
	 * Pre: ---
	 * Post: Ordena los equipos de mayor a menor en funcion de los puntos que tengan y los muestra por pantalla
	 */
	
	public static void Clasificacion(Liga liga1) {
		Equipo temp;
		
		//Se ordenan de mayor a menor los 15 equipos en funcion de los puntos
		for (int i = 0; i <= liga1.equipos.length - 1; i++) {
			for (int j = i + 1; j <= liga1.equipos.length - 1; j++) {
				if (liga1.equipos[i].puntos > liga1.equipos[j].puntos) {
					temp = liga1.equipos[j];
					liga1.equipos[j] = liga1.equipos[i];
					liga1.equipos[i] = temp;
				}
			}
		}
		
		//Se muestran los equipos ya ordenados de mayor a menor
		for (int i = liga1.equipos.length - 1; i >= 0; i--) {
			System.out.println("Nombre: " + liga1.equipos[i].nombre + " | Puntos: " + liga1.equipos[i].puntos + " | PG: " + 
								liga1.equipos[i].partidosGanados + " | PE: " + liga1.equipos[i].partidosEmpatados + " | PP: " + 
								liga1.equipos[i].partidosPerdidos + " | Goles a favor: " + liga1.equipos[i].golesFavor);
		}
	}
	
	/**
	 * Pre: ---
	 * Post: Coge los maximos goleadores de cada equipo, los compara entre si y muestra una tabla con los 5 mayores goleadores de la liga
	 */
	
	public static void Goleadores(Liga liga1) {
		Jugador temp;
		Jugador[] goleadores = new Jugador[75];
		
		//Ordena mayor a menor los jugadores de cada equipo en funcion de los goles marcados
		for (int i = 0; i <= liga1.equipos.length - 1; i++) {
			for (int j = 0; j <= 10; j++) {
				for (int k = 0; k <= 10; k++) {
					if (liga1.equipos[i].jugadores[j].goles > liga1.equipos[i].jugadores[k].goles) {
						temp = liga1.equipos[i].jugadores[k];
						liga1.equipos[i].jugadores[k] = liga1.equipos[i].jugadores[j];
						liga1.equipos[i].jugadores[j] = temp;
					}
				}
			}
		}
		
		//Coge los 5 primeros goleadores de cada equipo y los junta en una misma tabla
		int k = 0;
		for (int i = 0; i <= liga1.equipos.length - 1; i++) {
			for (int j = 0; j <= 4; j++) {
				goleadores[k] = liga1.equipos[i].jugadores[j];
				k++;
			}
		}
		
		//Ordena de mayor a menor la tabla que tiene a los 5 mayores goleadores de cada equipo
		for (int i = 0; i <= goleadores.length - 1; i++) {
			for (int j = i + 1; j <= goleadores.length - 1; j++) {
				if (goleadores[i].goles > goleadores[j].goles) {
					temp = goleadores[j];
					goleadores[j] = goleadores[i];
					goleadores[i] = temp;
				}
			}
		}
		
		//Muestra de mayor a menor los 5 primeros jugadores de la tabla 
		//goleadores (que contiene los 5 mayore goleadores de cada equipo)
		for (int i = goleadores.length - 1; i >= 70; i--) {
			System.out.println("Nombre: " + goleadores[i].nombre + " | Goles: " + goleadores[i].goles);
		}
	}
	
	/**
	 * Pre: ---
	 * Post: Coge los jugadores con mas expulsiones de cada equipo, los compara entre si y muestra una tabla con los 5 
	 * jugadores mas expulsados de la liga
	 */
	
	public static void Expulsados(Liga liga1) {
		Jugador temp;
		Jugador[] expulsados = new Jugador[75];
		
		//Ordena de mayor a menor los juadores de cada equipo en funcion de las tarjetas rojas obtenidas
		for (int i = 0; i <= liga1.equipos.length - 1; i++) {
			for (int j = 0; j <= 10; j++) {
				for (int k = 0; k <= 10; k++) {
					if (liga1.equipos[i].jugadores[j].tarjetasRojas > liga1.equipos[i].jugadores[k].tarjetasRojas) {
						temp = liga1.equipos[i].jugadores[k];
						liga1.equipos[i].jugadores[k] = liga1.equipos[i].jugadores[j];
						liga1.equipos[i].jugadores[j] = temp;
					}
				}
			}
		}
		
		//Junta los 5 jugadores con mas tarjetas rojas de cada equipo en una misma tabla
		int k = 0;
		for (int i = 0; i <= liga1.equipos.length - 1; i++) {
			for (int j = 0; j <= 4; j++) {
				expulsados[k] = liga1.equipos[i].jugadores[j];
				k++;
			}
		}
		
		//Ordena de mayor a menor la tabla que contiene a los 5 jugadores mas expulsados de cada equipo
		for (int i = 0; i <= expulsados.length - 1; i++) {
			for (int j = i + 1; j <= expulsados.length - 1; j++) {
				if (expulsados[i].tarjetasRojas > expulsados[j].tarjetasRojas) {
					temp = expulsados[j];
					expulsados[j] = expulsados[i];
					expulsados[i] = temp;
				}
			}
		}
		
		//Muestra de mayor a menor los 5 jugadores mas expulsados de la tabla 
		//expulsados (que contiene los 5 jugadores con mas tarjetas rojas de cada equipo)
		for (int i = expulsados.length - 1; i >= 70; i--) {
			System.out.println("Nombre: " + expulsados[i].nombre + " | Tarjetas rojas: " + expulsados[i].tarjetasRojas);
		}
	}
	
	/**
	 * Pre: ---
	 * Post: Cuenta los goles que ha marcado un equipo y muestra una lista con los 3 equipos con mas goles a favor
	 */
	
	public static void golesFavor(Liga liga1) {
		Equipo temp;
		
		//Ordena los equipos en funcion de los goles a favor de cada uno de ellos
		for (int i = 0; i <= liga1.equipos.length - 1; i++) {
			for (int j = i + 1; j <= liga1.equipos.length - 1; j++) {
				if (liga1.equipos[i].golesFavor > liga1.equipos[j].golesFavor) {
					temp = liga1.equipos[j];
					liga1.equipos[j] = liga1.equipos[i];
					liga1.equipos[i] = temp;
				}
			}
		}
		
		//Muestra una lista ordenada de mayor a menor de los 3 equipos con mas goles marcados
		for (int i = liga1.equipos.length - 1; i >= liga1.equipos.length - 3; i--) {
			System.out.println("Nombre: " + liga1.equipos[i].nombre + " | Goles a favor: " + liga1.equipos[i].golesFavor);
		}
	}
}