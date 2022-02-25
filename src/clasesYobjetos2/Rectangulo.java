package clasesYobjetos2;

public class Rectangulo {
	private int b, h;
	
	public Rectangulo() {
		this.b = 1;
		this.h = 1;
	}
	
	public Rectangulo(int b, int h) {
		this.b = b;
		this.h = h;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}
	
	public void areaPerimetro() {
		int area, perimetro;
		perimetro = (b * 2) + (h * 2);
		area = b * h;
		System.out.println("El perimetro del rectangulo es de: " + perimetro + " cm");
		System.out.println("El area del recatungulo es de: " + area + " cm2");
	}
	
}
