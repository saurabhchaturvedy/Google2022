package main.java.Array;

public class SecondLargest {


    private static int secondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        return second;
    }

    public static void main(String[] args) {


        System.out.println("Second largest value in the array is : " + secondLargest(new int[]{2, 8, 5, 13, 9, 2}));
    }
}
