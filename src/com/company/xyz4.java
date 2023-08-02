package com.company;

interface interface1{
    public default void display(){
        System.out.println("Interface 1 method");
    }
}
interface interface2 extends interface1{
    public default void display(){
        System.out.println("Interface 2 method");
    }
}
interface interface3 extends interface1{
    public default void display(){
        System.out.println("Interface 3 method");
    }
}
// 3
class parentXYZ4{
     public void display(){
        System.out.println("Class method");
    }
}
public class xyz4 extends parentXYZ4 implements interface2,interface3 {
//    public void display(){
//        // 1
//        //System.out.println("Class method");
//
//        // 2
//        //interface2.super.display();
//        //interface3.super.display();
//
//
//    }

    public static void main(String[] args) {
      xyz4 obj = new xyz4();
      obj.display();
    }
}
