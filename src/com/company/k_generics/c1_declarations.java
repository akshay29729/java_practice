package com.company.k_generics;

import java.util.ArrayList;

public class c1_declarations {
    public static void main(String[] args) {
        //1 all these declarations are equivalent..
        ArrayList a1 = new ArrayList();
        ArrayList a2 = new ArrayList<String>();
        ArrayList a3 = new ArrayList<Integer>();
        a1.add(10);
        a1.add('a');
        a1.add("string");
        a2.add(10);
        a2.add('a');
        a2.add("string");
        a3.add(10);
        a3.add('a');
        a3.add("string");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        // 2 These declarations are equal
        ArrayList<String> s1 = new ArrayList<String>();
        ArrayList<String> s2 = new ArrayList<>();
        s2.add("akshay");
        // s2.add(1);

    }
    // 3
//    public void m1(ArrayList<String> a1){
//        System.out.println(a1);
//    }
//    public void m1(ArrayList<Integer> a2){
//        System.out.println(a2);
//    }
}
