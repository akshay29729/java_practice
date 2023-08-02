package com.company.k_generics;

import java.util.ArrayList;

public class a1_problems {
    public static void main(String[] args) {
        String[] s1 = new String[10];
        s1[0]="akshay";
        s1[1]="shinde";
//        s1[3]='a'; // type safety
        s1[4]="1";
        String s = s1[1]; // No type casting required..
        for (String x:s1 )
            System.out.println(x);
        System.out.println("-------------------");
        ArrayList a = new ArrayList();
        a.add(1);
        a.add('a'); //
        a.add("akshay"); //
        a.add(true); // No type safety,we can add any types..

        int i = (int) a.get(0); // compulsory type casting required
//        int i2 = a.get(0);
        for (var v : a)
            System.out.println(v);
    }
}
