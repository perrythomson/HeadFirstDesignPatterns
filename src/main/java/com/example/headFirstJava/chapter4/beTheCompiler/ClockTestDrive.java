package com.example.headFirstJava.chapter4.beTheCompiler;

/**
 * Created by perrythomson on 3/13/17.
 */
public class ClockTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("time: " + tod);
    }
}
