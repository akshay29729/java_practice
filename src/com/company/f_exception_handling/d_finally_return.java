package com.company.f_exception_handling;

public class d_finally_return {
    public static void main(String[] args) {
        // 1--
        try {
            System.out.println("try");
            System.out.println(10/0);
        }catch (Exception e){
            System.out.println("catch..");
            return; // 'finally' block dominates 'return'..i.e. finally block is executed firstly..
        }
        finally {
            System.out.println("finally..");
        }

        // 2--
//        System.out.println(m1());
    }
    // 2-
//     static int m1(){ // we can't access non-static method from static block..hence 'm1'is static
//        try {
//            return 1;
//        }catch ( Exception e){
//            return 2;
//        }finally { // in case of try,catch,finally-- finally will be used for 'return'
//            return 3;
//        }
//    }
}
