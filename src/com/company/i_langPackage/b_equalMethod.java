package com.company.i_langPackage;

public class b_equalMethod {
    String name;
    int rollNo;

    public b_equalMethod(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    @Override
    public boolean equals(Object o){
        if(this==o)
            return true;
        if(o instanceof b_equalMethod){
            b_equalMethod b = (b_equalMethod) o;
            if(name.equals(b.name) && rollNo== b.rollNo)
                return true;
            else
                return false;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        b_equalMethod b1 = new b_equalMethod("akshay",29);
        b_equalMethod b2 = new b_equalMethod("shinde",30);
        b_equalMethod b3 = new b_equalMethod("akshay",29);
        b_equalMethod b4 =b1;
        // 1--
//        System.out.println(b1==b2);
//        System.out.println(b1==b3);
//        System.out.println(b1.equals(b3));
//        System.out.println("---------------------");
//        System.out.println(b1==b4);
//        System.out.println(b1.equals(b4)); // by default in object class, '==' and 'equals() methods
                                          // are meant for "reference(address)" comparison..

        // 2 - after overriding 'equals' method for "content" comparison
//        System.out.println(b1==b3); // we can't override "==" method..
//        System.out.println(b1.equals(b3));
//        System.out.println("-----------------------");
//        System.out.println(b1==b4);
//        System.out.println(b1.equals(b4));

        // 3 - compatibility
        StringBuffer sb = new StringBuffer("akshay");
        System.out.println(b1.equals(sb));
//        System.out.println(b1==sb); // it gives compilation error..
    }
}
