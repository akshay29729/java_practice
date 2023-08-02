package com.company.g_multiThreading;

class MyThread2 extends Thread{
    // 1- overloading
    public void run(){
        System.out.println("No argument run...");
    }
    public void run(int i){
        System.out.println("Argument run..");
    }
    // 2-

}
public class b_run {
    public static void main(String[] args) {
        MyThread2 m1 = new MyThread2();
        // 1
        m1.start(); // it will use no argument run method
        m1.run(2);// we explicitly have to call overloaded method and it will be executed as
                    // "normal" method..

        // 2
//        m1.start();// we must override the 'run' method otherwise 'Thread'class 'run' method will
                   // be executed which have empty implementation...

    }
}
