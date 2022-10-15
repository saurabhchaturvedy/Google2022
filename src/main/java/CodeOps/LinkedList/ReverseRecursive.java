package main.java.CodeOps.LinkedList;

public class ReverseRecursive {


    private ListNode reverse(ListNode head) {
        ListNode reverse = reverse(head.next);
        ListNode secLast = head.next;
        secLast.next = head;
        head.next = null;

        return reverse;
    }

    public static void main(String[] args) {

    }
}
