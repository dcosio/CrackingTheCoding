package ch1;

/**
 * clears rows/columns of a element row/column when the value is 0;
 * @author Dan
 *
 */
public class q17 {

	public void setZero(int[][] matrix) {
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
	
		for(int i = 0 ; i < matrix.length ;i++) {
			for(int j = 0; j < matrix[0].length ; j++) {
				if(matrix[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}
		
		for(int i = 0 ; i < row.length ; i++) {
			if(row[i]) nullifyRow(matrix,i);
		}
		
		for(int j = 0 ; j < column.length ; j++) {
			if(column[j]) nullifyColumn(matrix,j);
		}
			
			
	}
	
	public void nullifyRow(int[][] matrix, int row) {
		for(int j = 0 ; j < matrix[0].length ; j++) {
			matrix[row][j] = 0;
		}
	}
	
	public void nullifyColumn(int[][] matrix, int column) {
		for(int i = 0 ; i < matrix.length ; i++) {
			matrix[i][column] = 0;
		}
	}
	
	public void printMatix(int[][] matrix) {
		for(int i = 0 ; i < matrix.length ;i++) {
			for(int j = 0; j < matrix[0].length ; j++) {
				System.out.print(matrix[i][j]);
				}
			System.out.println();
			}
		}
	
	
	public static void main(String[] args) {
		int[][] matrix = {{12,15,0},
				          {0,5,6},
				          {99,7,3},
				          {45,0,56}};
		
		q17 m = new q17();
		m.setZero(matrix);
		m.printMatix(matrix);
	}
}
