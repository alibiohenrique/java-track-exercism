# Lasagna - Cooking Time Calculator

In this exercise, we have a class called `Lasagna` that helps calculate cooking times for making lasagna. The class
contains methods for calculating the expected time in the oven, the remaining time in the oven, the preparation time,
and the total cooking time.

## Methods

- `expectedMinutesInOven()`

    - Returns the expected time (in minutes) the lasagna should be in the oven, which is a constant value.

- `remainingMinutesInOven(int minutesLeft)`

    - Calculates and returns the remaining time (in minutes) the lasagna needs in the oven, given the time left.

- `preparationTimeInMinutes(int layers)`

    - Calculates and returns the preparation time (in minutes) based on the number of layers.

- `totalTimeInMinutes(int layers, int timeInOven)`

    - Calculates and returns the total cooking time (in minutes), which includes the preparation time and the time in
      the oven.

## Constants

- `MINUTES_IN_OVEN`: Expected oven time (40 minutes).
- `MINUTES_EACH_LAYER`: Time to prepare each layer (2 minutes).

## Usage Example

```java
//  Method 1: expectedMinutesInOven()

Lasagna lasagna = new Lasagna();
int expectedTimeInOven = lasagna.expectedMinutesInOven();
System.out.println("Expected time in the oven: " + expectedTimeInOven + " minutes"); // Output: Expected time in the oven: 40 minutes

// Method 2: remainingMinutesInOven()

int minutesLeft = 15; // Example: 15 minutes left
int remainingTimeInOven=lasagna.remainingMinutesInOven(minutesLeft);
System.out.println("Remaining time in the oven: " + remainingTimeInOven + " minutes"); // Output: Remaining time in the oven: 25 minutes

// Method 3: preparationTimeInMinutes()

int layers=3; // Example: 3 layers
int preparationTime=lasagna.preparationTimeInMinutes(layers);
System.out.println("Preparation time for " + layers + " layers: " + preparationTime + " minutes"); // Output: Preparation time for 3 layers: 6 minutes

// Method 4: totalTimeInMinutes()

int layers = 4; // Example: 4 layers
int timeInOven = 30; // Example: 30 minutes in the oven
int totalTime = lasagna.totalTimeInMinutes(layers,timeInOven);
System.out.println("Total cooking time for " + layers + " layers with " + timeInOven + " minutes in the oven: " + totalTime + " minutes"); // Output: Total cooking time for 4 layers with 30 minutes in the oven: 70 minutes
```

