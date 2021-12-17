package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(6);
        ListNode listNode6 = new ListNode(7);
        ListNode listNode7 = new ListNode(8);
        ListNode listNode8 = new ListNode(9);
        listNode.setNext(listNode1);
        listNode1.setNext(listNode2);
        listNode2.setNext(listNode3);
        listNode3.setNext(listNode4);
        listNode4.setNext(listNode5);
        listNode5.setNext(listNode6);
        listNode6.setNext(listNode7);
        listNode7.setNext(listNode8);

        System.out.println(getMidepoint(listNode).getValue());
    }

    public static ListNode getMidepoint(ListNode listNode) {
        ListNode left = listNode;
        ListNode right = listNode;
        while (right.getNext() != null) {
            left = left.getNext();
            right = right.getNext().getNext();
        }
        return left;
    }
}
