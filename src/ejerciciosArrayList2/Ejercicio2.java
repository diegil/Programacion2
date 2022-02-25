package ejerciciosArrayList2;
import java.util.*;

public class Ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Tupla> lista = new ArrayList<Tupla>();
		Random rn = new Random();
		int personas = rn.nextInt(50);
		int ni�o = 0, adolescente = 0, adulto = 0, recaudado = 0;
		
		for (int i = 0; i <= personas - 1; i++) {
			int edad = rn.nextInt(80);
			lista.add(new Tupla(edad));
		}
		
		for (Tupla edad: lista) {
			
			if (edad.getEdad() >= 0 && edad.getEdad() <= 10) {
				ni�o++;
			}else if (edad.getEdad() >= 11 && edad.getEdad() <= 17){
				adolescente++;
			}else {
				adulto++;
			}
		}
		
		recaudado = ni�o + (adolescente * 25) + (adulto * 35);
		System.out.println("Se han recaudado " + ni�o + "� de las entradas entre 0 y 10 a�os");
		System.out.println("Se han recaudado " + (adolescente * 25) + "� de las entradas entre 11 y 17 a�os");
		System.out.println("Se han recaudado " + (adulto * 35) + "� de las entradas de mas de 18 a�os");
		System.out.println("En total se han recaudado: " + recaudado + "�");
	}
}