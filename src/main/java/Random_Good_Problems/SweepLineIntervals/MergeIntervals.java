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

        for (Interval i : intervals) {
            if (last == null || last.end < i.start) {
                answers.add(i);
                last = i;
            } else {
                last.end = Math.max(last.end, i.end);
            }
        }
        return answers;
    }


    public static void main(String[] args) {

    }
}
