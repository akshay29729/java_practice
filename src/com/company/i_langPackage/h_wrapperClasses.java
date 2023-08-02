package com.company.i_langPackage;

import com.company.d_declarations_accessModifiers.B;

public class h_wrapperClasses {
    public static void main(String[] args) {
        // 1
        Integer i1 = 10;
        Integer i2 = new Integer("11"); // depreciated..
//        Integer i3 = new Integer("ten"); // depreciated..
        Integer i4 = new Integer('a');
        System.out.println(i1);
        System.out.println(i2);
//        System.out.println(i3); it will give error...
        System.out.println(i4);

        // 2
        Double d1 = new Double(10.5);
        Double d2 = new Double(10);
        Double d3 = new Double('a');
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        // 3
        Character c1 = new Character('a');
//        Character c2 = new Character("c");
//        Character c3 = new Character(1);

        // 4
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean(false);
//        Boolean b3 = new Boolean(True);
//        Boolean b4 = new Boolean(False);
        System.out.println(b1);
        System.out.println(b2);
        Boolean b5 = new Boolean("true");
        Boolean b6 = new Boolean("trUe");
        Boolean b7 = new Boolean("frue");
        Boolean b8 = new Boolean("false");
        Boolean b9 = new Boolean("akshay");
        System.out.println(b5);
        System.out.println(b6);
        System.out.println(b7);
        System.out.println(b8);
        System.out.println(b9);
    }
}
