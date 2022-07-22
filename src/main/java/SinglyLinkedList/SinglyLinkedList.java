package main.java.SinglyLinkedList;

import java.util.List;

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


    private static ListNode deleteFirst(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return head;
    }

    private static ListNode deleteLast(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        ListNode previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        previous.next = null;
        return head;
    }


    private static ListNode deleteAtPosition(ListNode head, int position) {
        if (position == 0) {
            if (head == null || head.next == null) {
                return null;
            }

            return head.next;
        }

        ListNode previous = head;
        int count = 0;
        while (count < position - 2) {

            previous = previous.next;
            count++;
        }

        ListNode temp = previous.next;
        previous.next = temp.next;
        return head;
    }

    private static boolean search(ListNode head, int data) {
        if (head == null) {
            return false;
        }

        ListNode current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }

            current = current.next;
        }

        return false;
    }


    private static ListNode reverse(ListNode head) {
        if (head == null) return null;
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

    private static ListNode middle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private static ListNode nthNodeFromEnd(ListNode head, int n) {
        ListNode mainPtr = head;
        ListNode refPtr = head;

        int count = 0;

        while (count < n) {
            refPtr = refPtr.next;
            count++;
        }

        while (refPtr != null) {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }

        return mainPtr;
    }


    private static ListNode insertInSortedList(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return head;
        }

        ListNode current = head;

        while (current != null) {
            if (current.data < newNode.data && newNode.data < current.next.data) {
                current.next = newNode;
                newNode.next = current.next.next;

            }

            current = current.next;
        }

        return head;
    }

    private static ListNode remove(ListNode head, int key) {
        if (key == head.data) {
            return head.next;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current != null && current.data != key) {
            previous = current;
            current = current.next;
        }

        if (current == null) return head;

        previous.next = current.next;

        return head;
    }

    public static void main(String[] args) {
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

        head = deleteFirst(head);

        print(head);

        head = deleteLast(head);

        print(head);

        head = deleteAtPosition(head, 3);

        print(head);

        System.out.println("Search for element 20 is : " + search(head, 20));
        System.out.println("Search for element 40 is : " + search(head, 40));

        head = reverse(head);

        print(head);

        System.out.println("Middle node of the linked list is : " + middle(head).data);

        ListNode resultNode = nthNodeFromEnd(head, 2);

        System.out.println("Nth node from the end is : " + resultNode.data);

        head = remove(head, 20);

        print(head);

    }
}


