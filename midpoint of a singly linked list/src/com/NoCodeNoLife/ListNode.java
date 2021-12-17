package com.NoCodeNoLife;

public class ListNode {

    private int value;

    private ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
