package main.java.Random_Good_Problems.RandomGoodProblems_2.MicrosoftOA;

import java.util.Arrays;

class PivotIndex {
  public static int pivotIndex(int[] nums) {
    final int sum = Arrays.stream(nums).sum();
    int prefix = 0;

    for (int i = 0; i < nums.length; ++i) {
      if (prefix == sum - prefix - nums[i])
        return i;
      prefix += nums[i];
    }

    return -1;
  }

  public static void main(String[] args) {
    int[]arr = {1,7,3,6,5,6};
    System.out.println(pivotIndex(arr));
  }
}