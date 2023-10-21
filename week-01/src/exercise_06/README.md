# String Reversal Utility

In this exercise, we have a class with a method `reverse` for reversing a given string.

## Method

- `reverse(String inputString)`

  - Takes a string as input and reverses it.
  - Uses a `StringBuilder` to efficiently reverse the string.
  - Returns the reversed string.

## Usage Example

```java
// Reverse a string

String originalString = "Hello, World!";
StringReversalUtility utility = new StringReversalUtility();
String reversedString = utility.reverse(originalString);
System.out.println("Reversed string: " + reversedString); // Output: Reversed string: !dlroW ,olleH
