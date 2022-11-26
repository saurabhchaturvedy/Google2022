package main.java.Random_Good_Problems.RandomGoodProblems_2.MicrosoftOA;

import main.java.Random_Good_Problems.BST.TreeNode;

class GoodNodes {
    public int goodNodes(TreeNode root) {
        return goodNodes(root, Integer.MIN_VALUE);
    }

    private int goodNodes(TreeNode root, int max) {
        if (root == null) return 0;

        final int newMax = Math.max(max, root.data);
        return (root.data >= max ? 1 : 0) + goodNodes(root.left, newMax) + goodNodes(root.right, newMax);
    }
}
