package main.java.Random_Good_Problems;

public class _31_JumpGame {


    static boolean canJump(int[] arr) {
        int lastPos = arr.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i + arr[i] >= lastPos) {
                lastPos = i;
            }
        }

        return lastPos == 0;
    }


    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 4};
        System.out.println(canJump(arr));
    }
}
