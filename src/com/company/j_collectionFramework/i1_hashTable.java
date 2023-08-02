package com.company.j_collectionFramework;

import java.util.Hashtable;

public class i1_hashTable {
    public static void main(String[] args) {
        Hashtable h1 = new Hashtable(); // default capacity=11 and fill ratio=0.75
        h1.put(1,11);
        h1.put("akshay","1");
        h1.put('a',1);
//        h1.put(1,null);
//        h1.put(null,1);
        System.out.println(h1);
    }
}
