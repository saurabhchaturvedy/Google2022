package main.java.CodeOps.LinkedList;

public class ListPalindrome {


    public boolean isPalindrome(ListNode head) {
        ListNode left = head;
        return solve(head, left);
    }

    private boolean solve(ListNode right, ListNode left) {

        if (right == null) {
            return true;
        }

        boolean res = solve(right.next, left);

        if (!res) {
            return false;
        } else if (right.data != left.data) {
            return false;
        } else {
            left = left.next;
            return true;
        }
    }

    public static void main(String[] args) {

        ListPalindrome listPalindrome = new ListPalindrome();

        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);

        boolean palindrome = listPalindrome.isPalindrome(one);

        System.out.println("Is palindrome : " + palindrome);
    }
}
