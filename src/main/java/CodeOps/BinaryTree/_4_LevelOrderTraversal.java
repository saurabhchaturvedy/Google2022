package main.java.CodeOps.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class _4_LevelOrderTraversal {


    public void levelorder(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int count = queue.size();

            for (int i = 0; i < count; i++) {
                TreeNode temp = queue.poll();
                System.out.print(temp.data + " ");

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

        TreeNode root = new TreeNode(30);
        root.left = new TreeNode(26);
        root.left.left = new TreeNode(8);
        root.right = new TreeNode(27);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(19);

        _4_LevelOrderTraversal levelOrderTraversal = new _4_LevelOrderTraversal();
        levelOrderTraversal.levelorder(root);
    }
}
