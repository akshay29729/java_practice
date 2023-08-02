package com.company.d_declarations_accessModifiers;

//public class fileStructure {
//  1-
//public static void main(String[] args) {
//    System.out.println("hi,first main class..");
//}
//}
//class second{
////    second class..we can't have two public classes in one programme..
////    else declare both classes without 'public' modifier...
//public static void main(String[] args) {
//    System.out.println("hi,second main class..");
//}
//}


//  2--
//class third{
//    public void m1(){
//        System.out.println("Third class...");
//    }
//    public static void m2(){
//        System.out.println("Third class...static");
//    }
//}
//class thirdChild extends third{
//    public static void m2(){
//        System.out.println("Third Child class...static");
//    }
//    public static void main(String[] args) {
//        new third().m1();
//        new thirdChild().m1();
//        System.out.println("--------------------------------------");
//        third t1 = new third();
//        third t2 = new thirdChild();
//        thirdChild t3 = new thirdChild();
//        t1.m2();
//        t2.m2();
//        t3.m2();
//    }
//}

//   3-
class A{
    public static void main(String[] args) {
        System.out.println("A main method");
    }
}
public class fileStructure extends A{
}