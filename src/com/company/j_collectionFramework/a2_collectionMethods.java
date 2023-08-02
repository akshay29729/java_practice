package com.company.j_collectionFramework;

import java.util.ArrayList;

public class a2_collectionMethods {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(10);
        a.add("akshay");
        a.add('a');
        System.out.println(a);
        System.out.println(a.get(1));
        System.out.println(a.contains('a'));
        System.out.println(a.contains('v'));
        System.out.println(a.size());
        ArrayList b = new ArrayList();
        b.add(11);
        b.addAll(a);
        System.out.println(b);
        b.retainAll(a);
        System.out.println(b);
        System.out.println(b.containsAll(a));
    }
}
