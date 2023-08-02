package com.company.g_multiThreading;
class MyThread5 extends Thread{
    public void run(){
        System.out.println("run...");
    }
}
public class e_names {
    public static void main(String[] args) {
        MyThread5 m1 = new MyThread5();
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("akshay thread");
        System.out.println(Thread.currentThread().getName());
        System.out.println(m1.getName());
        m1.setName("shinde");
        System.out.println(m1.getName());
        m1.start();
        System.out.println(Thread.currentThread().getName());
    }
}
