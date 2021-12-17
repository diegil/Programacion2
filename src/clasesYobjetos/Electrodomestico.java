package clasesYobjetos;

public class Electrodomestico {
	protected double precio, peso;
	protected String color, consumo;
	
	public Electrodomestico() {
		this.color = "Blanco";
		this.consumo = "F";
		this.precio = 100;
		this.peso = 5;
	}
	
	public Electrodomestico(double precio, double peso) {
		this.color = "Blanco";
		this.consumo = "F";
		this.precio = precio;
		this.peso = peso;
	}
	
	public Electrodomestico(String color, String consumo, double peso) {
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
		comprobarConsumoEnergetico();
		comprobarColor();
		precio = precioFinal();
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getConsumo() {
		return consumo;
	}
	
	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	private void comprobarConsumoEnergetico() {
		String letras[] = {"A", "B", "C", "D", "E", "F"};
		int contador = 0;
		for (int i = 0; i <= letras.length - 1; i++) {
			if (!this.consumo.equals(letras[i])) {
				contador++;
			}
		}	
		if (contador == letras.length) {
			this.consumo = "F";
		}
	}
	
	private void comprobarColor() {
		String colores[] = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};
		int contador = 0;
		for (int i = 0; i <= colores.length - 1; i++) {
			if (!this.color.equals(colores[i])) {
				contador++;
			}
			if (contador == colores.length) {
				this.color = "Blanco";
			}
		}
	}
	
	public double precioFinal() {
		if (this.consumo.equals("A")) {
			this.precio += 100;
		}else if (this.consumo.equals("B")){
			this.precio += 80;
		}else if (this.consumo.equals("C")) {
			this.precio += 60;
		}else if (this.consumo.equals("D")) {
			this.precio += 50;
		}else if (this.consumo.equals("E")) {
			this.precio += 30;
		}else if (this.consumo.equals("F")){
			this.precio += 10;
		}
		if (this.peso >= 0 && this.peso <= 19) {
			this.precio += 10;
		}else if (this.peso >= 20 && this.peso <= 49) {
			this.precio += 50;
		}else if (this.peso >= 50 && this.peso <= 79) {
			this.precio += 80;
		}else if (this.peso >= 80){
			this.precio += 100;
		}
		return precio;
	}
}
