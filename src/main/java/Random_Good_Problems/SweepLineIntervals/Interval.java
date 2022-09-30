package main.java.Random_Good_Problems.SweepLineIntervals;

public class Interval {

    public int start;
    public int end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Interval{" + "start=" + start + ", end=" + end + '}';
    }
}
