# Annalyn's Infiltration Quest - RPG Game Logic

In this exercise, we have a class `AnnalunsInfiltration`. The goal is to implement a quest logic for an RPG game where
the main character, Annalyn, seeks to
rescue her
kidnapped friend. There are various actions Annalyn can take based on the state of characters and conditions in the
game.

## Methods

- `canFastAttack(boolean knightIsAwake)`

    - Checks if a fast attack can be made based on the state of the knight.
        - If the knight is awake, a fast attack is not possible; otherwise, it returns true.

- `canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake)`

    - Checks if Annalyn can spy on the group based on the states of the knight, archer, and prisoner.
        - If at least one of them is awake, indicating that spying is possible, returning true.

- `canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake)`

    - Determines if Annalyn can signal the prisoner using bird sounds based on the states of the archer and prisoner.
        - If the archer is asleep and the prisoner is awake, it returns true.

- `canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent)`

    - Checks if Annalyn can free the prisoner, considering the states of the knight, archer, prisoner, and the presence
      of Annalyn's pet dog.
        - If the pet dog is present, Annalyn can free the prisoner if the archer is asleep.
        - If the pet dog is not present, Annalyn can free the prisoner if the prisoner is awake, and both the knight and
          archer are asleep.

## Usage Example

```java
//  Method 1: canFastAttack()

//  Example 1: Knight is awake, fast attack is not possible

boolean knightIsAwake = true;
boolean canFastAttack = AnnalynsInfiltration.canFastAttack(knightIsAwake);
System.out.println("Can Annalyn perform a fast attack? " + canFastAttack); // Output: Can Annalyn perform a fast attack? false

// Example 2: Knight is asleep, fast attack is possible

boolean knightIsAwake = false;
boolean canFastAttack = AnnalynsInfiltration.canFastAttack(knightIsAwake);
System.out.println("Can Annalyn perform a fast attack? " + canFastAttack); // Output: Can Annalyn perform a fast attack? true
```

```java
//  Method 2: canSpy()

//  Example 1: At least one character is awake, spying is possible

boolean knightIsAwake = false;
boolean archerIsAwake = true;
boolean prisonerIsAwake = false;
boolean canSpy = AnnalynsInfiltration.canSpy(knightIsAwake,archerIsAwake,prisonerIsAwake);
System.out.println("Can Annalyn spy on the group? " + canSpy); // Output: Can Annalyn spy on the group? true

//  Example 2: All characters are asleep, spying is not possible

boolean knightIsAwake = false;
boolean archerIsAwake = false;
boolean prisonerIsAwake = false;
boolean canSpy = AnnalynsInfiltration.canSpy(knightIsAwake,archerIsAwake,prisonerIsAwake);
System.out.println("Can Annalyn spy on the group? " + canSpy); // Output: Can Annalyn spy on the group? false
```

```java
//  Method 3: canSignalPrisoner()

//  Example 1: Archer is asleep, prisoner is awake, signaling is possible

boolean archerIsAwake = false;
boolean prisonerIsAwake = true;
boolean canSignalPrisoner = AnnalynsInfiltration.canSignalPrisoner(archerIsAwake,prisonerIsAwake);
System.out.println("Can Annalyn signal the prisoner? " + canSignalPrisoner); // Output: Can Annalyn signal the prisoner? true

//  Example 2: Archer is awake, signaling is not possible

boolean archerIsAwake = true;
boolean prisonerIsAwake = false;
boolean canSignalPrisoner=AnnalynsInfiltration.canSignalPrisoner(archerIsAwake,prisonerIsAwake);
System.out.println("Can Annalyn signal the prisoner? " + canSignalPrisoner); // Output: Can Annalyn signal the prisoner? false
```

```java
//  Method 4: canfreePrisoner()

boolean knightIsAwake = false;
boolean archerIsAwake = true;
boolean prisonerIsAwake = false;
boolean petDogIsPresent = false;

boolean canFree=AnnalynsInfiltration.canFreePrisoner(knightIsAwake,archerIsAwake,prisonerIsAwake,petDogIsPresent);
System.out.println("Can Annalyn free the prisoner?" + canFree);
```
