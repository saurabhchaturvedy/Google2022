package main.java.LLD.Logging;

public class LogManager {


    public static AbstractLogger doChaining() {
        AbstractLogger infoLogger = new InfoLogger(1);

        AbstractLogger errorLogger = new ErrorLogger(2);
        infoLogger.setNextAbstractLogger(errorLogger);

        AbstractLogger debugLogger = new DebugLogger(3);
        errorLogger.setNextAbstractLogger(debugLogger);

        return infoLogger;
    }

    public static LoggerSubject addObservers() {
        LoggerSubject loggerSubject = new LoggerSubject();
        DisplayLogger displayLogger = new DisplayLogger();
        loggerSubject.addObservers(1, displayLogger);
        loggerSubject.addObservers(2, displayLogger);
        loggerSubject.addObservers(3, displayLogger);
        FileLogger fileLogger = new FileLogger();
        loggerSubject.addObservers(2, fileLogger);
        return loggerSubject;
    }
}
