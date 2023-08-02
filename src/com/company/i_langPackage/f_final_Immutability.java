package com.company.i_langPackage;

public class f_final_Immutability {
    public static void main(String[] args) {
        String s1 = new String("akshay");
        final String s2 = new String("shinde");
        s1 = s1+" shinde";
//        s2 = "akshay "+s2; // we can't do reassignment for final object reference
    }
}
