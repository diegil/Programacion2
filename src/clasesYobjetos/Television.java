package clasesYobjetos;

public class Television extends Electrodomestico {
	double resolucion;
	boolean tdt;
	
	public Television() {
		super();
		this.resolucion = 20;
		this.tdt = false;
	}
	
	public Television(double precio, double peso) {
		super(precio, peso);
		this.resolucion = 20;
		this.tdt = false;
	}
	
	public Television(String color, String consumo, double peso, double resolucion, boolean tdt) {
		super(color, consumo, peso);
		this.resolucion = resolucion;
		this.tdt = tdt;
		precio = 0;
		precio = precioFinal();
	}

	public double getResolucion() {
		return resolucion;
	}

	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}

	public boolean getTdt() {
		return tdt;
	}

	public void setTdt(boolean tdt) {
		this.tdt = tdt;
	}
	
	@Override
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
		if (tdt == true) {
			this.precio += 50;
		}
		if (resolucion > 40) {
			this.precio += this.precio * 0.3;
		}
		return precio;
	}
	
}
