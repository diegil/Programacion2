package clasesYobjetos2;
import java.util.*;

public class Matriz {
	private int rows;
	private int columns;
	int[][] matrix = new int[rows][columns];
	Random rn = new Random();
	
	public Matriz() {
		this.rows = 5;
		this.columns = 5;
		matrix = new int[rows][columns];
		createMatrix();
	}
	
	public Matriz(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;	
		matrix = new int[rows][columns];
		createMatrix();
	}

	public int getRows() {
		return rows;
	}
	
	public void setRows(int rows) {
		this.rows = rows;
	}
	
	public int getColumns() {
		return columns;
	}
	
	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public int getNumberRows() {
		return rows;
	}
	
	public int getNumberColumns() {
		return columns;
	}
	
	public void setElement(int x, int j, int element) {
		matrix[x][j] = element;
	}
	
	public void createMatrix() {
		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j <= columns - 1; j++) {
				matrix[i][j] = rn.nextInt(9);
			}
		}
	}
	
	public void addMatrix(int[][] matrix2) {
		if (rows == matrix2.length && columns == matrix2[0].length) {
			for (int i = 0; i <= rows - 1; i++) {
				for (int j = 0; j <= columns - 1; j++) {
					matrix[i][j] += matrix2[i][j];
				}
			}
		}else {
			System.out.println("No se puede sumar porque no tienen el mismo numero de filas y columnas");
		}
	}
	
	public void multMatrix(int[][] matrix2) {
		if (rows == matrix2.length && columns == matrix2[0].length) {
			for (int i = 0; i <= rows - 1; i++) {
				for (int j = 0; j <= columns - 1; j++) {
					matrix[i][j] *= matrix2[i][j];
				}
			}
		}else {
			System.out.println("No se puede multiplicar porque no tienen el mismo numero de filas y columnas");
		}
	}
	
	public void showMatrix() {
		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j <= columns - 1; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
