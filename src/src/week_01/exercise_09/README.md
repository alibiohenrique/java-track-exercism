# Car Assembly Rate Calculator

In this exercise, we have a class `CarsAssemble` with methods to calculate the car assembly rate based on different
speeds and success rates.

## Constants

- `CARS_PER_HOUR`

    - Represents the number of cars produced per hour. This constant is set to 221.

## Methods

- `productionRatePerHour(int speed)`

    - Calculates and returns the car assembly rate per hour based on the given speed.
    - Different success rates are applied based on the speed:
        - Speeds 1 to 4: Success rate is 100% (1.0).
        - Speeds 5 to 8: Success rate is 90% (0.9).
        - Speed 9: Success rate is 80% (0.8).
        - Speed 10: Success rate is 77% (0.77).
        - For any other speed, the production rate is 0.

- `workingItemsPerMinute(int speed)`

    - Calculates and returns the number of cars produced per minute based on the speed.
    - It divides the hourly production rate by 60 to obtain the production rate per minute.

## Usage Example

```java
// Calculate car assembly rate per hour

CarsAssemble assembler=new CarsAssemble();
int speed=7;
double productionRatePerHour=assembler.productionRatePerHour(speed);
System.out.println("Production rate per hour: "+productionRatePerHour);
```
```java
// Calculate car assembly rate per minute

int speed=5;
int productionRatePerMinute=assembler.workingItemsPerMinute(speed);
System.out.println("Production rate per minute: "+productionRatePerMinute);
```



