package com.company.c_flow_control;

import com.company.d_declarations_accessModifiers.protected_practice;
public class protected_practice_outside_package extends protected_practice {
    public static void main(String[] args) {
        protected_practice_outside_package p1 = new protected_practice_outside_package();
        System.out.println(p1.i);
        protected_practice p2 = new protected_practice();
//        System.out.println(p2.i);
// we can not access protected member using parent reference in outside package
    }
}