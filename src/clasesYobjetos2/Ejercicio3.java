package clasesYobjetos2;

public class Ejercicio3 {

	public static void main(String[] args) {
		int rows, columns, element;
		
		Matriz m = new Matriz(2, 3);
		int[][] matrix2 = {{2, 1, 4, 6},
						   {1, 3, 2, 1},
		                   {2, 4, 1, 3}};
		m.showMatrix();
		m.addMatrix(matrix2);
		m.showMatrix();
		m.multMatrix(matrix2);
		m.showMatrix();
	}

}
