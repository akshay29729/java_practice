package com.company.g_multiThreading;

public class f_priority {
    public static void main(String[] args) {
        MyThread5 m1 = new MyThread5();
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(m1.getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(m1.getPriority());
        m1.setPriority(7);
        System.out.println(m1.getPriority());
    }
}
