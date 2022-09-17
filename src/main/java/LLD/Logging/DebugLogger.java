package main.java.LLD.Logging;

public class DebugLogger extends AbstractLogger {


    DebugLogger(int level) {
        this.level = level;
    }

    @Override
    public void display(String msg, LoggerSubject loggerSubject) {
        loggerSubject.notifyObservers(3, " DEBUG : " + msg);
    }
}
