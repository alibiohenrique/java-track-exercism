package week_04.exercise_29;

public class Matrix {
  
  int[][] matrix;
  
  public Matrix(String matrixAstring) {
    String[] rows = matrixAstring.split("\n");
    int countRow = rows.length;
    int countColumns = rows[0].split(" ").length;
    
    matrix = new int[countRow][countColumns];
    
    for (int i = 0; i < countRow; i++) {
      String[] elements = rows[i].split(" ");
      for (int j = 0; j < countColumns; j++) {
        matrix[i][j] = Integer.parseInt(elements[j]);
      }
    }
  }
  
  int[] getRow(int rowNumber) {
    return matrix[rowNumber - 1];
  }
  
  int[] getColumn(int columnNumber) {
    int[] column = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      column[i] = matrix[i][columnNumber - 1];
    }
    return column;
  }
}

