package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {
        LinkedNode linkedNode = new LinkedNode(1);
        LinkedNode linkedNode1 = new LinkedNode(2);
        LinkedNode linkedNode2 = new LinkedNode(3);
        LinkedNode linkedNode3 = new LinkedNode(4);
        LinkedNode linkedNode4 = new LinkedNode(5);
        LinkedNode linkedNode5 = new LinkedNode(6);
        LinkedNode linkedNode6 = new LinkedNode(7);
        LinkedNode linkedNode7 = new LinkedNode(8);
        LinkedNode linkedNode8 = new LinkedNode(9);
        LinkedNode linkedNode9 = new LinkedNode(10);
        linkedNode.setNext(linkedNode1);
        linkedNode1.setNext(linkedNode2);
        linkedNode2.setNext(linkedNode3);
        linkedNode3.setNext(linkedNode4);
        linkedNode4.setNext(linkedNode5);
        linkedNode5.setNext(linkedNode6);
        linkedNode6.setNext(linkedNode7);
        linkedNode7.setNext(linkedNode8);
        linkedNode8.setNext(linkedNode9);

        LinkedNode res = findFromEnd(linkedNode, 0);
        System.out.println(res);
    }

    public static LinkedNode findFromEnd(LinkedNode linkedNode, int k) {
        LinkedNode tmp = linkedNode;
        for (int i = 0; i < k; i++) {
            tmp = tmp.getNext();
        }
        LinkedNode res = linkedNode;
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
            res = res.getNext();
        }
        return res;
    }
}
