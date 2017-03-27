package com.example.headFirstJava.chapter7.inheritance;

/**
 * Created by perrythomson on 3/17/17.
 */
public class Mixed2 {
    public static void main (String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();

//        b.m1();  //output B's m1, A's m2, A's me
//        c.m2();
//        a.m3();

//        c.m1();  //output is B's m1, A's m2, C's m3, 13
//        c.m2();
//        c.m3();

//        a.m1();  //output is A's m1, A's m2, C's m3, 13
//        b.m2();
//        c.m3();

        a2.m1();  //output is B's m1, A's m2, C's m3, 13
        a2.m2();  //this is the same as c.m1 because a2 = new C()
        a2.m3();

    }
}
