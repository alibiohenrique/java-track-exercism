# Gigasecond - Calculate a Date and Time One Gigasecond Later

In this exercise, we have a Java class `Gigasecond` that is used to calculate a date and time one gigasecond (1,000,000,000 seconds) later than a given date or date and time.

## Class - Gigasecond

The `Gigasecond` class has two constructors and a method for calculating the gigasecond later date and time:

### Constructors

#### `Gigasecond(LocalDate localDate)`

- Initializes an instance of the `Gigasecond` class with a specific date (`localDate`).
- This constructor sets the time component to midnight (00:00:00) on the given date.

#### `Gigasecond(LocalDateTime localDateTime)`

- Initializes an instance of the `Gigasecond` class with a specific date and time (`localDateTime`).

### Method

#### `getDateTime()`

- Calculates and returns the date and time one gigasecond (1,000,000,000 seconds) later than the date or date and time provided during object creation.

## Usage Example

```java
LocalDate initialDate = LocalDate.of(2023, 9, 26);
Gigasecond gigasecond = new Gigasecond(initialDate);

LocalDateTime initialDateTime = LocalDateTime.of(2023, 9, 26, 12, 0, 0);
Gigasecond gigasecondWithTime = new Gigasecond(initialDateTime);

LocalDateTime gigasecondLater = gigasecond.getDateTime();
LocalDateTime gigasecondLaterWithTime = gigasecondWithTime.getDateTime();

System.out.println("Initial Date: " + initialDate);
System.out.println("One Gigasecond Later: " + gigasecondLater);
System.out.println("Initial Date and Time: " + initialDateTime);
System.out.println("One Gigasecond Later with Time: " + gigasecondLaterWithTime);
``