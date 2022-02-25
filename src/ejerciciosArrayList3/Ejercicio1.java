package ejerciciosArrayList3;
import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		ArrayList<Tupla> lista = new ArrayList<Tupla>();
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		String nombre, dni;
		while ((opcion != 5 && opcion <= 4) || (opcion != 5 && opcion >= 1)) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1. Paso de frontera");
			System.out.println("2. Mostrar todas las personas");
			System.out.println("3. Busqueda por nombre");
			System.out.println("4. Busqueda por dni");
			System.out.println("5. Salir");
			System.out.println("-----------------------------------------------------------");
			System.out.print("Elige una opcion > ");
			opcion = sc.nextInt();
			if (opcion == 1) {
				System.out.print("Escribe el nombre de la persona: ");
				sc.nextLine();
				nombre = sc.nextLine();
				System.out.print("Escribe el dni de la persona: ");
				dni = sc.nextLine();
				addPersona(lista, nombre, dni);
			}else if (opcion == 2) {
				mostrarPersonas(lista);
			}else if (opcion == 3) {
				System.out.print("Escribe el nombre de la persona: ");
				sc.nextLine();
				nombre = sc.nextLine();
				buscarNombre(lista, nombre);
			}else if (opcion == 4) {
				System.out.print("Escribe el dni de la persona: ");
				sc.nextLine();
				dni = sc.nextLine();
				buscarDni(lista, dni);
			}
		}		
	}
	
	public static void addPersona(ArrayList<Tupla> lista, String nombre, String dni) {
		lista.add(new Tupla(nombre,dni));
	}
	
	public static void mostrarPersonas(ArrayList<Tupla> lista) {
		for (Tupla persona: lista) {
			System.out.print("Nombre: " + persona.getNombre() + " | DNI:" + persona.getDni());
			System.out.println();
		}
	}
	
	public static void buscarNombre(ArrayList<Tupla> lista, String nombre) {
		for (Tupla persona: lista) {
			if (nombre.equals(persona.getNombre())) {
				System.out.print("Nombre: " + persona.getNombre() + " | DNI:" + persona.getDni());
				System.out.println();
			}
		}
	}
	
	public static void buscarDni(ArrayList<Tupla> lista, String dni) {
		for (Tupla persona: lista) {
			if (dni.equals(persona.getDni())) {
				System.out.print("Nombre: " + persona.getNombre() + " | DNI:" + persona.getDni());
				System.out.println();
			}
		}
	}
}