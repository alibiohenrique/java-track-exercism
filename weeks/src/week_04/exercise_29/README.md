# Matrix

In this exercise, we have a class called `Matrix` that represents a two-dimensional array. The class has methods to initialize the matrix from a string, retrieve a specific row, and retrieve a specific column.

## Constructor

- `public Matrix(String matrixString)`

  - Initializes the matrix based on the provided string representation.

## Methods

- `getRow(int rowNumber)`

  - Retrieves and returns the specified row as an array.

- `getColumn(int columnNumber)`

  - Retrieves and returns the specified column as an array.

## Usage Example

```java
    String matrixString = "1 2 3\n4 5 6\n7 8 9";
    Matrix matrix = new Matrix(matrixString);
```
```java
    // Get Row
    int rowNumber = 2;
    int[] row = matrix.getRow(rowNumber);
    System.out.println("Row " + rowNumber + ": " + Arrays.toString(row));
    // Output: Row 2: [4, 5, 6]
```
```java
    // Get Column
    int columnNumber = 3;
    int[] column = matrix.getColumn(columnNumber);
    System.out.println("Column " + columnNumber + ": " + Arrays.toString(column));
    // Output: Column 3: [3, 6, 9]
```


