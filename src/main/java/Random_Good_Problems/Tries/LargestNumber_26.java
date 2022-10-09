package main.java.Random_Good_Problems.Tries;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber_26 {
    public static String largestNumber(int[] nums) {
        Integer[] ints = new Integer[nums.length];
        int i = 0;
        for (int v : nums) {
            ints[i++] = v;
        }
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer s1, Integer s2) {
                String c1 = Integer.toString(s1) + Integer.toString(s2);
                String c2 = Integer.toString(s2) + Integer.toString(s1);

                return -c1.compareTo(c2);
            }
        };

        Arrays.sort(ints, comp);

        if (ints[0] == 0) return "0";

        StringBuilder sb = new StringBuilder();
        for (int v : ints) {
            sb.append(v);
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(largestNumber(new int[]{1,2,3}));
    }
}