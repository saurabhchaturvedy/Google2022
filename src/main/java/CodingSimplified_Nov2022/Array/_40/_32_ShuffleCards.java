package main.java.CodingSimplified_Nov2022.Array._40;

import java.util.Random;

public class _32_ShuffleCards {


    public static void shuffle(int[] arr) {
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            int randomIndex = random.nextInt(arr.length);

            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        shuffle(arr);
    }
}
