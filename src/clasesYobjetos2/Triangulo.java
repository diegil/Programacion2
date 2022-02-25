package clasesYobjetos2;

public class Triangulo {
	private int b, y, j, h;
	
	public Triangulo() {
		this.b = 1;
		this.y = 1;
		this.j = 1;
		this.h = 1;
	}
	
	public Triangulo(int b, int y, int j, int h) {
		this.b = b;
		this.y = y;
		this.j = j;
		this.h = h;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}
	
	public void areaPerimetro() {
		int area, perimetro;
		perimetro = b + y + j;
		area = (b * h) / 2;
		System.out.println("El perimetro del triangulo es de: " + perimetro + " cm");
		System.out.println("El area del triangulo es de: " + area + " cm2");
	}
}
