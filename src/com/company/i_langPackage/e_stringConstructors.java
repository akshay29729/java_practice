package com.company.i_langPackage;

public class e_stringConstructors {
    public static void main(String[] args) {
        // 1
        String s1 = new String();
        s1 = "akshay";
        System.out.println(s1);

        //2
        String s2 = new String("akshay");
        System.out.println(s2);

        // 3
        StringBuffer sb = new StringBuffer("akshay");
        String s3 = new String(sb);
        System.out.println(s3);

        //4
        char[] ch = {'a','k','s','h','a','y'};
        String s4 = new String(ch);
        System.out.println(s4);

        //5
        byte [] b = {11,21,31,41,51};
        String s5 = new String(b);
        System.out.println(s5);

        // 6 -- we can't use array other than char and byte for input to string...
//        int[] i = {1,2,3,4};
//        String s6 = new String(i);

    }
}
