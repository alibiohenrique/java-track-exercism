# Hamming Distance Calculator

In this exercise, we have a class called `Hamming` that calculates the Hamming distance between two DNA strands. The class has a constructor that takes two DNA strands as input and ensures they are of equal length. The class also contains a method `getHammingDistance()` that calculates and returns the Hamming distance between the two strands.

## Properties

- `leftStrand`: The first DNA strand.
- `rightStrand`: The second DNA strand.

## Constructor

- `Hamming(String leftStrand, String rightStrand)`

    - Initializes the `Hamming` object with two DNA strands. If the strands are not of equal length, an `IllegalArgumentException` is thrown.

## Method

- `getHammingDistance()`

    - Calculates and returns the Hamming distance between the two DNA strands.

## Usage Example

```java
// Creating a Hamming object with equal-length DNA strands
String leftStrand = "GAGCCTACTAACGGGAT";
String rightStrand = "CATCGTAATGACGGCCT";
Hamming hamming = new Hamming(leftStrand, rightStrand);

// Calculating the Hamming distance
int hammingDistance = hamming.getHammingDistance();
System.out.println("Hamming distance between the DNA strands: " + hammingDistance); // Output: Hamming distance between the DNA strands: 7
