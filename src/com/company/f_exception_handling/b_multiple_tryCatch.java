package com.company.f_exception_handling;

public class b_multiple_tryCatch {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
          }
        // we can't use parent exception at start in multiple catch blocks..
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        catch (ArithmeticException e){
//            e.printStackTrace();
//        }
        catch (ArithmeticException e){
            System.out.println(e.toString());
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
