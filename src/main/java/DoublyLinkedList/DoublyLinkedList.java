package main.java.DoublyLinkedList;

import java.util.List;

public class DoublyLinkedList {


    private ListNode head;
    private ListNode tail;
    private int length;

    private static class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;

        ListNode(int data) {
            this.data = data;

        }
    }


    DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    private boolean isEmpty() {
        return length == 0;
    }

    private int getLength() {
        return length;
    }


    private void printForward()
    {
        ListNode temp = head;
        while (temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }

        System.out.println("null");
    }

    private void printBackward()
    {
        ListNode temp = tail;
        while (temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp=temp.previous;
        }

        System.out.println("null");
    }

    private void addAtStart(int data)
    {
    ListNode newNode = new ListNode(data);
        if(head==null && tail==null)
        {
            head=newNode;
            tail=newNode;

        }

        newNode.next=head;
        head.previous=newNode;
        head=newNode;
    }


    private void addAtLast(int data)
    {
        ListNode newNode = new ListNode(data);
        if(head==null && tail==null)
        {
            head=newNode;
            tail=newNode;

        }

        tail.next=newNode;
        newNode.previous=tail;
        tail=newNode;
    }

    private void insertNodeAtIndex(int data,int index)
    {

        ListNode newNode = new ListNode(data);
        if(index==0)
        {
            head=newNode;
            tail=newNode;
        }

        ListNode temp = head;
        int count=0;

        while (count<index-1)
        {
            temp=temp.next;
            count++;
        }

        ListNode nextToTemp = temp.next;
        temp.next = newNode;
        newNode.previous=temp;
        newNode.next = nextToTemp;

    }

    private void deleteFirst()
    {
        if(head.next==null && head==tail)
        {
            head=null;
            tail=null;
        }

        head=head.next;
        head.previous=null;

    }

    private void deleteLast()
    {
        if(head.next==null && head==tail)
        {
            head=null;
            tail=null;
        }


        tail.previous.next=null;
        tail=tail.previous;

    }

    public static void main(String[] args) {
DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.head = new ListNode(10);

        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        ListNode fifth = new ListNode(50);

        doublyLinkedList.head.previous=null;
        doublyLinkedList.head.next=second;

        second.previous=doublyLinkedList.head;
        second.next=third;

        third.previous=second;
        third.next=fourth;

        fourth.previous=third;
        fourth.next=fifth;

        fifth.previous=fourth;
        fourth.next=null;

        doublyLinkedList.tail=fourth;

        doublyLinkedList.printForward();

        doublyLinkedList.printBackward();

        doublyLinkedList.addAtStart(78);

        doublyLinkedList.printForward();

        doublyLinkedList.addAtLast(83);

        doublyLinkedList.printForward();

        doublyLinkedList.insertNodeAtIndex(94,2);

        doublyLinkedList.printForward();

        doublyLinkedList.deleteFirst();

        doublyLinkedList.printForward();

        doublyLinkedList.deleteLast();

        doublyLinkedList.printForward();

    }
}
