package main.java.Random_Good_Problems.RandomGoodProblems_2.MicrosoftOA;

public class SignProductOfArray {


    public static int arraySign(int[] nums) {
        int sign = 1;

        for (final int num : nums) {
            if (num == 0)
                return 0;
            if (num < 0)
                sign = -sign;
        }

        return sign;
    }

    public static void main(String[] args) {

        int[]arr = {-1,-2,-3,-4,3,2,1};
        System.out.println(arraySign(arr));
    }
}
