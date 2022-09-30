package main.java.Random_Good_Problems.SweepLineIntervals;

import java.util.*;
import java.util.stream.Collectors;

class EmployeeFreeTime {
    public static List<Interval> employeeFreeTime(List<List<Interval>> avails) {
        List<Interval> result = new ArrayList<>();
        List<Interval> timeLine;
        timeLine = avails.stream().flatMap(Collection::stream).collect(Collectors.toList());
        timeLine.sort(Comparator.comparing(i -> i.start));

        Interval temp = timeLine.get(0);
        for (Interval each : timeLine) {
            if (temp.end < each.start) {
                result.add(new Interval(temp.end, each.start));
                temp = each;
            } else {
                temp = temp.end < each.end ? each : temp;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Interval> list1 = Arrays.asList(new Interval(1, 2), new Interval(5, 6));
        List<Interval> list2 = Arrays.asList(new Interval(1, 3), new Interval(4, 10));
        List<List<Interval>> avails = Arrays.asList(list1, list2);

        employeeFreeTime(avails).stream().forEach(i -> System.out.println(i.start + " " + i.end));

    }
}