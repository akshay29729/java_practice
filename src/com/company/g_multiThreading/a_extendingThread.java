package com.company.g_multiThreading;

class MyThread1 extends Thread{
    public void run(){
        for (int i=0;i<10;i++)
            System.out.println("Child thread runn...");
    }
}
public class a_extendingThread {
    public static void main(String[] args) {
        MyThread1 m1 = new MyThread1();
        m1.start(); // new thread  is created and that thread will execute the run method,hence we can't
                      // expect output
//        m1.run();    // new thread is created but run method will be executed by 'main' method,
                    //  hence,output will be 10 times 'thread run..' and then 10 times "main method run..'
        for (int i=0;i<10;i++)
            System.out.println("Main method run...");
    }
}
