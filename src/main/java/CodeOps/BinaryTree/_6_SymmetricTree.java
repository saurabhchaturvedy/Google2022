package main.java.CodeOps.BinaryTree;

public class _6_SymmetricTree {


    public boolean isSymmetricTree(TreeNode first, TreeNode second) {
        if (first == null && second == null) return true;
        if (first == null || second == null) {
            return false;
        }
        if (first.data != second.data) {
            return false;
        }

        return isSymmetricTree(first.left, second.right) && isSymmetricTree(first.right, second.left);
    }

    public static void main(String[] args) {

    }
}
