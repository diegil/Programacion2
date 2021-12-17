package clasesYobjetos;

public class Ejercicio2 {

	public static void main(String[] args) {
		String comoString;
		int ideal;
		boolean mayor;
		Persona persona1 = new Persona("juan", "H", 25, 80.5, 1.85);
		comoString = persona1.toString();
		System.out.println(comoString);
		ideal = persona1.calcularMC();
		System.out.println(ideal);
		mayor = persona1.esMayorDeEdad();
		System.out.println(mayor);
	}
}