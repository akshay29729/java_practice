package com.company;

import java.util.*;

public class parctivss {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        rotate(array);

    }

    public static void rotate(int[] array){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int no_of_rotate = n%(array.length);
        int count =0;
        List<Integer> list1 = new ArrayList<>();
        while(count<array.length){
            if(no_of_rotate>= array.length){
                no_of_rotate = no_of_rotate%array.length;
            }
            list1.add(array[no_of_rotate]);
            no_of_rotate++;
            count++;
        }
        System.out.println(list1);
    }
}
