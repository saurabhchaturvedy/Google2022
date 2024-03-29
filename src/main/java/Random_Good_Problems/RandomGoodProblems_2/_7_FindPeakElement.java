package main.java.Random_Good_Problems.RandomGoodProblems_2;

class _7_FindPeakElement {
    public static int findPeakElement(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return 0;
        }

        int len = nums.length;
        if (nums[0] > nums[1]) {
            return 0;
        }
        if (nums[len - 1] > nums[len - 2]) {
            return len - 1;
        }

        int start = 0;
        int end = len - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            System.out.println(" mid = "+mid);
            System.out.println("nums[mid] = "+nums[mid]+" nums[mid+1]="+nums[mid+1]);
            if (nums[mid] < nums[mid + 1]) {
                start = mid;
                System.out.println(" start "+start);
            } else {
                end = mid;
                System.out.println(" end "+end);
            }
        }

        return (nums[start] > nums[start + 1]) ? nums[start] : nums[end];
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 20, 15};
        System.out.println(findPeakElement(arr));
    }
}