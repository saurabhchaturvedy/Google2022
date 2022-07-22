package main.java.Random_Good_Problems;

public class TrappingRainWater_2 {


    private static int getTrappedWater(int[] arr, int n) {
        int[] lmax = new int[n];
        int[] rmax = new int[n];
        int water = 0;

        lmax[0] = arr[0];

        for (int i = 1; i < n; i++) {
            lmax[i] = Math.max(lmax[i], lmax[i - 1]);
        }

        rmax[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rmax[i] = Math.max(rmax[i], rmax[i + 1]);
        }

        for (int i = 1; i < n - 1; i++) {

            water = water + (Math.min(lmax[i], rmax[i]) - arr[i]);
        }

        return water;
    }


    public static void main(String[] args) {
        int[] water = {3, 0, 2, 0, 4};
        System.out.println(getTrappedWater(water, 5));
    }
}
