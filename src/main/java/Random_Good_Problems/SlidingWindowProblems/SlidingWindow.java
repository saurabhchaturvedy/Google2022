package main.java.Random_Good_Problems.SlidingWindowProblems;

public class SlidingWindow {


    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        int k = 3;
        int curr_sum = 0;
        int maximum_sum = Integer.MIN_VALUE;
        for (int i = 0; i < n - k + 1; i++) {

            curr_sum = 0;
            for (int j = 0; j < k; j++) {

                curr_sum = curr_sum + arr[i + j];
                //updating the maximum_sum
                maximum_sum = Math.max(curr_sum, maximum_sum);
            }//end of j for loop

        } // end of i for loop
        System.out.println(maximum_sum);
    }
}
