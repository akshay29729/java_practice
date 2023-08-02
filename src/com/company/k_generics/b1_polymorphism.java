package com.company.k_generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class b1_polymorphism {
    public static void main(String[] args) {
        // Polymorphism as allowed for base types only...
        Collection<String> c = new ArrayList<String>();
        List<String>       s = new ArrayList<String>();
        ArrayList<String>  a = new ArrayList<String>();

        // Polymorphism is not allowed for parameter type
//        ArrayList<Object> ab = new ArrayList<String>();

        // we can't provide any primitive type for parameter..
        // ArrayList<int> ab2 = new ArrayList<int>();
    }
}
