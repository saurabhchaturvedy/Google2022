package main.java.LLD.Logging;

public class InfoLogger extends AbstractLogger{

    InfoLogger(int level)
    {
        this.level=level;
    }
    @Override
    public void display(String msg, LoggerSubject loggerSubject) {
    loggerSubject.notifyObservers(1,"INFO : "+msg);
    }
}
