package com.NoCodeNoLife;

/**
 * 二叉树
 */
public class TreeNode {
    private int val;
    private TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
