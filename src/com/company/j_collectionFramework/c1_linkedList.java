package com.company.j_collectionFramework;

import java.util.LinkedList;

public class c1_linkedList {
    public static void main(String[] args) {
        // suitable for delete or insertion operation
        // worst for retrieval operation
        LinkedList l1 = new LinkedList();
        l1.add(1);
//        l1.add(3,2);
        l1.add(2);
        l1.add(3);
        l1.add(3);
        System.out.println(l1);
    }
}
