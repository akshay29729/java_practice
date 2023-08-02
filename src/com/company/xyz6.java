package com.company;

public class xyz6 {
    public static void main(String[] args) {
        String s = "Meet me in meeting room";
        String [] str = s.split(" ");
        String [] str1 = s.split(" ",2);
        String [] str2 = s.split(" ",3);
        String [] str3 = s.split(" ",-1);
        String [] str4 = s.split(" ",0);
        for (String s1: str){
            System.out.println(s1);
        }
        System.out.println("---------------------------");
        for (String s1: str1){
            System.out.println(s1);
        }
        System.out.println("---------------------------");
        for (String s1: str2){
            System.out.println(s1);
        }
        System.out.println("---------------------------");
        for (String s1: str3){
            System.out.println(s1);
        }
        System.out.println("---------------------------");
        for (String s1: str4){
            System.out.println(s1);
        }
    }

}
