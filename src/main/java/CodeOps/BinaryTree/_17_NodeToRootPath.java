package main.java.CodeOps.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class _17_NodeToRootPath {


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


    public static void main(String[] args) {

        _17_NodeToRootPath nodeToRootPath = new _17_NodeToRootPath();

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);

        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        List<Integer> path = new ArrayList<>();
        nodeToRootPath.findPath(root, path, 5);

        System.out.println(path);
    }
}
