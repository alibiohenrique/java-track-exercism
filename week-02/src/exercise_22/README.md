# SqueakyClean - Clean and Format Identifiers

In this exercise, we have a Java class `SqueakyClean` that provides a method to clean and format identifiers. The `clean` method takes an input identifier and applies various transformations to ensure it conforms to specified conventions.

## Class - SqueakyClean

The `SqueakyClean` class has a single method:

### `clean(String identifier)`

- Cleans and formats the input `identifier` based on specific conventions.
- Conventions:
    - Replaces spaces with underscores (`_`).
    - Removes digits (0-9).
    - Removes Greek lowercase letters (α-ω).
    - Replaces control characters (e.g., null character, carriage return, delete) with "CTRL".
    - Converts hyphens to uppercase the following character (e.g., "my-variable" becomes "myV").
    - Retains only letters and underscores in the final result.
- Returns the cleaned and formatted identifier.

## Usage Example

```java
String dirtyIdentifier = "this_is a 123 Test-string with α-ω Greek chars\rand control characters\0";
String cleanIdentifier = SqueakyClean.clean(dirtyIdentifier);

System.out.println("Dirty Identifier: " + dirtyIdentifier);
System.out.println("Cleaned Identifier: " + cleanIdentifier);
```