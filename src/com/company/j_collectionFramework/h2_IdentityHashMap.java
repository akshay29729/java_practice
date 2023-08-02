package com.company.j_collectionFramework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;

public class h2_IdentityHashMap {
    public static void main(String[] args) {
        HashMap m1 = new HashMap(); // use 'equals' method to find key duplication(content check)
        IdentityHashMap m2 = new IdentityHashMap(); // use '==' method (address check)
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        m1.put(i1,"akshay");
        m1.put(i2,"shinde");
        System.out.println(m1);
        System.out.println("----------------");
        m2.put(i1,"akshay");
        m2.put(i2,"shinde");
        System.out.println(m2);
    }
}
