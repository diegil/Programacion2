package ejerciciosArraylist;
import java.util.*;

public class Ejercicio11 {

	public static void main(String[] args) {
		ArrayList<String> ordenar = new ArrayList<String>();
		ordenar.add("b");
		ordenar.add("w");
		ordenar.add("n");
		ordenar.add("m");
		ordenar.add("p");
		ordenar.add("l");
		
		ordenar.sort(null);
		
		for (String letra: ordenar) {
			System.out.println(letra);
		}
	}
}