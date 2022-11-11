package main.java.CodeOps.BinaryTree;

public class _21_RootDistanceK {


    public void rootDistanceK(TreeNode root, int k) {
        if (root == null || k < 0) {
            return;
        }

        if (k == 0) {
            System.out.print(root.data + " ");
        }

        rootDistanceK(root.left, k - 1);
        rootDistanceK(root.right, k - 1);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right = new TreeNode(3);
        root.right.right = new TreeNode(7);

        root.right.left = new TreeNode(6);

        _21_RootDistanceK rootDistanceK = new _21_RootDistanceK();
        rootDistanceK.rootDistanceK(root, 2);
    }
}
