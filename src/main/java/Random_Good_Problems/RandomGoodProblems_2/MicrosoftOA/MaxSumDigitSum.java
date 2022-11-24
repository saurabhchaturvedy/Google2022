package main.java.Random_Good_Problems.RandomGoodProblems_2.MicrosoftOA;

import java.util.HashMap;
import java.util.Map;

public class MaxSumDigitSum {


    public static int digitSum(int num) {
        int sum = 0;
        int rem = 0;

        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }

        return sum;
    }


    public static int maxSum(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxSum = -1;
        for (int num : arr) {
            int digitSum = digitSum(num);

            if (map.containsKey(digitSum)) {
                if (num + map.get(digitSum) > maxSum) {
                    maxSum = num + map.get(digitSum);
                }
                map.put(digitSum, Math.max(num, map.get(digitSum)));
            } else {
                map.put(digitSum, num);
            }
        }

        return maxSum;
    }


    public static void main(String[] args) {
        int[] arr = {18, 19, 23, 15};
        System.out.println(maxSum(arr));
    }
}
