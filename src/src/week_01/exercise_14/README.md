# Remote Control Car Racing

In this exercise, we have two classes: `ProductionRemoteControlCar` and `ExperimentalRemoteControlCar`, along with an interface `RemoteControlCar` and a utility class `TestTrack` for remote control car racing.

## ProductionRemoteControlCar Class

### Attributes

- `distanceTravelled`
  - Represents the distance traveled by the car.
- `numberOfVictories`
  - Represents the number of victories achieved by the car.

### Methods

- `drive()`
  - Simulates the car driving and increases the distance traveled by 20.
- `getDistanceTravelled()`
  - Retrieves the total distance traveled by the car.
- `getNumberOfVictories()`
  - Retrieves the number of victories achieved by the car.
- `setNumberOfVictories(int numberOfVictories)`
  - Sets the number of victories achieved by the car.

### Implements

- `Comparable<ProductionRemoteControlCar>`
  - Allows comparison of `ProductionRemoteControlCar` objects based on the number of victories.

## ExperimentalRemoteControlCar Class

### Attributes

- `distanceTravelled`
  - Represents the distance traveled by the experimental car.

### Methods

- `drive()`
  - Simulates the car driving and increases the distance traveled by 10.
- `getDistanceTravelled()`
  - Retrieves the total distance traveled by the experimental car.

## RemoteControlCar Interface

### Methods

- `drive()`
  - Declares the method for driving the car.
- `getDistanceTravelled()`
  - Declares the method to retrieve the distance traveled by the car.

## TestTrack Class

### Methods

- `race(RemoteControlCar car)`
  - Simulates a race for a given remote control car by calling its `drive` method.
- `getRankedCars(List<ProductionRemoteControlCar> cars)`
  - Sorts and returns a list of `ProductionRemoteControlCar` objects based on the number of victories.

## Usage Examples

```java
// Create remote control cars

ProductionRemoteControlCar productionCar = new ProductionRemoteControlCar();
ExperimentalRemoteControlCar experimentalCar = new ExperimentalRemoteControlCar();

// Race the cars

TestTrack.race(productionCar);
TestTrack.race(experimentalCar);

// Get ranked production cars

List<ProductionRemoteControlCar> productionCars = new ArrayList<>();
productionCars.add(productionCar);

List<ProductionRemoteControlCar> rankedProductionCars = TestTrack.getRankedCars(productionCars);
System.out.println("Ranked Production Cars: " + rankedProductionCars);
