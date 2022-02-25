package ejerciciosArraylist;
import java.util.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("hola");
		lista.add("adios");
		lista.add("lista");
		lista.set(1, "que tal");
		System.out.print(lista.get(1));
	}

}
