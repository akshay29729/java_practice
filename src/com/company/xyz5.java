package com.company;

class parentxyz5{
    private void display(){
        System.out.println("Parent private method");
    }
    static void stMethod(){
        System.out.println("Parent static method");
    }

    // 2
    public static void main(String[] args) {
        parentxyz5 p1 = new parentxyz5();
        parentxyz5 p2 = new xyz5();
        xyz5 p3 = new xyz5();

        p1.display();
        p1.stMethod();
        System.out.println("-----------------------");

        p2.display();
        p1.stMethod();
        System.out.println("-----------------------");

//        p3.display(); // if we remove 'private' access modifier from display method of child class
                        // then we can accesss display method here...
        p3.stMethod();

    }
}
public class xyz5 extends parentxyz5 {
    private void display(){
        System.out.println("Child private method");
    }
    static void stMethod(){
        System.out.println("child static method");
    }

    // 1
//    public static void main(String[] args) {
//        xyz5 obj1 = new xyz5();
//        parentxyz5 obj2 = new parentxyz5();
//        parentxyz5 obj3 = new xyz5();
//
//        obj1.display();
//        obj1.stMethod();
//        System.out.println("-----------------------");
//
////        obj2.display();
//        obj2.stMethod();
//        System.out.println("-----------------------");
//
//        obj3.stMethod();
////       obj3.display();
//
//    }
}
