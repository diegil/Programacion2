package clasesYobjetos;

public class Lavadora extends Electrodomestico {
	private int carga;
	private double precio;
	
	public Lavadora() {
		super();
		this.carga = 5;
	}
	
	public Lavadora(double peso, double precio) {
		super(precio, peso);
		this.carga = 5;
	}
	
	public Lavadora(String color, String consumo, double peso, int carga) {
		super(color, consumo, peso);
		this.carga = carga;
		precio = 0;
		precio = precioFinal();
	}
	
	public int getCarga() {
		return carga;
	}
	
	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	@Override
	public double precioFinal() {
		if (consumo.equals("A")) {
			this.precio += 100;
		}else if (this.consumo.equals("B")){
			this.precio += 80;
		}else if (this.consumo.equals("C")) {
			this.precio += 60;
		}else if (this.consumo.equals("D")) {
			this.precio += 50;
		}else if (this.consumo.equals("E")) {
			this.precio += 30;
		}else {
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
		if (this.carga > 30) {
			this.precio += 50;
		}
		return precio;
	}
}