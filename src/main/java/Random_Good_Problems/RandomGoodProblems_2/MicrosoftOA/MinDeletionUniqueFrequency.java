package main.java.Random_Good_Problems.RandomGoodProblems_2.MicrosoftOA;

import java.util.Arrays;

public class MinDeletionUniqueFrequency {


    public static int minDeletions(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        Arrays.sort(freq);
        int rolling_frequency = freq[25];
        int min_deletions = 0;

        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0) break;
            if (freq[i] > rolling_frequency) {
                min_deletions = min_deletions+freq[i] - rolling_frequency;
            } else {
                rolling_frequency = freq[i];
            }
            if (rolling_frequency > 0) {
                rolling_frequency--; // Lowest exp is zero, cannot be negative
            }
        }
        return min_deletions;
    }

    public static void main(String[] args) {
        String str = "faafkfkmmmm";
        System.out.println(minDeletions(str));
    }
}
