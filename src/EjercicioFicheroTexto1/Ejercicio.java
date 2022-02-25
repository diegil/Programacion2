package EjercicioFicheroTexto1;
import java.util.*;
import java.io.*;

public class Ejercicio {

	public static void main(String[] args) {
		String escribir = "";
		File f;
		Scanner sc = new Scanner(System.in);
		System.out.print("Escrcibe la ruta del fichero en el que quieres escribir: ");
		String ruta = sc.nextLine();
		f = new File(ruta);
		try {
			Formatter wr = new Formatter(f);
			System.out.println("------------------------------------------");
			while (!escribir.equalsIgnoreCase("fin")) {
				System.out.print("Introduzca lo que desea escribir: ");
				escribir = sc.nextLine();
				boolean num = isInteger(escribir);
				if (num == true && !escribir.equalsIgnoreCase("fin")) {
					System.out.println("El número entero " + escribir + " se ha escrito correctamente en el fichero " + f);
					wr.format(escribir);
					wr.flush();
				}else if (num == false && !escribir.equalsIgnoreCase("fin")){
					System.out.println("La cadena de caracteres " + escribir + " se ha escrito correctamente en el fichero " + f);
					wr.format(escribir);
					wr.flush();
				}
			}
			System.out.print("Esl programa ha finalizado");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean isInteger(String escribir) {
		boolean num = true;
		try {
			Integer.parseInt(escribir);
		}
		catch (Exception e){
			num = false;
		}
		
		
		return num;
	}
}