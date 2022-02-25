package pruebaArraylist;
public class Coche {
	private String matricula;
	protected String color;
	protected int nPuertas;
	
	public Coche(String matricula, String color, int nPuertas) {
		this.matricula = matricula;
		this.color = color;
		this.nPuertas = nPuertas;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getnPuertas() {
		return nPuertas;
	}

	public void setnPuertas(int nPuertas) {
		this.nPuertas = nPuertas;
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", color=" + color + ", nPuertas=" + nPuertas + "]";
	}
}