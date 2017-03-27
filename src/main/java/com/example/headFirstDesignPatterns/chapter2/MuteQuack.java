package com.example.headFirstDesignPatterns.chapter2;

/**
 * Created by perrythomson on 2/27/17.
 */
public class MuteQuack implements QuackBehavior {

    public void quack() {
        System.out.println("<<Silence>>");
    }
}
