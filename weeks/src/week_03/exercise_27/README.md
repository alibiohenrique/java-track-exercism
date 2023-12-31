# MicroBlog Text Truncator

In this exercise, we have a class called `MicroBlog` that provides a method for truncating a given text to the first 5 characters. The `truncate` method ensures that only complete Unicode characters are counted.

## Method

- `truncate(String input)`

  - Truncates the input text to the first 5 characters while considering complete Unicode characters. Returns the truncated string.

## Usage Example

```java
// Creating a MicroBlog object
MicroBlog microBlog = new MicroBlog();

// Example: Truncating a text
String truncatedText = microBlog.truncate("Hello, world!");
System.out.println("Truncated Text: " + truncatedText); // Output: Truncated Text: Hello
