package main.java.CodeOps.BinaryTree;

public class _7_MinimumDepth {


    public int minimumDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        if (root.left == null) {
            return minimumDepth(root.right) + 1;
        }

        if (root.right == null) {
            return minimumDepth(root.left) + 1;
        }

        return 1 + Math.min(minimumDepth(root.left), minimumDepth(root.right));
    }

    public static void main(String[] args) {


        TreeNode root = new TreeNode(15);
        root.left = new TreeNode(16);
        root.right = new TreeNode(17);
        root.right.left = new TreeNode(18);
        root.right.right = new TreeNode(19);
        root.right.right.left = new TreeNode(20);

        _7_MinimumDepth minimumDepth = new _7_MinimumDepth();
        System.out.println("Minimum depth is : " + minimumDepth.minimumDepth(root));
    }
}
