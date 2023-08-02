package com.company.f_exception_handling;
//-- As 'i_throws' is not throwable object..we can't use 'throws' for it
//public class i_throws {
//    public static void main(String[] args) throws i_throws{
//
//    }
//}

public class i_throws extends Exception { // we extended here..
    public static void main(String[] args) throws i_throws {

    }
}
