package com.company.d_declarations_accessModifiers;

interface ii1{
    int x=10; // it is by default 'public static final'..so must initialize it while declaring
}
interface ii2{
    int x=12;
}
public class interface_variables implements ii1,ii2{
    public static void main(String[] args) {
        System.out.println(ii1.x);
        System.out.println(ii2.x);
//      System.out.println(x); // can't use..we can use it when our class implements only one interface
        int x =11;
        System.out.println(x);
    }
}
