package com.company.g_multiThreading;

class MyThread6 extends Thread{
    // 1
    public void run(){
        for (int i=0;i<5;i++)
            System.out.println("run method...");
    }

    // 2
//    static Thread mt;
//    public void run(){
//        try {
//            mt.join();
//        }catch (InterruptedException e){
//            System.out.println(e.getMessage());
//        }
//        for (int i=0;i<5;i++)
//            System.out.println("run method..");
//    }
}
public class g_join {
    public static void main(String[] args) throws InterruptedException {
        // 1
        MyThread6 m1 = new MyThread6();
        m1.start();
//        Thread mt = Thread.currentThread();
//        mt.join();
        m1.join();
        for (int i =0;i<5;i++)
            System.out.println("main method..");

        // 2
//        MyThread6.mt = Thread.currentThread();
//        MyThread6 m1 = new MyThread6();
//        m1.start();
//        for(int i=0;i<5;i++)
//            System.out.println("main...");
    }
}
