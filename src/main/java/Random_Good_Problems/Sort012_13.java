package main.java.Random_Good_Problems;

public class Sort012_13 {


    private static int[] sort012(int[] array) {
        int low = 0;
        int mid = 0;
        int high = array.length - 1;

        while (mid <= high) {
            if (array[mid] == 0) {
                swap(array, low, mid);
                low++;
                mid++;
            } else if (array[mid] == 1) {

                mid++;
            } else if (array[mid] == 2) {
                swap(array, mid, high);
                high--;
            }
        }

        return array;
    }

    private static void swap(int[] array, int first, int second) {

        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static void main(String[] args) {

        int[] array = {1, 0, 2, 0, 1, 1, 0, 0, 2, 2, 0};

        int[] ints = sort012(array);

        for (int x : ints) {
            System.out.print(x + " ");
        }
    }
}
