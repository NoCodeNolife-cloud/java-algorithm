package com.NoCodeNoLife;

public class LinkedNode {

    private int val;

    private LinkedNode next;

    public LinkedNode(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public LinkedNode getNext() {
        return next;
    }

    public void setNext(LinkedNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "LinkedNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
