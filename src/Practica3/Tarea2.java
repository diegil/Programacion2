package Practica3;
import java.io.*;
import java.util.*;

/**
 * Al construir un programa Java alrededor de esta clase se ejecuta un metodo [main] que 
 * busca un archivo dado por el usuario y calcula cuantos usos hay, asi como la cantidad de traslados y circulares
 */

public class Tarea2 {
	
	/**
	 * Pre: ---
	 * Post: Busca el archivo dado por el usuario y calcula la cantidad de usos y cuales de esos usos son traslados y cuales circulares
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba el nombre de un fichero de usos del sistema Bizi: ");
		String nombre = sc.nextLine();																	//El usuario da el nombre del archivo
		File f = new File("C:\\Users\\Diego\\Documents\\GS\\Programacion\\DiegoGil_Practica3", nombre); //Busca el archivo dado por el usuario
		ArrayList<Usobici> usos = new ArrayList<Usobici>();
		try {
			Scanner scf = new Scanner(f);
			scf.nextLine();						//Se salta la primera linea del archivo porque no tiene datos
			int usosTotales = 0;
			int traslados = 0;
			int circulares = 0;
			//Comprueba todas la lineas sumando traslado o circular segun convenga
			while (scf.hasNextLine()) {			//Repite el bucle hasta que llegue al final (no haya mas lineas para comprobar)
				String[] separadores = scf.nextLine().split(";");		//Separa cada linea cada vez que encuentra un ";"
				usos.add(new Usobici(separadores[2], separadores[4]));	//Añade a un ArrayList solo los numeros de la estacion de retiro y de anclaje
				
				//Si ambas estaciones son iguales añade uno al contador de circulares, si no añade uno al contador de traslados
				if (usos.get(usosTotales).getEstacionRetiro().equals(usos.get(usosTotales).getEstacionAnclaje())) {
					circulares++;
				}else {
					traslados++;
				}
				usosTotales++;
			}
			System.out.println();
			System.out.println("Numero de usos como traslado: " + "\t" + traslados);
			System.out.println("Numero de usos circulares: " + "\t" + circulares);
			System.out.println("Numero total de usos: " + "\t\t" + usosTotales);
		}
		catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}
	}
}