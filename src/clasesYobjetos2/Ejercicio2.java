package clasesYobjetos2;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int b, h;
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame el tamaño de la base (cm): ");
		b = sc.nextInt();
		System.out.print("Dame la altura (cm): ");
		h = sc.nextInt();
		
		Rectangulo r = new Rectangulo(b, h);
		r.areaPerimetro();
	}

}
