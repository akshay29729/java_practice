package com.company.k_generics;

import java.util.ArrayList;

public class a2_generics {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        //         ArrayList<String> a = new ArrayList<>();// its also correct
        a.add("akshay");
        a.add("shinde");
//        a.add(5,"bajira0");
//        a.add(a); // we get type safety..
        for (var v:a)
            System.out.println(v);
        String s = a.get(0); // no type casting required..
    }
}
