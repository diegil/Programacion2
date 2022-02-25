package pruebaArraylist;
import java.util.*;

public class pruebaArraylist {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		for (int i = 0; i <= 6000; i++) {
			numeros.add(i);
		}
		
		for (int i = 0; i <= numeros.size() - 1; i++) {
			System.out.println(numeros.get(i));
		}
		
		for (int numero: numeros) {
			System.out.println(numero);
		}
	}
}