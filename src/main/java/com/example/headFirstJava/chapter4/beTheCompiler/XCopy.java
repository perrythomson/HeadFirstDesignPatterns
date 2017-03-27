package com.example.headFirstJava.chapter4.beTheCompiler;

/**
 * Created by perrythomson on 3/13/17.
 */
public class XCopy {
    public static void main(String[] args) {
        int orig = 42;
        XCopy x = new XCopy();
        int y = x.go(orig);
        System.out.println(orig + " " + y);
    }

    public int go(int arg) {
        arg = arg * 2;
        return arg;
    }
}
