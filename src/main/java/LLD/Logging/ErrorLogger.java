package main.java.LLD.Logging;

public class ErrorLogger extends AbstractLogger{

    ErrorLogger(int level)
    {
        this.level=level;
    }
    @Override
    public void display(String msg, LoggerSubject loggerSubject) {
        loggerSubject.notifyObservers(2,"ERROR :"+msg);
    }
}
