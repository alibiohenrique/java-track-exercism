# Rotational Cipher

In this exercise, we have a class called `RotationalCipher` that performs a rotational cipher on a given string. The rotation is based on a shift key provided during initialization.

## Constructor

- `public RotationalCipher(int shiftKey)`

  - Initializes the rotational cipher with the given shift key.

## Methods

- `rotate(String data)`

  - Rotates each character in the provided string based on the shift key. Returns the transformed string.

## Usage Example

```java
// Example usage of the RotationalCipher class

int shiftKey = 3;
RotationalCipher cipher = new RotationalCipher(shiftKey);

String originalMessage = "Hello, World!";
String encryptedMessage = cipher.rotate(originalMessage);

System.out.println("Original Message: " + originalMessage); // Output: Original Message: Hello, World!
System.out.println("Encrypted Message: " + encryptedMessage); // Output: Encrypted Message: Khoor, Zruog!
