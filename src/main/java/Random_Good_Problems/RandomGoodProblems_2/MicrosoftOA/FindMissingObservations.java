package main.java.Random_Good_Problems.RandomGoodProblems_2.MicrosoftOA;

import java.util.Arrays;

public class FindMissingObservations {


    public static int[] missingDiceMoves(int[] rolls, int mean, int n) {
        final int targetSum = (rolls.length + n) * mean;
        int missingSum = targetSum - Arrays.stream(rolls).sum();
        if (missingSum > n * 6 || missingSum < n) return new int[]{};

        int[] missingDiceMoves = new int[n];
        Arrays.fill(missingDiceMoves, missingSum / n);
        missingSum %= n;
        for (int i = 0; i < missingSum; i++)
            missingDiceMoves[i]++;

        return missingDiceMoves;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int mean = 4;
        int n = 2;
        Arrays.stream(missingDiceMoves(arr, mean, n)).boxed().map(x -> x + " ").forEach(System.out::print);
    }
}
