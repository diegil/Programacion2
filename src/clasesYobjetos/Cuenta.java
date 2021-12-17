package clasesYobjetos;

public class Cuenta {
	private String titular;
	private double cantidad;
	
	public Cuenta(String titular, double cantidad){
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	public String getTitular(){
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	@Override
	public String toString() {
		String comoString = "";
		comoString = comoString + "Titular: " + this.titular + " Cantidad: " + this.cantidad;
		return comoString;
	}
	
	public void ingresar(double cantidad) {
		if (cantidad > 0) {
			this.cantidad += cantidad;
		}
	}
	
	public void retirar(double cantidad) {
		if (this.cantidad - cantidad < 0) {
			this.cantidad = 0;
		}else if(cantidad > 0){
			this.cantidad -= cantidad;
		}
	}
}