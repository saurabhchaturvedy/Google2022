package main.java.CodeOps.BinaryTree;

import main.java.CodeOps.LinkedList.ListNode;

import java.util.ArrayList;
import java.util.List;

public class _11_ListToBinaryTree {


    public TreeNode listToBinaryTree(ListNode head) {
        if (head == null) {
            return null;
        }

        List<TreeNode> listNodes = new ArrayList<>();

        ListNode current = head;

        while (current != null) {
            TreeNode treeNode = new TreeNode(current.data);
            listNodes.add(treeNode);
            current = current.next;
        }

        int n = listNodes.size();

        for (int i = 0; i < n / 2; i++) {
            if (2 * i + 1 < n) {
                listNodes.get(i).left = listNodes.get(2 * i + 1);
            }

            if (2 * i + 2 < n) {
                listNodes.get(i).right = listNodes.get(2 * i + 2);
            }
        }

        return listNodes.get(0);
    }

    public void print(TreeNode root) {
        if (root == null) {
            return;
        }

        print(root.left);
        System.out.print(root.data + " ");
        print(root.right);
    }


    public static void main(String[] args) {

        ListNode one = new ListNode(15);
        ListNode two = new ListNode(15);
        ListNode three = new ListNode(15);
        ListNode four = new ListNode(15);
        ListNode five = new ListNode(15);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        _11_ListToBinaryTree listToBinaryTree = new _11_ListToBinaryTree();

        TreeNode treeNode = listToBinaryTree.listToBinaryTree(one);

        listToBinaryTree.print(treeNode);
    }
}
