package com.example.headFirstJava.chapter7.poolPuzzle;

/**
 * Created by perrythomson on 3/17/17.
 */
public class Boat {
    private int length;

    public void setLength(int len) {
        length = len;
    }

    public int getLength() {
        return length;
    }

    public void move() {
        System.out.print("drift ");
    }
}
