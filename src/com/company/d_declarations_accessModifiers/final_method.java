package com.company.d_declarations_accessModifiers;

public class final_method {
    public static void main(String[] args) {

    }
    final void m1(){
        System.out.println("final method");
    }
     void m1(int i){ // we can declare it final also.. -- OVERLOADING
         System.out.println(i);
     }
}
class child extends final_method{
//    we can not override final method
//    public void m1(){
//        System.out.println("hi");
//    }
}
