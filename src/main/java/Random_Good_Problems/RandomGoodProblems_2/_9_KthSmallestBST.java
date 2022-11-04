package main.java.Random_Good_Problems.RandomGoodProblems_2;

import main.java.Random_Good_Problems.BST.TreeNode;

import java.util.Stack;

class _9_KthSmallestBST {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            if (--k == 0) {
                break;
            }
            curr = curr.right;
        }
        return curr.data;
    }
}