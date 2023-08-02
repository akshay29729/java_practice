package com.company.i_langPackage;

public class i_valueOf {
    public static void main(String[] args) {
        // 1 -for string.. // only for character class we can't use
////        Integer i1 = Integer.valueOf("a");
//        Integer i2 = Integer.valueOf("10");
//        Double d1 = Double.valueOf("10.5");
////        Double d2 = Double.valueOf("a");
//        Boolean b1 = Boolean.valueOf("durgaaa");
////        System.out.println(i1);
//       System.out.println(i2);
//        System.out.println(d1);
////        System.out.println(d2);
//        System.out.println(b1);

        // 2 -for primitive.. all wrapper classes including character..
        Integer i1 = Integer.valueOf(1);
        Double d1 = Double.valueOf(10.5);
        Float f1 = Float.valueOf(10.5f);
        Character c1 = Character.valueOf('a');
        String s1 = String.valueOf("a");
        System.out.println(i1);
        System.out.println(d1);
        System.out.println(f1);
        System.out.println(c1);
        System.out.println(s1);

    }
}
