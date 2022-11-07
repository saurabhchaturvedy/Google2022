package main.java.CodeOps.BinaryTree;

public class _9_Diameter_UO {


    public int diameter(TreeNode root) {
        if (root == null) {
            return 0;
        }


        int ld = diameter(root.left);
        int rd = diameter(root.right);

        int a = height(root.left) + height(root.right) + 2;

        int diameter = Math.max(a, Math.max(ld, rd));

        return diameter;
    }


    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return 1 + Math.max(lh, rh);
    }


    public static void main(String[] args) {


        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);

        root.right = new TreeNode(30);
        root.right.right = new TreeNode(60);
        root.right.right.left = new TreeNode(70);

        _9_Diameter_UO diameter_uo = new _9_Diameter_UO();

        System.out.println("Diameter of the tree is : " + diameter_uo.diameter(root));
    }
}
