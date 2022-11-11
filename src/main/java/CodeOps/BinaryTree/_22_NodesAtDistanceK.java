package main.java.CodeOps.BinaryTree;

import java.util.*;

public class _22_NodesAtDistanceK {


    public List<TreeNode> nodesAtKDistance(TreeNode root, TreeNode target, int k) {
        List<TreeNode> answer = new ArrayList<>();
        if (root == null) {
            return answer;
        }

        Map<TreeNode, TreeNode> childParentMap = new HashMap<>();
        createChildParentMap(root, childParentMap);

        Queue<TreeNode> queue = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();
        queue.offer(target);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                visited.add(temp);

                if (k == 0) {
                    answer.add(temp);
                }

                if (childParentMap.containsKey(temp) && !visited.contains(childParentMap.get(temp))) {
                    answer.add(childParentMap.get(temp));
                }

                if (temp.left != null && !visited.contains(temp.left)) {
                    answer.add(temp.left);
                }

                if (temp.right != null && !visited.contains(temp.right)) {
                    answer.add(temp.right);
                }
                k--;
                if (k < 0)
                    break;
            }
        }
        return answer;
    }

    private void createChildParentMap(TreeNode root, Map<TreeNode, TreeNode> childParentMap) {

        if (root == null) {
            return;
        }

        if (root.left != null) {
            childParentMap.put(root.left, root);
        }

        if (root.right != null) {
            childParentMap.put(root.right, root);
        }

        createChildParentMap(root.left, childParentMap);
        createChildParentMap(root.right, childParentMap);
        return;
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.left.right = new TreeNode(2);
        root.left.right.right = new TreeNode(4);
        root.left.right.left = new TreeNode(7);
        root.left.left = new TreeNode(6);

        root.right = new TreeNode(1);
        root.right.right = new TreeNode(8);

        root.right.left = new TreeNode(0);

        _22_NodesAtDistanceK nodesAtDistanceK = new _22_NodesAtDistanceK();
        List<TreeNode> treeNodes = nodesAtDistanceK.nodesAtKDistance(root, root.left, 3);

        treeNodes.stream().forEach(x -> System.out.print(x.data + " "));

    }
}
