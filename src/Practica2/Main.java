package Practica2;
import java.util.*;

/**
 * Al construir un programa Java alrededor de esta clase se ejecuta un metodo [main] que 
 * crea un tablero aleatorio en funcion de las dimensiones dadas por el usuario y simula tantas generaciones como este
 * indica
 */

public class Main {
	
	/**
	 * Pre: ---
	 * Post: Pide al usuario la cantidad de filas y columnas del tablero y las generaciones que quiere simular, despues
	 * ya sabiendo las dimensiones, crea el trablero y lo rellena aleatoriamente, muestra la generacion 0 (inicial), guarda 
	 * los datos y llama a la funcion "simulacion"
	 */

	public static void main(String[] args) {
		int m = 0, n = 0, gen = 0;
		ArrayList<Tripleta> datos = new ArrayList<Tripleta>();
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		//Pide el numero de filas (1-50)
		while(m <= 0 || m > 50) {
			System.out.print("Numero de filas: ");
			m = sc.nextInt();
		}
		
		//Pide el numero de columnas (1-50)
		while(n <= 0 || n > 50) {
			System.out.print("Numero de columnas: ");
			n = sc.nextInt();
		}
		
		
		//Pide el numero de generaciones (1-50)
		while(gen <= 0 || gen > 50) {
			System.out.print("Numero de generaciones: ");
			gen = sc.nextInt();
		}
		
		int[][] tablero = new int[m][n]; //Crea el tablero
		
		//Rellena el tablero aleatoriamente
		int vivas = 0;
		for (int i = 0; i <= m - 1; i++) {
			for (int j = 0; j <= n - 1; j++) {
				int rnN = rn.nextInt(100); //Calcula el porcentaje
				if (rnN > 80) {
					tablero[i][j] = 1;
					vivas++;
				}else {
					tablero[i][j] = 0;
				}
			}
		}
		int y = 0;
		System.out.println();
		mostrarTablero(m, n, y, tablero);
		datos.add(new Tripleta(0, vivas, vivas)); //Añade los datos de la generacion 0
		simulacion(m, n, gen, tablero, datos);
	}
	
	/**
	 * Pre: ---
	 * Post: Aplica las condiciones del juego en funcion de las celulas vivas cercanas de cada celula, muestra el tablero actualizado,
	 * guarda los datos en el ArrayList y lo muestra
	 */
	
	public static void simulacion(int m, int n, int gen, int[][] tablero, ArrayList<Tripleta> datos) {
		int vivasCerca = 0, vivas = datos.get(0).getVivas(), nuevas, vivasLast = 0;
		
		//Clona el tablero
		int[][] proxGen = new int[m][n];
		for (int i = 0; i <= m - 1; i++) {
			for (int j = 0; j <= n - 1; j++) {
				proxGen[i][j] = tablero[i][j];
			}
		}
		
		//Comprueba cuantas celulas vivas cercanas tiene cada celula
		for (int y = 1; y <= gen; y++) {
			for (int i = 0; i <= m - 1; i++) {
				for (int j = 0; j <= n - 1; j++) {			
					for (int k = i - 1; k <= i + 1; k++) {
						for (int x = j - 1; x <= j + 1; x++) {
							if (k >= 0 && x >= 0 && k < n && x < m) {
								vivasCerca += tablero[x][k];
							}
						}
					}
					vivasCerca -= tablero[i][j]; //Resta a las celulas vivas la propia celula que comprueba (Si esta viva resta 1)
					
					//Comprueba las condiciones de supervivencia en el tablero y las aplica en "proxGen"
					if (vivasCerca < 2) {
						proxGen[i][j] = 0;
					}
					if (vivasCerca > 3) {
						proxGen[i][j] = 0;
					}
					if (vivasCerca == 3 && tablero[i][j] == 0) {
						proxGen[i][j] = 1;
					}
					vivasCerca = 0;
				}	
			}
			
			//Copia el contenido de "proxGen" en el tablero
			for (int i = 0; i <= m - 1; i++) {
				for (int j = 0; j <= n - 1; j++) {
					tablero[i][j] = proxGen[i][j];
				}
			}
			
			//Comprueba las vivas y las nuevas que hay en la generacion que esta siendo simulada
			vivasLast = vivas;
			vivas = mostrarTablero(m, n, y, tablero);
			nuevas = vivas - vivasLast;
			datos.add(new Tripleta(y, vivas, nuevas)); //Añade los datos al ArrayList
			
			//Comprueba que no se acabe el juego ya sea porque se han simulado todas las generaciones o porque no quedan celulas vivas
			if (y == gen) {
				System.out.println("Sobreviven " + vivas + " celulas.");
				break;
			}else if (vivas == 0) {
				System.out.print("Colonia extinguida");
				break;
			}
		}
		
		//Muestra los datos del ArrayList
		for (Tripleta iteracion: datos) {
			System.out.print(iteracion.toString());
		}
	}
	
	/**
	 * Pre: ---
	 * Post: Cambia los 1 y 0 del tablero por "* " y "  " respectivamente, lo muestra en pantalla y devuelve las celulas vivas 
	 * de la generacion
	 */
	
	public static int mostrarTablero(int m, int n, int y, int[][] tablero) {
		System.out.println("Generacion " + y);
		int vivas = 0;
		for (int i = 0; i <= m - 1; i++) {
			for (int j = 0; j <= n - 1; j++) {
				if (tablero[i][j] == 1) {
					System.out.print("* ");
					vivas++;
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();	
		}
		return vivas;
	}
}