package com.company.f_exception_handling;

public class f_latest_exception {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println(e.toString()); // this AE wion't be shown..
        }finally {
            System.out.println("finally");
            String s =null;
            System.out.println(s.length()); // this latest exception will be shown
                         // this exception is occurring in 'finally' block so it will be
                         //'Abnormal' termination
        }
    }
}
