package com.company.d_declarations_accessModifiers;

public class local_final_variable {
    public static void main(String[] args) {
        int x;
        final  int y;
        final int z=10;
//        System.out.println(x);
//        System.out.println(y); // we can't use before initialization
        System.out.println(z);
        y=20;
        System.out.println(y);
    }
}
