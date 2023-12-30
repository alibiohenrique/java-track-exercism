# Captain's Log Generator

In this exercise, we have a class called `CaptainsLog` that generates random information for a captain's log. The class has methods for generating a random planet class, a random ship registry number, and a random stardate. It uses a `Random` object for generating random values.

## Constants

- `PLANET_CLASSES`: An array of characters representing different planet classes.

## Constructor

- `CaptainsLog(Random random)`

  - Initializes the `CaptainsLog` object with a `Random` object for generating random values.

## Methods

- `randomPlanetClass()`

  - Generates and returns a random planet class from the predefined array.

- `randomShipRegistryNumber()`

  - Generates and returns a random ship registry number in the format "NCC-XXXX," where XXXX is a random 4-digit number.

- `randomStardate()`

  - Generates and returns a random stardate in the range of 41000.0 to 42000.0.

## Usage Example

```java
// Creating a CaptainsLog object with a Random object
CaptainsLog captainsLog = new CaptainsLog(new Random());

// Generating random information
char randomPlanetClass = captainsLog.randomPlanetClass();
System.out.println("Random Planet Class: " + randomPlanetClass); // Output: Random Planet Class: M

String randomShipRegistryNumber = captainsLog.randomShipRegistryNumber();
System.out.println("Random Ship Registry Number: " + randomShipRegistryNumber); // Output: Random Ship Registry Number: NCC-7896

double randomStardate = captainsLog.randomStardate();
System.out.println("Random Stardate: " + randomStardate); // Output: Random Stardate: 41456.789
