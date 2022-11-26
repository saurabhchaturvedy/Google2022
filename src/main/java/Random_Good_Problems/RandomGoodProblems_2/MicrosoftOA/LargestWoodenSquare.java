package main.java.Random_Good_Problems.RandomGoodProblems_2.MicrosoftOA;

class LargestWoodenSquare {
    public static int largestWoodenSquare(int A, int B) {
        int totalSticks = A + B;
        int maxLenghthTogether = totalSticks / 4;
        while (maxLenghthTogether > 0) {
            int maxLenghthA = A / maxLenghthTogether;
            int maxLenghthB = B / maxLenghthTogether;
            if (maxLenghthA + maxLenghthB >= 4) {
                return maxLenghthTogether;
            }
            maxLenghthTogether--;
        }
        return 0;
    }

    public static int solution(int A, int B) {
        int maxSize = 0;

        if (A >= (B / 3)) maxSize = Math.max(maxSize, B / 3);
        else maxSize = Math.max(maxSize, A / 1);
        if (A >= 2 * (B / 2)) maxSize = Math.max(maxSize, B / 2);
        else maxSize = Math.max(maxSize, A / 2);
        if (B >= (A / 3)) maxSize = Math.max(maxSize, A / 3);
        else maxSize = Math.max(maxSize, B / 1);

        return maxSize;
    }

    public static int largestSquare(int A, int B) {
        int sum = A + B;
        while (sum > 0) {
            if (sum % 4 == 0 && (sum / 4 <= A && sum / 4 <= B)) {
                break;
            }
            sum--;
        }

        return sum / 4;
    }

    public static void main(String[] args) {

        int A = 100;
        int B = 121;
        //  System.out.println(largestWoodenSquare(A,B));


//        System.out.println(largestWoodenSquare(13,11));
        System.out.println(largestSquare(102, 121));
//        System.out.println(largestWoodenSquare(1,8));
    }
}