package com.company.j_collectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class d1_vectors {
    public static void main(String[] args) {
        // same working as ArrayList but all methods are synchronized..
        Vector v1 = new Vector();
        v1.addElement(1);
        v1.add(2);
        System.out.println(v1.elementAt(1));
        System.out.println(v1.capacity());
        for (int i=0;i<10;i++)
            v1.add(i);
        System.out.println(v1.capacity()); // new capacity = 2*capacity..
        System.out.println(v1);
        Enumeration e1 = v1.elements();
       System.out.println(e1);
        for (var v:v1)
            System.out.println(v);
    }
}
