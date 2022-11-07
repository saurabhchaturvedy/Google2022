package main.java.CodeOps.BinaryTree;

import java.util.Stack;

public class _3_PostOrderTraversal {


    public void postorder(TreeNode root) {
        if (root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        TreeNode previous = null;

        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                current = stack.peek();
                if (current.right == null || current.right == previous) {
                    current = stack.pop();
                    System.out.print(current.data + " ");

                    previous = current;
                    current = null;

                } else {
                    current = current.right;
                }
            }

        }
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(15);
        root.left = new TreeNode(26);
        root.right = new TreeNode(18);
        root.right.left = new TreeNode(9);

        _3_PostOrderTraversal postOrderTraversal = new _3_PostOrderTraversal();
        postOrderTraversal.postorder(root);
    }
}
