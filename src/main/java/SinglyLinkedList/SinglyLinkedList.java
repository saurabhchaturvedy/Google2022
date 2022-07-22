package main.java.SinglyLinkedList;

public class SinglyLinkedList {


    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }


    private static void print(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }


    private static int length(ListNode head) {
        ListNode current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    private static ListNode insertAtStart(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;

        return newNode;
    }

    private static ListNode insertAtEnd(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return newNode;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        return head;
    }


    private static ListNode insertAtPosition(ListNode head, int position, int data) {

        ListNode newNode = new ListNode(data);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        } else {
            ListNode previous = head;
            int count = 0;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            newNode.next = current;
            previous.next = newNode;

            return head;
        }

    }

        public static void main (String[]args){
            ListNode head = new ListNode(10);
            ListNode second = new ListNode(20);
            ListNode third = new ListNode(30);

            head.next = second;
            second.next = third;

            print(head);
            System.out.println("Length of the linked list is : : " + length(head));


            head = insertAtStart(head, 50);

            print(head);

            head = insertAtEnd(head, 90);

            print(head);

            head = insertAtPosition(head, 3, 75);

            print(head);


        }
    }


