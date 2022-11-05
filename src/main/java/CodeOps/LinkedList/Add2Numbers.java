package main.java.CodeOps.LinkedList;

public class Add2Numbers {


    public ListNode addNumbers(ListNode first, ListNode second) {
        first = reverse(first);
        second = reverse(second);

        ListNode fakeHead = new ListNode(0);
        ListNode temp = fakeHead;

        int sum = 0;
        int carry = 0;

        while (first != null || second != null) {
            sum = ((first != null ? first.data : 0) + (second != null ? second.data : 0) + carry) % 10;
            carry = sum / 10;

            temp.next = new ListNode(sum);
            temp = temp.next;

            if (first != null) first = first.next;
            if (second != null) second = second.next;
        }

        if (carry > 0) {
            temp.next = new ListNode(1);
        }

        return reverse(fakeHead.next);
    }

    private ListNode reverse(ListNode head) {

        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;

    }

    public void print(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }


    public static void main(String[] args) {

        Add2Numbers add2Numbers = new Add2Numbers();

        ListNode first = new ListNode(2);
        ListNode second = new ListNode(7);
        ListNode third = new ListNode(2);

        first.next = second;
        second.next = third;

        ListNode fourth = new ListNode(2);
        ListNode fifth = new ListNode(9);

        fourth.next = fifth;

        add2Numbers.print(add2Numbers.addNumbers(first, fourth));

    }
}
