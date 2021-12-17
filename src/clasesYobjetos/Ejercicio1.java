package clasesYobjetos;
import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		String titular, comoString;
		double cantidad;
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe el titular de la cuenta: ");
		titular = sc.nextLine();
		System.out.print("Escribe la cantidad que tiene en la cuenta: ");
		cantidad = sc.nextInt();
		Cuenta cuenta1= new Cuenta(titular, cantidad);
		System.out.println("Titular: " + cuenta1.getTitular());
		System.out.println("Cantidad: " + cuenta1.getCantidad());
		System.out.print("Escribe cuanto quieres ingresar en la cuenta: ");
		cantidad = sc.nextInt();
		cuenta1.ingresar(cantidad);
		System.out.println("Nueva cantidad: " + cuenta1.getCantidad());
		System.out.print("Escribe cuanto quieres retirar de la cuenta: ");
		cantidad = sc.nextInt();
		cuenta1.retirar(cantidad);
		System.out.println("Nueva cantidad: " + cuenta1.getCantidad());
		comoString = cuenta1.toString();
		System.out.print(comoString);
	}
}