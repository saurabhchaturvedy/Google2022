package main.java.BinarySearchTree;

public class BinarySearchTree {


    private TreeNode root;

    private static class TreeNode {

        int data;
        private TreeNode left;
        private TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    private TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    private TreeNode search(TreeNode root, int value) {
        if (root == null || root.data == value) {
            return root;
        }

        if (value < root.data) {
            return search(root.left, value);
        } else {
            return search(root.right, value);
        }
    }


    public static void main(String[] args) {

    }
}
