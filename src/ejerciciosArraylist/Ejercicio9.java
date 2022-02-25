package ejerciciosArraylist;
import java.util.*;

public class Ejercicio9 {

	public static void main(String[] args) {
		int contador = 0;
		ArrayList<String> lista1 = new ArrayList<String>();
		ArrayList<String> lista2 = new ArrayList<String>();
		lista1.add("pos0");
		lista1.add("pos1");
		lista1.add("pos2");
		lista1.add("pos3");
		lista2 = (ArrayList)lista1.clone();
		for (int i = 0; i <= lista1.size() - 1; i++) {
			if (lista1.get(i).equals(lista2.get(i))) {
				contador++;
			}
		}
		if (contador == lista1.size()) {
			System.out.print("true");
		}else {
			System.out.print("false");
		}
	}
}