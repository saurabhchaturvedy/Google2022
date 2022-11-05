package main.java.CodeOps.LinkedList;

public class ReorderList {


    public void reorder(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }


        ListNode l1 = head;
        ListNode l2 = reverse(slow.next);
        slow.next = null;

        merge(l1, l2);
    }

    private void merge(ListNode l1, ListNode l2) {

        while (l2 != null) {
            ListNode node1 = l1.next;
            ListNode node2 = l2.next;

            l1.next = l2;
            l2.next = node1;

            l1 = node1;
            l2 = node2;
        }
    }

    private ListNode reverse(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

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

        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);

        one.next = two;
        two.next = three;
        three.next = four;

        ReorderList reorderList = new ReorderList();
        reorderList.print(one);


        reorderList.reorder(one);

        System.out.println();

        reorderList.print(one);
    }
}
