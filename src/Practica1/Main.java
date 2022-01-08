package Practica1;
import java.util.*;


/**
 * Al construir un programa Java alrededor de esta clase se ejecuta un metodo [main] que 
 * muestra un menu en el cual puedes elegir que informacion sobre equipos y jugadores de una liga de futbol mostrar
 */

public class Main {

	/**
	 * Pre: ---
	 * Post: Muestra el menu y te da ha elegir que informacion mostrar
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		Liga liga1 = new Liga();
		System.out.println();
		System.out.println();
		System.out.println();
		
		//No deja de mostrar el menu hasta que introduces un numero valido
		while ((opcion != 5 && opcion <= 4) || (opcion != 5 && opcion >= 1)) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1. Visualizar clasificacion ordenada por puntos");
			System.out.println("2. Visualizar los 5 maximos goleadores");
			System.out.println("3. Visualizar los 5 jugadores con mas expulsiones");
			System.out.println("4. Obtener los 3 equipos mas goleadores");
			System.out.println("5. Cerrar");
			System.out.println("-----------------------------------------------------------");
			System.out.print("Elige una opcion > ");
			opcion = sc.nextInt();
			if (opcion == 1) {
				Liga.Clasificacion(liga1);
			}else if (opcion == 2) {
				Liga.Goleadores(liga1);
			}else if (opcion == 3) {
				Liga.Expulsados(liga1);
			}else if (opcion == 4){
				Liga.golesFavor(liga1);
			}
		}
	}
}