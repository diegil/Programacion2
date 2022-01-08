package Interfaces;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		int plazas, cuanto = 0;
		String color;
		Scanner sc = new Scanner(System.in);
		Vehiculo vehiculos[] = new Vehiculo[5];
		Coche coches[] = new Coche[5];
		Moto motos[] = new Moto[5];
		
		for (int i = 0; i <= vehiculos.length - 1; i++) {
			System.out.print("Numero de plazas: ");
			plazas = sc.nextInt();
			System.out.print("Color: ");
			sc.nextLine();
			color = sc.nextLine();
			System.out.print("Cuanto quieres acelerar/frenar: ");
			cuanto = sc.nextInt();
			if (i < 3) {
				vehiculos[i] = new Coche(plazas, color, cuanto);
				coches[i] = (Coche) vehiculos[i];
			}else {
				vehiculos[i] = new Moto(plazas, color, cuanto);
				motos[i] = (Moto) vehiculos[i];
			}
		}
		System.out.print("Que vehiulo quieres que acelere: ");
		int i = sc.nextInt();
		if (vehiculos[i] instanceof Coche) {
			System.out.println(coches[i].getColor());
			System.out.println(coches[i].getPlazas());
			coches[i].acelerar(cuanto);
			System.out.println(coches[i].velocidad);
		}else {
			System.out.println(motos[i].getColor());
			System.out.println(motos[i].getPlazas());
			motos[i].acelerar(cuanto);
			System.out.println(motos[i].velocidad);
		}
		System.out.print("Que vehiulo quieres que frene: ");
		i = sc.nextInt();
		if (vehiculos[i] instanceof Coche) {
			System.out.println(coches[i].getColor());
			System.out.println(coches[i].getPlazas());
			coches[i].frenar(cuanto);
			System.out.println(coches[i].velocidad);
		}else {
			System.out.println(motos[i].getColor());
			System.out.println(motos[i].getPlazas());
			motos[i].frenar(cuanto);
			System.out.println(motos[i].velocidad);
		}
	}
}