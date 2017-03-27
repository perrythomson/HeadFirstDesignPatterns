package com.example.headFirstJava.chapter9;

/**
 * Created by perrythomson on 3/20/17.
 */
public class Duck {
    int size;

    public Duck(int newSize) {
        System.out.println("Quack-a-licious");

        if (newSize == 0) {
            size = 27;
        } else {
            size = newSize;
        }
        System.out.println("The size of the duck is " + size);
    }
}
