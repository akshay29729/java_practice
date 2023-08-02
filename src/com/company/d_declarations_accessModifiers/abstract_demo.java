package com.company.d_declarations_accessModifiers;

public class abstract_demo {
    public static void main(String[] args) {

    }
}

// 2--
// abstract class  Abstarct1{
//    public abstract void m1(); // if any abstract method is present then compulsory that class
//                               // be declared 'abstract'
//     public void m2(){
//         System.out.println("hii");
//     }
//}
//class childAbstract1 extends Abstarct1{
//    public void m1(){ // must override abstract method
//        System.out.println("overrided..");
//    }
//}

// 3--
//abstract class abstract2{ // abstract class without any abstract method
//    public void m2(){
//        System.out.println("hi");
//    }
//}
//class childAbstract2 extends abstract2{
//    public void m4(){
//        System.out.println("hello..");
//    }
//}

// 4-
//abstract class abstract3{
//    public abstract void m1(); // we can't include private,final,synchronized,static,native,strictfp
//                               // with abstract
//}

// 5--abstract+final
//abstract class abstract4{
//    final void m1(){
//        System.out.println("we can have final method in abstract class");
//    }
//}
//final class final1{
//   abstract void m1(){
//        System.out.println("we can not have abstract method in final class");
//    }
//}
