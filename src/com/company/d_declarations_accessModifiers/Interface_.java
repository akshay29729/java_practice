package com.company.d_declarations_accessModifiers;

public class Interface_ {
    void m5(){
        System.out.println("class method..m5");
    }
    public static void main(String[] args) {

    }
}
interface i1{
    void m1();
    void m2();
}
interface i2{
    abstract void m3();
    void m4();
}
class childi1 implements i1{
    public void m1(){ // must declare public
        System.out.println("interface1..m1");
    }
    public void m2(){
        System.out.println("interface1..m2");
    }
}
abstract class childi2 implements i2{ // declared abstract bcz we didn't implemented 'm4'
    public void m3(){ // must declare public
        System.out.println("interface1..m1");
    }
}

class child3 extends Interface_{ // class can 'extend' only one class...
}
abstract class child4 implements i1,i2{ // class can 'implement' many interfaces...
}
abstract class child5 extends Interface_ implements i1,i2{
    // class can extend another class and also implement interfaces simultaneously..
}
//interface i3 implements i1{ // interface can't 'implement' interfaces...
//}
interface i4 extends i1,i2{ // interface can "extend" many interfaces..
}
