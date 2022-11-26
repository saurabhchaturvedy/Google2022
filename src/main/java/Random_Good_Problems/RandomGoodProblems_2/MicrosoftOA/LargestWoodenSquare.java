package main.java.Random_Good_Problems.RandomGoodProblems_2.MicrosoftOA;

class LargestWoodenSquare {
    public static int largestWoodenSquare(int A, int B) {
        int totalSticks = A + B;
        int maxLenghthTogether = totalSticks / 4;
        while(maxLenghthTogether > 0) {
        int maxLenghthA = A / maxLenghthTogether;
        int maxLenghthB = B / maxLenghthTogether;
        if(maxLenghthA + maxLenghthB >= 4) {
            return maxLenghthTogether;
        }
        maxLenghthTogether--;
        }
        return 0;
    }

    public static void main(String[] args) {

        int A = 10; int B = 21;
      //  System.out.println(largestWoodenSquare(A,B));


//        System.out.println(largestWoodenSquare(13,11));
        System.out.println(largestWoodenSquare(2,1));
//        System.out.println(largestWoodenSquare(1,8));
    }
}