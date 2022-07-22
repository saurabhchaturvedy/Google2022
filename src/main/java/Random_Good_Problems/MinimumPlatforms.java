package main.java.Random_Good_Problems;

import java.util.Arrays;

public class MinimumPlatforms {


   static int minimumPlatforms(int[] arr, int[] dep) {
        if (arr == null || dep == null || arr.length != dep.length) {
            return 0;
        }

        Arrays.sort(arr);
        Arrays.sort(dep);

        int min_plat_req = 0;
        int plat_required = 0;

        int i = 0;
        int j = 0;

        int n = arr.length;

        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                plat_required++;
                i++;
            } else {
                plat_required--;
                j++;
            }

            if (plat_required > min_plat_req) {
                min_plat_req = plat_required;
            }
        }

        return min_plat_req;
    }


    public static void main(String[] args) {

        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};

        System.out.println(minimumPlatforms(arr,dep));
    }
}
