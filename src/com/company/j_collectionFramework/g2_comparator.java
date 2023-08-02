package com.company.j_collectionFramework;

import java.util.Comparator;
import java.util.TreeSet;

public class g2_comparator {
    public static void main(String[] args) {
        TreeSet t1 = new TreeSet(); // Default Ascending order
        TreeSet t2 = new TreeSet(new myComparator()); // Custom Descending order
        t1.add(11);
        t1.add(2);
        t1.add(4);
        t1.add(-10);
        System.out.println(t1);
        System.out.println("---------------------------");
        t2.add(11);
        t2.add(2);
        t2.add(4);
        t2.add(-10);
        System.out.println(t2);
    }
}
class myComparator implements Comparator{
    @Override
    public int compare(Object o1,Object o2){
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
        // 1
//        if(i1>i2)
//            return -1;
//        else if(i1<i2)
//            return 1;
//        else
//            return 0;

        // 2
//        return i2.compareTo(i1); // descending

        // 3
//        return -i2.compareTo(i1); // ascending

        // 4
//        return -i1.compareTo(i2); // descending

        // 5
//        return i1.compareTo(i2); // ascending

        // 6
//        return 1; // in insertion order

        // 7
//        return  -1; // in reverse of insertion order
        // 8
        return 0; // only first added object..
    }
}
