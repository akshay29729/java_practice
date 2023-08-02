package com.company.j_collectionFramework;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.RandomAccess;

public class f1_setConstructors {
    public static void main(String[] args) {
        // 1
        HashSet s1 = new HashSet(); // default capacity is 16 and fill ratio=0.75
        s1.add(1);
        s1.add(3);
        s1.add("akshy");
        s1.add(1);
        s1.add(null); // 'null' always gets stored at first position
        System.out.println(s1);
        System.out.println(s1.size());

        // 2
        HashSet s2 = new HashSet(17); // default fill ratio=0.75

        // 3
        HashSet s3 = new HashSet(17,0.8f);
        System.out.println(s1 instanceof Collection);
        System.out.println(s1 instanceof Cloneable);
        System.out.println(s1 instanceof Serializable);
        System.out.println(s1 instanceof RandomAccess);
        System.out.println(s1 instanceof  Object);
    }
}
