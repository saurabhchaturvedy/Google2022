package main.java.CodeOps.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class _13_RightView {

    public void rightView(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i <size; i++) {
                TreeNode temp = queue.poll();
                if (i == size-1) {
                    System.out.print(temp.data + " ");
                }

                if (temp.left != null) {
                    queue.offer(temp.left);
                }

                if (temp.right != null) {
                    queue.offer(temp.right);
                }
            }
        }
    }

    public static void main(String[] args) {


        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.left.left = new TreeNode(40);

        root.left.right = new TreeNode(50);
        root.left.right.left = new TreeNode(60);

        root.right = new TreeNode(30);

        _13_RightView leftView = new _13_RightView();
        leftView.rightView(root);
    }
}
