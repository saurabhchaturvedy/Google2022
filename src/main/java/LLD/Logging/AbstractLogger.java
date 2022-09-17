package main.java.LLD.Logging;

public abstract class AbstractLogger {

    int level;
    AbstractLogger abstractLogger;

    void setNextAbstractLogger(AbstractLogger abstractLogger) {
        this.abstractLogger = abstractLogger;
    }

    void logMessage(int level, String msg, LoggerSubject loggerSubject) {
        if (this.level == level) {
            display(msg, loggerSubject);
        }

        if (abstractLogger != null) {
            abstractLogger.logMessage(level, msg, loggerSubject);
        }
    }


    public abstract void display(String msg, LoggerSubject loggerSubject);

}
