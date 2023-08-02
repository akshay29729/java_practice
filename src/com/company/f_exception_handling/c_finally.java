package com.company.f_exception_handling;

public class c_finally {
    public static void main(String[] args) {
        try {
            System.out.println("try..");
            System.out.println(10/0);
        }catch ( NullPointerException e){ // abnormal termination because we didn't handle exception
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally...");
        }
    }
}
