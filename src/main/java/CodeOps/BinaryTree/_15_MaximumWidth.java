package main.java.CodeOps.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class _15_MaximumWidth {


    public int maxWidth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int maxWidth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            if (size > maxWidth) {
                maxWidth = size;
            }

            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();

                if (temp.left != null) {
                    queue.add(temp.left);
                }

                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
        }

        return maxWidth;
    }


    public static void main(String[] args) {

    }
}
