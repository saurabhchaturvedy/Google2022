package main.java.CodingSimplified_Nov2022.Array._30;

public class _29_MaximumSubArraySum {


    public int maxSumArraySum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int sum = 0;
        int max_sum = Integer.MIN_VALUE;
        boolean positiveExists = false;
        int max_element = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                positiveExists = true;
            }

            sum = sum + arr[i];
            max_element = Math.max(arr[i], max_element);

            if (sum < 0) {
                sum = 0;
                continue;
            }

            max_sum = Math.max(max_sum, sum);

        }

        return positiveExists ? sum : max_element;
    }

    public int maxSubArraySum2(int[] arr) {

        int size = arr.length;
        int start = 0;
        int end = 0;

        int maxSoFar = arr[0], maxEndingHere = arr[0];

        for (int i = 1; i < size; i++) {
            if (arr[i] > maxEndingHere + arr[i]) {
                maxEndingHere = arr[i];
                start=i;
            } else {
                maxEndingHere = maxEndingHere + arr[i];
            }

            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
                end=i;

            }
        }
        System.out.printf("Found Maximum Subarray between %d and %d", Math.min(start, end), end);
        System.out.println();
        return maxSoFar;
    }


    public static void main(String[] args) {

        _29_MaximumSubArraySum maximumSubArraySum = new _29_MaximumSubArraySum();
        int[] arr = {-9,-6,-18,-2};

        System.out.println(maximumSubArraySum.maxSubArraySum2(arr));

    }
}
