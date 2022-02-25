package ejerciciosArraylist;
import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		ArrayList<String> colores = new ArrayList<String>();
		colores.add("rojo");
		colores.add("azul");
		colores.add("verde");
		colores.add("negro");
		colores.add("blanco");
		for (String color: colores) {
			System.out.println(color);
		}
	}

}
