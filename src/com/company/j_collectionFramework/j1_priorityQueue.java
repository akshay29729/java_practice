package com.company.j_collectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class j1_priorityQueue {
    public static void main(String[] args) {
        PriorityQueue p1 = new PriorityQueue(); // default sorting, so objects should be homogeneous
                                   // and  comparable..
        p1.add(11);
//        p1.add('a');
        p1.add(2);
        p1.add(22);
        p1.add(2);
//        p1.add(null); // we can't add null
        System.out.println(p1);
        System.out.println("-----------");
        PriorityQueue p2 = new PriorityQueue();
        p2.add('a');
        p2.add('z');
        p2.add('c');
        p2.add('A');
        System.out.println(p2);
    }
}
