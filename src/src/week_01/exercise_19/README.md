# LogLine - Log Parsing

In this exercise, we have a class `LogLine` that deals with log lines and their parsing. The class is designed to extract the log level from a log line and transform the log line into a simplified format.

## Enum - LogLevel

The `LogLevel` enum represents various log levels, including TRACE, DEBUG, INFO, WARNING, ERROR, FATAL, and UNKNOWN.

## Class - LogLine

The `LogLine` class provides methods to parse and manipulate log lines. It has the following methods:

### `getLogLevel()`

- Extracts the log level from the log line.
- It checks for log level indications like `[INF]`, `[ERR]`, `[DBG]`, `[TRC]`, `[WRN]`, and `[FTL]` in the log line.
- Returns the corresponding `LogLevel` enum value.

### `getOutputForShortLog()`

- Transforms the log line into a simplified format.
- It replaces log level indications in the log line with numeric representations.
- Returns the modified log line.

## Usage Example

```java
LogLine logLine = new LogLine("[INF]: This is an informational log message");
LogLevel logLevel = logLine.getLogLevel();
String shortLog = logLine.getOutputForShortLog();

System.out.println("Log Level: " + logLevel); // Output: Log Level: INFO
System.out.println("Short Log: " + shortLog); // Output: Short Log: 4: This is an informational log message
