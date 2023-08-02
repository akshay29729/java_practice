package com.company;

class parent{
    int max=100;
}
public class xyz2 extends parent{
    int max = 101;

    void display(){
        System.out.println("max Speed1:"+max);
        System.out.println("max Speed2:"+super.max);
    }
    public static void main(String[] args) {
        xyz2 a = new xyz2();
        a.display();
        parent a1 = new xyz2();
//        a1.display();
    }
}
