package main.java.CodeOps.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class _20_VerticalOrderTraversal {


    public void verticalOrderTraversal(TreeNode root, int hd, Map<Integer, List<Integer>> map) {

        if (root == null) {
            return;
        }
        List<Integer> nodes = map.get(hd);
        if (nodes == null) {
            nodes = new ArrayList<>();
            nodes.add(root.data);
        } else {
            nodes.add(root.data);
        }

        map.put(hd, nodes);

        verticalOrderTraversal(root.left, hd - 1, map);
        verticalOrderTraversal(root.right, hd + 1, map);


    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(8);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(9);

        root.right = new TreeNode(15);
        root.right.right = new TreeNode(17);
        root.right.left = new TreeNode(14);

        _20_VerticalOrderTraversal verticalOrderTraversal = new _20_VerticalOrderTraversal();
        Map<Integer, List<Integer>> map = new TreeMap<>();
        verticalOrderTraversal.verticalOrderTraversal(root, 0, map);

        for (List<Integer> list : map.values()) {
            System.out.print(list);
        }
    }
}
