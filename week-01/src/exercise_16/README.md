# Scrabble Word Scoring

In this exercise, we have a class `Scrabble` that calculates the score of a given word in a game of Scrabble based on the point values of each letter.

## Attributes

- `word`

  - Represents the word for which you want to calculate the score.

## Constructor

- `Scrabble(String word)`

  - Initializes an instance of the `Scrabble` class with the provided word.

## Method

- `getScore()`

  - Calculates and returns the score of the word according to Scrabble scoring rules.
  - It iterates through the letters of the word, looks up their point values, and accumulates the total score.

## Usage Example

```java
// Calculate the score for a word

Scrabble scrabble = new Scrabble("example");
int score = scrabble.getScore();
System.out.println("Score for 'example': " + score);
