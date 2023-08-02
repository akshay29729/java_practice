package com.company.g_multiThreading;

public class h_daemon {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon());
        MyThread6 m1 = new MyThread6();
        System.out.println(m1.isDaemon());
        System.out.println("---------------------------");
        m1.setDaemon(true);
        System.out.println(m1.isDaemon());
    }
}
