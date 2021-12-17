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
        listNode.setNext(listNode1);
        listNode1.setNext(listNode2);
        listNode2.setNext(listNode3);
        listNode3.setNext(listNode4);
        listNode4.setNext(listNode5);
        listNode5.setNext(listNode6);
        listNode6.setNext(listNode7);

        ListNode res = removeNthFromEnd(listNode, 0);
        while (res != null) {
            System.out.print(res.getValue() + " ");
            res = res.getNext();
        }
    }

    public static ListNode removeNthFromEnd(ListNode listNode, int k) {
        ListNode res = listNode;
        ListNode tmp = listNode;
        if (k == 0) {
            tmp = tmp.getNext();
            ListNode target = listNode;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
                target = target.getNext();
            }
            target.setNext(null);
        } else {
            for (int i = 0; i < k; i++) {
                tmp = tmp.getNext();
            }
            ListNode target = listNode;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
                target = target.getNext();
            }
            if (target.getNext() != null) {
                target.setValue(target.getNext().getValue());
                target.setNext(target.getNext().getNext());
            } else {
                target.setNext(null);
            }
        }
        return res;
    }
}
