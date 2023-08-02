package com.company;

import java.util.*;

public class xyz {
    // encoder
    public void encoder(String s){
        char[] c = s.toCharArray();
        StringBuffer s1 = new StringBuffer();
        int count=1;
        char ch;
        s1.append(c[0]);
        for(int i=1;i<c.length;i++){
            if(c[i]==c[i-1]){
                count++;
            }
            else{
                if(count==1){
                    s1.append(c[i-1]);
                }
                else{
                    s1.append(c[i-1]);
                    s1.append(count);
                }
            }
        }
        System.out.println(s1);
    }

    // decoder;
    public  void decoder(String s){
        StringBuffer s1 = new StringBuffer();

    }
    public static void main(String[] args) {
    new xyz().encoder("Hello");
    }
}
