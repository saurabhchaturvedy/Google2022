package main.java.DynamicProgramming;

public class NthFibonacci_BottomUp_Tabulation {


    static int fibonacci(int n) {
        int[] table = new int[n + 1];

        table[0] = 0;
        table[1] = 1;

        for (int i = 2; i <= n; i++) {
            table[i] = table[i - 1] + table[i - 2];
        }

        return table[n];

    }


    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        System.out.println(fibonacci(30));
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to arrive at solution : " + (endTime - startTime) + " millis");
    }
}
