package com.company.j_collectionFramework;

import java.util.Stack;

public class d2_stacks {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        System.out.println(s1.capacity());
        System.out.println(s1.peek());
        s1.push(3);
        System.out.println(s1.pop());
        System.out.println(s1.search(2));
        System.out.println(s1);
    }
}
