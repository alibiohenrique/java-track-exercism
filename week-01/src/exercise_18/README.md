# Calculator Conundrum - Exception Handling

In this exercise, we have two classes: `IllegalOperationException` and `CalculatorConundrum`, focusing on exception handling for a basic calculator application.

## IllegalOperationException

`IllegalOperationException` is a custom exception class used to handle illegal operations within the calculator.

### Constructors

- `IllegalOperationException()`: Constructs an `IllegalOperationException` without a message.
- `IllegalOperationException(String message)`: Constructs an `IllegalOperationException` with a specified message.
- `IllegalOperationException(String message, Throwable cause)`: Constructs an `IllegalOperationException` with a specified message and a cause.

## CalculatorConundrum

`CalculatorConundrum` is a class that performs basic arithmetic calculations and throws custom exceptions when illegal operations occur.

### Methods

- `calculate(int operand1, int operand2, String operation) throws IllegalOperationException`: Calculates the result of an operation and returns it as a formatted string.

### Operations

The following operations are supported:
- Addition `+`
- Multiplication `*`
- Division `/`

### Exception Handling

- Throws `IllegalArgumentException` if the operation is `null` or empty.
- Throws `IllegalOperationException` with a custom message if an unknown operation is provided.
- Throws `IllegalOperationException` with a custom message if division by zero occurs.

## Usage Example

```java
// Create a CalculatorConundrum instance
CalculatorConundrum calculator = new CalculatorConundrum();

try {
    // Perform an arithmetic calculation
    String result = calculator.calculate(5, 2, "/");
    System.out.println("Calculation result: " + result);
} catch (IllegalOperationException e) {
    System.err.println("Error: " + e.getMessage());
}
