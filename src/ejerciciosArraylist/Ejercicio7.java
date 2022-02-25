package ejerciciosArraylist;
import java.util.*;

public class Ejercicio7 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		ArrayList<String> lista2 = new ArrayList<String>();
		lista.add("pos0");
		lista.add("pos1");
		lista.add("pos2");
		lista.add("pos3");
		lista.add("pos4");
		lista.add("pos5");
		for (int i = lista.size() - 1; i >= 0; i--) {
			lista2.add(lista.get(i));
		}
		
		for (String pos: lista2) {
			System.out.println(pos);
		}
	}

}
