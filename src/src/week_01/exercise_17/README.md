# Wizards and Warriors - Role-Playing Game

In the role-playing game "Wizards and Warriors," you can play as either a `Wizard` or a `Warrior`, each with unique abilities and rules for determining damage points.

## Fighter Class

- The base class for both Wizards and Warriors.
- Provides the ability to check vulnerability and calculate damage points.

```java

// Create a Fighter (Wizard or Warrior)
Fighter fighter = new Warrior(); // or Fighter fighter = new Wizard();

// Check vulnerability
boolean vulnerable = fighter.isVulnerable();
System.out.println("Is the fighter vulnerable? " + vulnerable);
```

## Warrior Class

- Deal 6 points of damage if the fighter they are attacking is not vulnerable.
- Deal 10 points of damage if the fighter they are attacking is vulnerable.

```java
// Create a Warrior
Warrior warrior = new Warrior();

// Calculate damage points
int damagePoints = warrior.damagePoints(anotherFighter);
System.out.println("Warrior deals " + damagePoints + " points of damage.");
```

## Wizard Class

- Deal 12 points of damage if the Wizard prepared a spell in advance.
- Deal 3 points of damage if the Wizard did not prepare a spell in advance.
- Wizards are vulnerable if they haven't prepared a spell.

```java
// Create a Wizard
Wizard wizard = new Wizard();

// Calculate damage points with spell prepared
wizard.prepareSpell();
int damagePointsWithSpell = wizard.damagePoints(anotherFighter);
System.out.println("Wizard with prepared spell deals " + damagePointsWithSpell + " points of damage.");

// Calculate damage points without spell prepared
int damagePointsWithoutSpell = wizard.damagePoints(anotherFighter);
System.out.println("Wizard without prepared spell deals " + damagePointsWithoutSpell + " points of damage.");
```

