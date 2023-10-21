package week_02.exercise_21;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {

    private LocalDateTime localDateTime;

    public Gigasecond(LocalDate localDate) {

        this.localDateTime = localDate.atStartOfDay();

    }

    public Gigasecond(LocalDateTime localDateTime) {

        this.localDateTime = localDateTime;

    }

    public LocalDateTime getDateTime() {

        return localDateTime.plusSeconds(1000000000L);


    }


}



/*

    What are the differences between LocalDate & LocalDateTime?

    In Java, LocalDate and LocalDateTime are classes from the java.time package (introduced in Java 8)
    *   They are used to work with date and time values.
*   *   They have different purposes and represent different aspects of date and time:

    LocalDate:
    *   Represents a date without a specific time of day (year, month, and day).
    *   It's used when you only need to work with date-related information and don't care about the time component.
    *   Example usage:
        ->  Representing a specific date, such as a birthdate, an event date, or a calendar date.

    LocalDateTime:

    *   Represents a date and time (year, month, day, hour, minute, and second),
        ->   Including fractional seconds.
    *   Used when you need to work with both date and time components.
    *   Example usage:
        ->  Representing a timestamp for an event or a moment in time.

 */
