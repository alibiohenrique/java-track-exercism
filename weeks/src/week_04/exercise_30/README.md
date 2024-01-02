# Triangle

In this exercise, we have a class called `Triangle` that represents a triangle with three sides. The class includes methods to check if the triangle is equilateral, isosceles, or scalene.

## Constructor

- `public Triangle(double side1, double side2, double side3) throws TriangleException`

  - Initializes the triangle with the given side lengths. Throws `TriangleException` if the side lengths are invalid.

## Methods

- `isEquilateral()`

  - Checks and returns `true` if the triangle is equilateral (all sides are equal), otherwise `false`.

- `isIsosceles()`

  - Checks and returns `true` if the triangle is isosceles (at least two sides are equal), otherwise `false`.

- `isScalene()`

  - Checks and returns `true` if the triangle is scalene (no sides are equal), otherwise `false`.

## TriangleException

- Custom exception class to handle invalid triangle side lengths.

## Usage Example

```java
// Example usage of the Triangle class

try {
    double side1 = 3.0;
    double side2 = 4.0;
    double side3 = 5.0;

    Triangle triangle = new Triangle(side1, side2, side3);

    System.out.println("Is Equilateral: " + triangle.isEquilateral()); // Output: Is Equilateral: false
    System.out.println("Is Isosceles: " + triangle.isIsosceles()); // Output: Is Isosceles: true
    System.out.println("Is Scalene: " + triangle.isScalene()); // Output: Is Scalene: true
} catch (TriangleException e) {
    System.out.println("Invalid triangle sides!");
}
