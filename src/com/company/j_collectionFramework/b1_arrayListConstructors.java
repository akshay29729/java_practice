package com.company.j_collectionFramework;

import java.util.ArrayList;

public class b1_arrayListConstructors {
    public static void main(String[] args) {
        // 1
        ArrayList a1 = new ArrayList(); // default capacity is 10
        for (int i=0;i<10;i++)
            a1.add(i);
        a1.add(11); // after filling, new capacity = (capacity*3/2)+1

        // 2
        ArrayList a2 = new ArrayList(15);// we can give capacity

        // 3
        ArrayList a3 = new ArrayList();
        for(int i=0;i<19;i++)
            a3.add(i);
        ArrayList a4 = new ArrayList(a3);
    }
}
