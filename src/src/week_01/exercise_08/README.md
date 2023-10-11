# Isogram Checker

In this exercise, we have a class with a method `isIsogram` for checking if a given phrase is an isogram, which is a
word or phrase without any repeating letters.

## Method

- `isIsogram(String phrase)`

    - Takes a string as input and checks if it is an isogram.
    - Converts the input phrase to lowercase.
    - Removes hyphens and spaces from the phrase.
    - Sorts the characters in the cleaned phrase in ascending order.
    - Compares adjacent characters to check for duplicates.
    - Returns `true` if the phrase is an isogram (no repeating letters), and `false` otherwise.

## Usage Example

```java
// Check if a phrase is an isogram

String phrase1="Ambidextrously";
        IsogramChecker checker=new IsogramChecker();
        boolean isIsogram1=checker.isIsogram(phrase1);
        System.out.println("Is it an isogram? "+isIsogram1); // Output: Is it an isogram? true
```

```java
// Test Made Up Name That Is An Isogram

String phrase2="Emily Jung Schwartzkopf";
        boolean isIsogram2=checker.isIsogram(phrase2);
        System.out.println("Is it an isogram? "+isIsogram2); // Output: Is it an isogram? true
```

```java
// Test Isogram With Duplicated Hyphen

String phrase3="six-year-old";
        IsogramChecker checker=new IsogramChecker();
        boolean isIsogram1=checker.isIsogram(phrase2);
        System.out.println("Is it an isogram? "+isIsogram1); // Output: Is it an isogram? true
```
