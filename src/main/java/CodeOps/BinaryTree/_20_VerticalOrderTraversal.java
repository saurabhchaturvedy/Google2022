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


    public void topView(TreeNode root, int hd, Map<Integer, TreeNode> map) {

        if (root == null) {
            return;
        }
        map.putIfAbsent(hd, root);
        topView(root.left, hd - 1, map);
        topView(root.right, hd + 1, map);
    }


    public void bottomView(TreeNode root, int hd, Map<Integer, TreeNode> map) {

        if (root == null) {
            return;
        }
        map.put(hd, root);
        bottomView(root.left, hd - 1, map);
        bottomView(root.right, hd + 1, map);
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


        System.out.println("TOP VIEW : ");

        for (List<Integer> list : map.values()) {
            System.out.print(list.get(0) + " ");
        }

        Map<Integer, TreeNode> map2 = new TreeMap<>();
        verticalOrderTraversal.topView(root, 0, map2);

        System.out.println();

        for (TreeNode node : map2.values()) {
            System.out.print(node.data + " ");
        }

        Map<Integer, TreeNode> map3 = new TreeMap<>();
        verticalOrderTraversal.bottomView(root, 0, map3);

        System.out.println();

        for (TreeNode node : map3.values()) {
            System.out.print(node.data + " ");
        }

        System.out.println();
        System.out.println("BOTTOM VIEW : ");

        for (List<Integer> list : map.values()) {
            System.out.print(list.get(list.size() - 1) + " ");
        }

    }
}
