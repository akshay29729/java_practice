package com.company.f_exception_handling;

public class j_customized {
    public static void main(String[] args) {
        int age =65;
        if(age>60){
            throw new tooOldException("take vaccination as early possible");
        }
        else if (age<18)
            throw new tooYoungException("wait for instructions..");
        else
            System.out.println("wait for old citizens..");
    }
}
class tooYoungException extends RuntimeException{
    public tooYoungException(String s) {
        super(s);
    }
}
class tooOldException extends RuntimeException{
    public tooOldException(String s) {
        super(s);
    }
}

