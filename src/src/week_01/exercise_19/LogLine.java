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
}