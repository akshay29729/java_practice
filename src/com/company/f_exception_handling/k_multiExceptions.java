package com.company.f_exception_handling;

import java.io.FileNotFoundException;

public class k_multiExceptions {
    public static void main(String[] args) {
        try {
            System.out.println(20/0);
        }catch (NullPointerException|OutOfMemoryError|ArithmeticException e){
            System.out.println(e.toString());
            // the used exceptions should not have 'child-parent' relation..
        }
    }
}
