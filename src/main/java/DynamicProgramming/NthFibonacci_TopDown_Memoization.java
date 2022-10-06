package main.java.DynamicProgramming;

public class NthFibonacci_TopDown_Memoization {


    static int fibonacci(int n, int[] memo) {
        if (memo[n] == 0) {

            if (n < 2) {
                memo[n] = n;
            } else {

                int left = fibonacci(n - 1, memo);
                int right = fibonacci(n - 2, memo);
                memo[n] = left + right;
            }

        }
        return memo[n];
    }


    public static void main(String[] args) {
        int[] memo = new int[31];
        long startTime = System.currentTimeMillis();
        System.out.println(fibonacci(30, memo));
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to arrive at solution : " + (endTime - startTime) + " millis");
    }
}
