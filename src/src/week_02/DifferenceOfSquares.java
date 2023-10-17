package week_02;

public class DifferenceOfSquares {
    public int computeSquareOfSumTo(int input) {

        double sumOfNumbers = 0;

        for (int i = 1; i <= input; i++) {
            sumOfNumbers += i;
        }
        return (int) Math.pow(sumOfNumbers, 2);

    }

    public int computeSumOfSquaresTo(int input) {
        int sumOfNumbers = 0;
        int iTimesTwo = 0;
        for (int i = 1; i <= input; i++) {
            iTimesTwo = i * i;
            sumOfNumbers += iTimesTwo;

        }

        return sumOfNumbers;
    }

    public int computeDifferenceOfSquares(int input) {

        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }
}
