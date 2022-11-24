package main.java.Random_Good_Problems.RandomGoodProblems_2.MicrosoftOA;

import java.util.Scanner;

public class MinimumDeletionsStringRightFormat {

    public static int minStep(String str) {
        int charA = 'A';
        int numB = 0;
        int minDel = 0;

        for (int i = 0; i < str.length(); i++) {
            if (charA == str.charAt(i)) {
                minDel = Math.min(numB, minDel + 1);
            } else {
                numB++;
            }
        }
        return minDel;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        System.out.println(minStep(str));
    }
}
