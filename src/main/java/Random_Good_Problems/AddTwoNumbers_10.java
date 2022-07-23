package main.java.Random_Good_Problems;


public class AddTwoNumbers_10 {


    private static main.java.SinglyLinkedList.SinglyLinkedList.ListNode addTwoNums(main.java.SinglyLinkedList.SinglyLinkedList.ListNode a, main.java.SinglyLinkedList.SinglyLinkedList.ListNode b) {

        main.java.SinglyLinkedList.SinglyLinkedList.ListNode dummy = new main.java.SinglyLinkedList.SinglyLinkedList.ListNode(0);
        main.java.SinglyLinkedList.SinglyLinkedList.ListNode tail = dummy;
        int carry = 0;
        while (a != null || b != null) {
            int x = (a != null) ? a.data : 0;
            int y = (b != null) ? b.data : 0;

            int sum = carry + x + y;

            carry = sum / 10;

            tail.next = new main.java.SinglyLinkedList.SinglyLinkedList.ListNode(sum % 10);
            tail = tail.next;

            if (a != null) a = a.next;
            if (b != null) b = b.next;
        }

        if (carry > 0) {
            tail.next = new main.java.SinglyLinkedList.SinglyLinkedList.ListNode(carry);
        }

        return dummy.next;
    }

    private static void print(main.java.SinglyLinkedList.SinglyLinkedList.ListNode head) {
        main.java.SinglyLinkedList.SinglyLinkedList.ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(" null ");

    }


    public static void main(String[] args) {
        main.java.SinglyLinkedList.SinglyLinkedList.ListNode first = new main.java.SinglyLinkedList.SinglyLinkedList.ListNode(7);
        main.java.SinglyLinkedList.SinglyLinkedList.ListNode second = new main.java.SinglyLinkedList.SinglyLinkedList.ListNode(4);
        main.java.SinglyLinkedList.SinglyLinkedList.ListNode third = new main.java.SinglyLinkedList.SinglyLinkedList.ListNode(9);

        first.next = second;
        second.next = third;

        main.java.SinglyLinkedList.SinglyLinkedList.ListNode fourth = new main.java.SinglyLinkedList.SinglyLinkedList.ListNode(5);
        main.java.SinglyLinkedList.SinglyLinkedList.ListNode fifth = new main.java.SinglyLinkedList.SinglyLinkedList.ListNode(6);

        fourth.next = fifth;

        main.java.SinglyLinkedList.SinglyLinkedList.ListNode listNode = addTwoNums(first, fourth);

        print(listNode);

    }
}
