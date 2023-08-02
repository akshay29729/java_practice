package com.company.d_declarations_accessModifiers;
class A1{
    int x =10;
    void show(){
        System.out.println("A class");
    }
}
public class B extends A1 {
    int x =20;
    void show(){
        System.out.println("B class");
    }

    public static void main(String[] args) {
        A1 a = null;
        System.out.println(a.x);
        a.show();
    }
}
