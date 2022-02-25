package Practica3;

public class UsuarioBizi {
	private boolean circular;
	private String usuarioID;
	private String estacionRetiro;
	private String estacionAnclaje;
	private int traslados;
	private int circulares;
	private int totales;
	
	public UsuarioBizi(String usuarioID, String estacionRetiro, String estacionAnclaje) {
		this.usuarioID = usuarioID;
		this.estacionRetiro = estacionRetiro;
		this.estacionAnclaje = estacionAnclaje;
		if (estacionRetiro.equals(estacionAnclaje)) {
			this.circular = true;
		}else {
			this.circular = false;
		}
	}
	
	public UsuarioBizi(String usuarioID, int traslados, int circulares) {
		this.usuarioID = usuarioID;
		this.traslados = traslados;
		this.circulares = circulares;
		this.totales = traslados + circulares;
	}

	public boolean isCircular() {
		return circular;
	}

	public void setCircular(boolean circular) {
		this.circular = circular;
	}

	public String getUsuarioID() {
		return usuarioID;
	}

	public void setUsuarioID(String usuarioID) {
		this.usuarioID = usuarioID;
	}

	public String getEstacionRetiro() {
		return estacionRetiro;
	}

	public void setEstacionRetiro(String estacionRetiro) {
		this.estacionRetiro = estacionRetiro;
	}

	public String getEstacionAnclaje() {
		return estacionAnclaje;
	}

	public void setEstacionAnclaje(String estacionAnclaje) {
		this.estacionAnclaje = estacionAnclaje;
	}

	public int getTraslados() {
		return traslados;
	}

	public void setTraslados(int traslados) {
		this.traslados = traslados;
	}

	public int getCirculares() {
		return circulares;
	}

	public void setCirculares(int circulares) {
		this.circulares = circulares;
	}

	public int getTotales() {
		return totales;
	}

	public void setTotales(int totales) {
		this.totales = totales;
	}

	@Override
	public String toString() {
		return "UsuarioBizi [circular=" + circular + ", usuarioID=" + usuarioID + ", estacionRetiro=" + estacionRetiro
				+ ", estacionAnclaje=" + estacionAnclaje + ", traslados=" + traslados + ", circulares=" + circulares
				+ ", totales=" + totales + "]";
	}
}
