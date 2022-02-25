package pruebaArraylist;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Coche> coches = new ArrayList<Coche>();
		
		Coche coche1 = new Coche("1234AAA", "rojo", 4);
		Coche coche2 = new Coche("1234BBB", "negro", 2);
		Coche coche3 = new Coche("1234CCC", "blanco", 4);
		Coche coche4 = new Coche("1234DDD", "rojo", 4);
		
		coches.add(coche1);
		coches.add(coche2);
		coches.add(coche3);
		coches.add(coche4);
		
		for (Coche coche: coches) {
			if (coche.getColor().equals("rojo") && coche.getnPuertas() == 4) {
				System.out.println(coche.toString());
			}
		}
	}
}