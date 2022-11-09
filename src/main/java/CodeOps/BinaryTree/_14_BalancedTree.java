package main.java.CodeOps.BinaryTree;

public class _14_BalancedTree {


    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        if (Math.abs(lh - rh) <= 1 && isBalanced(root.left) && isBalanced(root.right)) ;
        {
            return true;
        }


    }


    public int height(TreeNode root) {
        if (root == null) return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        return 1 + Math.max(lh, rh);
    }


    public static void main(String[] args) {

    }
}
