package com.company.i_langPackage;

class cat{
    int j;

    public cat(int j) {
        this.j = j;
    }
}
class dog implements Cloneable{
    cat c;
    int i;

    public dog(cat c, int i) {
        this.c = c;
        this.i = i;
    }
//    public Object clone() throws CloneNotSupportedException{
//        return super.clone();
//    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        cat c1 = new cat(c.j);
        dog d1 = new dog(c1,i);
        return d1;
    }
}
public class c_cloningMethod {
    public static void main(String[] args) throws CloneNotSupportedException {
        cat c1 = new cat(10);
        dog d1 = new dog(c1,20);
        System.out.println("i="+d1.i+",j="+d1.c.j); // i-primitive variable
                                                    // j-reference variable
        // 1- shallow cloning(Default)
//        dog d2 = (dog) d1.clone();
//        d1.i=100;
//        d1.c.j=200;
//        System.out.println("----------------");
//        System.out.println("i="+d1.i+",j="+d1.c.j);
//        System.out.println("----------------");
//        System.out.println("i="+d2.i+",j="+d2.c.j);

        //  2-Override--Deep Cloning
        dog d2 = (dog) d1.clone();
        d1.i=100;
        d1.c.j=200;
        System.out.println("---------------");
        System.out.println("i="+d1.i+",j="+d1.c.j);
        System.out.println("---------------");
        System.out.println("i="+d2.i+",j="+d2.c.j);

        // 3 - getClass
//        System.out.println(d1.getClass());
//        System.out.println(c1.getClass());
    }
}
