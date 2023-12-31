# Difference of Squares

In this exercise, we have a class `DifferenceOfSquares` that provides methods for computing the difference between the square of the sum and the sum of squares of natural numbers.

## DifferenceOfSquares

`DifferenceOfSquares` is a class used for calculating the difference between the square of the sum and the sum of squares of natural numbers up to a given input.

### Methods

- `computeSquareOfSumTo(int input)`: Computes the square of the sum of natural numbers from 1 to the given input.
- `computeSumOfSquaresTo(int input)`: Computes the sum of squares of natural numbers from 1 to the given input.
- `computeDifferenceOfSquares(int input)`: Computes the difference between the square of the sum and the sum of squares of natural numbers up to the given input.

## Usage Example

```java
// Create an instance of DifferenceOfSquares
DifferenceOfSquares differenceOfSquares = new DifferenceOfSquares();

// Calculate the square of the sum for an input of 5
int squareOfSum = differenceOfSquares.computeSquareOfSumTo(5);
System.out.println("Square of the sum: " + squareOfSum); // Output: Square of the sum: 225

// Calculate the sum of squares for an input of 5
int sumOfSquares = differenceOfSquares.computeSumOfSquaresTo(5);
System.out.println("Sum of squares: " + sumOfSquares); // Output: Sum of squares: 55

// Calculate the difference of squares for an input of 5
int difference = differenceOfSquares.computeDifferenceOfSquares(5);
System.out.println("Difference of squares: " + difference); // Output: Difference of squares: 170
```