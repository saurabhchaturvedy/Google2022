package main.java.CodeOps.LinkedList;

public class Add1ToList {


    public ListNode addOne(ListNode head) {
        ListNode reverseHead = reverse(head);


        ListNode current = reverseHead;
        ListNode temp = null;

        int sum = 0;
        int carry = 0;

        boolean oneAdded = false;

        while (current != null) {
            if (!oneAdded) {
                sum = current.data + 1;
                oneAdded = true;
            } else {
                sum = carry + current.data;
            }

            carry = sum >= 10 ? 1 : 0;
            sum = sum % 10;

            current.data = sum;
            temp = current;

            current = current.next;
        }

        if (carry > 0) {
            temp.next = new ListNode(1);
        }

        return reverse(reverseHead);
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

        ListNode one = new ListNode(9);
        ListNode two = new ListNode(9);
        ListNode three = new ListNode(9);

        one.next = two;
        two.next = three;

        Add1ToList add1ToList = new Add1ToList();
        add1ToList.print(one);

        ListNode listNode = add1ToList.addOne(one);

        System.out.println();
        add1ToList.print(listNode);
    }
}
