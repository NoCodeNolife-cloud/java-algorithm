package com.NoCodeNoLife;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(5);
        listNode.setNext(listNode1);
        listNode1.setNext(listNode2);

        ListNode listNode3 = new ListNode(1);
        ListNode listNode4 = new ListNode(3);
        ListNode listNode5 = new ListNode(4);
        listNode3.setNext(listNode4);
        listNode4.setNext(listNode5);

        ListNode listNode6 = new ListNode(2);
        ListNode listNode7 = new ListNode(6);
        listNode6.setNext(listNode7);

        ArrayList<ListNode> arrayList = new ArrayList<>();
        arrayList.add(listNode);
        arrayList.add(listNode3);
        arrayList.add(listNode6);

        ListNode res = mergeKLists(arrayList);

        while (res != null) {
            System.out.printf(res.getValue() + " ");
            res = res.getNext();
        }
    }

    public static ListNode mergeKLists(ArrayList<ListNode> arrayList) {
        ArrayList<ListNode> cnt = new ArrayList<>();
        for (ListNode listNode : arrayList) {
            while (listNode != null) {
                cnt.add(listNode);
                listNode = listNode.getNext();
            }
        }
        cnt.sort(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                if (o1.getValue() < o2.getValue()) {
                    return -1;
                }
                if (o1.getValue() > o2.getValue()) {
                    return 1;
                }
                return 0;
            }
        });
        ListNode res = cnt.get(0);
        ListNode tmp = res;
        for (int i = 1; i < cnt.size(); i++) {
            tmp.setNext(cnt.get(i));
            tmp = tmp.getNext();
        }
        return res;
    }
}
