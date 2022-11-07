package main.java.CodeOps.BinaryTree;

public class _8_Height {


    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return 1 + Math.max(lh, rh);
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(15);
        root.left = new TreeNode(16);
        root.right = new TreeNode(17);
        root.right.left = new TreeNode(18);
        root.right.right = new TreeNode(19);
        root.right.right.left = new TreeNode(20);

        _8_Height height = new _8_Height();
        System.out.println("height of the tree is : " + height.height(root));
    }
}
