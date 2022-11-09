package main.java.CodeOps.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class _18_LowestCommonAncestor {

    public boolean findPath(TreeNode root, List<Integer> path, int data) {
        if (root == null) {
            return false;
        }

        if (root.data == data) {
            path.add(root.data);
            return true;
        }

        if (findPath(root.left, path, data) || findPath(root.right, path, data)) {
            path.add(root.data);
            return true;
        }

        return false;
    }

    public int getLowestCommonAncestor(TreeNode root, int n1, int n2) {
        List<Integer> path1 = new ArrayList<>();
        List<Integer> path2 = new ArrayList<>();

        if (!findPath(root, path1, n1) || !findPath(root, path2, n2)) {
            return -1;
        }

        int i = path1.size() - 1;
        int j = path2.size() - 1;

        while (i >= 0 && j >= 0 && Objects.equals(path1.get(i), path2.get(j))) {
            i--;
            j--;
        }

        return path1.get(i + 1);
    }

    public static void main(String[] args) {

    }
}
