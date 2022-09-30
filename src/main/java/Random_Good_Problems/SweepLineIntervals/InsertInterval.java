package main.java.Random_Good_Problems.SweepLineIntervals;

import java.util.ArrayList;
import java.util.List;

class InsertInterval {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> ans = new ArrayList<>();

        int index = 0;
        while (index < intervals.size()) {
            if (newInterval.start > intervals.get(index).start) {
                index++;
            } else {
                break;
            }
        }
        intervals.add(index, newInterval);

        Interval last = null;
        for (Interval interval : intervals) {
            if (last == null || interval.start > last.end) {
                ans.add(interval);
                last = interval;
            } else {
                last.end = Math.max(last.end, interval.end);
            }
        }
        return ans;
    }
}