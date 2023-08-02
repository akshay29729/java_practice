package com.company.f_exception_handling;

public class g_throw {
    public static void main(String[] args) {
        // 1--
        System.out.println(getSavings(1000,1001));

//        //2--
//        ArithmeticException e1 = new ArithmeticException();
//        ArithmeticException e2;
//       throw e1;
////        throw e2;
    }
    // 1--
    static int getSavings(int salary,int expenditure){
        if(expenditure>salary){
            throw new ArithmeticException("Salary is less that expenditure..u r busteddd..");
//            System.out.println("hello"); // we can't write anything after using 'throw' keyword..
        }
        else
            return salary-expenditure;
    }
}
