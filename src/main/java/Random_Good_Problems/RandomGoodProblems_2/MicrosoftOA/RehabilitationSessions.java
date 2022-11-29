package main.java.Random_Good_Problems.RandomGoodProblems_2.MicrosoftOA;

public class RehabilitationSessions {

    public static int minCost(int[] arr, int x, int y) {
        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i <= arr.length - (2 * x - 1); i++) {
            int cost = arr[i], j = 1;
            while (j < x) {
                cost += arr[i + j * y];
                j++;
            }
            minCost = Math.min(minCost, cost);
        }
        return minCost;
    }


    public static void main(String[] args) {
        int[] arr = {14, 2, 3, 7};
        int X = 2;
        int Y = 2;

        System.out.println(minCost(arr, X, Y));
    }
}
