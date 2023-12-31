package week_01.exercise_04;

public class LogLevels {

public static String message (String logLine) {

   String newMessage = null;
   String[] strings = logLine.split(": ");

   if (strings.length == 2) {
      newMessage = strings[1].replace("\\r\\n", "").trim();
   }

   return newMessage;
}

public static String logLevel (String logLine) {

   String check = null;

   if (logLine.toLowerCase().contains("error")) {
      check = "error";
   }
   else if (logLine.toLowerCase().contains("info")) {
      check = "info";
   }
   else if (logLine.toLowerCase().contains("warning")) {
      check = "warning";
   }
   else if (logLine.toLowerCase().contains("debug")) {
      check = "debug";
   }
   else {
      check = "unknown";
   }
   return check;
}

public static String reformat (String logLine) {

   String logLevel = logLevel(logLine);
   String logMessage = logLine.replaceFirst("\\[.*?\\]:\\s", "").trim();
   String reformattedLogLine = logMessage + " (" + logLevel + ")";

   return reformattedLogLine;
}

}
