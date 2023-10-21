# Race Track Simulation - Need for Speed

In this exercise, we have two classes: `RaceTrack` and `NeedForSpeed`. The `RaceTrack` class represents a racetrack where a car can attempt to finish the track, and the `NeedForSpeed` class represents a high-speed car with a limited battery.

## RaceTrack Class

### Attributes

- `distance`

  - Represents the distance of the racetrack.

### Constructors

- `RaceTrack()`

  - Initializes an instance of a racetrack with a default distance.

- `RaceTrack(int distance)`

  - Initializes an instance of a racetrack with a specified distance.

### Methods

- `tryFinishTrack(NeedForSpeed car)`

  - Simulates the car's attempt to finish the racetrack.
  - It checks if the car's battery is drained or if the car successfully covers the entire distance.
  - Returns `true` if the car finishes the track and `false` if the battery is drained or the distance isn't covered.

## NeedForSpeed Class

### Attributes

- `batteryDrain`

  - Represents the rate of battery consumption per drive.

- `batteryLeft`

  - Represents the remaining battery capacity.

- `speed`

  - Represents the speed of the car.

- `distanceDriven`

  - Tracks the cumulative distance driven by the car.

### Constructors

- `NeedForSpeed()`

  - Initializes an instance of the car with default values.

- `NeedForSpeed(int speed, int batteryDrain)`

  - Initializes an instance of the car with specified speed and battery drain.

### Static Factory Method

- `nitro()`

  - Returns a specialized instance of the car with high speed and battery drain, simulating a nitro boost.

### Methods

- `drive()`

  - Simulates the car driving. It increases the distance driven and decreases the battery level based on the battery drain rate.

- `distanceDriven()`

  - Returns the cumulative distance driven by the car.

- `batteryDrained()`

  - Checks if the car's battery is drained and returns `true` if it is, otherwise `false`.

- `toString()`

  - Provides a string representation of the car's attributes.

- `getBatteryDrain()`

  - Returns the battery drain rate.

- `getBatteryLeft()`

  - Returns the remaining battery capacity.

- `getSpeed()`

  - Returns the car's speed.

## Usage Example

```java
// RaceTrack Class Methods

// Method: tryFinishTrack(NeedForSpeed car)

RaceTrack racetrack = new RaceTrack(1000);
NeedForSpeed car = new NeedForSpeed(60, 2);
boolean finished = racetrack.tryFinishTrack(car);
System.out.println("Car finished the track: " + finished);
```
```java
// NeedForSpeed Class Methods

// Method: nitro()

NeedForSpeed nitroCar = NeedForSpeed.nitro();
nitroCar.drive();
System.out.println("Nitro car battery drained: " + nitroCar.batteryDrained());
```
```java
// NeedForSpeed Class Methods

// Method: drive()

NeedForSpeed car = new NeedForSpeed(50, 3);
car.drive();
System.out.println("Distance driven: " + car.distanceDriven());
System.out.println("Battery drained: " + car.batteryDrained());
```
