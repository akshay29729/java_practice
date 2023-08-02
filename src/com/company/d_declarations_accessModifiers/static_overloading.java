package com.company.d_declarations_accessModifiers;

public class static_overloading {
    public static void main(String[] args) {
        System.out.println("main..");
        int [] a ={1};
        static_overloading.main(a);
    }

    public static void main(int[] args) {
        System.out.println("overloaded");
    }
}
