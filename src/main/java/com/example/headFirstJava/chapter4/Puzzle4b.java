package com.example.headFirstJava.chapter4;

/**
 * Created by perrythomson on 3/13/17.
 */
public class Puzzle4b {
    int ivar;

    public int doStuff(int factor ) {
        if (ivar > 100) {
            return ivar * factor;
        } else {
            return ivar * (5 -factor);
        }
    }
}
