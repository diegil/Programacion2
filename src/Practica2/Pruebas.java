package Practica2;

/**
 * Al construir un programa Java alrededor de esta clase se ejecuta un metodo [main] que 
 * crea un tablero predefinido y lo simula
 */

public class Pruebas {
	
	/**
	 * Pre: ---
	 * Post: Crea 3 tableros de prueba diferentes predefinidos y los simula mientras muestra la evolucion de las generaciones
	 */

	public static void main(String[] args) {
		int gen = 30;
		
		//-------------------------------------------------PRUEBA BLOQUE----------------------------------------------------------------------------
		int m = 4, n = 4; //Dimensiones tablero
		
		//Tablero predefinido
		int[][] bloque =  {{0,0,0,0},
					       {0,1,1,0},
						   {0,1,1,0},
						   {0,0,0,0}};
		
		int y = 0;
		System.out.println("---------------------------------PRUEBA BLOQUE------------------------------------------------------------------------");
		System.out.println();
		mostrarBloque(m, n, y, bloque);
		simulacionBloque(m, n, gen, bloque);
		
		//-----------------------------------------------PRUEBA INTERMITENTE------------------------------------------------------------------------
		 m = 5; //Dimensiones tablero
		 n = 5; //Dimensiones tablero
		 
		 //Tablero predefinido
		 int [][] intermitente = {{0,0,0,0,0},
								  {0,0,0,0,0},
								  {0,1,1,1,0},
								  {0,0,0,0,0},
								  {0,0,0,0,0}};
		System.out.println("---------------------------------PRUEBA INTERMINTENTE-----------------------------------------------------------------");
		System.out.println();
		mostrarIntermitente(m, n, y, intermitente);
		simulacionIntermitente(m, n, gen, intermitente);
		
		//-----------------------------------------------PRUEBA FARO------------------------------------------------------------------------
		 m = 6; //Dimensiones tablero
		 n = 6; //Dimensiones tablero
		 
		 //Tablero predefinido
		 int [][] faro = {{0,0,0,0,0,0},
						  {0,1,1,0,0,0},
						  {0,1,1,0,0,0},
						  {0,0,0,1,1,0},
						  {0,0,0,1,1,0},
						  {0,0,0,0,0,0}};
		System.out.println("---------------------------------PRUEBA FARO-----------------------------------------------------------------");
		System.out.println();
		mostrarFaro(m, n, y, faro);
		simulacionFaro(m, n, gen, faro);
	}
	
	/**
	 * Pre: ---
	 * Post: Simula el tablero "bloque"
	 */
	
	public static void simulacionBloque(int m, int n, int gen, int[][] bloque) {
		int vivasCerca = 0;
		
		//Clona el tablero
		int[][] proxGen = new int[m][n];
		for (int i = 0; i <= n - 1; i++) {
			for (int j = 0; j <= m - 1; j++) {
				proxGen[i][j] = bloque[i][j];
			}
		}
		
		//Comprueba cuantas celulas vivas cercanas tiene cada celula
		for (int y = 1; y <= gen; y++) {
			for (int i = 0; i <= m - 1; i++) {
				for (int j = 0; j <= n - 1; j++) {			
					for (int k = i - 1; k <= i + 1; k++) {
						for (int x = j - 1; x <= j + 1; x++) {
							if (k >= 0 && x >= 0 && k < n && x < m) {
								vivasCerca += bloque[k][x];
							}
						}
					}
					vivasCerca -= bloque[i][j]; //Resta a las celulas vivas la propia celula que comprueba (Si esta viva resta 1)
					
					//Comprueba las condiciones de supervivencia en el tablero y las aplica en "proxGen"
					if (vivasCerca < 2) {
						proxGen[i][j] = 0;
					}
					if (vivasCerca > 3) {
						proxGen[i][j] = 0;
					}
					if (vivasCerca == 3 && bloque[i][j] == 0) {
						proxGen[i][j] = 1;
					}
					vivasCerca = 0;
				}	
			}
			
			//Copia el contenido de "proxGen" en el tablero
			for (int i = 0; i <= n - 1; i++) {
				for (int j = 0; j <= m - 1; j++) {
					bloque[i][j] = proxGen[i][j];
				}
			}
			
			int vivas = mostrarBloque(m, n, y, bloque);
			
			//Comprueba si se han completado todas las generaciones
			if (y == gen) {
				System.out.println("Sobreviven " + vivas + " celulas.");
				break;
			}
		}
	}
	
	/**
	 * Pre: ---
	 * Post: Cambia los 1 y 0 del tablero por "* " y "  " respectivamente, lo muestra en pantalla y devuelve las celulas vivas 
	 * de la generacion
	 */
	
	public static int mostrarBloque(int m, int n, int y, int[][] bloque) {
		System.out.println("Generacion " + y);
		int vivas = 0;
		for (int i = 0; i <= m - 1; i++) {
			for (int j = 0; j <= n - 1; j++) {
				if (bloque[i][j] == 1) {
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
	
	/**
	 * Pre: ---
	 * Post: Simula el tablero "intermitente"
	 */
	
	public static void simulacionIntermitente(int m, int n, int gen, int[][] intermitente) {
		int vivasCerca = 0;
		
		//Clona el tablero
		int[][] proxGen = new int[m][n];
		for (int i = 0; i <= n - 1; i++) {
			for (int j = 0; j <= m - 1; j++) {
				proxGen[i][j] = intermitente[i][j];
			}
		}
		
		//Comprueba cuantas celulas vivas cercanas tiene cada celula
		for (int y = 1; y <= gen; y++) {
			for (int i = 0; i <= m - 1; i++) {
				for (int j = 0; j <= n - 1; j++) {			
					for (int k = i - 1; k <= i + 1; k++) {
						for (int x = j - 1; x <= j + 1; x++) {
							if (k >= 0 && x >= 0 && k < n && x < m) {
								vivasCerca += intermitente[k][x];
							}
						}
					}
					vivasCerca -= intermitente[i][j]; //Resta a las celulas vivas la propia celula que comprueba (Si esta viva resta 1)
					
					//Comprueba las condiciones de supervivencia en el tablero y las aplica en "proxGen"
					if (vivasCerca < 2) {
						proxGen[i][j] = 0;
					}
					if (vivasCerca > 3) {
						proxGen[i][j] = 0;
					}
					if (vivasCerca == 3 && intermitente[i][j] == 0) {
						proxGen[i][j] = 1;
					}
					vivasCerca = 0;
				}	
			}
			
			//Copia el contenido de "proxGen" en el tablero
			for (int i = 0; i <= n - 1; i++) {
				for (int j = 0; j <= m - 1; j++) {
					intermitente[i][j] = proxGen[i][j];
				}
			}
			
			int vivas = mostrarIntermitente(m, n, y, intermitente);
			
			//Comprueba si se han completado todas las generaciones
			if (y == gen) {
				System.out.println("Sobreviven " + vivas + " celulas.");
				break;
			}
		}
	}
	
	/**
	 * Pre: ---
	 * Post: Cambia los 1 y 0 del tablero por "* " y "  " respectivamente, lo muestra en pantalla y devuelve las celulas vivas 
	 * de la generacion
	 */
	
	public static int mostrarIntermitente(int m, int n, int y, int[][] intermitente) {
		System.out.println("Generacion " + y);
		int vivas = 0;
		for (int i = 0; i <= m - 1; i++) {
			for (int j = 0; j <= n - 1; j++) {
				if (intermitente[i][j] == 1) {
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

	/**
	 * Pre: ---
	 * Post: Simula el tablero "faro"
	 */
	
	public static void simulacionFaro(int m, int n, int gen, int[][] faro) {
		int vivasCerca = 0;
		
		//Clona el tablero
		int[][] proxGen = new int[m][n];
		for (int i = 0; i <= n - 1; i++) {
			for (int j = 0; j <= m - 1; j++) {
				proxGen[i][j] = faro[i][j];
			}
		}
		
		//Comprueba cuantas celulas vivas cercanas tiene cada celula
		for (int y = 1; y <= gen; y++) {
			for (int i = 0; i <= m - 1; i++) {
				for (int j = 0; j <= n - 1; j++) {			
					for (int k = i - 1; k <= i + 1; k++) {
						for (int x = j - 1; x <= j + 1; x++) {
							if (k >= 0 && x >= 0 && k < n && x < m) {
								vivasCerca += faro[k][x];
							}
						}
					}
					vivasCerca -= faro[i][j]; //Resta a las celulas vivas la propia celula que comprueba (Si esta viva resta 1)
					
					//Comprueba las condiciones de supervivencia en el tablero y las aplica en "proxGen"
					if (vivasCerca < 2) {
						proxGen[i][j] = 0;
					}
					if (vivasCerca > 3) {
						proxGen[i][j] = 0;
					}
					if (vivasCerca == 3 && faro[i][j] == 0) {
						proxGen[i][j] = 1;
					}
					vivasCerca = 0;
				}	
			}
			
			//Copia el contenido de "proxGen" en el tablero
			for (int i = 0; i <= n - 1; i++) {
				for (int j = 0; j <= m - 1; j++) {
					faro[i][j] = proxGen[i][j];
				}
			}
			
			int vivas = mostrarIntermitente(m, n, y, faro);
			
			//Comprueba si se han completado todas las generaciones
			if (y == gen) {
				System.out.println("Sobreviven " + vivas + " celulas.");
				break;
			}
		}
	}
	
	/**
	 * Pre: ---
	 * Post: Cambia los 1 y 0 del tablero por "* " y "  " respectivamente, lo muestra en pantalla y devuelve las celulas vivas 
	 * de la generacion
	 */
	
	public static int mostrarFaro(int m, int n, int y, int[][] faro) {
		System.out.println("Generacion " + y);
		int vivas = 0;
		for (int i = 0; i <= m - 1; i++) {
			for (int j = 0; j <= n - 1; j++) {
				if (faro[i][j] == 1) {
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
