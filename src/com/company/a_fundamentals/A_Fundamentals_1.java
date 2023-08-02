package com.company.a_fundamentals;

public class A_Fundamentals_1 {
//    3-
    int x=1;
    static int y=10;
    public static void main(String args1[]) {
//        1-Array
//        int [][] a = new int[3][];
//        System.out.println(a[1]);
//        System.out.println(a[1][0]);
//        int [][] b = new int[3][2];
//        System.out.println(b[1]);
//        System.out.println(b[1][0]);
//        2-
//        A_Fundamentals_1  fundamentals_1 = new A_Fundamentals_1();
//        fundamentals_1.show(null);
//        3-Variables
//        System.out.println(x);
        A_Fundamentals_1 f1 = new A_Fundamentals_1();
//       A_Fundamentals_1 f2 = new A_Fundamentals_1();
//        System.out.println(f1.x);
//        System.out.println(y);
//        f1.m1();
//        System.out.println(f1.x);
//        System.out.println(f1.y);
//        f1.x =11;
//        f1.y = 22;
//        System.out.println(f2.x);
//        System.out.println(f2.y);
//        4- Var-arg Method
//        f1.m1(2);
////        f1.m1();
//        f1.m1(1,2,4);
//        5-main method
//        f1.main();
        System.out.println("Parent main method");
    }
//    2-
//    void show(String str){
//        System.out.println("STRING CLASS");
//    }
//    void show(Object obj){
//        System.out.println("OBJECT CLASS");
//
//    }
//    3-
//    public void m1(){
//        System.out.println(x);
//        System.out.println(y);
//    }
//    4-
//    public void m1(int...a){
//        System.out.println(a[0]);
//    }
    public static void main(){
        System.out.println("overloaded main method");
    }
}

class child extends A_Fundamentals_1{

   public static void main(String[] args) {
////        System.out.println("Child class main method");
//    }
//    child c1 = new child();
//        c1.main();
//    Fundamentals_1 f1 = new child();
//        f1.main();
       System.out.println("child..");
   }
}