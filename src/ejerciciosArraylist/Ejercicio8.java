package ejerciciosArraylist;
import java.util.*;

public class Ejercicio8 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("pos0");
		lista.add("pos1");
		lista.add("pos2");
		lista.add("pos3");
		lista.add("pos4");
		lista.add("pos5");
		int n = 1, m = 3;
		for (int i = n; i <= m; i++) {
			lista.remove(n);
		}
		for (String dato: lista) {
			System.out.println(dato);
		}
	}

}
