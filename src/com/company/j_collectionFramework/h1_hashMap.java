package com.company.j_collectionFramework;

import java.util.*;

public class h1_hashMap {
    public static void main(String[] args) {
        // 1
        HashMap h1 = new HashMap(); // default capacity 16 and fill ration 0.75
        h1.put("akshay",100);
        h1.put('B',2);
        h1.put(true,11);
        h1.put(null,24);
        h1.put(null,42); // replaces earlier null valu1.. and moved to top position..
        h1.put(1,null);
        h1.put(2,null);
        h1.put(3,11);
        System.out.println(h1);
        System.out.println(h1.get(4)); // returns null if key is absent
        System.out.println(h1.get(3));
        System.out.println(h1.containsKey(3));
        System.out.println("------------------------------");
        Set s1 = h1.keySet();
        System.out.println(s1);
        System.out.println("-------------------------------");
        Set s2 = h1.entrySet();
        System.out.println(s2);
        System.out.println("-------------------------------");
        Collection c = h1.values();
        System.out.println(c);
        for (var entry:s2){
            System.out.println(entry);
        }
        System.out.println("-----------------");
        Iterator i1 = s2.iterator();
        while (i1.hasNext()){
            Map.Entry m1 = (Map.Entry) i1.next();
            System.out.println("Key: "+m1.getKey()+",Value: "+m1.getValue());
        }
    }
}
