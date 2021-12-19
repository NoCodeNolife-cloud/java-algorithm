package com.NoCodeNoLife;

public class ListNode {

    public ListNode next;

    public int val;

    public ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}
