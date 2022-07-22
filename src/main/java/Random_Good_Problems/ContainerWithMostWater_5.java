package main.java.Random_Good_Problems;

public class ContainerWithMostWater_5 {


    private static int mostWater(int[]arr)
    {
        int l=0;
        int r=arr.length-1;
        int max=0;

        while (l<r)
        {
            int lh = arr[l];
            int rh = arr[r];

            int min_height = Math.min(lh,rh);

            int area = min_height * (r-l);

            max=Math.max(max,area);

            if(lh<rh)
                l++;
            else
                r--;
        }

        return max;
    }

    public static void main(String[] args) {

        int[]arr = {1,8,6,2,5,4,8,3,7};

        System.out.println(mostWater(arr));
    }
}
