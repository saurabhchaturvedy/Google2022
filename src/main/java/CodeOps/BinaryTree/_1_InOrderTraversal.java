package main.java.CodeOps.BinaryTree;

import java.util.Stack;

public class _1_InOrderTraversal {


    public void inorder(TreeNode root) {
        if (root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode current = root;
        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                current = stack.pop();
                System.out.print(current.data + " ");
                current = current.right;
            }
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(15);
        root.left.left = new TreeNode(17);
        root.right = new TreeNode(23);
        root.right.left = new TreeNode(24);
        root.right.right = new TreeNode(26);

        _1_InOrderTraversal inOrderTraversal = new _1_InOrderTraversal();
        inOrderTraversal.inorder(root);
    }
}
