package com.company.f_exception_handling;

public class h_throws_checkedOnly {
    public static void main(String[] args) throws Exception {
        Thread.sleep(500); // try without "throws Exception" and see the error(compilation)

        // 2-- we can use try-catch also..
//        try {
//            Thread.sleep(5000);
//        }catch (Exception e){
//        }
    }
}
