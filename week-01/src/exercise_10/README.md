# Language List Management

In this exercise, we have a class `LanguageList` for managing a list of programming languages. You can add, remove, and query information about the list.

## Attributes

- `languages`

    - Represents a list of programming languages.

## Constructor

- `LanguageList()`

    - Initializes an empty language list.

## Methods

- `isEmpty()`

    - Checks if the language list is empty and returns `true` if it is, otherwise `false`.

- `addLanguage(String language)`

    - Adds a programming language to the list.

- `removeLanguage(String language)`

    - Removes a specific programming language from the list.

- `firstLanguage()`

    - Returns the first programming language in the list. If the list is empty, it will throw an exception.

- `count()`

    - Counts and returns the number of programming languages in the list.

- `containsLanguage(String language)`

    - Checks if a specific programming language is in the list and returns `true` if it is, otherwise `false`.

- `isExciting()`

    - Checks if the list contains either "Java" or "Kotlin," and returns `true` if at least one of them is present, otherwise `false`.

## Usage Example

```java
// Create a Language List

LanguageList languageList = new LanguageList();

// Add languages to the list

languageList.addLanguage("Java");
languageList.addLanguage("Python");
languageList.addLanguage("C++");

// Check if the list is empty

boolean empty = languageList.isEmpty();
System.out.println("Is the list empty? " + empty);

// Get the first language in the list

String firstLanguage = languageList.firstLanguage();
System.out.println("The first language in the list is: " + firstLanguage);

// Check if the list contains a specific language

boolean containsJava = languageList.containsLanguage("Java");
System.out.println("Does the list contain Java? " + containsJava);

// Check if the list is exciting

boolean isExciting = languageList.isExciting();
System.out.println("Is the list exciting? " + isExciting);

// Remove a language from the list

languageList.removeLanguage("C++");
