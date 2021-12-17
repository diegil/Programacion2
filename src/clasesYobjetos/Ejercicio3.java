package clasesYobjetos;

public class Ejercicio3 {

	public static void main(String[] args) {
		Electrodomestico elec1 = new Electrodomestico("Blanco", "A", 85);
		System.out.println("Color: " + elec1.getColor());
		System.out.println("Consumo: " + elec1.getConsumo());
		System.out.println("Peso: " + elec1.getPeso());
		System.out.println("Precio: " + elec1.getPrecio());
		
		System.out.println();
		
		Lavadora lav1 = new Lavadora("Blanco", "A", 85, 55);
		System.out.println("Color: " + lav1.getColor());
		System.out.println("Consumo: " + lav1.getConsumo());
		System.out.println("Peso: " + lav1.getPeso());
		System.out.println("Carga: " + lav1.getCarga());
		System.out.println("Precio: " + lav1.getPrecio());
		
		System.out.println();
		
		Television tele1 = new Television("Blanco", "A", 85, 45, true);
		System.out.println("Color: " + tele1.getColor());
		System.out.println("Consumo: " + tele1.getConsumo());
		System.out.println("Peso: " + tele1.getPeso());
		System.out.println("Resolucion: " + tele1.getResolucion());
		System.out.println("TDT: " + tele1.getTdt());
		System.out.println("Precio: " + tele1.getPrecio());
	}
}