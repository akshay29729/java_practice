package com.company.j_collectionFramework;

import java.util.TreeSet;

public class f4_treeSet {
    public static void main(String[] args) {
        TreeSet t1 = new TreeSet();
//        t1.add(null); // after 'null' as first element,we can't add more elements
        // the object class that we added must be 'comparable' i.e. must implememnt comparable interface
//        (11,23,1,4)
        t1.add(11);
        t1.add(23);
        t1.add(1);
        t1.add(4);
//        t1.add(null); // we can add null 'only once' and that also at start only
        System.out.println(t1);
//        t1.add(10.5); // we can't add heterogenous objects
    }
}
