package main.java.DynamicProgramming;

public class NthFibonacci_Recursion {


    static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int left = fibonacci(n - 1);
        int right = fibonacci(n - 2);

        return left + right;
    }


    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        System.out.println(fibonacci(30));
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to arrive at solution : " + (endTime - startTime) + " millis");
    }
}
