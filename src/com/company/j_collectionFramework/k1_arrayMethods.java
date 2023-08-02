package com.company.j_collectionFramework;

import java.util.Arrays;
import java.util.List;

public class k1_arrayMethods {
    public static void main(String[] args) {
        String[] s1 ={"akshay","bajirao","shinde"};
        int [] i1 ={1,2,3,4};
        System.out.println(i1);
        List l1 = Arrays.asList(s1);
        List l2 = Arrays.asList(i1);
        System.out.println(l1);
        System.out.println(l2);
        //
        l1.set(1,"nanda");
        System.out.println(Arrays.toString(s1));
        System.out.println(l1);
//        l1.add("snehal"); // using list reference we can't do any changes in size
//        l1.remove("akshay")
        l1.set(1,new String("bajirao"));
        System.out.println(l1);
//        l1.set(1,new StringBuffer("nanda")); // we can't set heterogeneous object...
    }
}
