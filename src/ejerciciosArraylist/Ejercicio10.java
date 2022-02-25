package ejerciciosArraylist;
import java.util.*;

public class Ejercicio10 {

	public static void main(String[] args) {
		ArrayList<String> lista1 = new ArrayList<String>();
		ArrayList<String> lista2 = new ArrayList<String>();
		ArrayList<String> lista3 = new ArrayList<String>();
		lista1.add("pos0");
		lista1.add("pos1");
		lista1.add("pos2");
		lista1.add("pos3");
		lista2.add("pos4");
		lista2.add("pos5");
		lista2.add("pos6");
		lista2.add("pos7");
		lista3 = (ArrayList)lista1.clone();
		for (int i = 0; i <= lista2.size() - 1; i++) {
			lista3.add(lista2.get(i));
		}
		
		for (String elemento: lista3) {
			System.out.println(elemento);
		}
	}

}
