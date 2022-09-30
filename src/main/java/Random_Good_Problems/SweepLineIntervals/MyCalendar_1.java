package main.java.Random_Good_Problems.SweepLineIntervals;

import java.util.ArrayList;
import java.util.List;

class MyCalendar_1 {
    List<int[]> calendar;

    public MyCalendar_1() {
        calendar = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (int[] date : calendar) {
            if (date[0] < end && date[1] > start) {
                return false;
            }
        }
        calendar.add(new int[]{start, end});
        return true;
    }

    public static void main(String[] args) {
        MyCalendar_1 calender = new MyCalendar_1();
        System.out.println(calender.book(10, 20));
        System.out.println(calender.book(15, 25));
        System.out.println(calender.book(20, 30));
    }
}