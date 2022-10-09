package main.java.Random_Good_Problems.BST;

import java.util.Stack;

public class KthSmallestElement {


    public static Integer KthSmallestElement(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;

        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }


            TreeNode top = stack.pop();
            k--;

            if (k == 0) {
                node = top;
                break;
            } else {
                node = top.right;
            }
        }

        return node.data;
    }


    public static void main(String[] args) {

    }
}
