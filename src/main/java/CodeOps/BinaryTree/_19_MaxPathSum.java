package main.java.CodeOps.BinaryTree;

public class _19_MaxPathSum {


    public static int res = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }


        int ls = maxPathSum(root.left);
        int rs = maxPathSum(root.right);

        int temp = Math.max(Math.max(ls, rs) + root.data, root.data);
        int max = Math.max(temp, ls + rs + root.data);

        res = Math.max(res, max);

        return temp;
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(6);

        _19_MaxPathSum maxPathSum = new _19_MaxPathSum();
        System.out.println(maxPathSum.maxPathSum(root));
    }
}
