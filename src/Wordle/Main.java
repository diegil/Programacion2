package Wordle;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			String diccionarioFull = Files.readString(Paths.get("C:\\Users\\Diego\\Documents\\GS\\Programacion\\diccionario.txt")); // Copia los datos del txt a un string
			String[] diccionario = diccionarioFull.split("\n"); // Separa las palabras y las guarda en una tabla
			ArrayList<String> posibles = new ArrayList<String>(); 
			ArrayList<Integer> letrasIguales = new ArrayList<Integer>();
			String palabra;
			int nLetras = 0, contador = 0;
			System.out.print("Escribe la palabra que tengas con * donde no sepas la letra: " );
			palabra = sc.nextLine(); // Pide la palabra a buscar
			ArrayList<Character> noEstan = new ArrayList<Character>();
			System.out.println("Escribe las letras que sepas que no estan (fin - para pasar): ");
			String check = "";
			while (!check.equalsIgnoreCase("fin")) {
				check = sc.nextLine().toLowerCase();
				if (!check.equalsIgnoreCase("fin")) {     // Pide las letras que sabes que no estan y las guarda en un ArrayList
					char checkChar = check.charAt(0);
					noEstan.add(checkChar);
				}	
			}
			ArrayList<Character> estan = new ArrayList<Character>();
			System.out.println("Escribe las letras que sepas que estan pero no sabes las posiciones (fin - para terminar): ");
			check = "";
			while (!check.equalsIgnoreCase("fin")) {
				check = sc.nextLine().toLowerCase();
				if (!check.equalsIgnoreCase("fin")) {    // Pide las letras que sabes que estan y las guarda en un ArrayList
					char checkChar = check.charAt(0);
					estan.add(checkChar);
				}	
			}
			sc.close();
			
			int[] posicionLetras = new int[5];
			for (int i: posicionLetras) {		// Rellena la tabla de posicionLetras con 0
				posicionLetras[i] = 0; 
			}
			char[] letras = palabra.toCharArray();
			for (int i = 0; i <= 4; i++) {
				if (letras[i] != '*'){			// Rellena la talbla posicionLetras con 1 en funcion de la posicion donde hay letras en la palabra introducida
					nLetras++;
					posicionLetras[i] = 1;
				}
			}			
			
			for (int i = 0; i <= diccionario.length - 1; i++) {
				if (diccionario[i].length() == 5) {
					for (int j = 0; j <= 4; j++) {
						if (letras[j] == diccionario[i].charAt(j)) {	 
							contador++;									
						}
					}
					letrasIguales.add(contador);
					contador = 0;										// Comprueba en el diccionario las palabras de 5 letras que tienen las letras en la
				}else {													// posicion correcta de la palabra introducida y guarda las posibles palabras en 
					letrasIguales.add(0);								// un ArrayList
				}
			}
			for (int i = 0; i <= letrasIguales.size() - 1; i++) {
				if (letrasIguales.get(i) == nLetras) {
					posibles.add(diccionario[i]);
				}
			}
			
			for (int i = 0; i <= posibles.size() - 1; i++) {
				for (int j = 0; j <= 4; j++) {
					for (int k = 0; k <= noEstan.size() - 1; k++) {
						if (posibles.get(i).charAt(j) == noEstan.get(k)) {		// Comprueba las letras de cada palabra con las que el usuario ha dicho que no estan
							posibles.remove(i);									// y elimina del ArrayList de posibles las palabras que tengan algnua de esas letras
							i = 0;
						}
					}
				}
			}
			int checkContador = 0;
			ArrayList<Character> estanBackup = (ArrayList) estan.clone();
			for (int i = 0; i <= posibles.size() - 1; i++) {
				for (int j = 0; j <= 4; j++) {
					for (int k = 0; k <= estan.size() - 1; k++) {
						if (posibles.get(i).charAt(j) == estan.get(k) && posicionLetras[j] == 0) {
							estan.remove(k);															// Comprueba las letras de cada palabra con las que el 
							k = 0;																		// usuario ha dicho que estan y elimina del ArrayList 
							checkContador++;															// de posibles las palabras que no tengan todas esas letras
						}
					}
				}
				estan = (ArrayList) estanBackup.clone();
				if (checkContador != estan.size()){
					posibles.remove(i);
					i--;
				}
				checkContador = 0;
			}
			for (String posible: posibles) {
				System.out.println(posible);
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}