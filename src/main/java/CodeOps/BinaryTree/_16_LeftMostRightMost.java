package main.java.CodeOps.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class _16_LeftMostRightMost {


    public void leftMostRightMostNode(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();

                if (i == 0 || i == size - 1) {
                    System.out.print(temp.data + " ");
                }

                if (temp.left != null) {
                    queue.offer(temp.left);
                }

                if (temp.right != null) {
                    queue.offer(temp.right);
                }
            }

            System.out.println();
        }
    }


    public static void main(String[] args) {

        _16_LeftMostRightMost leftMostRightMost = new _16_LeftMostRightMost();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);

        root.left.right = new TreeNode(5);

        root.right = new TreeNode(3);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(11);

        root.right.left = new TreeNode(6);
        root.right.left.left = new TreeNode(8);

        root.right.left.right = new TreeNode(9);
        root.right.left.right.right = new TreeNode(10);

        leftMostRightMost.leftMostRightMostNode(root);


    }
}
