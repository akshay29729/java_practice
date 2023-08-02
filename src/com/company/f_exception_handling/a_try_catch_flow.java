package com.company.f_exception_handling;

public class a_try_catch_flow {
    public static void main(String[] args) {
        try {
            System.out.println("hi");
            System.out.println(10/0);
            System.out.println(10/3); // it won't get executed..
        }
        catch (ArithmeticException e){
           e.printStackTrace();
//            e.toString();
//            System.out.println(e.getMessage());
            System.out.println(10/2);
        }
        System.out.println("end...");
    }
}
