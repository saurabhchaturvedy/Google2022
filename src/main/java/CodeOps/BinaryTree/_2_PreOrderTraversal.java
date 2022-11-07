package main.java.CodeOps.BinaryTree;

import java.util.Stack;

public class _2_PreOrderTraversal {


    public void preorder(TreeNode root) {
        if (root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");

            if (temp.right != null) {
                stack.push(temp.right);
            }

            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }


    public static void main(String[] args) {

    }
}
