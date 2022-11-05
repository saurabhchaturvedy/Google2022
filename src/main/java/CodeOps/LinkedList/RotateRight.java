package main.java.CodeOps.LinkedList;

public class RotateRight {


    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode current = head;
        int length = 1;

        while (current.next != null) {
            current = current.next;
            length++;
        }

        current.next = head;
        k = k % length;
        k = length - k;

        for (int i = 0; i < k; i++) {
            current = current.next;
        }

        head = current.next;
        current.next = null;

        return head;

    }


    public void print(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }


    public static void main(String[] args) {

        RotateRight rotateRight = new RotateRight();

        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        rotateRight.print(one);

        ListNode listNode = rotateRight.rotateRight(one, 1);

        System.out.println();

        rotateRight.print(listNode);


    }
}
