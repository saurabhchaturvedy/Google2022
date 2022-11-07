package main.java.CodeOps.BinaryTree;

public class _10_Diameter_O {

    static class Pair {
        int height;
        int diameter;

    }

    public Pair diameter(TreeNode root) {
        if (root == null) {
            Pair p = new Pair();
            p.height = -1;
            p.diameter = 0;
            return p;
        }

        Pair leftPair = diameter(root.left);
        Pair rightPair = diameter(root.right);

        Pair newPair = new Pair();

        newPair.height = 1 + Math.max(leftPair.height, rightPair.height);

        int a = 2 + leftPair.height + rightPair.height;

        int diameter = Math.max(a, Math.max(leftPair.height, rightPair.height));

        newPair.diameter = diameter;

        return newPair;
    }


    public int diameterOfBinaryTree(TreeNode root) {
        Pair p = diameter(root);
        return p.diameter;
    }

    public static void main(String[] args) {

    }
}
