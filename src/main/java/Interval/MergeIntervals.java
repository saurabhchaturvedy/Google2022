package main.java.Interval;

import main.java.Interval.notes.Interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {


    private static List<Interval> mergeIntervals(List<Interval> intervals) {
        if (intervals.size() < 2) return intervals;
        intervals.sort(Comparator.comparingInt(i -> i.start));
        List<Interval> result = new ArrayList<>();
        Interval interval = intervals.get(0);
        int start = interval.start;
        int end = interval.end;
        for (int i = 1; i < intervals.size(); i++) {
            Interval current = intervals.get(i);
            if (current.start <= end) {
                end = Math.max(current.end, end);
            } else {
                result.add(new Interval(start, end));
                start = current.start;
                end = current.end;
            }
        }

        result.add(new Interval(start, end));
        return result;
    }


    public static void main(String[] args) {

        Interval interval1 = new Interval(7,9);
        Interval interval2 = new Interval(2,6);
        Interval interval3 = new Interval(1,3);

        List<Interval> intervals = mergeIntervals(Arrays.asList(interval1, interval2, interval3));

        System.out.println(intervals);
    }
}
