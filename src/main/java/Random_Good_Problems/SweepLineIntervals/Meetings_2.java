package main.java.Random_Good_Problems.SweepLineIntervals;

import java.util.Arrays;

public class Meetings_2 {


    private static int minMeetingRooms(Interval[] intervals) {
        int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            starts[i] = intervals[i].start;
            ends[i] = intervals[i].end;
        }

        Arrays.sort(starts);
        Arrays.sort(ends);

        int rooms = 0;
        int endTimes = 0;

        for (int i = 0; i < starts.length; i++) {
            if (starts[rooms] < ends[endTimes]) {
                rooms++;
            } else {
                endTimes++;
            }
        }

        return rooms;
    }


    public static void main(String[] args) {
        Interval[] intervals = new Interval[]{new Interval(5, 7), new Interval(6, 8)};
        System.out.println("Min meeting rooms required : " + minMeetingRooms(intervals));
    }
}
