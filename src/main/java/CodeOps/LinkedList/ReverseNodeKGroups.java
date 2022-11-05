package main.java.CodeOps.LinkedList;

public class ReverseNodeKGroups {


    public ListNode reverseK(ListNode head, int k, int size) {
        if (size < k) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        int count = 0;

        while (current != null && count < k) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            count++;
        }

        if (next != null) {
            head.next = reverseK(next, k, size - k);
        }

        return previous;
    }


    public static void main(String[] args) {

    }
}
