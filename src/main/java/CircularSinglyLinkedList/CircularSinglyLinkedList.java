package main.java.CircularSinglyLinkedList;

public class CircularSinglyLinkedList {


    ListNode last;

    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }


    private void print() {
        if (last == null) return;

        ListNode first = last.next;

        while (first != last) {
            System.out.print(first.data + " -> ");
            first = first.next;
        }
        System.out.println(first.data);
    }

    private int length() {
        if (last == null) return 0;

        ListNode first = last.next;
        int length = 1;
        while (first != last) {
            first = first.next;
            length++;
        }

        return length;
    }


    private void insertAtStart(int data) {
        ListNode newNode = new ListNode(data);
        if (last == null) {
            last = newNode;
        }

        newNode.next = last.next;
        last.next = newNode;
    }

    private void insertAtLast(int data) {
        ListNode newNode = new ListNode(data);
        if (last == null) {
            last = newNode;
        }

        ListNode temp = last.next;
        last.next = newNode;
        newNode.next = temp;
        last = last.next;

    }


    private void removeFirst() {
        if (last.next == null) {
            last = null;
        }

        ListNode first = last.next;
        last.next = first.next;
    }

    private void removeLast() {
        if (last.next == null) {
            last = null;
        }

        ListNode first = last.next;
        ListNode temp = last.next;

        while (temp.next != last) {
            temp = temp.next;
        }

        temp.next = first;
        last = temp;

        System.out.println(" New last node is : " + last.data);
    }


    public static void main(String[] args) {
        CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
        ListNode first = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);

        first.next = second;
        second.next = third;
        third.next = first;

        circularSinglyLinkedList.last = third;

        circularSinglyLinkedList.print();

        System.out.println("Length of the circular linked list is : " + circularSinglyLinkedList.length());

        circularSinglyLinkedList.insertAtStart(67);

        circularSinglyLinkedList.print();

        circularSinglyLinkedList.insertAtLast(43);

        circularSinglyLinkedList.print();

        circularSinglyLinkedList.removeFirst();

        circularSinglyLinkedList.print();

        circularSinglyLinkedList.removeLast();

        circularSinglyLinkedList.print();
    }
}
