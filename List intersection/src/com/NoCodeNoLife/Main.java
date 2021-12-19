package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {
        ListNode listNode = new ListNode("a1");
        ListNode listNode1 = new ListNode("a2");
        ListNode listNode2 = new ListNode("c1");
        ListNode listNode3 = new ListNode("c2");
        ListNode listNode4 = new ListNode("b1");
        ListNode listNode5 = new ListNode("b2");
        ListNode listNode6 = new ListNode("b3");
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode2;

        System.out.println(getIntersectionNode(listNode, listNode4));
    }

    public static ListNode getIntersectionNode(ListNode listNode1, ListNode listNode2) {
        ListNode tmp1 = listNode1;
        ListNode tmp2 = listNode2;
        while (tmp1 != tmp2) {
            if (tmp1 == null) {
                tmp1 = listNode2;
            } else {
                tmp1 = tmp1.next;
            }
            if (tmp2 == null) {
                tmp2 = listNode1;
            } else {
                tmp2 = tmp2.next;
            }
        }
        return tmp1;
    }
}
