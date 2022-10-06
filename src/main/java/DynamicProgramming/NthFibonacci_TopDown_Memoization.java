package main.java.DynamicProgramming;

public class NthFibonacci_TopDown_Memoization {


    static int fibonacci(int n, int[] cache) {
        if (cache[n] == 0) {

            if (n < 2) {
                cache[n] = n;
            } else {

                int left = fibonacci(n - 1, cache);
                int right = fibonacci(n - 2, cache);
                cache[n] = left + right;
            }

        }
        return cache[n];
    }


    public static void main(String[] args) {
        int[] memo = new int[31];
        long startTime = System.currentTimeMillis();
        System.out.println(fibonacci(30, memo));
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to arrive at solution : " + (endTime - startTime) + " millis");
    }
}
