package com.company.i_langPackage;

public class a_objectMethods {
    String name;
    int rollNo;

    public a_objectMethods(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
//     1
//    @Override
//    public String toString(){
//        return "Student name is: "+name +" and Roll no.: "+ rollNo;
//    }
//     2
//    @Override
//    public int hashCode(){
//        return rollNo;
//    }

    public static void main(String[] args) {
        a_objectMethods a1 = new a_objectMethods("akshay",29);
        a_objectMethods a2 = new a_objectMethods("shinde",30);
        // 1 - toString
//        System.out.println(a1);
//        System.out.println(a1.toString());
//        System.out.println(a1 instanceof a_objectMethods);
//        System.out.println(a1 instanceof Object);

        // 2 -hashCode
//        System.out.println(a1.toString()); // internally 'toString' method calls object level 'hashCode'
//                                          // method until we override 'hashCode' method...
//        System.out.println(a1.hashCode());
//        System.out.println(Integer.toHexString(a1.hashCode()));
        // after overriding hashcode method(also try with overridden 'toString' method)
        System.out.println(a1.toString());
        System.out.println(a1.hashCode());
        System.out.println(Integer.toHexString((a1.hashCode())));
    }
}
