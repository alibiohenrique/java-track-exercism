# Blackjack Card Parser and Game Logic

In this exercise, we have a class `Blackjack` responsible for parsing blackjack cards and implementing the logic for the
game of blackjack.

## Methods

- `parseCard(String card)`

    - Parses the given card and returns its numerical value.
    - Valid cards include "ace," "ten," "king," "queen," "jack," "nine," "eight," "seven," "six," "five," "four," "
      three," and "two."
    - If the card is not recognized, it returns 0.

- `firstTurn(String firstCard, String secondCard, String dealerCard)`

    - Calculates the initial hand value for the player based on the parsed cards.
    - Determines the player's next move (hit or stand) and returns the corresponding action:
        - If the hand value is over 20, it takes into account whether the player has a blackjack and the dealer's card
          and returns "W" (win), "S" (stand), or "P" (split) as appropriate.
        - If the hand value is not over 20, it returns "H" (hit) for a small hand, "S" (stand) for a big hand.

- `isBlackjack(String firstCard, String secondCard)`

    - Checks if the first two cards make a blackjack (a hand value of 21).

- `largeHand(boolean isBlackjack, int dealerScore)`

    - Returns "W" (win) if it's a blackjack and the dealer doesn't have a strong card; otherwise, it returns "S" (
      stand).

- `smallHand(int handScore, int dealerScore)`

    - Determines the player's move based on the hand score and the dealer's card.
    - Returns "H" (hit) if the hand score is below 12, "S" (stand) if the hand score is 17 or more, and "H" or "S" based
      on the dealer's card for scores between 12 and 16.

## Usage Examples

```java
// Method 1: parseCard()

int cardValue=blackjack.parseCard("ten");
System.out.println("Value of the card: " + cardValue); // Output: Value of the card: 10
```

```java
// Method 2: firstTurn()

String firstCard = "ace";
String secondCard = "king";
String dealerCard = "eight";

String action=blackjack.firstTurn(firstCard,secondCard,dealerCard);
System.out.println("Player's first move: " + action); // Output: Player's first move: W
```

```java
// Method 3: isBlackjack()

boolean isBlackjack=blackjack.isBlackjack("ace","king");
System.out.println("Is it a blackjack? " + isBlackjack); // Output: Is it a blackjack? true
```

```java
// Method 4: largeHand()

String largeHandResult=blackjack.largeHand(true,8);
System.out.println("Result of a large hand: " + largeHandResult); // Output: Result of a large hand: W
```

```java
// Method 5: smallHand()

String smallHandResult=blackjack.smallHand(15,7);
System.out.println("Result of a small hand: " + smallHandResult); // Output: Result of a small hand: H
```