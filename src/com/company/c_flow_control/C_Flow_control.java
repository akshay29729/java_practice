package com.company.c_flow_control;

public class C_Flow_control {
    public static void main(String[] args) {
//        1-if else
//        if (true)
//            System.out.println("hi");
//        System.out.println("hello");
//        if (true);
//        System.out.println("hello");


//        2-switch
//        int x=10;
//        switch (x){
//            case 11:
//                System.out.println(11);
//            case 10:
//                System.out.println(10);
//            case 1:
//                System.out.println(1);
//            default:
//                System.out.println("None...");
//        }
//        switch (x){
//            case 11:
//                System.out.println(11);
//                break;
//            case 10:
//                System.out.println(10);
//                break;
//            case 1:
//                System.out.println(1);
//                break;
//            default:
//                System.out.println("None...");
//        }
//        int y=20;
//        final int z=20;
//        switch (x){
//            case 10:
//                System.out.println(10);
//            case y:
//                System.out.println(y);
//            case z:
//                System.out.println(z);
//        }

//        3-While
//        while (true)
//            System.out.println("hello");
//        System.out.println("hi");
//        while (false)
//            System.out.println("hello");
//        System.out.println("hi");
//        int x=10,y=20;
//        while (x<y)
//            System.out.println("hell");
//        System.out.println("ji");
//        final int x=10,y=20;
//        while (x<y)
//            System.out.println("hell");
//        System.out.println("ji");

//        4-for
//        for (int i=0,j=2;i<j;i++){
//            System.out.println(i);
//        }
//        for (int i=0,int j=2;i<j;i++){
//            System.out.println(i);
//        }
//        for (System.out.println("hello");; System.out.println("jo")){
//            System.out.println("hi");
//        } // why "hello" is not getting printed...
//        int i=0;
//        for (System.out.println("Welcome..");i<3;i++)
//            System.out.println("hi");
//        int i=0;
//        for (System.out.println("Welcome..");i<3;i++);
//        for (int i=0;true;i++)
//            System.out.println("hi");
//        System.out.println("hello");
//        for (int i=0;false;i++)
//            System.out.println("hi");
//        System.out.println("hello");

//        5-for each
//        int [][] a = {{1,2,3},{4,5,6}};
//        for (int[] x:a){
//            for (int y:x)
//                System.out.println(y);
//        }

//        6-labeled continue and break
        loop1:for (int i=0;i<3;i++){
           loop2:for (int j=0;j<3;j++){
            if(i==j)
//                break loop2;
//                break loop1;
//                continue loop1;
                continue loop2;
            System.out.println(i+"...."+j);
           }
        }

    }
}
