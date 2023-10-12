# Football Match Reports

In this exercise, we have a class `FootballMatchReports` that provides information about the on-field positions of football players based on their shirt numbers.

## Method

- `onField(int shirtNum) throws IllegalArgumentException`

  - Determines the on-field position of a football player based on their shirt number.
  - It checks if the shirt number is within the valid range (between 1 and 11). 
    - If not, it throws an `IllegalArgumentException`.
  - It uses a switch statement to map the shirt number to the player's position.

## Usage Example

```java
// Get the on-field position of a player

try {
    int shirtNum = 7; // Example shirt number
    String position = FootballMatchReports.onField(shirtNum);
    System.out.println("Player with shirt number " + shirtNum + " plays as a " + position);
} catch (IllegalArgumentException e) {
    System.err.println("Invalid shirt number: " + e.getMessage());
}
