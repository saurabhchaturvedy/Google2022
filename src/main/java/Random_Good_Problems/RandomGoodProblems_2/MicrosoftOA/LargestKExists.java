package main.java.Random_Good_Problems.RandomGoodProblems_2.MicrosoftOA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LargestKExists {

    public static int largestK(List<Integer> nums) {
        HashSet<Integer> set = new HashSet<>();
        int curMax = 0;
        for (int a : nums) {
            if (set.contains(-a)) curMax = Math.max(curMax, Math.abs(a));
            else set.add(a);
        }
        return curMax;
    }

    public static void main(String[] args) {

        System.out.println(largestK(Arrays.asList(3, 2, -2, 5, -3)));
    }
}
