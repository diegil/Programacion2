package EjercicioFicheroTexto2;
import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escrcibe la ruta del fichero en el que quieres escribir: ");
		String ruta = sc.nextLine();
		File f = new File(ruta);
		File personas = new File("C:\\Users\\Diego\\Documents\\GS\\Programacion\\pruebaFiles\\personas.txt");
		try {
			if(!f.exists()) {
				f.createNewFile();
			}
			Formatter wr = new Formatter(f);
			String texto = Files.readString(Paths.get("C:\\Users\\Diego\\Documents\\GS\\Programacion\\pruebaFiles\\personas.txt"));
			String[] linea = texto.split("\n");
			for (int i = 0; i <= linea.length - 1; i++) {
				wr.format(linea[i].substring(linea[i].indexOf(",") + 2));
				wr.format(linea[i].substring(linea[i].indexOf(" "), linea[i].indexOf(",")));
				for (int j = 0; j <= 51 - (linea[i].length() - 1); j++) {
					wr.format(".");
				}
				wr.format(linea[i].substring(0, linea[i].indexOf(" ")));
				wr.format("\n");
				wr.flush();	
			}
		}
		catch (Exception e) {
			
		}
	}
}