# Elon's Toy Car - Electric Car Simulator

In this exercise, we have a class `ElonsToyCar` that simulates an electric car. The car has a battery, and you can drive it to cover a certain distance while consuming battery power.

## Constants

- `BATTERY_USAGE`

    - Represents the amount of battery power consumed per mile driven. It's set to 1 unit of power per mile.

- `MILES_DRIVEN_CAPACITY`

    - Represents the distance the car can cover in a single drive. It's set to 20 miles.

- `BATTERY_CAPACITY`

    - Represents the maximum battery capacity of the car. It's set to 100 units of power.

## Attributes

- `batteryLevel`

    - Tracks the current battery level.

- `batteryUsage`

    - Tracks the cumulative battery usage.

- `distanceDriven`

    - Tracks the cumulative distance driven.

## Constructor

- `ElonsToyCar()`

    - Initializes an instance of Elon's toy car with default values.

## Static Factory Method

- `buy()`

    - Returns a new instance of Elon's toy car. It's used to "buy" a car.

## Methods

- `distanceDisplay()`

    - Displays the distance driven in meters. If the distance exceeds 2000 meters, it returns "Driven 2000 meters."

- `batteryDisplay()`

    - Displays the battery level in percentage. If the battery is empty, it returns "Battery empty." Otherwise, it shows the remaining battery level.

- `drive()`

    - Simulates driving the car. It increases the distance driven and decreases the battery level based on the constants.

## Usage Example

```java
// Buy an Elon's Toy Car

ElonsToyCar car = ElonsToyCar.buy();

// Drive the car

car.drive();
String distanceDisplay = car.distanceDisplay();
System.out.println("Distance display: " + distanceDisplay);

String batteryDisplay = car.batteryDisplay();
System.out.println("Battery display: " + batteryDisplay);
