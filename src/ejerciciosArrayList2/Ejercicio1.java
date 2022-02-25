package ejerciciosArrayList2;
import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = 1, suma = 0;
		while(n != 0) {
			System.out.print("Escribe el numero que quieras añadir (1-9) (0 - Finalizar): ");
			n = sc.nextInt();
			if (n <= 9 && n >= 1) {
				l.add(n);
			}else if (n != 0){
				System.out.println("Un numero del 1 al 9");
			}
		}
		
		suma = calcularSuma(l, suma);
		System.out.println("La suma de los numeros introducidos es: " + suma);
		calcularMedia(l, suma);
		esCapicua(l);
	}
	
	public static int calcularSuma(ArrayList<Integer> l, int suma) {
		for (int numero: l) {
			suma += numero;
		}
		return suma;
	}
	
	public static void calcularMedia(ArrayList<Integer> l, int suma) {
		double media = (double)suma/l.size();
		System.out.println("La media de los numeros introducidos es: " + media);
	}
	
	public static void esCapicua(ArrayList<Integer> l) {
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		int contador = 0;
		
		for (int i = l.size() - 1; i >= 0; i--) {
			l2.add(l.get(i));
		}
		
		for (int i = 0; i <= l.size() - 1; i++) {
			if (l.get(i) == l2.get(i)) {
				contador++;
			}
		}
		
		if (contador == l.size()) {
			System.out.println("La lista es capicua");
		}else {
			System.out.println("La lista no es capicua");
		}
	}
}