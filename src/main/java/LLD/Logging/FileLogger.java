package main.java.LLD.Logging;

public class FileLogger implements LogObserver{
    @Override
    public void log(String msg) {
        System.out.println(" FILE CONSOLE MSG :"+msg);
    }
}
