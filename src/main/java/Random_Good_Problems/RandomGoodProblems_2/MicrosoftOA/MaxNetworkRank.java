package main.java.Random_Good_Problems.RandomGoodProblems_2.MicrosoftOA;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MaxNetworkRank {

    public static int maxNetworkRank(List<Integer> starts, List<Integer> ends, int n) {
        int[] edgeCount = new int[n];
        int m = starts.size();
        int maxRank = Integer.MIN_VALUE;

        for (int i = 0; i < m; i++) {
            edgeCount[starts.get(i) - 1]++;
            edgeCount[ends.get(i) - 1]++;
        }

        for (int i = 0; i < m; i++) {
            int rank = edgeCount[starts.get(i) - 1] + edgeCount[ends.get(i) - 1] - 1;
            if (rank > maxRank) {
                maxRank = rank;
            }
        }

        return maxRank;
    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> starts = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> ends = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());
        scanner.close();
        int res = maxNetworkRank(starts, ends, n);
        System.out.println(res);
    }
}
