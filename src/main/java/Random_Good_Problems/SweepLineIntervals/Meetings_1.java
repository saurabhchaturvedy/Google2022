package main.java.Random_Good_Problems.SweepLineIntervals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Meetings_1 {

    private static boolean canAttendMeetings(List<Interval> intervals) {
        if (intervals == null) return false;

        intervals.sort(Comparator.comparingInt(i -> i.start));

        Interval last = null;

        for (Interval i : intervals) {
            if (last != null && i.start < last.end) {
                return false;
            }

            last = i;
        }

        return true;
    }

    public static void main(String[] args) {

        Interval i1 = new Interval(5, 8);
        Interval i2 = new Interval(6, 9);

        System.out.println("Can attend meetings ? " + canAttendMeetings(Arrays.asList(i1, i2)));
    }
}
