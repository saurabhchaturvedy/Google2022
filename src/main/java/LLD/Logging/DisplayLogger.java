package main.java.LLD.Logging;

public class DisplayLogger implements LogObserver {
    @Override
    public void log(String msg) {
        System.out.println(" CONSOLE MSG :"+msg);
    }
}
