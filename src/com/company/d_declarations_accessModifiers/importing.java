package com.company.d_declarations_accessModifiers;
// 1-Ambiguity
//import java.util.*;
//import java.sql.*;
//import java.util.Date;

// 2-static import
//import static java.lang.Math.*;

// 3 - preference
import static java.lang.Byte.MAX_VALUE; //2
import static java.lang.Integer.*;  //3

public class importing {
//    3
    static int MAX_VALUE =999; // 1
    public static void main(String[] args) {
//        It will give error or ask for particular package...
//        2--
//        System.out.println(sqrt(25));
//        System.out.println(random());
//        System.out.println(max(1,1));

//        3--
        System.out.println(MAX_VALUE); // also try with commenting '1', then '1,2'
    }
}
