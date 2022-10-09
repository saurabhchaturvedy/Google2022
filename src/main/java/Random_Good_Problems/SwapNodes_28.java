package main.java.Random_Good_Problems;

public class SwapNodes_28 {
    public static ListNode swapPairs(ListNode head) {
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode node = fakeHead;
        while (node.next != null && node.next.next != null) {
            ListNode first = node;
            ListNode second = node.next;
            ListNode third = node.next.next;
            first.next = third;
            second.next = third.next;
            third.next = second;
            node = second;
        }
        return fakeHead.next;
    }


    private static void print(ListNode head) {
        ListNode current = head;
        System.out.println("head " + head.data);
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

        print(one);
        System.out.println();
        ListNode node = swapPairs(one);
        System.out.println();
        print(node);


    }
}