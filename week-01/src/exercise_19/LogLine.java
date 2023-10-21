package week_01.exercise_19;

public class LogLine {

    private String logLine;

    public LogLine() {

    }

    public LogLine(String logline) {
        this.logLine = logline;
    }

    public LogLevel getLogLevel() {

        if (logLine.contains("[INF]")) {
            return LogLevel.INFO;
        } else if (logLine.contains("[ERR]")) {
            return LogLevel.ERROR;
        } else if (logLine.contains("[DBG]")) {
            return LogLevel.DEBUG;
        } else if (logLine.contains("[TRC]")) {
            return LogLevel.TRACE;
        } else if (logLine.contains("[WRN]")) {
            return LogLevel.WARNING;
        } else if (logLine.contains("[FTL]")) {
            return LogLevel.FATAL;
        }

        return LogLevel.UNKNOW;

    }

    public String getOutputForShortLog() {

        String newMessage = null;

        if (logLine.contains("[UNK]")) {
            newMessage = logLine.replace("[UNK]: ", "0:").trim();
        } else if (logLine.contains("[ABC]")) {
            newMessage = logLine.replace("[ABC]: ", "0:").trim();
        } else if (logLine.contains("[TRC]")) {
            newMessage = logLine.replace("[TRC]: ", "1:").trim();
        } else if (logLine.contains("[DBG]")) {
            newMessage = logLine.replace("[DBG]: ", "2:").trim();
        } else if (logLine.contains("[INF]")) {
            newMessage = logLine.replace("[INF]: ", "4:").trim();
        } else if (logLine.contains("[WRN]")) {
            newMessage = logLine.replace("[WRN]: ", "5:").trim();
        } else if (logLine.contains("[ERR]")) {
            newMessage = logLine.replace("[ERR]: ", "6:").trim();
        } else if (logLine.contains("[FTL]")) {
            newMessage = logLine.replace("[FTL]: ", "42:").trim();
        }
        return newMessage;
    }
}