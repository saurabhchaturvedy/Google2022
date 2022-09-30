package main.java.Random_Good_Problems.SweepLineIntervals;

import java.util.Comparator;

public class Point {

    int time;
    int flag;

    Point(int time, int flag) {
        this.time = time;
        this.flag = flag;
    }

    private static Comparator<Point> pointComparator = new Comparator<Point>() {
        @Override
        public int compare(Point p1, Point p2) {
            if (p1.time == p2.time) return p1.flag - p2.flag;
            return p1.time - p2.time;
        }
    };
}
