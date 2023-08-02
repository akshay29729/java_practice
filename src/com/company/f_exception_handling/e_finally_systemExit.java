package com.company.f_exception_handling;

public class e_finally_systemExit {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            System.out.println(10/0);
        }catch (Exception e){
            System.out.println("Catch");
//            System.exit(0);
            System.exit(2); // use any integer as 'status'
        }finally { // 'finally' block won't get executed when "system.exit' is used in between because
                   // 'JVM' itself gets shutdown..
            System.out.println("finally..");
        }
    }
}
