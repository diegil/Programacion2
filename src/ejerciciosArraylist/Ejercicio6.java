package ejerciciosArraylist;
import java.util.*;

public class Ejercicio6 {

	public static void main(String[] args) {
		ArrayList<String> lista1 = new ArrayList<String>();
		ArrayList<String> lista2 = new ArrayList<String>();
		lista1.add("pos0");
		lista1.add("pos1");
		lista1.add("pos2");
		lista1.add("pos3");
		lista2 = (ArrayList)lista1.clone();
		System.out.print(lista2.get(2));
	}

}
