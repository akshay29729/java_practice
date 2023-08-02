package com.company.j_collectionFramework;

import java.util.*;

public class e1_cursor {
    public static void main(String[] args) {
        // 1-Enumarator--for legacy classes only
        // Read only..
//        Vector v1 = new Vector();
//        for (int i=0;i<10;i++)
//            v1.addElement(i);
//        Enumeration e1 = v1.elements();
//        while (e1.hasMoreElements()){
////            int i = e1.nextElement();
//            int i =(int) e1.nextElement();
//            System.out.println(i);
//        }

        // 2-Iterator -- for all collection objects
        // Read and Remove
//        Vector v1 = new Vector();
//        for (int i=0;i<10;i++)
//            v1.addElement(i);
//        Iterator i1 = v1.iterator();
//        while (i1.hasNext()){
////            int i = e1.next();
//            int i =(int) i1.next();
//            if(i%2==0)
//                System.out.println(i);
//            else{
//                System.out.println("Removing  "+i);
//                i1.remove();
//            }
//        }
//        System.out.println(v1);

        // 3-ListIterator -- for all "list" objects only
        // read,remove,replace,add
        // It is bidirectional...
        ArrayList l1 = new ArrayList();
        for (int i=0;i<10;i++)
            l1.add(i);
        ListIterator li1 = l1.listIterator();
        while (li1.hasNext()){
            int i = (int) li1.next();
            if(i%2==0)
                li1.set(i+20);
            else if (i%3==0)
                li1.set(30);
            else
                li1.remove();
        }
        System.out.println(l1);
    }
}
