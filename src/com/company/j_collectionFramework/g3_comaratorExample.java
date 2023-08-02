package com.company.j_collectionFramework;

import java.util.Comparator;
import java.util.TreeSet;

public class g3_comaratorExample {
    public static void main(String[] args) {
        TreeSet t1 = new TreeSet(new myComparator2());
        t1.add("akshay");
        t1.add("Shinde");
        t1.add("bajirao");
        t1.add(new StringBuffer("from"));
        t1.add(new StringBuffer("Nagar"));
        System.out.println(t1);
    }
}
class myComparator2 implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        int l1 = s1.length();
        int l2 = s2.length();
        if(l1<l2)
            return -1;
        else if(l1>l2)
            return 1;
        else
            return s1.compareTo(s2);
    }
}
