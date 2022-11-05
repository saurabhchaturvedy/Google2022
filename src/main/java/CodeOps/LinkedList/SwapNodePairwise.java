package main.java.CodeOps.LinkedList;

public class SwapNodePairwise {


    public ListNode swapNodes(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        int count = 0;
        while (current != null && count < 2) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            count++;
        }

        if (next != null) {
            head.next = swapNodes(next);
        }

        return previous;
    }


    public void print(ListNode head) {

        ListNode current = head;

        while (current != null) {

            System.out.print(current.data + " -> ");
            current = current.next;
        }
    }


    public static void main(String[] args) {


        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        one.next = two;

        two.next = three;

        three.next = four;

        four.next = five;

        SwapNodePairwise swapNodePairwise = new SwapNodePairwise();

        swapNodePairwise.print(one);


        ListNode listNode = swapNodePairwise.swapNodes(one);

        System.out.println();

        swapNodePairwise.print(listNode);


    }
}
