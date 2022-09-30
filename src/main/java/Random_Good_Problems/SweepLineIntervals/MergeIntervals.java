package main.java.Random_Good_Problems.SweepLineIntervals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {


    private static List<Interval> mergeIntervals(List<Interval> intervals) {
        if (intervals == null || intervals.size() == 0) {
            return null;
        }

        List<Interval> answers = new ArrayList<>();

        intervals.sort(Comparator.comparingInt(i -> i.start));

        Interval last = null;

        for (Interval interval : intervals) {
            if (last == null || interval.start > last.end) {
                answers.add(interval);
                last = interval;
            } else {
                last.end = Math.max(last.end, interval.end);
            }
        }
        return answers;
    }


    public static void main(String[] args) {

    }
}
