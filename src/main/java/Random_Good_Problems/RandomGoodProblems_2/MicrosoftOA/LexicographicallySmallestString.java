package main.java.Random_Good_Problems.RandomGoodProblems_2.MicrosoftOA;

import java.util.Scanner;

public class LexicographicallySmallestString {

    public static String smallestString(String s) {
        int i = 0;
        for (; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                break;
            }
        }
        return s.substring(0, i) + s.substring(i + 1, s.length());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        String res = smallestString(s);
        System.out.println(res);
    }
}
