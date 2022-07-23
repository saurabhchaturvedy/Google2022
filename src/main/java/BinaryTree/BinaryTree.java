package main.java.BinaryTree;

import java.util.Stack;

public class BinaryTree {


    private TreeNode root;

    private static class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    private void preorder(TreeNode root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    private void preorderIterative(TreeNode root) {
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

    private void inorder(TreeNode root) {

        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }


    private void inorderIterative(TreeNode root) {
        if (root == null) return;

        Stack<TreeNode> stack = new Stack<>();

        TreeNode temp = root;

        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    private void postorder(TreeNode root) {

        if (root == null) return;

        postorder(root.left);
        postorder(root.right);

        System.out.print(root.data + " ");

    }

    private void postorderIterative(TreeNode root) {
        if (root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (!stack.isEmpty() || current != null) {

            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {

                TreeNode temp = stack.peek().right;

                if (temp == null) {
                    temp = stack.pop();
                    System.out.print(temp.data + " ");

                    while (!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        System.out.print(temp.data + " ");

                    }
                } else {
                    current = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new TreeNode(10);

        binaryTree.root.left = new TreeNode(20);
        binaryTree.root.right = new TreeNode(30);

        binaryTree.preorder(binaryTree.root);

        System.out.println();
        binaryTree.preorderIterative(binaryTree.root);

        System.out.println();
        binaryTree.inorder(binaryTree.root);

        System.out.println();
        binaryTree.inorderIterative(binaryTree.root);

        System.out.println();
        binaryTree.postorder(binaryTree.root);

        System.out.println();

        binaryTree.postorderIterative(binaryTree.root);
    }
}
