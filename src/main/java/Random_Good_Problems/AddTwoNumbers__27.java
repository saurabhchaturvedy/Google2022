package main.java.Random_Good_Problems;

import main.java.SinglyLinkedList.SinglyLinkedList;

public class AddTwoNumbers__27 {
    public SinglyLinkedList.ListNode addTwoNumbers(SinglyLinkedList.ListNode l1, SinglyLinkedList.ListNode l2) {
        SinglyLinkedList.ListNode res = new SinglyLinkedList.ListNode(-1);
        SinglyLinkedList.ListNode tail = res;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int x1 = l1 == null ? 0 : l1.data;
            int x2 = l2 == null ? 0 : l2.data;
            tail.next = new SinglyLinkedList.ListNode((x1 + x2 + carry) % 10);
            carry = (x1 + x2 + carry) / 10;
            tail = tail.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return res.next;
    }
}