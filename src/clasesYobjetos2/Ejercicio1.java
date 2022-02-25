package clasesYobjetos2;
import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		int b, y, j ,h;
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame el tamaño de la base (cm): ");
		b = sc.nextInt();
		System.out.print("Dame la altura (cm): ");
		h = sc.nextInt();
		System.out.print("Dame el tamaño de un lado (cm): ");
		y = sc.nextInt();
		System.out.print("Dame el tamaño del otro lado (cm): ");
		j = sc.nextInt();
		
		Triangulo t = new Triangulo(b, y, j, h);
		t.areaPerimetro();
	}

}
