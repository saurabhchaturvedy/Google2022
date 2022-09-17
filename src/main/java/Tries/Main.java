package main.java.Tries;

public class Main {

    public static void main(String[] args) {
        String s ="aabb";
        char ch='x';

        for(char c : s.toCharArray())
        {
            if(s.indexOf(c)==s.lastIndexOf(c)) {
                System.out.println("first non repeating "+c);
                break;
            }
        }

    }
}
