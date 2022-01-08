package Interfaces;

public class Coche implements Vehiculo{
	private int plazas;
	private String color;
	private int cuanto;
	protected int velocidad = 0;
	
	public Coche(int plazas, String color, int cuanto) {
		this.plazas = plazas;
		this.color = color;
		this.cuanto = cuanto;
	}
	
	public int getPlazas() {
		return plazas;
	}
	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int frenar(int cuanto) {
		int velocidad = 0;
		velocidad -= cuanto;
		return velocidad;
	}
	
	public int acelerar(int cuanto) {
		velocidad += cuanto;
		return velocidad;
	}
}
