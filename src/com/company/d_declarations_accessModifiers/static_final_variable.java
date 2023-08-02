package com.company.d_declarations_accessModifiers;

public class static_final_variable {
    static int x;
    final static int y=10;
    final static int z;
    static {
        z=20;
    }
    public static void main(String[] args) {
        System.out.println(x+","+y+","+z);
    }
}
