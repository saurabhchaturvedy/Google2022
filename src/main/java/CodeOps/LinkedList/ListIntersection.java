package main.java.CodeOps.LinkedList;

public class ListIntersection {


    public ListNode getIntersection(ListNode first, ListNode second) {
        ListNode l1 = first;
        ListNode l2 = second;

        while (l1 != l2) {
            l1 = (l1 == null) ? first : l1.next;
            l2 = (l2 == null) ? second : l2.next;
        }

        return l1;
    }


    public static void main(String[] args) {

    }
}
