package com.company.j_collectionFramework;

import java.util.LinkedHashSet;

public class f2_linkedSets {
    public static void main(String[] args) {
        LinkedHashSet l1 = new LinkedHashSet();
        l1.add(1);
        l1.add(3);
        l1.add(3);
        l1.add('a');
        l1.add(null);
        System.out.println(l1);
    }
}
