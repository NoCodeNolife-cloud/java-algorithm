package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(4);
        listNode1.setNext(listNode2);
        listNode2.setNext(listNode3);

        ListNode listNode4 = new ListNode(1);
        ListNode listNode5 = new ListNode(3);
        ListNode listNode6 = new ListNode(4);
        listNode4.setNext(listNode5);
        listNode5.setNext(listNode6);

        ListNode res = merge(listNode1, listNode4);
        while (res != null) {
            System.out.print(res.getValue() + " ");
            res = res.getNext();
        }
    }

    public static ListNode merge(ListNode listNode1, ListNode listNode2) {
        ListNode res;
        if (listNode1.getValue() > listNode2.getValue()) {
            res = listNode2;
            listNode2 = listNode2.getNext();
        } else {
            res = listNode1;
            listNode1 = listNode1.getNext();
        }
        ListNode tmp = res;
        while (listNode1 != null && listNode2 != null) {
            if (listNode1.getValue() > listNode2.getValue()) {
                tmp.setNext(listNode2);
                tmp = tmp.getNext();
                listNode2 = listNode2.getNext();
            } else {
                tmp.setNext(listNode1);
                tmp = tmp.getNext();
                listNode1 = listNode1.getNext();
            }
        }
        if (listNode1 != null) {
            tmp.setNext(listNode1);
        }
        if (listNode2 != null) {
            tmp.setNext(listNode2);
        }
        return res;
    }
}
