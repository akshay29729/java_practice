package com.company.g_multiThreading;

class MyThread4 implements Runnable{
    public void run(){
        for (int i=0;i<5;i++)
            System.out.println("run..");
    }
}
public class d_implementRunnable {
    public static void main(String[] args) {
        MyThread4 m1 = new MyThread4();
        Thread t = new Thread(m1);
        t.start();
        for (int i = 0;i<5;i++)
            System.out.println("main...");
    }
}
