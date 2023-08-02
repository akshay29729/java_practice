package com.company.d_declarations_accessModifiers;

public class instance_final_variables {
//    1-instance variable
    int x;
    // instance+ final-various initialization positions
    final int y =10;
    final int z;
    instance_final_variables(){
        z=20;
    }
    final int w;
    {
        w=30;
    }
    public static void main(String[] args) {
//        1-
       new instance_final_variables().m1();
    }
    public void m1(){
        System.out.println(x+","+y+","+z+","+w);
    }
}
