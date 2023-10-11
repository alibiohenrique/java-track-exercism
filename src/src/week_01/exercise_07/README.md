# Bird Watching Tracker

In this exercise, we have a class `BirdWatcher` with methods to track and analyze bird sightings over a period of time.

## Constructor

- `BirdWatcher(int[] birdsPerDay)`

    - Initializes a `BirdWatcher` object with an array of daily bird counts.

## Methods

- `getLastWeek()`

    - Returns an array containing the bird counts for the last week (7 days).

- `getToday()`

    - Returns the count of birds seen today.

- `incrementTodaysCount()`

    - Increments the count of birds seen today by 1.

- `hasDayWithoutBirds()`

    - Checks if there was a day with no bird sightings.
    - Returns `true` if there was a day without birds; otherwise, returns `false`.

- `getCountForFirstDays(int numberOfDays)`

    - Returns the total count of birds seen for the specified number of days (starting from the first day).
    - If there are fewer days in the data than the specified number of days, it calculates the count for the available
      days.

- `getBusyDays()`

    - Counts and returns the number of days when at least 5 or more birds were seen, indicating a busy day for bird
      watching.

## Usage Examples

```java
// Method 1: getLastWeek()

int [] lastWeekCounts = birdWatcher.getLastWeek();
System.out.println("Bird counts for the last week: " + Arrays.toString(lastWeekCounts));
```

```java
// Method 2: getToday()

int todayCount = birdWatcher.getToday();
System.out.println("Bird count for today: " + todayCount);


```

```java
// Method 3: incrementTodaysCount()

birdWatcher.incrementTodaysCount();
int updatedTodayCount = birdWatcher.getToday();
System.out.println("Updated bird count for today: " + updatedTodayCount);
```

```java
// Method 4: hasDayWithoutBirds()

boolean hasDayWithoutBirds=birdWatcher.hasDayWithoutBirds();
System.out.println("Has there been a day without birds? " + hasDayWithoutBirds);
```

```java
// Method 5: getCountForFirstDays()

int countForFirst4Days = birdWatcher.getCountForFirstDays(4);
System.out.println("Bird count for the first 4 days: " + countForFirst4Days);
```

```java
// Method 6: getBusyDays()

int  = birdWatcher.getBusyDays();
System.out.println("Number of busy days: " + busyDays);
```