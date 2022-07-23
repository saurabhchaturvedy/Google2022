package main.java.Random_Good_Problems;

public class MaximumSubarraySum_6 {


    private static int maxSubArraySum(int[] arr) {
        int sum = arr[0];
        int max_sum = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (sum < 0) {
                sum = arr[i];
            } else {

                sum = sum + arr[i];
            }

            max_sum = Math.max(sum, max_sum);
        }

        return max_sum;
    }

    public static void main(String[] args) {

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println("Maximum Sub Array Sum : "+maxSubArraySum(arr));

    }
}
