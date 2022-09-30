package main.java.Random_Good_Problems.SweepLineIntervals;

import java.util.HashMap;
import java.util.List;

class AirplanesInSky {

    public int countOfAirplanes(List<Interval> airplanes) {
        if (airplanes == null || airplanes.size() == 0) {
            return 0;
        }

        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        int max = 0;

        for (Interval flight : airplanes) {
            int start = flight.start;
            int end = flight.end;
            for (int i = start; i < end; i++) {
                if (hashmap.containsKey(i)) {
                    hashmap.put(i, hashmap.getOrDefault(i, 0)+1);
                }
                max = Math.max(max, hashmap.get(i));
            }
        }
        return max;
    }
}