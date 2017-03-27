package com.example.headFirstJava.chapter10.sharpenYourPencil;

/**
 * Created by perrythomson on 3/24/17.
 */
public class TestBox {

    //int types are equated in the go() so in order for it to compile they need to be the same type
    //primitiv or not

    Integer i;
    int j;

    public static void main (String[] args) {
        TestBox t = new TestBox();
        t.go();
    }

    private void go() {
        j = i;
        System.out.println(j);
        System.out.println(i);
    }


}
