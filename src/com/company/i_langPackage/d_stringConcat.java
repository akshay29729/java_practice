package com.company.i_langPackage;

public class d_stringConcat {
    public static void main(String[] args) {
        // 1--
//        String s1 = new String("akshay");
//        System.out.println(s1);
//        s1.concat(" shinde");
//        System.out.println(s1);
//        String s2 = s1.concat(" shinde");
//        System.out.println(s2);
//        String s3 = s1 + " shinde";
//        System.out.println(s3);
//        s1 = s1+" shinde";
//        System.out.println(s1);
        // 2--
        String s1 = new String("akshay");
        String s2 = s1.intern();
        System.out.println(s1==s2);
        String s3 ="akshay";
        System.out.println(s2==s3);
    }
}
