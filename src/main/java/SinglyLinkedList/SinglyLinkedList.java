package main.java.SinglyLinkedList;

public class SinglyLinkedList {


    private ListNode head;

    private static class ListNode
    {
        private int data;
        private ListNode next;

        ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
}
