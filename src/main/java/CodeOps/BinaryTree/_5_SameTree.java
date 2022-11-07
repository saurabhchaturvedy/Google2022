package main.java.CodeOps.BinaryTree;

public class _5_SameTree {


    public boolean areIdenticalTrees(TreeNode first, TreeNode second) {
        if (first == null && second == null) return true;
        if (first == null || second == null) {
            return false;
        }
        if (first.data != second.data) {
            return false;
        }

        return areIdenticalTrees(first.left, second.left) && areIdenticalTrees(first.right, second.right);
    }

    public static void main(String[] args) {

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        _5_SameTree sameTree = new _5_SameTree();
        System.out.println(sameTree.areIdenticalTrees(root1, root2));
    }
}
