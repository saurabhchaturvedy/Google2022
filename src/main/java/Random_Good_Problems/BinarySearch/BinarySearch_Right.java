package main.java.Random_Good_Problems.BinarySearch;

public class BinarySearch_Right {


    private static int binarySearchRight(int[]nums,int target)
    {
        if(nums==null || nums.length==0)
        {
            return -1;
        }

        int left = 0;
        int right = nums.length;

        while (left<right)
        {
            int mid = left + (right-left)/2;

            if(nums[mid]==target)
            {
                return mid;
            } else if (nums[mid]<target) {
                left = mid+1;
            }
            else {
                right = mid;
            }
        }

        if(left!=nums.length && nums[left]==target) return left;
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 8};
        System.out.println(binarySearchRight(arr, 8));
    }
}
