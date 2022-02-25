package Practica3;
import java.io.*;
import java.util.*;

/**
 * Al construir un programa Java alrededor de esta clase se ejecuta un metodo [main] que 
 * coge dos archivos ya creados con entradas de Bizi y crea dos nuevos reducidos con 10 y 2000 entradas
 */

public class Tarea1 {
	
	/**
	 * Pre: ---
	 * Post: Busca los dos archivos completos y crea los dos reducidos
	 */


	public static void main(String[] args) {
		//Busca los archivos y crea los reducidos
		File usos16 = new File("C:\\Users\\Diego\\Documents\\GS\\Programacion\\DiegoGil_Practica3\\usos-16.csv");
		File usos17 = new File("C:\\Users\\Diego\\Documents\\GS\\Programacion\\DiegoGil_Practica3\\usos-17.csv");
		File pruebas10 = new File("C:\\Users\\Diego\\Documents\\GS\\Programacion\\DiegoGil_Practica3\\pruebas-10.csv");
		File pruebas2000 = new File("C:\\Users\\Diego\\Documents\\GS\\Programacion\\DiegoGil_Practica3\\pruebas-2000.csv");
		
		try {
			//Crea lo formatter y scanner que se usaran para rellenar los reducidos
			Formatter f10 = new Formatter(pruebas10);
			Formatter f2000 = new Formatter(pruebas2000);
			Scanner sc16 = new Scanner(usos16);
			Scanner sc17 = new Scanner(usos17);
			
			//Escribe las diez primeras lineas de un uno de los archivos completos en uno de los reducidos
			for (int i = 0; i <= 9; i++) {
				f10.format(sc16.nextLine() + "\n");
			}
			f10.flush();
			
			
			//Escribe las 2000 primeras lineas del otro archivo completo en el otro reducido
			for (int i = 0; i <= 1999; i++) {
				f2000.format(sc17.nextLine() + "\n");
			}
			f2000.flush();
		}
		catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}	
	}
}