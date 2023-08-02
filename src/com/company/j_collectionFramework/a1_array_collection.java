package com.company.j_collectionFramework;

import java.util.ArrayList;

public class a1_array_collection {
    public static void main(String[] args) {
        // we can form array for objects and primitives
//        boolean[] b ={true,false,false,true};
//        System.out.println(b);
//        String[] s = {"akshay","shinde"};
//        System.out.println(s);

        // collections can hold objects only
        ArrayList a = new ArrayList();
        int i =1;
        a.add(i);
        System.out.println(a.get(0).getClass().getName()); // though i is 'int' primitive type,
               // it is automatically type casted to 'Integer' object..

    }
}
