package com.company.d_declarations_accessModifiers;

public class static_overriding extends parent1{
     static void m1(){
         System.out.println("Child method...");
     }
    void m2(){
        System.out.println("child m2");
    }
    public static void main(String[] args) {
        parent1 p1 = new parent1();
       parent1 p2 = new static_overriding();
        static_overriding s1 = new static_overriding();
        p1.m1();
        s1.m1();
        p2.m1();
        p1.m2();
        s1.m2();
        p2.m2();
    }
}

class parent1{
    static void m1(){
        System.out.println("parent method..");
    }
    void m2(){
        System.out.println("parent m2");
    }
}