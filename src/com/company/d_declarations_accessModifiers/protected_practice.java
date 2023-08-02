package com.company.d_declarations_accessModifiers;
//Let's play with 'member_modifier' class from same package having protected member
public class protected_practice extends  member_modifier {
    public static void main(String[] args) {
//        System.out.println(member_modifier.i);
//        System.out.println(protected_practice.i);
        member_modifier m1 = new member_modifier();
        protected_practice p1 = new protected_practice();
        System.out.println(m1.i);
        System.out.println(p1.i);
    }
}
