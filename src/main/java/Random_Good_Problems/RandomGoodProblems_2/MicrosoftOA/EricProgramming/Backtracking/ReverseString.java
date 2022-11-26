package main.java.Random_Good_Problems.RandomGoodProblems_2.MicrosoftOA.EricProgramming.Backtracking;

public class ReverseString {


    public static String reverse(String s)
    {
     if(s.isEmpty())
     {
         return s;
     }
        return reverse(s.substring(1)) + s.charAt(0);
    }


    public static void main(String[] args) {

        String str="abc"; //cba
        System.out.println(reverse(str));
    }
}
