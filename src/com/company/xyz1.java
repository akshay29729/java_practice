package com.company;
class Test{
    static int i;
    static {
        System.out.println("Static method called");
        i=10;
    }

    public static void main(String[] args) {
        System.out.println("Main method of Test called...");
    }
}
public class xyz1 {
    public static void main(String[] args) {
        System.out.println("Main method of xyz1 called...");
        System.out.println(Test.i);
    }
}
