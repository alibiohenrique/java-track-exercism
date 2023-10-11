# Log Line Processing Utility

In this exercise, we have a class `LogLevels` with utility methods to process log lines and extract relevant information, such as log messages and log levels.

## Methods

- `message(String logLine)`

    - Extracts and returns the log message from a given log line.
    - The log message is the text after the colon and space (": ").
    - Removes any trailing "\\r\\n" and leading/trailing white spaces from the message.

- `logLevel(String logLine)`

    - Determines and returns the log level from a given log line.
    - Recognizes log levels such as "error," "info," "warning," and "debug" case-insensitively.
    - If no known log level is found, it returns "unknown."

- `reformat(String logLine)`

    - Reformats a log line to include the log level in parentheses.
    - Extracts the log level from the log line and the log message.
    - Returns the log message followed by the log level in parentheses.

## Usage Examples

```java
// Method 1: message()

String logLine = "ERROR: Database connection failed \\r\\n";
String message = LogLevels.message(logLine);
System.out.println("Extracted log message: " + message); // Output: Extracted log message: Database connection failed
```
```java
// Method 2: logLevel()

String logLine = "INFO: Application started successfully \\r\\n";
String level = LogLevels.logLevel(logLine);
System.out.println("Determined log level: " + level); // Output: Determined log level: info
```
```java
// Method 3: reformat()

String logLine = "WARNING: Invalid input received \\r\\n";
String reformattedLine = LogLevels.reformat(logLine);
System.out.println("Reformatted log line: " + reformattedLine); // Output: Reformatted log line: Invalid input received (warning)
```
