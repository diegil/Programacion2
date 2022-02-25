package ExamenParcial;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Al construir un programa Java alrededor de esta clase se ejecuta un metodo [main] que 
 * usa el arhivo titanic.csv para calcular la cantidad de pasajeros que llevaba, cuantos de esos eran hombres y cuantas mujeres, asi como la cantidad
 * de hombres y  mujeres que murieron
 */

public class Main {
	
	/**
	 * Pre: ---
	 * Post: Busca el archivo de titanic.csv, guarda su contenido en un String, despues separa este contenido en funcion de los saltos de linea "\n". Cambia los prefijos
	 * "Mr, Mrs, Master y Miss" por espacios en blanco y guarda los datos de cada pasajero en otro String. Al final calcula lo datos pedidos en el ejercicio.
	 */

	public static void main(String[] args) {
		try {
			File f = new File("C:\\Users\\Diego\\Documents\\GS\\Programacion\\titanic.csv");  //Busca el archivo titanic.csv
			String datos = Files.readString(Paths.get(f.getPath()));						  //Guarda el contenido del File en un String
			String[] lineas = datos.split("\n");											  //Separa el contenido en funcion de los saltos de linea
			String[][] pasajero = new String[lineas.length][5];
			for (int i = 0; i <= lineas.length - 1; i++) {
				lineas[i] = lineas[i].replaceAll(", Mr.", " ").replaceAll(", Mrs.", " ").replaceAll(", Master.", " ").replaceAll(", Miss.", " ");
				String[] separacion = lineas[i].split(",");														//Sustituye los prefijos y guarda los datos de cada
				for (int j = 0; j <= pasajero[0].length - 1; j++) {												//pasajero en un String multidimensional					
					pasajero[i][j] = separacion[j];
				}
			}
			
			int totalPasajeros = pasajero.length - 1;   //Calcula la cantidad de pasajeros (-1 porque la primera linea no cuenta)
			int totalMujeres = 0;
			int totalHombres = 0;
			int mujeresMuertas = 0;
			int hombresMuertos = 0;
			for (int i = 1; i <= pasajero.length - 1; i++) {
				if (pasajero[i][4].equals("female")) {
					totalMujeres++;								
					if (pasajero[i][1].equals("0")) {
						mujeresMuertas++;
					}													//Sabiendo donde estan los datos necesarios (sexo y supervivencia) calcula
				}else {													//lo que pide el ejercicio
					totalHombres++;
					if (pasajero[i][1].equals("0")) {
						hombresMuertos++;
					}
				}
			}
			System.out.println("Total pasajeros: " + totalPasajeros);
			System.out.println("Total mujeres: " + totalMujeres);
			System.out.println("Total hombres: " + totalHombres);
			System.out.println("Mujeres muertas: " + mujeresMuertas + " | " + (mujeresMuertas * 100 / totalMujeres) + "%");
			System.out.println("Hombres muertos: " + hombresMuertos + " | " + (hombresMuertos * 100 / totalHombres) + "%");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}