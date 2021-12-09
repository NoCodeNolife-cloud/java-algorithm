package com.NoCodeNoLife;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        TreeNode treeNode_3 = new TreeNode(3);
        TreeNode treeNode_9 = new TreeNode(9);
        TreeNode treeNode_20 = new TreeNode(20);
        TreeNode treeNode_15 = new TreeNode(15);
        TreeNode treeNode_7 = new TreeNode(7);
        treeNode_3.setLeft(treeNode_9);
        treeNode_3.setRight(treeNode_20);
        treeNode_20.setLeft(treeNode_15);
        treeNode_20.setRight(treeNode_7);
        System.out.println(minDepth(treeNode_7));
    }

    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        LinkedList<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int depth = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = q.pop();
                if (treeNode.getLeft() != null) {
                    q.add(treeNode.getLeft());
                }
                if (treeNode.getRight() != null) {
                    q.add(treeNode.getRight());
                }
            }
            depth++;
        }
        return depth - 1;
    }
}
