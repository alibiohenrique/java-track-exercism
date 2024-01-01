# Handshake Calculator

In this exercise, we have a class called `HandshakeCalculator` that calculates a series of signals based on a given
number.

## Method

- `calculateHandshake(int number)`

    - Calculates and returns a list of signals based on the binary representation of the given number.

## Signals

- 00001 = `WINK`
- 00010 = `DOUBLE_BLINK`
- 00100 = `CLOSE_YOUR_EYES`
- 01000 = `JUMP`
- 10000 = Reverse the order of the operations in the secret handshake.


## Usage Example


```java
    // Example 1: Binary representation is 10010
    int number1=18;
    List<Signal> signals1=calculator.calculateHandshake(number1);
    System.out.println("Handshake signals for number "+number1+": "+signals1);
    // Output: Handshake signals for number 18: [JUMP, DOUBLE_BLINK]
```

```java
    // Example 2: Binary representation is 1101
    int number2=13;
    List<Signal> signals2=calculator.calculateHandshake(number2);
    System.out.println("Handshake signals for number "+number2+": "+signals2);
    // Output: Handshake signals for number 13: [WINK, CLOSE_YOUR_EYES, JUMP]
```

```java
    // Example 3: Binary representation is 111110
    int number3=62;
    List<Signal> signals3=calculator.calculateHandshake(number3);
    System.out.println("Handshake signals for number "+number3+": "+signals3);
    // Output: Handshake signals for number 62: [JUMP, CLOSE_YOUR_EYES, DOUBLE_BLINK, WINK]
```

