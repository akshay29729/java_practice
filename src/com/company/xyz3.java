package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class xyz3 {
    public static void main(String[] args) {
        // FAIL FAST
        // EXAMPLE 1

//        Map<Integer, String> students = new HashMap<Integer, String>();
//        students.put(101, "Emma");
//        students.put(102, "Paul");
//        students.put(103, "Walker");
//
//        //creating an instance of the Iterator class
//        Iterator itr = students.keySet().iterator();
//
//        //iterating map using Iterator
//        while (itr.hasNext()) {
//            //printing elements of Map
//            System.out.println(students.get(itr.next()));
//
//            // adding an element to Map
//            students.put(104, "Rubby"); // on the next call of next() method, exception will be thrown.
//        }

        // EXAMPLE 2
        //creating ArrayList
//        ArrayList<String> students = new ArrayList<String>();
//        students.add("Emma");
//        students.add("Paul");
//        students.add("Walker");
//        students.add("Elanie");
//        students.add("Amara");
//
//
//        //creating an instance of the Iterator class
//        Iterator itr = students.iterator();
//
//        //iterating ArrayList using Iterator
//        while (itr.hasNext()) {
//            if ((String)itr.next() == "Paul") {
//                // It will  throw an exception
//                System.out.println("Safely removing....");
//                students.remove("Amara");
////                break;
//            }
//        }
//
//        System.out.println(students);
//

        // FAIL SAFE
        // EXAMPLE 3
        ArrayList<String> students = new ArrayList<String>();
        students.add("Emma");
        students.add("Paul");
        students.add("Walker");

        //creating CopyOnWriteArrayList by copy students ArrayList
        CopyOnWriteArrayList<String> copyStudents = new CopyOnWriteArrayList<String>(students);

        //creating an instance of the Iterator class
        Iterator itr = copyStudents.iterator();

        //iterating CopyOnWriteArrayList using Iterator
        while (itr.hasNext()) {
            String name = (String)itr.next();
            System.out.println(name);
            if (name == "Paul")
                // The Rubby name will not print but it has created separate copy
                copyStudents.add("Rubby");
        }
        System.out.println(students);
        System.out.println(copyStudents);
       itr = copyStudents.iterator();
        while (itr.hasNext()) {
            String name = (String)itr.next();
            System.out.println(name);
        }
    }
}
