package com.company.i_langPackage;

public class g_stringBuffer {
    public static void main(String[] args) {
        // 1
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity()); // default capacity is 16...
        sb1.append("abcdefghijklmnop"); // sb1 capacity is filled
        System.out.println(sb1.capacity());
        sb1.append("q"); // new string is filled and we added new string..so capacity is increased
                         // new capcaity = 2*(old capacity+1)----(16+1)*2=34
        System.out.println(sb1.capacity());
        // 2
        StringBuffer sb2 = new StringBuffer("akshay");
        System.out.println(sb2.capacity()); // capacity=16+"akshay" length

        // 3
        StringBuffer sb3 = new StringBuffer(38); // setting capacity..
        System.out.println(sb3.capacity());

        // 4
        StringBuffer sb4 = new StringBuffer("AkshayBajiraoShinde");
        sb4.setLength(6);
        System.out.println(sb4);
        System.out.println(sb4.capacity());

        // 5
        sb4.ensureCapacity(71); // original sb4 capacity=35..so next capacity will be
                     // 2(35+1)=72... so if we ensure capacity <72, it will automatically sets capacity
                     // to 72..
        System.out.println(sb4.capacity());
    }
}
