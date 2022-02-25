package ejerciciosArraylist;
import java.util.*;

public class Ejercicio5 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("pos0");
		lista.add("pos1");
		lista.add("pos2");
		lista.add("pos3");
		lista.add("pos4");
		lista.add("pos5");
		lista.remove(3);
		System.out.print(lista.get(3));
	}

}
