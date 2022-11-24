package main.java.Random_Good_Problems.RandomGoodProblems_2.MicrosoftOA;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MinimumAddDeleteOperations {

    private static int minNumberOfDeletionsOrAdditions(int[] nums) {

        int numberOfAdditionOrDeletions = 0;
        Map<Integer, Integer> countUniqueNumbers = new HashMap<>();

        for (int num : nums) {
            countUniqueNumbers.put(num, countUniqueNumbers.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : countUniqueNumbers.entrySet()) {
            if (!Objects.equals(entry.getKey(), entry.getValue())) {
                int diff = entry.getKey() - entry.getValue();
                if (diff > 0) {
                    if (diff < entry.getValue()) {
                        numberOfAdditionOrDeletions += diff;
                    } else {
                        numberOfAdditionOrDeletions += entry.getValue();
                    }
                } else {
                    numberOfAdditionOrDeletions += Math.abs(diff);
                }
            }
        }
        return numberOfAdditionOrDeletions;
    }

    public static void main(String[] args) {

        System.out.println(minNumberOfDeletionsOrAdditions(new int[]{1, 1, 1, 1, 2}));
        System.out.println(minNumberOfDeletionsOrAdditions(new int[]{10, 10, 10, 10, 10, 10, 10}));
    }
}
