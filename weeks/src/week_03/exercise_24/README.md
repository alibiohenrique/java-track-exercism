# Badge Printer

In this exercise, we have a class called `Badge` that represents a badge and provides a method for generating a badge printout. The `print` method takes three parameters: `id` (an Integer), `name` (a String), and `department` (a String). It constructs and returns a formatted badge printout based on the input parameters.

## Method

- `print(Integer id, String name, String department)`

  - Generates and returns a formatted badge printout based on the provided parameters. The formatting depends on the presence or absence of the `id` and `department` values.

## Usage Example

```java
// Creating a Badge object
Badge badge = new Badge();

// Example 1: Printing a badge with only name and department
String badgePrint1 = badge.print(null, "John Doe", "Engineering");
System.out.println("Badge Print 1: " + badgePrint1); // Output: John Doe - ENGINEERING

// Example 2: Printing a badge with only name (owner)
String badgePrint2 = badge.print(null, "Jane Smith", null);
System.out.println("Badge Print 2: " + badgePrint2); // Output: Jane Smith - OWNER

// Example 3: Printing a badge with id, name, and department
String badgePrint3 = badge.print(123, "Alice Johnson", "HR");
System.out.println("Badge Print 3: " + badgePrint3); // Output: [123] - Alice Johnson - HR

// Example 4: Printing a badge with id, name (owner)
String badgePrint4 = badge.print(456, "Bob Williams", null);
System.out.println("Badge Print 4: " + badgePrint4); // Output: [456] - Bob Williams - OWNER
