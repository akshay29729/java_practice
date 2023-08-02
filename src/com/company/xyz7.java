package com.company;
interface xyzi1{
    default void show(){
        System.out.println("No argument default");
    }
    default void show(String s){
        System.out.println("Argument default");
    }
}
public class xyz7 implements xyzi1{
    public static void main(String[] args) {
        xyzi1 x = new xyz7();
        x.show();
        x.show("h");
    }
}
