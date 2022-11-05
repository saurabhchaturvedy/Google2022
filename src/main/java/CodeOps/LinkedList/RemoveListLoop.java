package main.java.CodeOps.LinkedList;

public class RemoveListLoop {


    public void removeLoop(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        if (slow == head) {
            while (fast.next != slow) {
                fast = fast.next;
            }

            fast.next = null;
        } else {
            if (slow == fast) {
                slow = head;
                while (fast.next != slow.next) {
                    slow = slow.next;
                    fast = fast.next;
                }

                fast.next = null;
            }
        }
    }


    public static void main(String[] args) {

    }
}
