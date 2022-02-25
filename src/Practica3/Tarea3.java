package Practica3;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Al construir un programa Java alrededor de esta clase se ejecuta un metodo [main] que 
 * busca un archivo dado por el usuario y calcula cuantos usuarios unicos hay, el numero de traslados y circulares ha realizado y muestra los 15 con usos
 * ordenados de mayor a menor
 */

public class Tarea3 {
	
	/**
	 * Pre: ---
	 * Post: Busca el archivo dado por el usuario y llama a las diferentes funciones
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba el nombre de un fichero de usos del sistema Bizi: ");
		String nombre = sc.nextLine();																		//El usuario da el nombre del archivo
		File f = new File("C:\\Users\\Diego\\Documents\\GS\\Programacion\\DiegoGil_Practica3", nombre);		//Busca el archivo dado por el usuario
		ArrayList<UsuarioBizi> usos = new ArrayList<UsuarioBizi>();
		ArrayList<String> usuarios = new ArrayList<String>();
		ArrayList<UsuarioBizi> usuariosFull = new ArrayList<UsuarioBizi>();
		usuarios.add("0");			//Añade un 0 al principio del ArrayList "usuarios" (necesario para los bucles posteriores, despues esta entrada se borra)
		
		usuariosUnicos(f, usos, usuarios);
		
		ordenarUsuarios(usuarios, usos, usuariosFull);
		
		Mostrar(usuarios, usuariosFull);		
	}	
	
	/**
	 * Pre: ---
	 * Post: Cuenta los usuarios unicos que tiene el archivo y guarda sus IDs en otro ArrayList
	 */
	
	public static void usuariosUnicos(File f, ArrayList<UsuarioBizi> usos, ArrayList<String> usuarios) {
		try {
			Scanner scf = new Scanner(f);
			scf.nextLine(); 		//Se salta la primera linea porque no tiene datos
			int i = 0;
			while (scf.hasNextLine()) {															//Se repite hasta que llega al final del archivo	
				String separadores[] = scf.nextLine().split(";");								//Separa los datos en funcion de los ";"
				usos.add(new UsuarioBizi(separadores[0], separadores[2], separadores[4]));		//Añade a otro ArrayList el ID del usuario y las estaciones
				int contador = 0;
				//Compara cada ID del ArrayList "usuarios" con todos los IDs del ArrayList "usos" y si no esta guardado lo añade
				for (int j = 0; j <= usuarios.size() - 1; j++) {
					if (!usuarios.get(j).equals(usos.get(i).getUsuarioID())) {  //Comprueba si el ID ya esta guardado
						contador++;
					}
					if (contador == usuarios.size()) {							//Si el contador llega al tamaño del ArrayList de IDs guardados añade uno nuevo
						usuarios.add(usos.get(i).getUsuarioID());
					}
				}
			i++;
			}
		}
		catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}
		System.out.println();
		usuarios.remove(0);			//Elimina la primera entrada del ArrayList "usuarios" (esta se añade al principio del main para evitar errores)
		System.out.println("Numero usuarios distintos: " + usuarios.size());
	}
	
	/**
	 * Pre: ---
	 * Post: Calcula cuantos traslados y circulares ha realizado cada usuario y los ordena de mayor a menor
	 */
	
	public static void ordenarUsuarios(ArrayList<String> usuarios, ArrayList<UsuarioBizi> usos, ArrayList<UsuarioBizi> usuariosFull) {
		int traslados = 0;
		int circulares = 0;
		//Suma cuantos traslados y circulares ha realizado cada usuario
		for (int j = 0; j <= usuarios.size() - 1; j++) {
			for (int k = 0; k <= usos.size() - 1; k++) {
				if (usuarios.get(j).equals(usos.get(k).getUsuarioID())) {	//Coge el ID a comprobar
					if (usos.get(k).isCircular()) {		//Si la variable "isCircular" es true añade uno a "circulares"
						circulares++;
					}else {								//Sino añade uno a "traslados"
						traslados++;
					}
				}
			}
			usuariosFull.add(new UsuarioBizi(usuarios.get(j), traslados, circulares));	//Añade el usuario con la suma de sus traslados y circulares
			traslados = 0;
			circulares = 0;
		}
		
		//Ordena de mayor a menor los usuarios en funcion del total de traslados que han realizado
		for (int j = 0; j <= usuariosFull.size() - 1; j++) {
			for (int k = 0; k <= usuariosFull.size() - 1; k++) {
				if (usuariosFull.get(j).getTotales() > usuariosFull.get(k).getTotales()) {
					UsuarioBizi temp;
					temp = usuariosFull.get(j);
					usuariosFull.set(j, usuariosFull.get(k));
					usuariosFull.set(k, temp);
				}
			}
		}
	}
	
	/**
	 * Pre: ---
	 * Post: Muestra por pantalla los 15 usuarios con mayor traslados ordenados de mayor a menor
	 */
	
	public static void Mostrar(ArrayList<String> usuarios, ArrayList<UsuarioBizi> usuariosFull) {
		System.out.println();
		System.out.println("Usuario Traslados Circulares Total");
		System.out.println("======= ========= ========== =====");
		int limite;
		//Comprueba si el tamaño del archivo es mayor a 15 lineas para que no haya problemas con el bucle
		if (usuarios.size() < 15) {
			limite = usuarios.size() - 1;
		}else {
			limite = 14;
		}
		for (int j = 0; j <= limite; j++) {
			System.out.println(usuariosFull.get(j).getUsuarioID() + 
					"\t\t" + usuariosFull.get(j).getTraslados() + "\t" 
					+ usuariosFull.get(j).getCirculares() + "\t" 
					+ usuariosFull.get(j).getTotales());
		}
	}
}