package com.company.j_collectionFramework;

import java.util.LinkedList;

public class c2_linkedList {
    public static void main(String[] args) {
        // stack and queue specific methods
        LinkedList l1 = new LinkedList();
        l1.addFirst(1);
        l1.addLast(2);
        l1.addFirst(3);
        l1.addLast(1);
        System.out.println(l1);
        l1.removeFirst();
        l1.removeLast();
        System.out.println(l1);
    }
}
