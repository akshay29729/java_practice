package com.company.g_multiThreading;
class  MyThread3 extends Thread{
    public void run(){
        System.out.println("run method");
    }
    // 1-overloading
//    public void start(){
//        System.out.println("start method");
//    }

    // 2
    public void start(){
        super.start();
        System.out.println("start method");
    }
}
public class c_start {
    public static void main(String[] args) {
        MyThread3 m1 = new MyThread3();
        // 1
//        m1.start(); // 'start' will be executed as a normal method, it won't invoke the 'run' method..
//        System.out.println("main method");

        // 2
        m1.start();// it will invoke run method and we can't expect output
        System.out.println("main method");
    }
}
