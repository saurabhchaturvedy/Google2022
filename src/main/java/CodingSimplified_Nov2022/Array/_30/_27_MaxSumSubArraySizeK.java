package main.java.CodingSimplified_Nov2022.Array._30;

public class _27_MaxSumSubArraySizeK {


    public int maxSumSizeK(int[] arr, int K) {
        if (arr.length == 0 || K <= 0 || K > arr.length) {
            return -1;
        }

        int sum = 0;
        for (int i = 0; i < K; i++) {
            sum = sum + arr[i];
        }

        int max_sum = sum;
        int start = 0;

        for (int j = K; j < arr.length; j++) {
            sum = sum + arr[j] - arr[start++];

            if (sum > max_sum) {
                max_sum = sum;
            }
        }

        return max_sum;
    }


    public static void main(String[] args) {

        int[] arr = {3, 2, 5, 4, 1};
        _27_MaxSumSubArraySizeK maxSumSubArraySizeK = new _27_MaxSumSubArraySizeK();
        int maxSum = maxSumSubArraySizeK.maxSumSizeK(arr, 2);
        System.out.println("Maximum sum : " + maxSum);

    }
}
