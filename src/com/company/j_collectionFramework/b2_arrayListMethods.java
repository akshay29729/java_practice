package com.company.j_collectionFramework;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public class b2_arrayListMethods {
    public static void main(String[] args) {
        // suitable if frequent retrieval is required
        // worst when frequent operation is delete or insertion..
        ArrayList a1 = new ArrayList();
        a1.add(10);
        a1.add("akshay");
        a1.add('a');
        a1.add(true);
        System.out.println(a1);
        a1.add(2,15);
        System.out.println(a1);
        a1.add(true);
        a1.add(null);
        System.out.println(a1);
        System.out.println(a1 instanceof Collection);
        System.out.println(a1 instanceof List);
        System.out.println(a1 instanceof Cloneable);
        System.out.println(a1 instanceof Serializable);
        System.out.println(a1 instanceof RandomAccess);
        System.out.println(a1 instanceof  Object);
    }
}
